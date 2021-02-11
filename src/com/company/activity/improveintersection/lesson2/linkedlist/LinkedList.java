package com.company.activity.improveintersection.lesson2.linkedlist;

import java.util.Optional;

public class LinkedList<V> {
    private LinkedListNode<V> head;

    public LinkedList() {
        head = null;
    }

    public void addFront(V item) {
        this.head = new LinkedListNode<>(item, head);
    }

    public void deleteFront() {
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n -> n.setNext(null));
    }

    public Optional<LinkedListNode<V>> find(V item) {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        while (node.filter(n -> n.getValue() != item).isPresent()) {
            node = node.flatMap(LinkedListNode::getNext);
        }
        return node;
    }

    public void addAfter(LinkedListNode<V> aNode, V item) {
        aNode.setNext(new LinkedListNode<>(item, aNode.getNext().orElse(null)));
    }

    public String toString() {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        StringBuffer result = new StringBuffer("[");
        while (node.isPresent()) {
            node.ifPresent(n -> result.append(n.getValue().toString()));
            node = node.flatMap(LinkedListNode::getNext);
            node.ifPresent(n -> result.append(", "));
        }
        return result.append("]").toString();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.addFront("Isabel");                    // добавление элементов
        list.addFront("Ruth");
        list.addFront("Karl");
        list.addFront("John");
        System.out.println(list.toString());

        System.out.println(list.find("Isabel"));    // поиск элементов
        System.out.println(list.find("Ruth"));
        System.out.println(list.find("Karl"));
        System.out.println(list.find("John"));
        System.out.println(list.find("James"));     // поиск несуществующего элемента
        System.out.println(list.toString());

        list.deleteFront();                              // удаление элемента
        System.out.println(list.toString());

        System.out.println(list.find("John"));      // поиск удаленного элемента
        list.addFront("Oliver");
        System.out.println(list.find("Ruth"));
        list.addAfter(list.find("Ruth").get(), "Sam");  // добавление "Sam" после "Ruth"
        System.out.println(list.toString());

        LinkedListNode<Integer> x = new LinkedListNode<>(5, null);
    }
}
