/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine_aparis84;

import java.util.Scanner;
import static VendingMachine_aparis84.Transactions.outOfChange;

/**
 * Emulates a Vending Machine with 3 drinks and 1 Snack
 * @author alexc
 */
public class VendingMachine {

    /** Main Method 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int menuSelection; 
        String go = "y";
        
        while (go.equals("y")){
        
        //Display Menu
        Menu menu = new Menu();
        menu.showMenu();
        menuSelection = input.nextInt();
   
        //Menu Selections
        switch(menuSelection)
            {
            case 0: 
            menu.showMenu();
            menuSelection = input.nextInt();
            break;
                
            case 1:
            //Select Item
            menu.showSelectionMenu();
            menu.selectItem(input.nextInt());
            double selection = 0;
             switch(menu.selection){
                        case 1: 
                        selection = Coke.price;
                        break;
                        case 2: 
                        selection = Juice.price;
                        break;
                        case 3:
                        selection = Water.price;
                        break;
                        case 4:
                        selection = Pretzle.price;
                        break;}
            
            //Inserted Currency Quantities
            System.out.println("Please insert $" + selection+ ": "); 
            System.out.println("Fives: ");
            int insertFives = input.nextInt();
            System.out.println("Dollars: ");
            int insertDollars = input.nextInt();      
            System.out.println("Quarters: ");
            int insertQuarters = input.nextInt();
            
            /**Tests if User choice has enough inventory in-stock if so processes
               transaction by calling the purchase item function **/
                switch(menu.selection){
                    case 1:                      
                        if(Transactions.coke.currentQuantity == 0)
                        {System.out.println("\nOut of Stock!!");break;}
                        
                        else{
                        Transactions.coke.currentQuantity -=1;
                        Transactions.purchaseItem(insertQuarters, insertDollars, insertFives,Coke.price);}
                        
                    break;
                    
                    case 2:
                        if(Transactions.juice.currentQuantity == 0)
                        {System.out.println("\nOut of Stock!!");break;}
                        
                        else{
                        Transactions.juice.currentQuantity -=1;
                        Transactions.purchaseItem(insertQuarters, insertDollars, insertFives,Juice.price);}
                    break;  
                    
                    case 3:
                        if(Transactions.water.currentQuantity == 0)
                        {System.out.println("\nOut of Stock!!");break;}
                        
                        else{
                        Transactions.water.currentQuantity -=1;
                        Transactions.purchaseItem(insertQuarters, insertDollars, insertFives,Water.price);}
                    break;
                    
                    case 4:
                        if(Transactions.pretzle.currentQuantity == 0)
                        {System.out.println("\nOut of Stock!!");break;}
                        
                        else{
                        Transactions.pretzle.currentQuantity -=1;
                        Transactions.purchaseItem(insertQuarters, insertDollars, insertFives,Pretzle.price);}
                    break;
                    
                    default: 
                        System.out.println("Invalid Selection");
                    break;}
            break;
            
            case 2: 
            //Show Inventory Stocked
            Transactions.showInventory();
            break;
        
            case 3: 
            //Restock Inventory
            Transactions.showInventory();
            System.out.println("Please Restock Inventories (Add or Remove by Int Values): ");
            System.out.println("Coke: ");
            Transactions.coke.currentQuantity += input.nextInt();
            System.out.println("Juice: ");
            Transactions.juice.currentQuantity += input.nextInt();
            System.out.println("Water: ");
            Transactions.water.currentQuantity += input.nextInt();
            System.out.println("Pretzle: ");
            Transactions.pretzle.currentQuantity += input.nextInt();
            System.out.println("Fives: ");
            Currency.numbFive += input.nextInt();
            System.out.println("Ones: ");
            Currency.oneBalance += input.nextInt();
            System.out.println("Quarters: ");
            Currency.numbQuarters += input.nextInt();
            Transactions.showInventory();
                    
            break;
            
            default: 
            System.out.println("Invalid Selection");
            break;

        }
        
            System.out.println("\nBack to Menu, y or n?");
                go = input.next();
            if (go.equals("n")){System.out.println("So long");}

            } 

        }

    }
    

