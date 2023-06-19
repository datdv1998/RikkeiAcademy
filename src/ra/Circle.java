package ra;

public class Circle extends Shape{

    private double radius; // Khởi tạo thuộc tính bán kính của lớp Circle

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Tính diện tích của hình tròn
    @Override
    Double getArea() {
        return Math.PI  * radius * radius;
    }

    @Override
    String display() {
        return getColor();
    }
}
