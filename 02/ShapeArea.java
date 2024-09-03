public class ShapeArea {

	// フィールド（クラス内の変数）
    private double length; // 縦の長さ（m）
    private double width;  // 横の長さ（m）

    // コンストラクタ
    public ShapeAreaCalculator(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 四角形の面積を計算するメソッド
    public double calculateRectangleArea() {
        return length * width;
    }

    // 三角形の面積を計算するメソッド
    public double calculateTriangleArea() {
        return (length * width) / 2;
    }

    // メインメソッド（実行用）
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