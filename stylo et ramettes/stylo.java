package fr.unice.toto.article;

/**
 * Stylo.
 */
public class Stylo extends ArticleUnitaire {
  private String couleur;

  public Stylo(String reference, String descriptif, String marque, 
               double pu, String couleur) {
    super(reference, descriptif, marque, pu);
    this.couleur = couleur;
  }

  public String getCouleur() {
    return couleur;
  }

  @Override
  public String toString() {
    return super.toString() + ";couleur=" + couleur;
  }
}
