public class Dictionnaire extends Volume {

    public Dictionnaire(String titre, String auteur) {
        super(titre, auteur);
    }

    public String toString(){
        return ("Dictionnaire: " + super.toString());
    }
}