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
public class Currency {
/*//Inserted Currency Variables 
public int quartersInserted = 0;
public int oneInserted = 0;        
public int fiveInserted = 0;
public int totalInserted = 0;*/


//Total Currency Variables 

    /**
     *
     */
public static double numbQuarters = 100;    

    /**
     *
     */
    public static double quarterBalance = numbQuarters*0.25;

    /**
     *
     */
    public static double oneBalance = 100;

    /**
     *
     */
    public static double numbFive = 0;

    /**
     *
     */
    public static double fiveBalance = numbFive*5;

//Default Currency Constructor

Currency(){
//Amount of Cash Initially Inserted in Machine 
this.numbQuarters = 100;
this.oneBalance = 100;

    
}



}
