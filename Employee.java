package employeeproject;
enum Gender{Male,Female}
public abstract class Employee {
   private String Name,Address;
   private int Ssn;
   private Gender Sex;
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public int getSsn() {
        return Ssn;
    }
    public void setSsn(int Ssn) {
        this.Ssn = Ssn; 
    }
    public Gender getSex() {
        return Sex;
    }
    public void setSex(Gender Sex) {
        this.Sex = Sex;
    }
    public Employee() {
    }
    public Employee(String Name, String Address, int Ssn, Gender Sex) {
        this.Name = Name;
        this.Address = Address;
        this.Ssn = Ssn;
        this.Sex = Sex;
    }
    public abstract double earning();
    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", Address=" + Address + ", Ssn=" + Ssn + ", Sex=" + Sex + '}';
    }
}
