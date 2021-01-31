package fundamentals.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency: " + bankAccount.getCurrency());

//case 1 :give bank account to the client from outside(created outside)
        Client client1 = new Client("Alexandra", "291324660876", bankAccount);
        System.out.println(client1.toString());

        client1.getBankAccount().setBalance(24);
        //am apelat bankaccountu si balance ale clientului


        client1.getBankAccount().addMoney(24);
        client1.getBankAccount().withdrawMoney(10);
        System.out.println(client1.toString());
        client1.getBankAccount().setType("SPENDING");
        client1.getBankAccount().addMoney(5);

        double x = BankAccount.convertMoneyToCurrency(12, "EUR", "USD");
        System.out.println(BankAccount.convertMoneyToCurrency(12, "EUR", "USD"));
        System.out.println(x);

        BankAccount bankAccount1 = new BankAccount("SAVING" , "USD");
        BankAccount bankAccount2 = new BankAccount("SPENDING" , "USD");

        BankAccount[] myArray = {bankAccount1,bankAccount2};
        client1.setBankAccounts(myArray);
        System.out.println(myArray[0]);
        BankAccount[] clientBankAccounts = client1.getBankAccounts();
        System.out.println(client1.getBankAccounts()[0]);//accesat 1 element din array adica [0]
        System.out.println(client1);


        //   System.out.println("input the name of the client: ");
        //  String name= scanner.next();
        //  System.out.println("input the cnp of the client: ");
        // String cnp = scanner.next();

        //case 2 : client has asigned by default a def. bank acc. Create the bank acc.from the constructor
        //    Client client2 = new Client(name,cnp);  // constr. mereu il initializam cu NEW
        //  System.out.println(client2.toString());


    }
}
