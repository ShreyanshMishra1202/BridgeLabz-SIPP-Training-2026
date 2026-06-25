// A hospital billing system must never crash. Wrap division-by-zero
// (bills with zero items), array out-of-bounds (invalid patient index),
// and number format exceptions (bad input) with meaningful
// messages. Create a custom InsufficientFundsException for payment
// failures.

public class Hospital_Billing_Scenario {
    public static void main(String[] args) {
        int[] patientBills = {100, 200, 300};
        int patientIndex = 5; // Invalid index
        try {
            double billAmount = patientBills[patientIndex];
            double items = 0; // Simulating zero items
            double costPerItem = billAmount / items; // Division by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate cost per item with zero items.");
        }
        try {
            String input = "abc"; // Simulating bad input
            int payment = Integer.parseInt(input); // Number format exception
        } catch (NumberFormatException e) {
            System.out.println("Invalid payment input.");
        }

        try {
            double payment = 50; // Simulating insufficient payment
            double billAmount = 100;
            if (payment < billAmount) {
                throw new InsufficientFundsException("Payment is less than the bill amount.");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        
    }
}
