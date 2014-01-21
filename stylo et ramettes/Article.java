package fr.unice.toto.article;

/**
 * Un article vendu dans le magasin.
 * On suppose que tout article a une r�f�rence.
 */
public abstract class Article {
  private String reference;

  /**
   * Cr�e un article qui n'a qu'une r�f�rence. Son �tat sera
   * initialis� ensuite.
   */
  protected Article(String reference) {
    this.reference = reference;
  }

  public String getReference() {
    return reference;
  }

  // Les m�thodes suivantes correspondent � des attributs de tout
  // article, mais qui sont "calcul�es" dans la classe Lot,
  // et pas associ�es � une variable d'�tat priv�e
  public abstract String getDescriptif();

  public abstract double getPU();

  /**
   * Retourne la marque de l'article.
   * Par d�faut, un article n'a pas de marque.
   * Un article unitaire a toujours une marque (?),
   * mais un lot peut avoir une marque ou non :
   *   - les lots h�t�rog�nes peuvent ne pas avoir de marque s'ils contiennent
   *     des articles de marques diff�rentes (pas trait� dans cet exercice)
   *   - un lot homog�ne aura une marque si l'article dont il est compos�
   *     a une marque (l'article pourrait �tre un lot h�t�rog�ne, m�me si on
   *     peut consid�rer que cette situation serait un peu tordue)
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
