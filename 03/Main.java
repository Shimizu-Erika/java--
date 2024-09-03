public class Main {
    public static void main(String[] args) {
        // 縦の長さと横の長さを指定してインスタンスを作成
        ShapeAreaCalculator calculator = new ShapeAreaCalculator(10, 5);

        // 四角形の面積を計算して表示
        double rectangleArea = calculator.calculateRectangleArea();
        System.out.println("四角形の面積: " + rectangleArea + " m2");

        // 三角形の面積を計算して表示
        double triangleArea = calculator.calculateTriangleArea();
        System.out.println("三角形の面積: " + triangleArea + " m2");
    }
}