package com.company;

public class Main {

    public static void main(String[] args) {
        Double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw;
        double amountForEachFriend = updatedBalance/3;
        boolean canPurchaseTicket = amountForEachFriend>=250;
        System.out.println(canPurchaseTicket);
        System.out.println("I gave each friend "+amountForEachFriend+"...");
    }
}
