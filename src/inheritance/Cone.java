package inheritance;

public class Cone extends Circle {
    private int height;

    public Cone() {

    }

    public Cone(float x, float y, int circleRadius, int height) {
        super(x, y, circleRadius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float coneVolume() {
        return ((float) (1 / 3f * (Math.abs(circleRadius) * Math.PI * height)));
    }
}
