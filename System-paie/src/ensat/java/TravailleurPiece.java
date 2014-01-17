package ensat.java;

import java.util.Scanner;

public final class TravailleurPiece extends Employe{
private double prixPiece;

/*public double getPrixPiece() {
	return prixPiece;
}*/

public TravailleurPiece(String nom, String prenom, double prixPiece) {
	super(nom,prenom);
	this.prixPiece = prixPiece;
	
}
public String toString(){
	return("TravailleurPiece "+ super.toString());
}


void gain() {
    int nbPiece;
	Scanner clavier = new Scanner(System.in);
	System.out.println("nb de piece produite?");
	nbPiece = clavier.nextInt();
	salaireMensuel = prixPiece * nbPiece;
	
}



}

