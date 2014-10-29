/**
 *  Java program that calculates the optimum change to be returned in a transaction.
 *  Because I hate coins.
 *  
 *  Input: Price and amount ($) received.
 *  Output: Change to be returned, using the least amount of US bills and coins.
 * 
 *  Based on this reddit daily challenge:
 *  http://goo.gl/tjtZpU
 */
package optimus_change;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author todyerutz@plainintricacy.wordpress.com
 */
public class Optimus_Change {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the price:");
        System.out.print("$");
        double price = in.nextDouble();
        System.out.println("Please enter the amount received:");
        System.out.print("$");
        double input = in.nextDouble();
        in.close();
        if(price<=input){
            calc_change(Double.valueOf(df.format(input-price)));
        }else{
            System.out.println("Not enough money received. Please try again with other values.");
            System.out.println();
        }
    }
    
    public static void calc_change(double value){
        int pny = 0, nik = 0, dim = 0, qrt = 0, wsh = 0, lin = 0, ham = 0, jks = 0, grt = 0, ben = 0;
        System.out.println();
        System.out.println("Change to be returned:");
        System.out.println();
        int cents = (int)(value*100);
        if(cents>=10000){
            ben+=cents/10000;
            cents%=10000;
        }
        if(cents>=5000){
            grt+=cents/5000;
            cents%=5000;
        }
        if(cents>=2000){
            jks+=cents/2000;
            cents%=2000;
        }
        if(cents>=1000){
            ham+=cents/1000;
            cents%=1000;
        }
        if(cents>=500){
            lin+=cents/500;
            cents%=500;
        }
        if(cents>=100){
            wsh+=cents/100;
            cents%=100;
        }
        if(cents>=25){
            qrt+=cents/25;
            cents%=25;
        }
        if(cents>=10){
            dim+=cents/10;
            cents%=10;
        }
        if(cents>=5){
            nik+=cents/5;
            cents%=5;
        }
        if(cents>=1){
            pny=cents;
        }
        if(ben>0){
            System.out.println("One hundred dollar bills: " + ben);
        }
        if(grt>0){
            System.out.println("Fifty dollar bills: " + grt);
        }
        if(jks>0){
            System.out.println("Twenty dollar bills: " + jks);
        }
        if(ham>0){
            System.out.println("Ten dollar bills: " + ham);
        }
        if(lin>0){
            System.out.println("Five dollar bills: " + lin);
        }
        if(wsh>0){
            System.out.println("One dollar bills: " + wsh);
        }
        if(qrt>0){
            System.out.println("Quarters: " + qrt);
        }
        if(dim>0){
            System.out.println("Dimes: " + dim);
        }
        if(nik>0){
            System.out.println("Nickels: " + nik);
        }
        if(pny>0){
            System.out.println("Pennies: "+pny);
        }
        System.out.println();
        }
    }
    