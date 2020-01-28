public class Stretch {
    Point A;
    Point B;

    public Stretch(Point Point_A, Point Point_B) {
        A = Point_A;
        B = Point_B;
    }
    public Stretch() {
    }

    double stretchLength(Point A, Point B){
        return Math.sqrt(square(B.x-A.x)+square(B.y-A.y));
    }
    double square (double a){
        return a*a;
    }
}
