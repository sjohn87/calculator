import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setValue1();
        calculator.setOperator();
        calculator.setValue2();
        calculator.calculateResult();

    }
}

class Calculator {
    private int value1;
    private int value2;
    private char operator;

    Scanner scanner = new Scanner(System.in);

    // сетим
    void setValue1() {
        System.out.println("Введите первое целое число от 1 до 10:");
        value1 = scanner.nextInt();
        if (value1 < 0 || value1 > 10) {
            throw new IllegalArgumentException("Требуется ввести значение от 1 до 10!");
        }
    }

    void setValue2() {
        System.out.println("Введите второе целое число от 1 до 10:");
        value2 = scanner.nextInt();
        if (value2 < 0 || value2 > 10) {
            throw new IllegalArgumentException("Требуется ввести значение от 1 до 10!");
        }
    }

    void setOperator() {
        System.out.println("Введите арифметическое действие:");
        operator = scanner.next().charAt(0);
        if (Character.isLetterOrDigit(operator)) {
            throw new IllegalArgumentException("Требуется ввести знак арифметическго действия!");
        }
    }


    //расчеты и вывод результата
    void calculateResult() {
        int result = switch (operator) {
            case '+' -> value1 + value2;
            case '-' -> value1 - value2;
            case '*' -> value1 * value2;
            case '/' -> value1 / value2;
            default -> throw new IllegalStateException("Не подошло ни одно условие");
        };
        System.out.println("Ответ: " + result);
    }

}
