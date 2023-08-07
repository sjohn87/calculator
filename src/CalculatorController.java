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
    private int result;

    Scanner scanner = new Scanner(System.in);

    // сетим
    void setValue1() {
        System.out.println("Введите первое число от 1 до 10:");
        value1 = scanner.nextInt();
        if (value1 > 0 && value1 < 11) {
           this.value1 = value1;
        } else {
            throw new IllegalArgumentException("Требуется ввести значение от 1 до 10!");
        }
    }

    void setValue2() {
        System.out.println("Введите второе число от 1 до 10:");
        value2 = scanner.nextInt();
        if (value2 > 0 && value2 < 11) {
            this.value2 = value2;
        } else {
            throw new IllegalArgumentException("Требуется ввести значение от 1 до 10!");
        }
    }

    void setOperator() {
        System.out.println("Введите арифметическое действие:");
        char operator = scanner.next().charAt(0);
    }


    //расчеты и вывод результата
    void calculateResult() {
        result = switch (operator) {
            case '+' -> value1 + value2;
            case '-' -> value1 - value2;
            case '*' -> value1 * value2;
            case '/' -> value1 / value2;
            default -> throw new IllegalStateException("Не подошло ни одно условие");
        };
        System.out.println("Ответ: " + result);
    }

}
