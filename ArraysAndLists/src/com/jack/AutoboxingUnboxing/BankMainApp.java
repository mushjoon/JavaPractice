package com.jack.AutoboxingUnboxing;

public class BankMainApp {

    public static void main(String[] args) {

        Bank bank = new Bank("My Bank");

        if (bank.addBranch("New York")) {
            System.out.println("New York branch created");
        }

        bank.addCustomer("New York","Tom",50.05);
        bank.addCustomer("New York","Bonnie",123.45);
        bank.addCustomer("New York","Adam",199.20);

        bank.addBranch("London");
        bank.addCustomer("London","John",322.30);

        bank.addCustomerTransaction("New York","Tom",33.20);
        bank.addCustomerTransaction("New York","Bonnie", 42.50);
        bank.addCustomerTransaction("New York","Adam", 21.44);

        bank.listCustomers("New York",true);
        System.out.println("====================================");
        bank.listCustomers("London",true);

        bank.addBranch("Melbourne");

        // validation codes below
        if (!bank.addCustomer("Melbourne","Brian",5.53)) {
            System.out.println("Error Melbourne branch doesn't exist");
        }

        if (!bank.addBranch("New York")) {
            System.out.println("New York branch already exists");
        }

        if(!bank.addCustomerTransaction("New York","Steven",52.33)){
            System.out.println("Customer doesn't exist");
        }

        if (!bank.addCustomer("New York","Bonnie", 12.21)) {
            System.out.println("Customer Bonnie already exists");
        }
    }
}
