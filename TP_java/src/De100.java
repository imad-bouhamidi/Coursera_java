public class De100 {
    int valeur;
    public De100(){
        valeur = 1;
    }

    void lance(){
        valeur = (int) (Math.random()*100 + 1);
    }

    boolean exact(int chiffre){
        if(chiffre == valeur)
            return true;
        else
            return false;
    }

    boolean tropGrand(int chiffre){
        if(chiffre > valeur)
            return true;
        else
            return false;
    }

    boolean tropPetit(int chiffre){
        if(chiffre < valeur)
            return true;
        else
            return false;
    }
}
