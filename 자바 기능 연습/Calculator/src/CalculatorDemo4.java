public class CalculatorDemo4 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

    }
}

class Calculator {
    int left;
    int right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(left + right);
    }

    public void avg() {
        System.out.println(left + right / 2);
    }

}
