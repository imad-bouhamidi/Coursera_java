public class Bissextile {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        if((year%4 == 0 && year%100 != 0) || year == 400)
            System.out.println(year + " est Bissextile.");
        else
            System.out.println(year + " est non Bissextile.");
    }
}
