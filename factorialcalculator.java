public class factorialcalculator {
    public static void main(String[] args) {
        int value = 5;  // Predefined number to calculate factorial
        int factorial = 1;

        for (int i = 1; i <= value; i++) { // Loop through numbers
            factorial *= i;  // Multiply current number
        }

        System.out.println("Factorial of " + value + " is: " + factorial);
    }
}
