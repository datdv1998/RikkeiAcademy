package ra;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    // Đây là một phương thức trừu tượng để tính diện tích
    abstract Double getArea();

    abstract String display();
}
