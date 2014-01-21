package fr.unice.toto.facture;

import fr.unice.toto.article.*;

/**
 * Une facture.
 */
public class Facture {
  // Nombre maximum de lignes par défaut
  private static int NB_MAX_LIGNES = 10;
  private static int numeroCourant = 0;
  private String client, date;
  private Ligne[] lignes;
  /** Nombre de lignes dans la facture */
  private int nbLignes = 0;
  /** Numéro de la facture */
  private int numero = 0;


  public Facture(String client, String date, int nbLignes) {
    this.client = client;
    this.date = date;
    this.lignes = new Ligne[nbLignes];
    numero = ++numeroCourant;
  }

  public Facture(String client, String date) {
    this(client, date, NB_MAX_LIGNES);
  }

  public void ajouterLigne(Article article, int quantite) {
    lignes[nbLignes++] = new Ligne(article, quantite);
  }

  public double getPrixTotal() {
    double pt = 0;
    for (int i = 0; i < nbLignes; i++) {
      pt += lignes[i].prixTotal();
    }
    return pt;
  }

  // Nécessite le JDK 5
  public void afficheToi() {
    System.out.printf("Facture numéro %d ; Client : %s ; Date : %s %n",
		       numero, client, date);
    System.out.printf("%7s | %6s | %20s | %20s | %10s | %10s %n",
		       "Quant.", "Réf.", "Nom", "Marque", "PU", "PT");
    for (int i = 0; i < nbLignes; i++) {
      lignes[i].afficheToi();
    }
    System.out.printf("%56s Prix total facture : %10.2f", "", getPrixTotal());
  }

  @Override
  public String toString() {
    String descript = 
      "Facture " + numero + ";Client=" + client + ";Date=" + date + "\n";
    for (int i = 0; i < nbLignes; i++) {
      descript += lignes[i] + "\n";
    }
    descript += "Prix total Facture=" + getPrixTotal();
    return descript;
  }
}

class Ligne {
  private Article article;
  private int quantite;

  Ligne(Article article, int quantite) {
    this.article = article;
    this.quantite = quantite;
  }

  Article getArticle() {
    return article;
  }

  int getQuantite() {
    return quantite;
  }

  // Nécessite le JDK 5
  void afficheToi() {
    System.out.printf("%7d | %6s | %20.20s | %20.20s | %10.2f | %10.2f %n",
		      quantite, article.getReference(), 
		      article.getDescriptif(), 
		      article.getMarque(), article.getPU(), prixTotal());
  }

  double prixTotal() {
    return article.getPU() * quantite;
  }
    
  @Override
  public String toString() {
    return quantite + " " + article;
  }   
}
