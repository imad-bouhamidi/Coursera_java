import java.util.Scanner;

public class Cluedo2 {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Pensez a un personnage : Mlle Rose, ");
        System.out.println("le Professeur Violet, le Colonel Moutarde,");
        System.out.println("le Reverend Olive ou Mme Leblanc.\n");

        /*System.out.print("Votre personnage a-t-il des moustaches ? ");
        System.out.print("(true : oui, false : non) ");
        boolean moustaches = clavier.nextBoolean();*/

        System.out.print("Votre personnage porte-t-il des lunettes ? ");
        boolean lunettes = clavier.nextBoolean();

        System.out.print("Votre personnage porte-t-il un chapeau ? ");
        boolean chapeau = clavier.nextBoolean();

        System.out.print("Est-ce que votre personnage est un homme ? ");
        boolean homme = clavier.nextBoolean();

        System.out.print("==> Le personnage auquel vous pensez est ");

        if(lunettes && !chapeau && homme){
            System.out.print("le Reverend Olive");
        }else{
            if (lunettes) {
                if(chapeau){
                    System.out.print("le Professeur Violet");
                }else {
                    if (!homme) {
                        System.out.print("Mme Leblanc");
                    }else{
                        if(homme){
                            System.out.print("le Reverend Olive");
                        }else{
                            System.out.print("le Colonel Moutarde");
                        }
                    }
                }
            }else {
                System.out.print("Mlle Rose");
            }
        }

        System.out.println();
    }
}
