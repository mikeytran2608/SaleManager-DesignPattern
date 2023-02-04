/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdtu.dp.finalexam;


/**
 *
 * @author banto
 */
public class DataMgr {
    private static DataMgr instance = null;
    
    private DataMgr(){
        System.out.println("TRUYEN THANH NARUTO");
    }
    
    public static DataMgr getInstance(){
        if(instance == null){
            instance = new DataMgr();
        }
        return instance;
    }
}
