/**
 * Created with IntelliJ IDEA.
 * User: Imad
 * Date: 12/25/13
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Point {
    double x, y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    double calculerDistance(Point p){
        double dx=x - p.x;
        double dy=y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public boolean equals(Point p){
        return ((this.x == p.x) && (this.y == p.y));
    }

    /*String toString(){
        return "les coordonnées sont: " + this.x + "et " + this.y;
    }*/
}
