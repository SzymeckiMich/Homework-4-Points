public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    boolean isPointInI(Point point) {
        return ((point.x > 0) && (point.y > 0));
    }

    boolean isPointInII(Point point) {
        return ((point.x < 0) && (point.y > 0));
    }

    boolean isPointInIII(Point point) {
        return ((point.x < 0) && (point.y < 0));
    }

    boolean isPointInIV(Point point) {
        return ((point.x > 0) && (point.y < 0));
    }

    boolean isPointOnOX(Point point) {
        return ((point.y == 0) && (point.x != 0));
    }

    boolean isPointOnOY(Point point) {
        return ((point.x == 0) && (point.y != 0));
    }

    boolean isPointOn0(Point point) {
        return ((point.y == 0) && (point.x == 0));
    }
}
