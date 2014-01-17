package Payroll;

public abstract class Employe {
    private String firstName;
    private String lastName;
    public abstract double gains();

    //constructeur a 2 arguments
    public Employe(String employeeFirstName, String employeeLastName){
        this.firstName = employeeFirstName;
        this.lastName = employeeLastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return getLastName() + " " + getFirstName();
    }
}
