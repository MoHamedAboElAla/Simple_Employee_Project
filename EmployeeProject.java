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
public class EmployeeProject {


    public static void main(String[] args) {
        Department depart=new Department(1, "Computer Science");
                
        SalariedEmployee se=new SalariedEmployee(15000,1000, 500,"Mohamed","Zagzig",1200,Gender.Male);
          depart.add_employee(se);
       
     HourlyEmployee he=new HourlyEmployee(100,6,"Ahmed","Cairo",1300,Gender.Male);
          depart.add_employee(he);
  
     CommissionEmployee ce=new CommissionEmployee(14000,0.25, "Eman","Giza", 1400, Gender.Female);
          depart.add_employee(ce);
         System.out.println(depart.count_employee());
         depart.print_data();
         depart.print_all_details();
        
    }
    
}
