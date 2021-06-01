/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final332;

/**
 *
 * @author natthapornwimonanupong
 */
public class Room {
    
    public ManageRoom singleRoom(){
        
        ManageRoom mr = new ManageRoom();
        mr.addItem(new SingleBed());
        mr.addItem(new Service());
        return mr;
    }
    
    public ManageRoom doubleRoom(){
        ManageRoom mr = new ManageRoom();
        mr.addItem(new DoubleBed());
        mr.addItem(new Service());
       return mr;
    }
   
    
}
