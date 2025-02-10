package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the valid arithmetic expression: ");
        String expression = input.nextLine();
        System.out.println(expression);

    }
}