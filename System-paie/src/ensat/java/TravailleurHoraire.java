package ensat.java;

import java.util.Scanner;

public final class TravailleurHoraire extends Employe {
    private double prixHN;
    private double prixHS;
    
	public TravailleurHoraire(String nom, String prenom, double prixHN, double prixHS){
    	super(nom,prenom);
    	this.prixHN =prixHN;
    	this.prixHS =prixHS;
    	
    }
	
	public String toString(){
		return ("TravailleurHoraire "+ super.toString());
	}
	void gain() {
		int HS, HN;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Heure sup?");
		HS = clavier.nextInt();
        System.out.println("Heure N?");
		HN = clavier.nextInt();
		salaireMensuel = (HS * prixHS) + (HN *prixHN); 
	}

}
