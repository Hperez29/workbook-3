package com.pluralsight;

import java.util.Scanner;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
            String[] quotes = {
                    "Be yourself; everyone else is already taken. – Oscar Wilde",
                    "Two things are infinite: the universe and human stupidity. – Albert Einstein",
                    "So many books, so little time. – Frank Zappa",
                    "A room without books is like a body without a soul. – Cicero",
                    "In three words I can sum up everything I've learned about life: it goes on. – Robert Frost",
                    "If you tell the truth, you don't have to remember anything. – Mark Twain",
                    "Always forgive your enemies; nothing annoys them so much. – Oscar Wilde",
                    "It is never too late to be what you might have been. – George Eliot",
                    "We accept the love we think we deserve. – Stephen Chbosky",
                    "The only way out of the labyrinth of suffering is to forgive. – John Green"
            };

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            boolean keepGoing = true;

            while (keepGoing) {
                System.out.println("\nChoose a number between 1 and 10 to see a quote.");
                System.out.println("Enter 0 for a random quote.");
                System.out.print("Your choice: ");

                String input = scanner.nextLine();

                try {
                    int choice = Integer.parseInt(input);

                    if (choice == 0) {
                        int randIndex = random.nextInt(quotes.length);
                        System.out.println("\nRandom Quote: " + quotes[randIndex]);
                    } else if (choice >= 1 && choice <= 10) {
                        System.out.println("\nQuote #" + choice + ": " + quotes[choice - 1]);
                    } else {
                        System.out.println("Invalid number. Please enter a number between 1 and 10 or 0 for random.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                }

                System.out.print("\nWould you like to see another quote? (yes/no): ");
                String again = scanner.nextLine().trim().toLowerCase();
                if (!again.equals("yes")) {
                    keepGoing = false;
                    System.out.println("Goodbye!");
                }
            }

            scanner.close();
        }
    }