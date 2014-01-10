public class BD extends Volume {
    String dessinateur;

    public BD(String titre, String auteur, String dessinateur) {
        super(titre, auteur);
        this.dessinateur = dessinateur;
    }

    public String toString(){
        return ("BD: " + super.toString() + "dessinateur= " + dessinateur);
    }
}