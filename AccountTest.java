package com.bridglabz;


import java.util.Scanner;

public class AccountTest {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of accounts to insert = ");
        int n = sc.nextInt();
        Account acc[] = new Account[n];
        for (int i = 0; i < acc.length; i++) {
            acc[i] = new Account();
            acc[i].openAccount();
        }

        int option;
        do {
            System.out.println(
                    "Select option:\n 1. Display All\n 2. Search by Account\n 3. Deposit\n 4. Withdrawal\n 5. Exit ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    for (int i = 0; i < acc.length; i++) {
                        acc[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.print("Enter the account number to search ");
                    String acn = sc.next();
                    boolean found = false;
                    for (int i = 0; i < acc.length; i++) {
                        found = acc[i].search(acn);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No : ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i < acc.length; i++) {
                        found = acc[i].search(acn);
                        if (found) {
                            acc[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No : ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i < acc.length; i++) {
                        found = acc[i].search(acn);
                        if (found) {
                            acc[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;

                case 5:
                    break;
            }
        } while (option != 5);
    }

}
