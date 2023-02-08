package Encapsulation;

public class Account {

		private int account_number;
	    private int account_balance;
	    // getter method
	    public int getBalance ()
	    {
	        return this.account_balance;
	    }
	    public int getNumber ()
	    {
	        return this.account_number;
	    }
	    // setter method
	    public void setBalance (int num)
	    {
	        this.account_balance = num;
	    }
	    public void setNumber (int num)
	    {
	        this.account_number = num;
	    }
	    public void deposit (int a)
	    {
	        if (a < 0)
	        {
	         System.out.println ("Insufficient Balance");
	        }
	        else
	            account_balance = account_balance + a;
	    }
	}

