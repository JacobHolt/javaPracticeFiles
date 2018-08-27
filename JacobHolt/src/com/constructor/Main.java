package com.constructor;

public class Main {

    public static void main(String[] args) {

        BankAccount Levi = new BankAccount("12345", 0.00, "Bow Brown", "myemail@bob.com", "(256)-463-9504");

        /*Levi.setAccountNumber("12345");
        Levi.setBalance(1000);
        Levi.setCustomerName("Levi");
        Levi.setEmail("jholt5@stu.jsu.edu");
        Levi.setPhoneNumber("2564639504");
        Julia.setAccountNumber("13579");
        Julia.setBalance(5000);
        Julia.setCustomerName("Julia");
        Julia.setEmail("ju.mcc87@gmail.com");
        Julia.setPhoneNumber("4048316625");*/

        System.out.println("Levi balance : " + Levi.getBalance() );
        System.out.println("Levi account number : " + Levi.getAccountNumber());
        System.out.println("Levi name is : " + Levi.getCustomerName());
        System.out.println("Levi phone number is : " + Levi.getPhoneNumber());
        System.out.println("Levi email is : " + Levi.getEmail());
        /*System.out.println("Julia balance : " + Julia.getBalance() );
        System.out.println("Julia account number : " + Julia.getAccountNumber());
        System.out.println("Julia name is : " + Julia.getCustomerName());
        System.out.println("Julia phone number is : " + Julia.getPhoneNumber());
        System.out.println("Julia email is : " + Julia.getEmail());*/

        Levi.makeDeposit(154);
        System.out.println("Levi balance : " + Levi.getBalance() );
        //Julia.makeWithdraw(500);
        //System.out.println("Julia balance : " + Julia.getBalance() );
        Levi.makeWithdraw(155);
        System.out.println("Levi balance : " + Levi.getBalance() );

        BankAccount test = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println(test.getAccountNumber() + " name " + test.getCustomerName());

        VIPAccount Brian = new VIPAccount();
        VIPAccount Tadd = new VIPAccount("Tadd", 3000);
        VIPAccount Wilson = new VIPAccount("Wilson", 5000, "Wilson243@Hotmail.com");

        System.out.println("This accounts name is : " + Brian.getAccountName() + ".");
        System.out.println("This accounts name is : " + Tadd.getAccountName() + ".");
        System.out.println("This accounts name is : " + Wilson.getAccountName() + ".");

    }
}
