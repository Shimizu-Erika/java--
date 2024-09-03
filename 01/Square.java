class Square {
    /*
     * メインメソッド
     */


　　　public static void main(String[] args) {

        // メソッド呼び出し
        double result = calculateArea(5.0, 3.0);

        // 結果表示
        System.out.println("四角形の面積は: " + result + " m2");
    }

    /*
     * 四角形の面積を計算するメソッド
     * double length：縦の長さ（m）
     * double width：横の長さ（m）
     * 戻り値：面積（m2）
     */
    static double calculateArea(double length, double width) {
        return length * width;
    }
}
