import java.util.Scanner;


// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9

// Пример 2
// Ввод: 1
// Ввод: +
// Ввод: 2
// Вывод: 3
// Ввод:+
// Ввод:4
// Вывод 7
// Ввод:*
// Ввод:3
// Вывод 21
// Отмена
// Вывод 7
// Отмена
// Вывод 3
// Ввод:-
// Ввод:1
// Вывод 2


public class task_three {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введи первое число: ");
        int firstNum = iScanner.nextInt();
        System.out.println("введи второе число: ");
        int secondNum = iScanner.nextInt();
        System.out.println("введи знак для вычисления: ");
        String symbol = iScanner.next();
        result(firstNum, secondNum, symbol);
    }

    public static void result(int numOne, int numSec, String sym){
        int temp = 0;
        if (sym.equals("+")){
            temp = numOne + numSec;
            System.out.println(numOne + "+" + numSec + "=" + temp);
        }
        else if (sym.equals("-")){
            temp = numOne - numSec;
            System.out.println(numOne + "-" + numSec + "=" + temp);
        }
        else if (sym.equals("/")){
            temp = numOne / numSec;
            System.out.println(numOne + "/" + numSec + "=" + temp);
        }
        else if (sym.equals("*")){
            temp = numOne * numSec;
            System.out.println(numOne + "*" + numSec + "=" + temp);
        }
        else{
            System.out.println("Некорректный ввод!");
        }
    }
}