class Node {
    Node next; // указатель на следующий элемент
    int data; // данные
}
public class LinkedList {
    private Node head; // указатель на первый элемент
    private Node tail; // указатель на последний элемент

    public void addFront(int data) // добавить вначало
    {
        Node node = new Node(); // создаем новый элемент
        node.data = data; // инициализируем данные, указатель на следующий элемент автоматически инициализируется как null

        if (head == null) { // если список пуст,
            head = node; // то указываем ссылки начала и конца на новый элемент,
            tail = node; // т.е. список состоит из одного элемента
        } else {
            node.next = head; // иначе новый элемент теперь ссылается на "бывший" первый
            head = node; // а указатель на первый элемент теперь сслыается на новый элемент
        }
    }

    public void addBack(int data) { // добавить в конец
        Node node = new Node(); // создаем новый элемент
        node.data = data;

        if (tail == null) { // если список пуст
            head = node; // то указываем ссылки начала и конца на новый элемент,
            tail = node; // т.е. список состоит из одного элемента
        } else {
            tail.next = node; // иначе "старый" последний элемент теперь ссылается на новый,
            tail = node; // а указатель на последний элемент записываем адрес нового элемента
        }
    }

    public void printList() { // вывод списка
        Node node = head; // получаем ссылку на первый элемент
        while (node != null) { // пока элемент существует
            System.out.print(node.data + " "); // выводим его данные
            node = node.next; // и переключаемся на следующий
            System.out.println();
        }
    }

    public void delete(int data) { // удаление элемента
        if (head == null) return; // если список пуст - ничего не делаем
        if (head == tail) { // если список состоит из одного элемента,
            head = null; // очищаем указатели начала и конца
            tail = null;
            return; // и выходим
        }

        if (head.data == data) { // если первый элемент тот, что нам нужен
            head = head.next; // переключаем указатель начала на второй элемент
            return; // и выходим
        }

        Node node = head; // иначе начинаем искать
        while (node.next != null) { // пока следующий элемент существует
            if (node.next.data == data) { // проверяем следующий элемент
                if (tail == node.next) tail = node; // если он последний, то переключаем указатель на последний элемент на текущий
                node.next = node.next.next; // найденный элемент выкидываем
                return; // и выходим
            }
            node = node.next; // иначи ищем дальше
        }
    }
}
