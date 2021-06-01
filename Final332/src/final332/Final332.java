/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final332;

import java.lang.reflect.Method;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author natthapornwimonanupong
 */
public class Final332 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room b = new Room();
        ManageRoom mr = new ManageRoom();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("เลือกห้อง ห้องเดี่ยว(1) หรือ ห้องคู่(2) : ");
        String input = sc.nextLine();
        System.out.print("จำนวนห้อง : ");
        int people = sc.nextInt();
        if(input.equals(1)){
            mr = b.singleRoom();
        }
        else{
            mr = b.doubleRoom();
        }
        mr.ShowDetail();
        System.out.println("Total price :" + mr.getPrice()*people);
        
        System.out.print("ต้องการจองห้องพักหรือไม่ (y/n) : ");
        String request = sc.next();
        if(request.equals("y")){
            System.out.print("ชำระเงินอย่างไร เงินสด(1), บัตรเครดิท(2), พร้อมเพย์(3) : ");
            String method = sc.next();
            Mathod payment = new Mathod(method);
        }
        else{
            exit();
        }
    }   
}
