public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return this.x;
    }

    public double y() {
        return this.y;
    }

    // http://mathworld.wolfram.com/PolarCoordinates.html
    public double radioPolar() {
        return Math.sqrt(x * x + y * y);
    }

    // http://mathworld.wolfram.com/PolarCoordinates.html
    public double anguloPolar() {
        return Math.atan(y / x);
    }

    // http://mathworld.wolfram.com/Distance.html
    public double distanciaEuclidiana(Punto otro) {
        double dx = this.x - otro.x();
        double dy = this.y - otro.y();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
