package test1_0909;

public class GeoTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Trangle trangle = new Trangle(2,3);
        System.out.println("圆形的面积为："+circle.getArea());
        System.out.println("圆形的周长为："+circle.getPerimeter());
        System.out.println("圆的半径为："+circle.getRadius());
        System.out.println("矩形的面积为："+trangle.getArea());
        System.out.println("矩形的周长为："+trangle.getPerimeter());
        System.out.println("矩形的长为："+trangle.getWidth()+"矩形的宽为："+trangle.getHeight());
    }
}
