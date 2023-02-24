package inheritance;

public class Circle extends Dot {
    protected int circleRadius;

    public Circle() {
    }

    public Circle(float x,float y, int circleRadius) {
        super(x,y);
        this.circleRadius = circleRadius;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }
}
