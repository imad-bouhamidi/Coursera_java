import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Article[] article = new Article[3]; // create an Array that contain 3 articles
        int index;
        long reference;
        String intitule;
        float prixHT;
        int quantiteEnStock;
        System.out.println("Entrer 3 article: ");
        //a loop to affect 3 articles to the array
        for(index=0; index<3; index++){
            System.out.println("article: " + (index+1));
            //saisir de la variable reference
            System.out.println("Entrer la reference de l'article: ");
            Scanner keyBoard = new Scanner(System.in);
            reference = keyBoard.nextLong();

            //saisir de la variable intitule
            System.out.println("Entrer l'intitule de l'article: ");
            intitule = keyBoard.next();

            //saisir de la variable prixHT
            System.out.println("Entrer le prixHT de l'article: ");
            prixHT = keyBoard.nextFloat();

            //saisir de la variable quantiteEnStock
            System.out.println("Entrer la quantiteEnStock de l'article: ");
            quantiteEnStock = keyBoard.nextInt();

            //affectation des variables a chaque article
            article[index] = new Article(reference, intitule, prixHT, quantiteEnStock);
        }
        for(index=0; index<3; index++ ){
            System.out.println(article[index]);
        }
        if(article[0].equals(article[1]))
            System.out.println("true");
        else System.out.println("false");

    }
}
