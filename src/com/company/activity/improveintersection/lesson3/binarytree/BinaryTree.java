package com.company.activity.improveintersection.lesson3.binarytree;

import java.util.Optional;

public interface BinaryTree<K,V> {
    void put(K key,V value);

    Optional<V> get(K key);
}
