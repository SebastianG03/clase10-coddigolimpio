import java.util.List;

public class NumberParityCheck {
    public void printParity(Integer number) {
        if (number % 2 == 0) {
            System.out.println("Even: " + number);
        } else {
            System.out.println("Odd: " + number);
        }
    } 

    public void checkParity(List<Integer> numbers) {
        for (Integer number : numbers) {
            printParity(number);
        }
    }
}