import java.util.Scanner;

public class Bissextiles {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int year = clavier.nextInt();
        if(year == 400){
            System.out.println(year + " est Bissextile.");
        }else{
            if(year%4 == 0 && year%100 != 0){
                System.out.println(year + " est Bissextile.");
            }else{
                System.out.println(year + " est non Bissextile.");
            }
        }
    }
}
