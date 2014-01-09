package ensat.java;

public class Volume extends Document {
private String auteur;

Volume(String titre, String auteur){
	super(titre);
	this.auteur = auteur;
	}

public String toString(){
	return (super.toString()+ " "+ auteur);
}
}
