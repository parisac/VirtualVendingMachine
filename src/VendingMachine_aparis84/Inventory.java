/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine_aparis84;

/**Contains attributes and methods related to inventories (
 *
 * @author alexc
 */
public class Inventory {

//Declare Price Quantity Variables 

    /**
     *
     */
    public double price;

    /**
     *
     */
    public double maxQuantity = 4; 

    /**
     *
     */
    public double currentQuantity = maxQuantity;
     

//Getter and Setter Methods
/**
 * sets inventories price to price parameter
     * @param price
 */   
public void setPrice(double price){
    this.price = price;}
/**
 * adds to inventory quantities if less than 4
     * @param quantity
 */
public void addQuantity(double quantity){
    if (quantity>0 && quantity<4){
          this.currentQuantity += quantity;}
    else {System.out.println("Values must be whole numbers"
            + "greater than 1");}}
/**
 * removes inventory when sold 
 * 
 */
public void sellQuantity(){
    if (this.currentQuantity > 0){
        this.currentQuantity -=1;}
    else{System.out.println("Sold Out");}}

/**
 * gets price of object
 * @return - returns price of double 
 */
public double getPrice(){
    return this.price;}

/**
 * gets quantity of inventory 
 * @return - quantity amount 
 */
public double getQuantity(){
    return this.currentQuantity;}
    
}
