package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Type your name: ");
        String userName= scanner.nextLine();
        System.out.println("Type your last name: ");
        String userLastName= scanner.nextLine();
        System.out.println("Type your favorite colour: ");
        String userFavoriteColour= scanner.nextLine();
        System.out.println("Type the day of your birthday (example: 14 if you were born the 14th of December): ");
        int userBirthdayDay= scanner.nextInt();
        System.out.println("Type the month of your birthday (as a number): ");
        int userBirthdayMonth= scanner.nextInt();
        System.out.println("Type the year you were born: ");
        int userYearOfBirth= scanner.nextInt();

        int sumDayDigits= userBirthdayDay+ userBirthdayMonth+ userYearOfBirth;
        String passwordGenerated= userName+"-"+userLastName+"-"+userFavoriteColour+"-"+sumDayDigits;

        System.out.println("the password generated with your data is:\n"+ passwordGenerated);

        scanner.close();
    }
}
