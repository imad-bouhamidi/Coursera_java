import java.util.Scanner;

public class Bissextiles {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int year = keyBoard.nextInt();
        if((year%4 == 0 && year%100 != 0) || year == 400)
            System.out.println(year + " est Bissextile.");
        else
            System.out.println(year + " est non Bissextile.");
    }
}
