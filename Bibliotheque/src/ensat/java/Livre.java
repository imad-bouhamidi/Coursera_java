package ensat.java;

public class Livre extends Volume {
	boolean dispo;
	long idEmprunteur;
	public Livre(String titre, String auteur) {
	super(titre, auteur);
	dispo =true;
	idEmprunteur=0;
	}
	boolean empruntable(){
		return true;
	}
	
	public String toString(){
		return ("Livre :"+ super.toString());
	}
	
	

}
