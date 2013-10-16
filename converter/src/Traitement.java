/**
 * Created with IntelliJ IDEA.
 * User: Imad
 * Date: 10/16/13
 * Time: 9:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class Traitement {

    public static void main(String[] args) {
        System.out.println(MyClass.carre(2));
        MyClass.systemExploitation = "Windows 7";
        MyClass myClass1 = new MyClass();
        myClass1.systemExploitation="XP";
        myClass1.nom="amine";
        MyClass myClass2 = new MyClass();
        myClass2.nom="imad";
        System.out.println(MyClass.systemExploitation);
        System.out.println(myClass1.nom);
        System.out.println(myClass2.nom);


        int x = 4;
        int y = 5;
        System.out.println("avant permutation :");
        System.out.println("x :" + x);
        System.out.println("y :" + y);
        System.out.println("-------------------------");
        MyClass.permuter(x, y);
        System.out.println("-------------------------");
        System.out.println("apres permutation :");
        System.out.println("x :" + x);
        System.out.println("y :" + y);
    }
}
