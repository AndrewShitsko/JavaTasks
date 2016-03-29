import java.util.Arrays;

public class ArrayString {
    /* 1.1. Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз.
    * При выполнгение этого задания нельзя использовать допольнительные структуры данных.
    */
    public static boolean isUniqueChars2(String str) {
        if (str.length() > 256) return false;

        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if(charSet[value]) return false; // Символ уже был найден в строке
            charSet[value] = true;
        }
        return true;
    }

    /* 1.3. Для двух строк напишите метод, определяющ0ий, является ли одна строка перестановкой другой*/
    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    /* 1.4 Напишите метод, заменяющий все пробелы в строке символами '%20'.
    * Можно предположить, что длина строки позволяет сохранить допольнительные символы
    * и "истинная" длина строки известна. (Примечание: при реализации метода на Java
    * используйте символьный массив).*/
    public static String replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newLength, i = 0;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') spaceCount++;
        }

        newLength = length + spaceCount * 2;

        char[] newStr = new char[newLength];
        for (int j = 0; j < length; j++)
            newStr[j] = str[j];

        for (i = length - 1; i >= 0; i--) {
            if (newStr[i] == ' ') {
                newStr[newLength - 1] = '0';
                newStr[newLength - 2] = '2';
                newStr[newLength - 3] = '%';
                newLength -= 3;
            } else {
                newStr[newLength - 1] = newStr[i];
                newLength--;
            }
        }
        return new String(newStr);
    }

    /*1.6. Дано: изображение в виде матрицы размером NxN, где каждый пиксель занимает 4 байта.
    Напишите метод, поворачивающий изображение на 90 градусов. */
    public static void rorate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // сохраняем вершину
                matrix[first][i] = matrix[last - offset][first]; // левая -> верхняя
                matrix[last - offset][first] = matrix[last][last - offset]; // нижняя -> левая
                matrix[last][last - offset] = matrix[i][last]; // правая -> нижняя
                matrix[i][last] = top; // верхняя -> правая
            }
        }
    }
}
