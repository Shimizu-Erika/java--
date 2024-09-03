public class ShapeAreaCalculator {
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
}
