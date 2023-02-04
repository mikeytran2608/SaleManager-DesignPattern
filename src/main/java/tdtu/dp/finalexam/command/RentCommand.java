/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdtu.dp.finalexam.command;
import tdtu.dp.finalexam.command.BookRental;
/**
 *
 * @author banto
 */
public class RentCommand implements Command{
    BookRental bookrental = new BookRental();
    @Override
    public void Run() {
        bookrental.Rent();
    }
    
}
