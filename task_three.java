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
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("введи первое число: ");
        int firstNum = iScanner.nextInt();
        System.out.println("введи второе число: ");
        int secondNum = iScanner.nextInt();
        System.out.println("введи знак для вычисления: ");
        String symbol = iScanner.next();
        int firstResult = resultOne(firstNum, secondNum, symbol);
        int secondResult = firstResult;
        int resultTemp = firstResult;
        System.out.println("ответ: " + firstResult);
        while (true) {
            System.out.println("введи знак для вычисления(+, -, /, *) или команду 'отмена': ");
            String symbol2 = iScanner.next();
            if (symbol2.equals("отмена")) {
                System.out.println("ответ: " + secondResult);
                firstResult = secondResult;
            }else{
                if ((symbol2.equals("+")) || (symbol2.equals("-")) || (symbol2.equals("/")) || (symbol2.equals("*"))){
                    secondResult = resultTemp;
                    System.out.println("введи число: ");
                    int numberNext = iScanner.nextInt();
                    resultTemp = finalResult(firstResult, numberNext, symbol2);
                    System.out.println("ответ: " + resultTemp);
                    firstResult = resultTemp;
            }else{
                System.out.println("Некорректный ввод!");
                }
            }
            
        }

    }

    public static int resultOne(int numOne, int numSec, String sym){
        int temp = 0;
        if (sym.equals("+")){
            temp = numOne + numSec;
        }
        else if (sym.equals("-")){
            temp = numOne - numSec;
        }
        else if (sym.equals("/")){
            temp = numOne / numSec;
        }
        else if (sym.equals("*")){
            temp = numOne * numSec;
        }
        else{
            System.out.println("Некорректный ввод!");
        }
        return temp;
    }

    public static int finalResult(int temp, int tempNum, String sym){
        if (sym.equals("+")){
            temp = temp + tempNum;
        }
        else if (sym.equals("-")){
            temp = temp - tempNum;
        }
        else if (sym.equals("/")){
            temp = temp / tempNum;
        }
        else if (sym.equals("*")){
            temp = temp * tempNum;
        }
        else{
            System.out.println("Некорректный ввод!");
        }
        return temp;

    }
}