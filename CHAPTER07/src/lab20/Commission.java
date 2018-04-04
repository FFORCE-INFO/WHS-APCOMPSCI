/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20;

/**
 *
 * @author Frank
 */
public class Commission extends Hourly{
     double totalSales;
      double commissionRate;
      
   public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate, double comm) {
    super(eName, eAddress, ePhone, socSecNumber, rate);
    commissionRate = comm;
   }
   public void addSales(double sales)
   {
       totalSales += sales;
   }
   public double pay()
   {
       double payment = super.pay();
       payment += totalSales * commissionRate;
       totalSales = 0;
       return payment;
     }
}
