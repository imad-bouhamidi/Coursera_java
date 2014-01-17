package ensat.java;

import java.util.Scanner;

public final class TravailleurComission extends Employe {

private double salaireBase;
private float pourcentage;

public TravailleurComission(String nom, String prenom, float pourcentage, double salaireBase){
	super(nom, prenom);
	this.pourcentage =pourcentage;
	this.salaireBase=salaireBase;
	}


	void gain() {
		double chiffreAffaire;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Chiffre d'affaire?");
		chiffreAffaire = clavier.nextDouble();
		salaireMensuel = salaireBase + pourcentage * chiffreAffaire;

	}

  public String toString(){
	return("Travailleur Comission: "+ super.toString());
	
}
	/*public double getSalaireBase() {
		return salaireBase;
	}


	public float getPourcentage() {
		return pourcentage;
	}*/

}
