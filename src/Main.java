import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Введите строку: ");
        String str = scanner.next();
        System.out.println("Все ли символы встречаются в строке один раз? - " + ArrayString.isUniqueChars2(str));

        System.out.print("Введите строку 1: ");
        String firstStr = scanner.next();
        System.out.print("Введите строку 2: ");
        String secondStr = scanner.next();
        System.out.println("Является ли строка \"" + firstStr + "\" перестановкой строки \"" + secondStr + "\"? - " + ArrayString.isPermutation(firstStr, secondStr));

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Результирующая строка: " + ArrayString.replaceSpaces(str.toCharArray(), str.length()));

        int[][] matrix = { {1,  2,  3,  4},
                           {5,  6,  7,  8},
                           {9,  10, 11, 12},
                           {13, 14, 15, 16} };
        ArrayString.rorate(matrix, matrix.length); */

        LinkedList list = new LinkedList();
        list.addBack(3);
        list.addBack(2);
        list.addBack(1);
        list.addFront(4);
        list.printList();
        list.delete(4);
        list.delete(5);
        list.delete(2);
        list.printList();
    }
}
