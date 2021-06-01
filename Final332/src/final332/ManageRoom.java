/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final332;

import java.util.ArrayList;

/**
 *
 * @author natthapornwimonanupong
 */

// เก็บ arraylist ข้อมูลห้องที่ลูกค้าจอง
public class ManageRoom {
    private ArrayList<Item> items = new ArrayList<Item>();
    
    public void addItem(Item i){
        items.add(i);
    }
    
    public float getPrice(){
        float price = (float) 0.0;
        Item item;
 
        for(Item i : items){
            price += i.price();
        }
        return price;
    }
    
    public void ShowDetail(){
        for(Item i : items){
            System.out.print("Room : "+i.name());
            System.out.println(", Price : "+ i.price());
        }
    }
    
    
}
