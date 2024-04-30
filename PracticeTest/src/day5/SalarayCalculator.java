package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SalarayCalculator {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //loop to calculate salary for multiple employees
        while (true){
            System.out.println("Enter role (manager, developer, or internee) or exit)");
            String role = sc.nextLine();
            if (role.equalsIgnoreCase("exit")){
                break; //exits loop
            }
            System.out.println("Enter your worked hours: ");
            int hoursWorked;
            try{
                //try to read an integer for hours worked
                hoursWorked = sc.nextInt();
                sc.nextLine(); //consume new line left-over
            } catch (InputMismatchException e){
                //catch exception if input is not an integer
                System.out.println("Invalid input. Please enter a valid integer for hours worked");
                sc.nextLine();
                continue;
            }
            //calculate hourly rate based on the role using ternary operator
            double hourlyRate = role.equalsIgnoreCase("manager") ? 50.0 :
                    role.equalsIgnoreCase("developer") ? 30 :
                            role.equalsIgnoreCase("internee") ? 5.0: 0.0;

            //calculate total salary based on hours worked and hourly rate
            double totalSalary = hoursWorked <= 40 ? hoursWorked + hourlyRate :
                    40 * hourlyRate + (hoursWorked - 40) * hourlyRate + 1.5;

            //display total salary
            System.out.println("Total salary: " +totalSalary);
        }
        System.out.println("exiting the page");
    }
}
