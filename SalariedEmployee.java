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
public class SalariedEmployee extends Employee implements Displayable{
   private double salary,bouns,deductions;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getBouns() {
        return bouns;
    }
    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
    public double getDeductions() {
        return deductions;
    }
    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
    public SalariedEmployee() {
    }
    public SalariedEmployee(double salary, double bouns, double deductions, String Name, String Address, int Ssn, Gender Sex) {
        super(Name, Address, Ssn, Sex);
        this.salary = salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }    
    @Override
    public double earning() {
    return (salary+bouns)-deductions;
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
    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deductions=" + deductions + '}';
    }
    
}
