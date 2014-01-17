package Payroll;

public final class TravailleurCommission extends Employe {
    private double salary;       //salaire d'un travailleur de commission
    private double totalSales;   //somme total de vente
    private double salesPerc;    //pourcentage de vente

    public TravailleurCommission(String travCommFirstName, String travCommLastName,
                                 double normalSalary, double sales, double percentage){
        super(travCommFirstName, travCommLastName);
        this.salary = normalSalary;
        setTotalSales(sales);
        setSalesPerc(percentage);
    }

    public void setSalary(double normalSalary){
        if(normalSalary < 0){
            this.salary = 0;
        }else{
            this.salary = normalSalary;
        }
    }

    public void setTotalSales(double sales){
        if(sales < 0){
            this.totalSales = 0;
        }else{
            this.totalSales = sales;
        }
    }

    public void setSalesPerc(double perc){
        if(perc < 0 || perc > 1){
            this.salesPerc = 0;
        }else{
            this.salesPerc = perc;
        }
    }

    @Override
    public double gains() {
        return this.salary + (this.totalSales * this.salesPerc);
    }

    public String toString(){
        return "Travailleur Commission: " + super.toString() + " " + "earn " + this.gains() + " per week.";
    }
}
