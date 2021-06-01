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
public class Mathod{
    private Payment pay;
    
    
    public Mathod(String p){
        if(p.equals("1")){
            Payment c = new Cash();
            System.out.println("ช่องทางการชำระเงิน : "+ c.name());
        }
        else if(p.equals("2")){
            Payment c = new Credit();
            System.out.println("ช่องทางการชำระเงิน : "+ c.name());
        }
        else{
            Payment c = new Promtpay();
            
            System.out.println("ช่องทางการชำระเงิน : "+ c.name());
            System.out.println("Promtpay hotel : "+ c.numberpayment());
        }
    }
}
