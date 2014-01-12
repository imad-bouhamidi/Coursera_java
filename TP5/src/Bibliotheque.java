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

    Vector chercherDocument(String titre){
        Vector<Document> doc = new Vector<Document>();
        Iterator<Document> index = ensembleDocument.iterator();
        while(index.hasNext()){
            if(titre.indexOf(index.next().toString()) == -1){
                System.out.println("Your document not found :)");
            }else{
                doc.addElement(index.next());
            }
        }
        return doc;
    }

    public void listerDocuments(){
        Iterator<Document> index = ensembleDocument.iterator();
        while(index.hasNext()){
            if(index.next() instanceof Livre){
                Iterator<Adherent> indexAdherent = ensembleAdherent.iterator();
                while(indexAdherent.hasNext()){
                    if(((Livre) index.next()).idEmprunteur == indexAdherent.next().idAdherent){
                        System.out.println(index.next() + " " + indexAdherent.next());
                    }
                }
            }else{
                System.out.println(index.next());
            }
        }
    }

    public static void main(String arg[]){
        Bibliotheque b = new Bibliotheque();
        Scanner clavier = new Scanner(System.in);
        String nom;
        String prenom;
        for(int i = 0; i<3 ; i++){
            System.out.println("entrez le nom");
            nom = clavier.next();
            System.out.println("entrez le prenom");
            prenom =  clavier.next();
            b.ajouterAdherent(new Adherent(nom, prenom));
        }

        Document d = new Livre("OCJP6","Bouha");
        b.ajouterDocument(d);
        d = new Journal("le monde", 12,1,2014);
        b.ajouterDocument(d);

        System.out.println(b);
    }
}