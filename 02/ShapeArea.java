public class ShapeArea {

	// �t�B�[���h�i�N���X���̕ϐ��j
    private double length; // �c�̒����im�j
    private double width;  // ���̒����im�j

    // �R���X�g���N�^
    public ShapeAreaCalculator(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // �l�p�`�̖ʐς��v�Z���郁�\�b�h
    public double calculateRectangleArea() {
        return length * width;
    }

    // �O�p�`�̖ʐς��v�Z���郁�\�b�h
    public double calculateTriangleArea() {
        return (length * width) / 2;
    }

    // ���C�����\�b�h�i���s�p�j
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