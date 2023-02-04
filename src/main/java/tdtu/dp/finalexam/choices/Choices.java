/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdtu.dp.finalexam.choices;

import java.util.Scanner;
import tdtu.dp.finalexam.strategy.PayStrategy;

/**
 *
 * @author banto
 */
public class Choices {
    private PayStrategy paystrategy;
    
    public Choices(PayStrategy paystrategy){
        this.paystrategy = paystrategy;
    }
    
    public void executeStrategy(int amount){
        paystrategy.pay(amount);
    }
    
    public static int takeInput(int min, int max)
    {    
        String choice;
        Scanner input = new Scanner(System.in);        
        
        while(true)
        {
            System.out.println("\nEnter Choice: ");

            choice = input.next();

            if((!choice.matches(".*[a-zA-Z]+.*")) && (Integer.parseInt(choice) > min && Integer.parseInt(choice) < max))
            {
                return Integer.parseInt(choice);
            }
            
            else
                System.out.println("\nInvalid Input.");
        }
          
    }
}

