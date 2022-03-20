package com.company;



import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String id, name;
        try {
            Formatter formatter = new Formatter
                    ("C:/Users/Computer Garden/Desktop/Person/Student.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("How many Student: ");
            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.println("Enter Student Id and Name.");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }

            formatter.close();
        } catch (Exception e) {
            System.out.println("e");
        }
    }

}
