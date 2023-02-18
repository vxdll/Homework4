import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
public class TaskOne {
    public static void main(String[] args) {
        ArrayDeque<String> listDeque = new ArrayDeque<>();
        while(true){
            String str = inputText();
            if (str.equalsIgnoreCase("print")){
                for (String s: listDeque){
                    System.out.println(s);
                }
            } else if (str.equalsIgnoreCase("revert")) {
                listDeque.removeFirst();
            } else if (str.equalsIgnoreCase("exit")) {
                break;
            } else{
                listDeque.addFirst(str);
            }
        }
    }

    private static String inputText() {
        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите запрос: ");
        str = scan.nextLine();
        return str;
    }
}
