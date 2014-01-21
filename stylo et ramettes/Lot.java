package fr.unice.toto.article;

/**
 * Lot "homog�ne" compos� d'un certain nombre d'un m�me type d'articles.
 */
public class Lot extends Article {
  /** article dont le lot est constitu� */
  private Article article; 
  private int nb, pourcentage;

  public Lot(String reference, Article article, int nb, int pourcentage) {
    super(reference);
    this.article = article;
    this.nb = nb;
    this.pourcentage = pourcentage;
  }

  @Override
  public double getPU() {
    return nb * article.getPU() * (100 - pourcentage) / 100;
  }

  @Override
  public String getDescriptif() {
    return "Lot de " + nb + " *" + article.getDescriptif() + "* ";
  }

  @Override
  public String getMarque() {
    return article.getMarque();
  }

  public int getNbArticles() {
    return nb;
  }

  public void setNbArticles(int nbArticles) {
    this.nb = nbArticles;
  }

  public int getPourcentage() {
    return pourcentage;
  }

  public void setPourcentage(int pourcentage) {
    this.pourcentage = pourcentage;
  }

  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }  

  @Override
  public String toString() {
    return super.toString() + ";%r�duction=" + pourcentage 
      + ";compos� de " + nb + " [" + article + "]";
  }
}

