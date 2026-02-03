package com.tnsif.Demo.CaseStudyBanking;

import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {

        BankingService service = new BankingServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List Accounts of Customer");
            System.out.println("7. List Transactions of Account");
            System.out.println("8. List Beneficiaries of Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Customer Id: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    service.addCustomer(new Customer(cid, name, address, contact));
                    break;

                case 2:
                    System.out.print("Account Id: ");
                    int aid = sc.nextInt();
                    System.out.print("Customer Id: ");
                    cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type: ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double bal = sc.nextDouble();
                    service.addAccount(new Account(aid, cid, type, bal));
                    break;

                case 3:
                    System.out.print("Beneficiary Id: ");
                    int bid = sc.nextInt();
                    System.out.print("Customer Id: ");
                    cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String bname = sc.nextLine();
                    System.out.print("Account Number: ");
                    String accno = sc.nextLine();
                    System.out.print("Bank Details: ");
                    String bank = sc.nextLine();
                    service.addBeneficiary(new Beneficiary(bid, cid, bname, accno, bank));
                    break;

                case 4:
                    System.out.print("Account Id: ");
                    aid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Deposit/Withdrawal): ");
                    type = sc.nextLine();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    service.addTransaction(new Transaction(aid, type, amt));
                    break;

                case 5:
                    System.out.print("Customer Id: ");
                    cid = sc.nextInt();
                    System.out.println(service.findCustomerById(cid));
                    break;

                case 6:
                    System.out.print("Customer Id: ");
                    cid = sc.nextInt();
                    service.getAccountsByCustomerId(cid)
                           .forEach(System.out::println);
                    break;

                case 7:
                    System.out.print("Account Id: ");
                    aid = sc.nextInt();
                    service.getTransactionsByAccountId(aid)
                           .forEach(System.out::println);
                    break;

                case 8:
                    System.out.print("Customer Id: ");
                    cid = sc.nextInt();
                    service.getBeneficiariesByCustomerId(cid)
                           .forEach(System.out::println);
                    break;

                case 9:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
            }
        }
    }
}

