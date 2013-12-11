import java.util.Scanner;

class Parachutiste {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextInt();
        } while (h0 < 250.0);

        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;
        double t = t0;
        double hauteur = h0;
        double vitesse = v0;
        double accel = 0;
        double s = 2/masse;
        double temp;
        double q;
        while(hauteur > 0){
            t+=1;
            temp = 0 - s * (t - t0);
            q = Math.exp(temp);
            vitesse = (g / s) * (1 - q) + (q * v0);
            hauteur = h0 - (g / s) * (t - t0) - ((v0 - g / s) * (1 - q) / s);
            accel = g - s * vitesse;
            if(vitesse > 343 && vitesse < 344){
                System.out.println("## Felix depasse la vitesse du son");
            }
            if(accel < 0.5 && accel > 0.48 ){
                System.out.println("## Felix a atteint sa vitesse maximale");
            }
            if(hauteur < 2500 && hauteur > 2490){
                System.out.println("## Felix ouvre son parachute");
                s = 25 / masse;
            }
            System.out.format("%.0f, %.4f, %.4f, %.5f\n",
                    t, hauteur, vitesse, accel);
            if(hauteur < 0){
                break;
            }
        }








    }
}
