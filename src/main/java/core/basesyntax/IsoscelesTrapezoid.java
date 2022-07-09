package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int firstSide, secondSide, height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super("isosceles trapezoid", color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void Draw() {
        System.out.println("Figure: " + getName() + " square: " + getSquare() + " first side: " + getFirstSide() +
                " second side: " + getSecondSide() + " height: " + getHeight() + " color: " + getColor());
    }

    @Override
    double getSquare() {
        return 0.5 * (getFirstSide() + getSecondSide()) * getHeight();
    }
}
