package ensat.java;

public abstract class Employe {
private String nom;
private String prenom;
protected double salaireMensuel;

 public double getSalaireMensuel() {
	return salaireMensuel;
}

public Employe(String nom, String prenom){
	 this.nom= nom;
	 this.prenom = prenom;
 }

public String getNom() {
	return nom;
}

public String getPrenom() {
	return prenom;
}
 
public String toString(){
	return ("Nom: "+nom+"Prenom: "+prenom + "salaire: " + salaireMensuel);
}

abstract void gain();

}
