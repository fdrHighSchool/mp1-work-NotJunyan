
/**
 * Write a description of class Date here.
 *
 * JunYan Lin
 * 9/28/22
 */
import java.util.Scanner;
public class Kids{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        System.out.print("Children are an invasive species in most homes worldwide ");
        System.out.println("and is a pest that needs to be terminated.");
            
        System.out.print("How many did you run over during your summer? ");
        int num = input.nextInt();
        if (num < 1) {
            System.out.println("Good job! You passed the psychopath test");
            System.out.println("and won't be getting arrested.");
        } // end if statement
        else {
            System.out.print("How could you? The children you ran over could");
            System.out.println(" of cured cancer. Hope you feel good about yourself");
        } // end else statement
        } // end main method
    } // end class