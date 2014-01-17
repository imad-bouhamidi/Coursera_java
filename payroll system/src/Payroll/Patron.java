package Payroll;

public final class Patron extends Employe {
    private final double weeklyPayRoll;

    public Patron(String patronFirstName, String patronLastName, double weeklyPayRoll){
        super(patronFirstName, patronLastName);
        this.weeklyPayRoll = weeklyPayRoll;
    }

    @Override
    public double gains() {
        return weeklyPayRoll;
    }

    public String toString(){
        return "Patron: " + super.toString() + " " + "earn " + this.gains() + " per week.";
    }
}
