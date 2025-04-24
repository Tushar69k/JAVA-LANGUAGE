package Exam.Done;

import java.util.Scanner;

public class MultipleException {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // NumberFormatException
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // ArithmeticException
            System.out.print("Enter another number to divide: ");
            int divisor = scanner.nextInt();
            int result = num / divisor;
            System.out.println("Division Result: " + result);

            // ArrayIndexOutOfBoundsException
            int[] arr = {10, 20, 30};
            System.out.print("Enter index to access array: ");
            int index = scanner.nextInt();
            System.out.println("Array value: " + arr[index]);

            // NullPointerException
            String str = null;
            System.out.println("String length: " + str.length()); // Will throw NullPointerException


        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer encountered.");
        } catch (Exception e) {
            System.out.println("Some other unexpected error: " + e);
        } finally {
            System.out.println("Program completed.");
        }
    }
}



