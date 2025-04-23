package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        FileInputStream fis;
        Scanner fileScanner = null;

        try {
            fis = new FileInputStream("jokes.txt");
            fileScanner = new Scanner(fis);

            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                System.out.println(currentLine);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'jokes.txt' was not found.");
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
    }
}