public class StretchLength {
    Stretch stretchMethods = new Stretch();

    double stretchLength(Stretch stretch) {
        return Math.sqrt(square(stretch.B.x - stretch.A.x) + square(stretch.B.y - stretch.A.y));
    }

    double square(double a) {
        return a * a;
    }

//    boolean isTraingle(Point A, Point B, Point C) {
//        return (sum(A, B, C) && sum(B, C, A) && sum(B, A, C));
//    }
//
//    boolean sum(Point A, Point B, Point C) {
//        return (stretchMethods.stretchLength(A, B) + stretchMethods.stretchLength(B, C) > stretchMethods.stretchLength(C, B));
//    }
//
//    ??? 3 punkty zawsze tworzą trójkąt

}
