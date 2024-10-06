package com.example;

import java.util.Scanner;

public class GreeterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Simple Scanner App.");
        scanner.close();
    }
}
