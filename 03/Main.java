public class Main {
    public static void main(String[] args) {
        // �c�̒����Ɖ��̒������w�肵�ăC���X�^���X���쐬
        ShapeAreaCalculator calculator = new ShapeAreaCalculator(10, 5);

        // �l�p�`�̖ʐς��v�Z���ĕ\��
        double rectangleArea = calculator.calculateRectangleArea();
        System.out.println("�l�p�`�̖ʐ�: " + rectangleArea + " m2");

        // �O�p�`�̖ʐς��v�Z���ĕ\��
        double triangleArea = calculator.calculateTriangleArea();
        System.out.println("�O�p�`�̖ʐ�: " + triangleArea + " m2");
    }
}