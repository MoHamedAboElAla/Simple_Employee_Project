/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;

import java.util.ArrayList;

/**
 *
 * @author UAS
 */
public class Department {
    private int depart_no;
    private String depart_name;
    ArrayList<Employee>emplist;
    public Department() {
    }
    public Department(int depart_no, String depart_name) {
        this.depart_no = depart_no;
        this.depart_name = depart_name;
         emplist=new ArrayList<Employee>();
    }
    public int getDepart_no() {
        return depart_no;
    }
    public void setDepart_no(int depart_no) {
        this.depart_no = depart_no;
    }
    public String getDepart_name() {
        return depart_name;
    }
    public void setDepatr_name(String depatr_name) {
        this.depart_name = depatr_name;
    }
    public ArrayList<Employee> getEmplist()
    {
        return emplist;
    }
    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    } 
    public void add_employee(Employee emp){
        emplist.add(emp);
    }
    public void remove_employee(int index)
    {
        
        emplist.remove(index);
    }
    public int count_employee()
    {
        return emplist.size();
    }
    public void print_data()
    {
        for(int i=0;i<emplist.size();i++)
        {
            System.out.println(emplist.get(i).getSsn()+" "+emplist.get(i).getName()+" "+emplist.get(i).getSex());   
        }    
    }
    public void print_all_details()
    {
        for(int i=0;i<emplist.size();i++)
        {
            if(emplist.get(i) instanceof SalariedEmployee)
            ((SalariedEmployee)emplist.get(i)).DisplayAllDetails();
            if(emplist.get(i) instanceof HourlyEmployee)
            ((HourlyEmployee)emplist.get(i)).DisplayAllDetails();
                if(emplist.get(i) instanceof CommissionEmployee)
            ((CommissionEmployee)emplist.get(i)).DisplayAllDetails();
        }
    }
}
