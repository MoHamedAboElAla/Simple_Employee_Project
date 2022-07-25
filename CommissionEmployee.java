/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;

/**
 *
 * @author UAS
 */
public class CommissionEmployee extends Employee implements Displayable {
    private double gross_sales, commission_rate;
    public CommissionEmployee(double gross_sales, double commission_rate, String Name, String Address, int Ssn, Gender Sex) {
        super(Name, Address, Ssn, Sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }
    public double getGross_sales() {
        return gross_sales;
    }
    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }
    public double getCommission_rate() {
        return commission_rate;
    }
    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    @Override
    public double earning() {
        return commission_rate * gross_sales;
    }
    @Override
    public String toString() {
        return "CommissionEmployee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
    }
    @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void DisplayEarnings() {
        System.out.println(earning());
    }

}
