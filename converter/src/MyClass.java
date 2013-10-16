/**
 * Created with IntelliJ IDEA.
 * User: Imad
 * Date: 10/16/13
 * Time: 9:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyClass {

    public String nom;
    public static String systemExploitation;

    public static int carre(int x)   {
       return x * x;
    }

    public static void permuter(int x, int y) {
        int z = y;
        y = x;
        x = z;
        System.out.println("Interieur de la méthode permuter :");
        System.out.println("x :" + x);
        System.out.println("y :" + y);
    }

}
