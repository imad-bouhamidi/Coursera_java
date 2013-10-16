import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    double x = 1;
        x = 2.;
        System.out.println("La variable n contient " + x + ".");

        Scanner keyB = new Scanner(System.in);
        System.out.println("Entrez une ligne ");
        String s = keyB.nextLine();
        System.out.println("Entrez une valeur entier ");
        int n = keyB.nextInt();
        System.out.println("Entrez une valeur Double ");
        double d = keyB.nextDouble();
        System.out.println("La variable n contient " + n);
        System.out.println("La variable d contient " + d);
        System.out.println("La variable s contient " + s);

    }
}
