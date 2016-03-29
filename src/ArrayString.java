import java.util.Arrays;

public class ArrayString {
    /* 1.1. ���������� ��������, ������������, ��� �� ������� � ������ ����������� ���� ���.
    * ��� ����������� ����� ������� ������ ������������ ��������������� ��������� ������.
    */
    public static boolean isUniqueChars2(String str) {
        if (str.length() > 256) return false;

        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if(charSet[value]) return false; // ������ ��� ��� ������ � ������
            charSet[value] = true;
        }
        return true;
    }

    /* 1.3. ��� ���� ����� �������� �����, ����������0��, �������� �� ���� ������ ������������� ������*/
    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    /* 1.4 �������� �����, ���������� ��� ������� � ������ ��������� '%20'.
    * ����� ������������, ��� ����� ������ ��������� ��������� ��������������� �������
    * � "��������" ����� ������ ��������. (����������: ��� ���������� ������ �� Java
    * ����������� ���������� ������).*/
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

    /*1.6. ����: ����������� � ���� ������� �������� NxN, ��� ������ ������� �������� 4 �����.
    �������� �����, �������������� ����������� �� 90 ��������. */
    public static void rorate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // ��������� �������
                matrix[first][i] = matrix[last - offset][first]; // ����� -> �������
                matrix[last - offset][first] = matrix[last][last - offset]; // ������ -> �����
                matrix[last][last - offset] = matrix[i][last]; // ������ -> ������
                matrix[i][last] = top; // ������� -> ������
            }
        }
    }
}
