package fundamentals.oop;

/**
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized with 0 in the constructor)
 * fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
 * methods:
 * addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
 * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can not be < 0 otherwise print a suggestive  error message ),
 * covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns the result = the money in the input currency)
 */

public class BankAccount<balance> {
    /**
     * Type of the account SAVING or SPENDING
     */
    private String type;
    /**
     * Balance of the account
     */
    private double balance;
    /**
     * currency : USD or EUR
     */
    private String currency;
    private String accountType;
    public static final double USD_TO_EUR = 2.12;
    public static final double EUR_TO_USD = 4.12;

    public BankAccount(String type, String currency) {  // 1 constructor
        this.type = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {                 //2 constructor
        this.type = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    public void addMoney(double newMoney) {
        if (this.accountType == "SPENDING") {
            if (newMoney <= this.balance / 10) {
                System.out.println("Please add at least 10% of actual balance");
                return;
            }
        }
        this.balance += newMoney;
        System.out.println("your new balance is :" + this.balance);
    }

    public void withdrawMoney(double newMoney) {
        if (this.accountType == "SAVING" && this.balance - newMoney < 0) {
            System.out.println("Your balance ");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    //convert Money to currency
    public static double convertMoneyToCurrency(double amountOfMoney, String inputCurrency, String outputCurrency) {
        if (inputCurrency.equals("EUR") && outputCurrency.equals("USD")) {
            outputCurrency = "USD";
            return amountOfMoney * EUR_TO_USD;
        }
        return amountOfMoney * USD_TO_EUR;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Return the balance of the account
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

