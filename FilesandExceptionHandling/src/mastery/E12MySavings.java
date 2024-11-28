package mastery;

import java.io.*; // For file input/output
import java.util.Scanner; // For user input

/*
Program: E12MySavings.java          Last Date of this Revision: November 25, 2024

Purpose: Create a savings application that allows users to manage a piggy bank with options to add coins, withdraw funds, and save/load the state of the piggy bank to/from a file.

Author: bilal
School: CHHS
Course: Computer Programming 20
*/

public class E12MySavings implements Serializable {
    private static final long serialVersionUID = 1L; // Serialization ID for saving/loading compatibility

    // Variables to track coins and total money
    private double totalMoney; // Total amount in the piggy bank
    private int pennies;       // Count of pennies
    private int nickels;       // Count of nickels
    private int dimes;         // Count of dimes
    private int quarters;      // Count of quarters

    // Default constructor to initialize piggy bank with zero values
    public E12MySavings() {
        totalMoney = 0.00;
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    // Method to calculate and display the total amount in the piggy bank
    public double displayTotalMoney() {
        totalMoney = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25; // Calculate total money
        totalMoney = Math.round(totalMoney * 100.0) / 100.0; // Round to 2 decimal places
        System.out.println("You have $" + totalMoney + " in your account."); // Display the total
        return totalMoney; // Return total amount
    }

    // Method to add pennies to the piggy bank
    public void addPennies(int addedPennies) {
        pennies += addedPennies; // Add the specified number of pennies
        System.out.println("You added " + addedPennies + " pennies.");
    }

    // Method to add nickels to the piggy bank
    public void addNickels(int addedNickels) {
        nickels += addedNickels; // Add the specified number of nickels
        System.out.println("You added " + addedNickels + " nickels.");
    }

    // Method to add dimes to the piggy bank
    public void addDimes(int addedDimes) {
        dimes += addedDimes; // Add the specified number of dimes
        System.out.println("You added " + addedDimes + " dimes.");
    }

    // Method to add quarters to the piggy bank
    public void addQuarters(int addedQuarters) {
        quarters += addedQuarters; // Add the specified number of quarters
        System.out.println("You added " + addedQuarters + " quarters.");
    }

    // Method to withdraw money from the piggy bank
    public void withdrawMoney(double amount) {
        totalMoney = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25; // Recalculate total money
        totalMoney = Math.round(totalMoney * 100.0) / 100.0; // Round to 2 decimal places

        if (amount <= totalMoney && amount > 0) { // Check if withdrawal amount is valid
            totalMoney -= amount; // Deduct the amount
            System.out.println("You withdrew $" + amount + ". Remaining balance: $" + totalMoney);
        } else {
            System.out.println("Insufficient funds or invalid amount."); // Error message for invalid withdrawal
        }
    }

    // Method to save the piggy bank object to a file
    public void saveToFile(String filename) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(filename); // Open the file
        ObjectOutputStream out = new ObjectOutputStream(fileOut); // Create an object stream
        out.writeObject(this); // Write the object to the file
        out.close(); // Close the object stream
        fileOut.close(); // Close the file stream
        System.out.println("Piggy bank saved to " + filename); // Confirm save
    }

    // Method to load the piggy bank object from a file
    public static E12MySavings loadFromFile(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filename); // Open the file
        ObjectInputStream in = new ObjectInputStream(fileIn); // Create an object stream
        E12MySavings piggyBank = (E12MySavings) in.readObject(); // Read the object from the file
        in.close(); // Close the object stream
        fileIn.close(); // Close the file stream
        System.out.println("Piggy bank loaded from " + filename); // Confirm load
        return piggyBank; // Return the loaded object
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        E12MySavings piggyBank = new E12MySavings(); // Create a new piggy bank object

        while (true) { // Infinite loop for menu interaction
            try {
                // Display menu options
                System.out.println("\nSelect an option:");
                System.out.println("1. Show total money");
                System.out.println("2. Add pennies");
                System.out.println("3. Add nickels");
                System.out.println("4. Add dimes");
                System.out.println("5. Add quarters");
                System.out.println("6. Withdraw money");
                System.out.println("7. Save piggy bank to file");
                System.out.println("8. Load piggy bank from file");
                System.out.println("0. Exit");

                int choice = Integer.parseInt(scanner.nextLine()); // Get user choice

                if (choice == 1) {
                    piggyBank.displayTotalMoney(); // Show total money
                } else if (choice == 2) {
                    System.out.print("How many pennies? ");
                    piggyBank.addPennies(Integer.parseInt(scanner.nextLine())); // Add pennies
                } else if (choice == 3) {
                    System.out.print("How many nickels? ");
                    piggyBank.addNickels(Integer.parseInt(scanner.nextLine())); // Add nickels
                } else if (choice == 4) {
                    System.out.print("How many dimes? ");
                    piggyBank.addDimes(Integer.parseInt(scanner.nextLine())); // Add dimes
                } else if (choice == 5) {
                    System.out.print("How many quarters? ");
                    piggyBank.addQuarters(Integer.parseInt(scanner.nextLine())); // Add quarters
                } else if (choice == 6) {
                    System.out.print("How much money to withdraw? ");
                    piggyBank.withdrawMoney(Double.parseDouble(scanner.nextLine())); // Withdraw money
                } else if (choice == 7) {
                    System.out.print("Enter filename to save: ");
                    piggyBank.saveToFile(scanner.nextLine()); // Save to file
                } else if (choice == 8) {
                    System.out.print("Enter filename to load: ");
                    piggyBank = E12MySavings.loadFromFile(scanner.nextLine()); // Load from file
                } else if (choice == 0) {
                    System.out.println("Goodbye!"); // Exit the program
                    break;
                } else {
                    System.out.println("Invalid choice. Try again."); // Handle invalid input
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again."); // Handle errors
            }
        }

        scanner.close(); // Close the scanner
    }
}



/*

Test case 1

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
2
How many pennies? 17
You added 17 pennies.

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
5
How many quarters? 27
You added 27 quarters.

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
6
How much money to withdraw? 1.00
You withdrew $1.0. Remaining balance: $5.92

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
1
You have $5.92 in your account.

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
7
Enter filename to save: C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\mastery\\myPiggyBank.dat
Piggy bank saved to C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\mastery\\myPiggyBank.dat

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
1
You have $5.92 in your account.

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
5
How many quarters? 1234
You added 1234 quarters.

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
1
You have $314.42 in your account.

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
8
Enter filename to load: C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\mastery\\myPiggyBank.dat
Piggy bank loaded from C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\mastery\\myPiggyBank.dat

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
1
You have $5.92 in your account.

Select an option:
1. Show total money
2. Add pennies
3. Add nickels
4. Add dimes
5. Add quarters
6. Withdraw money
7. Save piggy bank to file
8. Load piggy bank from file
0. Exit
0
Goodbye!






*/







