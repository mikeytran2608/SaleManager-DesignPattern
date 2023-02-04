/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdtu.dp.finalexam.strategy;

/**
 *
 * @author banto
 */
public class PayByCreditCard implements PayStrategy{
    public void pay(int amount){
        System.out.println("Truyen tranh Naruto thanh toán qua creditcard " + amount + " VND");
    }
}
