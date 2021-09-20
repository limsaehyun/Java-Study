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
