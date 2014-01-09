/**
 * Created with IntelliJ IDEA.
 * User: Imad
 * Date: 12/25/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Triangle {
    Point p1, p2, p3;
    Triangle (Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    Triangle (Point p1, double n) {
        this.p1 = p1;
        this.p2 = new Point(p1.x + n, p1.y);
        this.p3 = new Point(p1.x, p1.y + n);
    }

    double calculerSurface(){
        double d1 = p1.calculerDistance(p2);
        double d2 = p2.calculerDistance(p3);
        double d3 = p3.calculerDistance(p1);
        double k = (d1 + d2 + d3)/2;
        return Math.sqrt(k*(k - d1)*(k - d2)*(k - d3));
    }

    double perimetre() {
        return (p1.calculerDistance(p2)+
                p2.calculerDistance(p3)+
                p3.calculerDistance(p1));
    }

    boolean equals(Triangle T){
        return (p1.equals(T.p1) && p2.equals(T.p2) && p3.equals(T.p3));
    }

}
