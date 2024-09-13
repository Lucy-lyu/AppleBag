import java.util.Scanner;

public class IntFinder {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the max value: ");
        int max = myScan.nextInt();
        System.out.println("Enter the quantity of values: ");
        int n = myScan.nextInt();
        System.out.println(analyzeInts(max, n));
        myScan.close();
    }

    // Returns the next int from a list
    public static int getInt() {
        Scanner myInt = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int digit = 0;
        if(myInt.hasNextInt())
            digit = myInt.nextInt();
        return digit;
    }

    /* COMPLETE THIS METHOD
     * Precondition: max > 0, n > 0
     * Write the method analyzeInts, which obtains n values using the getInt 
     * method and returns the proportion of the obtained values that meet all 
     * the following criteria.
     * Value is greater than 0
     * Value is less than max
     * Value is divisible by 3
     * Example: if max is 16 and the values obtained by getInt are 15, 16, -13, 
     * -5, 3, 12, 9, and 18, then analyzeInts should return 0.5 because four out 
     * of eight values (15, 3, 12, and 9) meet all the criteria.
     */
    public static double analyzeInts(int max, int n) {
        int count = 0;  // Count of numbers that meet the criteria

        for (int i = 0; i < n; i++) {
            int value = getInt();  // Get the next integer
            if (value > 0 && value < max && value % 3 == 0) {
                count++;  // Increment count if the value meets all criteria
            }
        }
        
        return (double) count / n;
    }
}
