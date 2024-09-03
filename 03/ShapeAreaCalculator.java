public class ShapeAreaCalculator {
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
}
