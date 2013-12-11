import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        De100 d1 = new De100();
        d1.lance();

        int val = 200;
        boolean result = true;
        do{
            System.out.println("Entrer un nombre entre 1 et 100:");
            Scanner keyBoard = new Scanner(System.in);
            val = keyBoard.nextInt();
            if(d1.tropGrand(val)){
                System.out.println("votre nombre et plus grand que le nombre mystère ...");
            }else{
                if(d1.tropPetit(val)){
                    System.out.println("votre nombre et plus petit que le nombre mystère...");
                }else{
                    result = false;
                }
            }
        }while(result);
        System.out.println("le nombre mystère est " + val);
    }
}
