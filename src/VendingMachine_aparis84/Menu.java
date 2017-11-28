/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine_aparis84;

/**
 *
 * @author alexc
 */
public class Menu {

int selection; 

/**
 * Shows main menu
 */
public static void showMenu(){
    System.out.println("Menu:\n"
        +"\t0 - Return to Menu\n"
        +"\t1 - Make Purchase\n"
        +"\t2 - Show Inventory Stocked\n"
        +"\t3 - Restock Inventory or Cash\n");}
/**
 * Shows items that can be bought 
 */
public static void showSelectionMenu(){
//Declare Purchase Item Variable and instance objects
        Coke coke = new Coke();
        Juice juice = new Juice();
        Water water = new Water();
        Pretzle pretzle = new Pretzle();

    System.out.println("Select an Item: "
        +"\n\t1 - Coke:   $" + coke.getPrice()  
        +"\n\t2 - Juice:  $" + juice.getPrice()
        +"\n\t3 - Water:  $" + water.getPrice()
        +"\n\t4 - Pretzle:$" +pretzle.getPrice());}
/**
 * helper method that stores users selection as an int
 * @param selection - users input
 */
public void selectItem(int selection){
        if (selection >0 && selection <5)
            {this.selection = selection;}
        else {System.out.println("Invalid Selection");}    
    }

}
