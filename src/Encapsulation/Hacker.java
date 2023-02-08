package Encapsulation;

public class Hacker {

    public static void main (String args[])
    {
    	Account acc = new Account ();
        acc.setBalance (-100);
        acc.deposit (2);
        System.out.println ("Account Balance is : " + acc.getBalance ()); 
    }
}
