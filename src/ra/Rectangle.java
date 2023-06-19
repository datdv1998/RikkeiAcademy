package ra;

public class Rectangle extends Shape{
    private double width ; // Thuộc tính chiều rộng của lớp Rectangle
    private double height; // Thuộc tính chiều dài của lớp Rectangle

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

    }


    // Tính diện tích của hình chữ nhật (Rectangle)
    @Override
    Double getArea() {
        return width * height;
    }

    @Override
    String display() {
        return getColor();
    }
}
