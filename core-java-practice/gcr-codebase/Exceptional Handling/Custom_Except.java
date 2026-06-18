// A hospital billing system must never crash. Wrap division-by-zero
// (bills with zero items), array out-of-bounds (invalid patient index),
// and number format exceptions (bad input) with meaningful
// messages. Create a custom InsufficientFundsException for payment
// failures.

import java.lang.Exception;

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Custom_Except {
    public static void main(String[] args) {
        try {
            int[] bills = {100, 200, 300};
            int patientIndex = 5; 
            int billAmount = bills[patientIndex]; 
            int items = 0; // Zero items
            int averageBill = billAmount / items; 

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero. Please check the number of items.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index. Please check the patient list.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter valid numbers.");
        } catch (InsufficientFundsException e) {
            System.out.println("Error: Insufficient funds for payment. Please check your balance.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
