
/**
 * This is a Assignment 2 Java Program
 * Which is based on Vending Machine.
 * this Program is created on 22th June 2020.
 *
 *
 * @ author Utsavkumar M Patel
 *
 */

public class Vendingmachine {

    private String ItemName;
    private double ItemPrice ,UnusedCredit,TotalAmount;
    private int ItemQuantity;

    //Getters
    public String getItemName() {
        return ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }


    public int getItemQuantity() {
        return ItemQuantity;
    }


    public double getUnusedCredit() {
        return UnusedCredit;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    //Setters
    public void setUnusedCredit(double UnusedCredit) {
        this.UnusedCredit = UnusedCredit;
    }


    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }


    public void setTotalAmount(double TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public void setItemQuantity(int ItemQuantity) {
        this.ItemQuantity = ItemQuantity;
    }



     //Change after a product is bought for visual output
    public double getChange() {
        return (this.UnusedCredit - this.ItemPrice);
    }
    //Change in credit for the toString method
    public double remainCred(){
        return(this.UnusedCredit -= ItemPrice);
    }
    //Resetting credit to 0
    public double change(){
        return(this.UnusedCredit = 0);
    }
    //Remaining amount of items after purchase
    public int remainAmt(){
        return(this.ItemQuantity -= 1);
    }

    //New revenue earned after current purchase
    public double newBalance(){
        return(this.TotalAmount += this.ItemPrice);
    }

    //Coin validation and new credit
    public double Coin(double coin) {
        if (coin == 2 || coin == 1 || coin == 0.25 || coin == 0.1 || coin == 0.05){
            this.UnusedCredit += coin;
        }
        return coin;
    }



    @Override
    public String toString(){
        return " This Vending Machine Cotains: " + ItemQuantity
                + ItemName + " ,Each Price " + ItemPrice +"\n Unused Credit : " + UnusedCredit + "\n Total Amount Of Money Vended : " + TotalAmount;
    }

}


