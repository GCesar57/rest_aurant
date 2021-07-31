/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phoenix055
 */
public class SuperClass_Parent {
    public double chikenBurger;
    public double chikenBurgerM;
    public double baconBurger;
    public double chikenLegend;
    public double filletOFish;
    
    public double milkshake;
    public double vanillaCone;
    public double classVanilla;
    public double vanMilkShake;
    public double chocMilkShake;
    
    public double meals;
    public double drinks;
    public double totalMealsAndDrinks;
    public double allTotalOfMD;
    //
    public double getAmount(){
        meals = chikenBurger+chikenBurgerM+baconBurger+chikenLegend+filletOFish;
        drinks = milkshake+vanillaCone+classVanilla+vanMilkShake+chocMilkShake;
        totalMealsAndDrinks = meals+drinks;
        allTotalOfMD = totalMealsAndDrinks;
        return allTotalOfMD;
    }//
    //
    private JFrame frame;
    public void iExitSystem(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ", "Restaurant Management ", 
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }//IF
    }//
    //
    //Prices...
    public double pchikenBurger = 3.56;
    public double pchikenBurgerM = 2.97;
    public double pbaconBurger = 3.66;
    public double pchikenLegend = 4.56;
    public double pfilletOFish = 5.56;
    
    public double pmilkshake = 1.56;
    public double pvanillaCone = 2.32;
    public double pclassVanilla = 3.00;
    public double pvanMilkShake = 2.56;
    public double pchocMilkShake = 3.56;
    //
    public double mcTax = 0.90;
    public double cFindTax(double cAmount){
        double findTax = cAmount -(cAmount*mcTax);
        return findTax;
    }//
}
