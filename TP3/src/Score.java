public class Score {
    private String name;
    private int leScore;
    private int scoreMax;

    public Score(){
        this.name = "inconnu";
        this.leScore = 0;
        this.scoreMax = 100;
    }

    public Score(String nom){
        this.name = nom;
    }

    /*
    public Score(int score){
        this.setLeScore(score); //les modificateurs
    }
    */

    public void setLeScore(int score){
        if(score <= this.scoreMax){
            this.leScore = score;
        }else{
            System.out.println("score max dépassé");
        }
    }

    public void add(int point){
        if((leScore + point) > scoreMax){
            this.leScore = scoreMax;
        }else{
            this.leScore += point;
        }
    }

    public int getLeScore(){
        return leScore;
    }

    public String toString(){
        return "Le joueur est: " + this.name + " ,"
                + "son score est: " + this.leScore
                + " et le score max est: " + this.scoreMax;
    }
}
