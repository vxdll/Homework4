import java.util.LinkedList;
import java.util.Random;

//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class TaskTwo {
    public static void main(String[] args) {
        // Объявляем рандомный список
        int list_size = 6;
        LinkedList<Random> linkedList = new LinkedList<>();
        for (int i = 0; i < list_size; i++) {
            linkedList.add(new Random());
        }
        System.out.println(linkedList);

//         Вводим метод для вывода перевернутого списка
        reverseList(linkedList);
    }


    private static void reverseList(LinkedList<Random> linkedList) {
        LinkedList<Random> newLinkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size() ; i++) {
            newLinkedList.add(linkedList.get(linkedList.size() - 1 - i));
        }
        System.out.println(newLinkedList);
    }



}
