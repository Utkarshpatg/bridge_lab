package oopBasedQuestion;

public class Question15 {

	    int balance; 

	    public void setBalance(int amount) {
	        balance = amount;  
	        System.out.println("Balance set to: " + balance);
	    }

	    public void deposit(int amount) {
	        balance += amount; 
	        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	    }

	    public void withdraw(int amount) {
	        balance -= amount;  
	        System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
	    }

	    public void showBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

	    public static void main(String[] args) {
	        Question15 account = new Question15();

	        account.setBalance(1000);  
	        account.deposit(500);      
	        account.withdraw(200);     
	        account.showBalance();     
	    }
	}

