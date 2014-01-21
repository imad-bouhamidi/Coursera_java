package fr.unice.toto.article;

/**
 * Articles unitaires (en opposition aux lots).
 * Le prix et la description ne sont pas des "variables calculées"
 * d'après d'autres attributs de l'article.
 */
public abstract class ArticleUnitaire extends Article {
  private String marque;
  private double pu;
  private String descriptif;

  public ArticleUnitaire(String reference) {
    super(reference);
  }

  public ArticleUnitaire(String reference, String descriptif, String marque,
                         double pu) {
    super(reference);
    this.marque = marque;
    this.pu = pu;
    this.descriptif = descriptif;
  }

  @Override
  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  @Override
  public double getPU() {
    return pu;
  }

  public void setPU(double pu) {
    this.pu = pu;
  }

  public void setDescriptif(String descriptif) {
    this.descriptif = descriptif;
  }

  @Override
  public String getDescriptif() {
    return descriptif;
  }

  // Inutile de redéfinir toString() car le PU et le descriptif 
  // sont déjà affichés par la classe mère (Article)

}
