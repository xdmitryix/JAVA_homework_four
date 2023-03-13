import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task_one {

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
        System.out.println("перевернутый список: " + turn(userList));
    }

    public static LinkedList<String> turn(List firstList){
        LinkedList<String> turnList = new LinkedList<>();
        for (int i = 0; i < firstList.size(); i++) {
            turnList.addFirst((String) firstList.get(i));    
        }
        return turnList;
    }
}