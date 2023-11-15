package com.telran.org.lesson_13;

import java.util.Stack;

public class BinaryTree {


    public Node getRoot;
    private Node root;

    public void insert(int key, String value) { // 1, 2, 3, 4
        Node newNode = new Node(key, value);      // 1, 2, 3, 4
        if (root == null) { // if tree doesn't exist
            root = newNode;  // 1, 2
            return;
        }
        Node current = root;
        Node parent = null;

        while (true) {
            parent = current; // 1
            if (key == current.getKey()) { // 2 == 1 , 4 == 1, 4 == 2, 4 == 2
                return;
            }

        if (key < current.getKey()) { // go left // 2 < 1
            // 1
            current = current.getLeft();
            if (current == null) {
                parent.setLeft(newNode);
                return;
            }
        } else {                     // go right // 2 > 1 , 4 > 1 , 4 > 2 , 4 > 3
            current = current.getRight();  // null
            if (current == null) {
                parent.setRight(newNode); // 1 -> 2
                return;
            }

        }
    }
    }

    public Node getRoot() {
        return root;
    }

   
    public Node find(int key) {
        return  null;
    }

    public void print() { // метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева

        globalStack.push(root);
        int gaps = 32; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (isRowEmpty == false) {
            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue()); // выводим его значение в консоли
                    localStack.push(temp.getLeft()); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null ||
                            temp.getRight() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }
    
}

