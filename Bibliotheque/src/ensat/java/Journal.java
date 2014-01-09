package ensat.java;



public class Journal extends Document {
private Date d;

Journal(String titre, int jour,int mois, long annee){
	super(titre);
	d=new Date(jour,mois,(int) annee);
}

public String toString(){
	return ("Journal :"+super.toString()+" "+ "date d'apparition: "+ d.toString());
}
}
