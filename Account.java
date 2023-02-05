package com.bridglabz;

import java.util.Scanner;

public class Account {
    private String accno;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    void showAccount() {
        System.out.println(accno + " " + name + " " + balance);
    }

    void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit : ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw : ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Debit amount exceeded account balance. Transaction failed.");
        }
    }

    boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }

}
