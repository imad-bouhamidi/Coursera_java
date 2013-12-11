public class Moyenne {
    public static void main(String[] args) {
        int somme = 0;
        int n = args.length;
        for(int i=0; i < n; i++){
            somme += Integer.parseInt(args[i]);
        }
        System.out.println("La moyenne est: " + somme/n);
    }
}
