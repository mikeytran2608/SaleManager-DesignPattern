/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tdtu.dp.finalexam;

import tdtu.dp.finalexam.choices.Choices;
import tdtu.dp.finalexam.command.GiveBackCommand;
import tdtu.dp.finalexam.command.RentCommand;
import tdtu.dp.finalexam.command.RentalControl;
import tdtu.dp.finalexam.strategy.PayByMoMo;
import tdtu.dp.finalexam.strategy.PayStrategy;

/**
 *
 * @author banto
 */
public class Main {

    public static void main(String[] args) {
        DataMgr datamgr = DataMgr.getInstance(); //Singleton // 
        DataMgr datamgr1 = DataMgr.getInstance(); //Singleton // 

        
        PayStrategy paybymomo = new PayByMoMo(); //Strategy //
        Choices choi = new Choices(paybymomo); //Strategy //
        
        
        RentalControl rentalcontrol = new RentalControl(); // Command //
        //GiveBackCommand gbcmd = new GiveBackCommand(); // Command //
        RentCommand rentcmd = new RentCommand();
        
        // UI //
        choi.executeStrategy(10000);
        //rentalcontrol.setCommand(gbcmd);
        //rentalcontrol.RunCommand();
        rentalcontrol.setCommand(rentcmd);
        rentalcontrol.RunCommand();
    }
}
