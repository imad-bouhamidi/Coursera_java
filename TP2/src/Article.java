public class Article {
    private long reference;
    private String intitule;
    private float prixHT;
    private int quantiteEnStock;

    public Article(long reference, String intitule, float  prixHT, int quantiteEnStock){
        this.reference = reference;
        this.intitule = intitule;
        this.prixHT = prixHT;
        this.quantiteEnStock = quantiteEnStock;
    }

    public long getReference(){
        return reference;
    }
    public String getIntitule(){
        return intitule;
    }
    public float getPrixHT(){
        return prixHT;
    }
    public int getQuantiteEnStock(){
        return quantiteEnStock;
    }

    public void approvisionner(int nombreUnites){
        this.quantiteEnStock += nombreUnites;
    }

    public boolean vendre(int nombreUnites){
        if(nombreUnites > this.quantiteEnStock){
            return false;
        }
        else{
            this.quantiteEnStock -= nombreUnites;
            return true;
        }
    }
    public float prixTTC(){
        return (prixHT + prixHT*0.196f);
    }
    public String toString(){
        return "la référence de l'article est: " + this.getReference() +
                " l’intitulé de l'article est: " + this.getIntitule() +
                " le prix de l'article est: " + this.getPrixHT();

    }
    public boolean equals(Article unArticle){
        if(unArticle.reference == this.reference){
            return true;
        }
        else{
            return false;
        }
    }

}
