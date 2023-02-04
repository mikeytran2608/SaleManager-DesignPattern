/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdtu.dp.finalexam;

/**
 *
 * @author banto
 */
public class Category {
    public int id;
    public String CatName;

    public Category() {
    }

    public Category(int id, String CatName) {
        this.id = id;
        this.CatName = CatName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String CatName) {
        this.CatName = CatName;
    }

    
}
