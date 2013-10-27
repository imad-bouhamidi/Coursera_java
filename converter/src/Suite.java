import java.util.Scanner;

class Suite {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        int temp;
        int inc;
        for(int i = debut; i <= fin ; i++){
            temp = i;
            inc = 0;
            while(temp != 0){
                if(temp%3 == 0){
                    temp+=4;
                    inc++;
                }else{
                    if(temp%4 == 0){
                        temp/=2;
                        inc++;
                    }else{
                        temp-=1;
                        inc++;
                    }
                }
            }
            System.out.println(i + " -> " + inc);
        }

    }
}
