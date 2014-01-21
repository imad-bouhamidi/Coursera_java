package Payroll;

public final class TravailleurPiece extends Employe {
    private int numItems;
    private double earnPerItems;

    public TravailleurPiece(String traPieceFirstName, String traPieceLastName, int numItems, double earnPerItems){
        super(traPieceFirstName, traPieceLastName);
        setNumItems(numItems);
        setEarnPerItems(earnPerItems);
    }

    public void setNumItems(int numItems){
        if(numItems < 0){
            numItems = 0;
        }else{
            this.numItems = numItems;
        }
    }

    public void setEarnPerItems(double earnPerItems){
        this.earnPerItems = earnPerItems;
    }

    @Override
    public double gains() {
        return numItems * earnPerItems;
    }

    public String toString(){
        return "Travailleur Piece: " + super.toString() + ": " + "earn " + this.gains() + " per week.";
    }
}
