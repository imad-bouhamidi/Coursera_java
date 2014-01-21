package fr.unice.toto.article;

/**
 * Ramette de feuilles de papier.
 */
public class Ramette extends ArticleUnitaire {
  private int grammage;

  public Ramette(String reference, String descriptif, String marque, 
                 double pu, int grammage) {
    super(reference, descriptif, marque, pu);
    this.grammage = grammage;
  }

  public int getGrammage() {
    return grammage;
  }

  @Override
  public String toString() {
    return super.toString() + ";grammage=" + grammage;
  }

}
