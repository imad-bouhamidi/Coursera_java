import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Bibliotheque{
    Vector<Adherent> ensembleAdherent;
    Vector<Document> ensembleDocument;

    public Bibliotheque(){
        ensembleAdherent = new Vector<Adherent>();
        ensembleDocument = new Vector<Document>();
    }
    void ajouterDocument(Document d){
        ensembleDocument.addElement(d);
    }

    void ajouterAdherent(Adherent a){
        ensembleAdherent.add(a);
    }

    public String toString(){
        String res = "Les adherents : \n";
        Iterator i = ensembleAdherent.iterator();
        while(i.hasNext()){
            res += i.next().toString() + "\n";
        }
        res += "Les documents: \n";

        i = ensembleDocument.iterator();
        while(i.hasNext()){
            res += i.next().toString() + "\n";
        }
        return res;
    }

    /*Document[] chercherDocument(String titre){
        int n = 5;
        Document[] doc = new Document[n];
        for(int i = 0; i < n; i++){
            if(doc.toString().equals(titre)){

            }
        }
        return doc;
    }*/

    public static void main(String arg[]){
        Bibliotheque b = new Bibliotheque();
        Scanner clavier = new Scanner(System.in);
        String nom;String prenom;
        for(int i = 0; i<3 ; i++){
            System.out.println("entrez le nom");
            nom = clavier.next();
            System.out.println("entrez le prenom");
            prenom =  clavier.next();
            b.ajouterAdherent(new Adherent(nom, prenom));
        }

        Document d = new Livre("Java","Houda");
        b.ajouterDocument(d);
        d = new Journal("le monde", 12,1,2014);
        b.ajouterDocument(d);

        System.out.println(b);
    }
}