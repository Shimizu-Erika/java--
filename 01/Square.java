class Square {
    /*
     * ���C�����\�b�h
     */


�@�@�@public static void main(String[] args) {

        // ���\�b�h�Ăяo��
        double result = calculateArea(5.0, 3.0);

        // ���ʕ\��
        System.out.println("�l�p�`�̖ʐς�: " + result + " m2");
    }

    /*
     * �l�p�`�̖ʐς��v�Z���郁�\�b�h
     * double length�F�c�̒����im�j
     * double width�F���̒����im�j
     * �߂�l�F�ʐρim2�j
     */
    static double calculateArea(double length, double width) {
        return length * width;
    }
}
