/*
Exercise 1: Make a program that calculates and prints the sum of 3 qualifications.
 */

import java.util.Scanner;

public class Exercise1_PATS {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String user;
        float qualification1, qualification2, qualification3, addition;

        // Saving the student's name and lastname
        System.out.println("Entry your name and last name, please: ");
        user = entry.nextLine();

        // Saving qualifications
        System.out.println("Type your first qualification, please: ");
        qualification1 = entry.nextFloat();

        System.out.println("Type your second qualification, please: ");
        qualification2 = entry.nextFloat();

        System.out.println("Type your third and last qualification, please: ");
        qualification3 = entry.nextFloat();

        addition = qualification1 + qualification2 + qualification3; // Adding the 3 qualificactions
        System.out.println("\nYour final qualification is: " + addition / 3);

        if (addition >= 10) {
            System.out.println("Congrasts " + user + ", you've passed the grade!🤩");
        } else {
            System.out.println("Sorry " + user + ", you haven't passed the grade. \n Try harder next time 👍🏽");
        }
    }
}