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
public class Promtpay extends Payment{

    @Override
    public String name() {
       return "Promtpay";
    }
    
    @Override
    public String numberpayment(){
        String numpay = "0926749833";
        return numpay;
    }
    
}
