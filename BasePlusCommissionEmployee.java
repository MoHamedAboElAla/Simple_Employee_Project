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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double base;
    public BasePlusCommissionEmployee(double base, double gross_sales, double commission_rate, String Name, String Address, int Ssn, Gender Sex) {
        super(gross_sales, commission_rate, Name, Address, Ssn, Sex);
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
        @Override
    public double earning() {
    return base+super.earning();
    }
    @Override
    public void DisplayEarnings() {
        System.out.println("Earnings= "+earning());
        DisplayEarnings();
    }
    @Override
    public void DisplayAllDetails() {
        super.DisplayAllDetails();
    }
    
    

}
