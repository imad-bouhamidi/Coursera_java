public class Test {
    public static void main(String[] args) {
        Score s = new Score();
        System.out.println(s);
        System.out.println(s.getLeScore());
        s.setLeScore(50);
        System.out.println(s);
        s.add(50);
        System.out.println(s);
        s.setLeScore(101);
        System.out.println(s);
    }
}
