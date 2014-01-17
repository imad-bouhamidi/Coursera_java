package ensat.java;

public final class Patron extends Employe {
	private double salaireHebdo;

	
	public Patron(String nom, String prenom, double salaireHebdo){
		super(nom,prenom);
		this.salaireHebdo = salaireHebdo;
	}
	
	public String toString(){
		return("Patron "+ super.toString());
	}
	void gain() {
		salaireMensuel = 4*salaireHebdo;
	}

}
