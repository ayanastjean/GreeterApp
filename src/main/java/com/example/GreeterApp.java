package com.example;

import java.util.Scanner;

public class GreeterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("What the freak is up', " + name + "! Welcome to your App!");
        scanner.close();
    }
}
