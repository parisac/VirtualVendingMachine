/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine_aparis84;

/**
 * Contains most of the accounting and logic around purchasing a specific 
 * inventory item!!
 * @author alexc
 */
public class Transactions {
    
//Create Instance Objects of Inventories
static Coke coke = new Coke();
static Juice juice = new Juice();
static Water water = new Water();
static Pretzle pretzle = new Pretzle(); 

//Out of Change Variable
static String outOfChange = "no";
     
/**
 * Shows all Inventory items (Snacks and Money)
 */
public static void showInventory(){
        System.out.println("Current inventory stocked:\n"+
        "\tCoke - " + coke.currentQuantity +"\n" +
        "\tJuice - " + juice.currentQuantity +"\n" +
        "\tWater - " + water.currentQuantity +"\n" +
        "\tPretzle - " + pretzle.currentQuantity +"\n"+
        "\t#FiveBills - " + Currency.numbFive +"\n"+
        "\t#OneBills - " + Currency.oneBalance +"\n"+
        "\t#Quarters - " + Currency.numbQuarters +"\n");}

/**
 * Shows prices of all inventory items 
 */
public static void showPrices(){
        System.out.println("Prices of Inventory:\n"+
        "\tCoke - " + coke.getPrice() +"\n" +
        "\tJuice - " + juice.getPrice() +"\n" +
        "\tWater - " + water.getPrice() +"\n" +
        "\tPretzle - " + pretzle.getPrice() +"\n");}

/** takes users payment forms, calculates change, vends item
 * if enough currency and in-stock
 * 
 * @param quarters - amount customer puts in
 * @param ones - amount customer puts in
 * @param fives - amount customer puts in
 * @param price - amount customer puts in
 */
public static void purchaseItem(int quarters, int ones, int fives, double price){
        //Adds inserted currency to stacks
        Currency.numbFive += fives;     
        Currency.oneBalance += ones;
        Currency.numbQuarters += quarters;
        
        
        //Calculate and Output Change 
        double total = quarters * 0.25 + ones + fives * 5;
        double change = total - price;
        double outputDollars = Math.floor(change);
        double truncatedChange = change - (Math.floor(change));
        double outputQuarters = 0;
        
        if (total >= price){
        
        if (truncatedChange == 0.25){
            if (Currency.numbQuarters>=1 && 
                Currency.oneBalance>= Math.floor(change)){
            System.out.println("Your change is $" + change + ": ");
            outputQuarters = 1;
            Currency.numbQuarters -= outputQuarters;
            System.out.println("1 Quarter Back");
            Currency.oneBalance -= outputDollars;
            System.out.println((int)outputDollars + " Dollar(s) Back \nItem Vended");}
            
            else{System.out.println("Sorry out of Change");
                outOfChange = "yes";}   
        }
     
        else if (truncatedChange == 0.5){ 
            if (Currency.numbQuarters>=2 && 
                Currency.oneBalance>= Math.floor(change)){
            System.out.println("Your change is $" + change + ": ");
            outputQuarters = 2;
            Currency.numbQuarters -= outputQuarters;
            System.out.println("2 Quarters Back");
            Currency.oneBalance -= outputDollars;
            System.out.println((int)outputDollars + " Dollar(s) Back \nItem Vended");}
            
            else{System.out.println("Sorry out of Change");
               outOfChange = "yes";}
        } 
    
        else if (truncatedChange == 0.75){
            if (Currency.numbQuarters>=3 && 
            Currency.oneBalance>= Math.floor(change)){
            System.out.println("Your change is $" + change + ": ");
            Currency.numbQuarters -= outputQuarters;
            System.out.println("3 Quarter Back");
            Currency.oneBalance -= outputDollars;
            System.out.println((int)outputDollars + " Dollar(s) Back \nItem Vended");}
            
            else{System.out.println("Sorry out of Change");
            outOfChange = "yes";}
            }
        
        else if (change == 0){
            System.out.println("\nNo Change Needed \nItem Vended");}
            
        else if (truncatedChange == 0){
                if(Currency.oneBalance>=change)
                    { System.out.println("Your change is $" + change + ": ");
                      Currency.oneBalance -= outputDollars;
                      System.out.println((int)outputDollars + " Dollar(s) Back \nItem Vended");
                    }
                else{System.out.println("Sorry out of Change");}}
        
            } 
        else {System.out.println("Not Enough Currency Inserted, Goodbye.");}
        }
    }

  

        