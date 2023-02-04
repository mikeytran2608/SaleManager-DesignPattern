/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdtu.dp.finalexam.command;

/**
 *
 * @author banto
 */
public class RentalControl {
    private Command command;
    
    public void setCommand(Command command){
        this.command = command;
    }
    
    public void RunCommand(){
        command.Run();
    }
}
