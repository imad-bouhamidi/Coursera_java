public class Document {
    private String titre;

    Document(String titre){
        this.titre = titre;
    }

    boolean empruntable(){
        return false;
    }

    public String toString(){
        return titre;
    }
}