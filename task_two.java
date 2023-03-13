import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.



public class task_two {

    public static void main(String[] args) {
        LinkedList<String> userList = new LinkedList<> ();
        int quantity = 5;
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            System.out.println("введи элемент массива: ");
            String name = iScanner.next();
            userList.add(name);
        }
        System.out.println("изначальный список: " + userList);
        while (true) {
            System.out.println("введите команду:\n one-помещает элемент в конец очереди\n two-возвращает первый элемент из очереди и удаляет его\n three-возвращает первый элемент из очереди, не удаляя ");
            String command = iScanner.next();
            if (command.equals("one")) {
                userList = enqueue(userList);
                System.out.println(userList);
            }else{
                if (command.equals("two")){
                    userList = dequeue(userList);
                    System.out.println(userList);
                }else{
                    if (command.equals("three")){
                        first(userList);
                    }else{
                        System.out.println("введите команду:\n one-помещает элемент в конец очереди\n two-возвращает первый элемент из очереди и удаляет его\n three-возвращает первый элемент из очереди, не удаляя ");
                    }
                }
            
            }
        
        }

    }

    public static LinkedList<String> enqueue(List firstList){
        System.out.println("введи индекс элемента для перемещения в конец очереди: ");
        Scanner iScanner2 = new Scanner(System.in) ;
        Integer index = Integer.parseInt(iScanner2.next());
        String temp = (String) firstList.get(index);
        firstList.add(temp);
        firstList.remove(temp);
        return (LinkedList<String>) firstList;
    }

    public static LinkedList<String> dequeue(List firstList){
        System.out.println("удаляем первый элемент списка: " + firstList.get(0));
        firstList.remove(0);
        return (LinkedList<String>) firstList;
    }

    public static void first(List firstList){
        System.out.println("первый элемент списка: " + firstList.get(0));
    }
}