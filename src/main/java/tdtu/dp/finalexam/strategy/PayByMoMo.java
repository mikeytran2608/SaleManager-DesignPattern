/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdtu.dp.finalexam.strategy;

/**
 *
 * @author banto
 */
public class PayByMoMo implements PayStrategy{
    public void pay(int amount){
        System.out.println("Truyen thanh Naruto thanh toán qua ví momo " + amount + " VND");
    }
}
