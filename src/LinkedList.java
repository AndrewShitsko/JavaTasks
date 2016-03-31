class Node {
    Node next; // ��������� �� ��������� �������
    int data; // ������
}
public class LinkedList {
    private Node head; // ��������� �� ������ �������
    private Node tail; // ��������� �� ��������� �������

    public void addFront(int data) // �������� �������
    {
        Node node = new Node(); // ������� ����� �������
        node.data = data; // �������������� ������, ��������� �� ��������� ������� ������������� ���������������� ��� null

        if (head == null) { // ���� ������ ����,
            head = node; // �� ��������� ������ ������ � ����� �� ����� �������,
            tail = node; // �.�. ������ ������� �� ������ ��������
        } else {
            node.next = head; // ����� ����� ������� ������ ��������� �� "������" ������
            head = node; // � ��������� �� ������ ������� ������ ��������� �� ����� �������
        }
    }

    public void addBack(int data) { // �������� � �����
        Node node = new Node(); // ������� ����� �������
        node.data = data;

        if (tail == null) { // ���� ������ ����
            head = node; // �� ��������� ������ ������ � ����� �� ����� �������,
            tail = node; // �.�. ������ ������� �� ������ ��������
        } else {
            tail.next = node; // ����� "������" ��������� ������� ������ ��������� �� �����,
            tail = node; // � ��������� �� ��������� ������� ���������� ����� ������ ��������
        }
    }

    public void printList() { // ����� ������
        Node node = head; // �������� ������ �� ������ �������
        while (node != null) { // ���� ������� ����������
            System.out.print(node.data + " "); // ������� ��� ������
            node = node.next; // � ������������� �� ���������
            System.out.println();
        }
    }

    public void delete(int data) { // �������� ��������
        if (head == null) return; // ���� ������ ���� - ������ �� ������
        if (head == tail) { // ���� ������ ������� �� ������ ��������,
            head = null; // ������� ��������� ������ � �����
            tail = null;
            return; // � �������
        }

        if (head.data == data) { // ���� ������ ������� ���, ��� ��� �����
            head = head.next; // ����������� ��������� ������ �� ������ �������
            return; // � �������
        }

        Node node = head; // ����� �������� ������
        while (node.next != null) { // ���� ��������� ������� ����������
            if (node.next.data == data) { // ��������� ��������� �������
                if (tail == node.next) tail = node; // ���� �� ���������, �� ����������� ��������� �� ��������� ������� �� �������
                node.next = node.next.next; // ��������� ������� ����������
                return; // � �������
            }
            node = node.next; // ����� ���� ������
        }
    }
}
