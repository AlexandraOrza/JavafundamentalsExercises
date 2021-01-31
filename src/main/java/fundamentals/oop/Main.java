package fundamentals.oop;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency: " + bankAccount.getCurrency());
        Client client = new Client("Alexandra","291324660876" , bankAccount);
        System.out.println(client);

    }
}
