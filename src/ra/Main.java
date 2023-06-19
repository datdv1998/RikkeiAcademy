package ra;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Màu cam", 5);
        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Màu sắc của hình tròn là: " + circle.display());

        Circle circle2 = new Circle(5);
        System.out.println("Diện tích hình tròn là: " + circle2.getArea() + " - Màu sắc: " + circle2.display());

        Rectangle rectangle = new Rectangle("Màu lục",2, 4);
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea() + " - Màu sắc: " + rectangle.display());

        Rectangle rectangleNoConstructor = new Rectangle();
        System.out.println("Diện tích hình chữ nhật là: " + rectangleNoConstructor.getArea() + " - Màu sắc: " + rectangleNoConstructor.display());
    }
}
