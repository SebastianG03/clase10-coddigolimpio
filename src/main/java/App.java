public class Sum {
    private int firstNumber;
    private int secondNumber;
    public void setFirstNumber(int number) {
        this.firstNumber = number;
    }
    public void setSecondNumber(int number) {
        this.secondNumber = number;
    }
    public int getSum() {
        return firstNumber + secondNumber;
    }
    public static void main(String[] args) {
        Sum result = new Sum();
        result.setFirstNumber(5);
        result.setSecondNumber(10);
        System.out.println("Sum: " + result.getSum());
    }
}
 