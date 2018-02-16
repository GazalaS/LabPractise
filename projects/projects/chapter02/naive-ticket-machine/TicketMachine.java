/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
    public  class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    private int refund;
    
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        //assert cost>0:" Not valid";  
        if ( cost > 0)
        {
            price = cost;
            balance = 0;
            total = 0;
            refund = 0;
        }
        else    
            System.out.println("Ticket price should be a positive amount");
    }

    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
        refund = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount >= price)
            balance = balance + amount;
        else
            System.out.println("Efficient Amount. Ticket Price: " + price);
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        if (balance > price)
        {
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();    
        }
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
    }
    
    public void showPrice()
    {
        System.out.println ("The price of the ticket is "+ price +" cents.");
    }
    
    public void empty()
    {
     total = 0;
    }
            
    
    public void refundBalance()
    {
        refund = balance - price; 
        if (refund > 0)
            System.out.println("Please collect the remaining amount: " + refund);

        // Update the total collected with the balance.
        
        total = total + price;
        
        // Clear the balance.
        balance = 0;
        
    }
    
    public boolean checkAmount(int amount)
    {
        return true;
    }
}
