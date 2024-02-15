package otherchallenges.code.classes;

public class Circle {

    double ratio;

    public Circle(double ratio) {
        this.ratio = ratio;
    }

    public Circle(){

    }

    public double calculateRatio() {
        double pi = 3.14;

        return Math.sqrt(ratio) * pi;
    }

    public double calculatePerimeter() {
        double pi = 3.14;

        return 2d * pi * ratio;
    }
}
