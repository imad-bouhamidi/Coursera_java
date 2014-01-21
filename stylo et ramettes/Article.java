package fr.unice.toto.article;

/**
 * Un article vendu dans le magasin.
 * On suppose que tout article a une référence.
 */
public abstract class Article {
  private String reference;

  /**
   * Crée un article qui n'a qu'une référence. Son état sera
   * initialisé ensuite.
   */
  protected Article(String reference) {
    this.reference = reference;
  }

  public String getReference() {
    return reference;
  }

  // Les méthodes suivantes correspondent à des attributs de tout
  // article, mais qui sont "calculées" dans la classe Lot,
  // et pas associées à une variable d'état privée
  public abstract String getDescriptif();

  public abstract double getPU();

  /**
   * Retourne la marque de l'article.
   * Par défaut, un article n'a pas de marque.
   * Un article unitaire a toujours une marque (?),
   * mais un lot peut avoir une marque ou non :
   *   - les lots hétérogènes peuvent ne pas avoir de marque s'ils contiennent
   *     des articles de marques différentes (pas traité dans cet exercice)
   *   - un lot homogène aura une marque si l'article dont il est composé
   *     a une marque (l'article pourrait être un lot hétérogène, même si on
   *     peut considérer que cette situation serait un peu tordue)
   */
  public String getMarque() {
    return "Sans marque";
  }

  public String toString() {
    return this.getClass().getName() + ":reference=" 
      + reference + ";descriptif=" + getDescriptif() 
      + ";marque=" + getMarque() + ";PU=" + getPU();
  }

}
