package Lesson_8_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_NumDivider {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int result ;
        try {
            System.out.println("Please enter a value for x: ");
            int x = sc.nextInt();
            System.out.println("Please enter a value for y: ");
            int y = sc.nextInt();
            if(x < 0 || y < 0){
                throw new IllegalArgumentException();
            }
            result = numDivider(x,y);
            System.out.println(result);
        }
        catch (InputMismatchException ex) {
            System.out.println("You are trying to enter incorrect data ,please enter numbers only ");
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero detected");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("PLease enter a positive number, we don't want negative numbers");
        }

    }

    public static int numDivider(int x, int y) throws ArithmeticException{
        if(x>y) {
            return x / y;
            // wanted to make it so that we always divide by the smaller number
        } else {
            return y/x;
        }
    }
}
