package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reads employee data from a CSV file and displays payroll information.
 */
public class Main {
    public static void main(String[] args) {
        // Print the working directory
        System.out.println("Working directory: " + System.getProperty("user.dir"));

        String fileName = "employees.csv"; // Make sure this file is in the project root folder

        // Using try-with-resources to auto-close the file reader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Process each line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts using the | delimiter
                String[] parts = line.split("\\|");

                // Ensure there are exactly four tokens: id, name, hours-worked, and pay-rate
                if (parts.length == 4) {
                    try {
                        int id = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        double hours = Double.parseDouble(parts[2].trim());
                        double rate = Double.parseDouble(parts[3].trim());

                        // Create a new Employee object
                        Employee emp = new Employee(id, name, hours, rate);

                        // Display payroll info for this employee using printf
                        System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                                emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
                    } catch (NumberFormatException e) {
                        // Handle any errors that occur when parsing numbers
                        System.out.println("Error parsing numbers on line: " + line);
                    }
                } else {
                    // Print a message if the CSV line does not match the expected format
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            // Handle errors related to file reading (e.g., file not found)
            System.out.println("Could not read the file: " + fileName);

        }
    }
}