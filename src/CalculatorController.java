import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        calculator.setValue1(value1);

        System.out.println("Введите арифметическое действие: ");
        char operator = scanner.next().charAt(0);
        calculator.setOperator(operator);

        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        calculator.setValue2(value2);

        calculator.calculateResult();
        calculator.printResult();


    }
}

class Calculator {
    private int value1;
    private int value2;
    private char operator;
    private int result;


    // сетим
    void setValue1(int value1) {
        this.value1 = value1;
    }

    void setValue2(int value2) {
        this.value2 = value2;
    }

    void setOperator(char operator) {
        this.operator = operator;
    }

    //гетим (кажется, тут это не надо)
    /* int getValue1() {
        return value1;
    }

    int getValue2() {
        return value2;
    }

    String getOperator() {
        return operator;
    } */


    //расчеты
    void calculateResult() {

        switch (operator) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                result = value1 / value2;
                break;
            default:
                System.out.println("Не подошло ни одно условие");
        }
    }
    //вывод результата
    void printResult() {
        System.out.println("Ответ: " + result); //это можно было засунуть в метод calculateResult()
    }


}
