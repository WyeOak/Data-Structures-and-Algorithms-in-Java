package com.company.activity.improveintersection.lesson3.hashtable;

public interface HashProvider<K> {
    int hashKey(K key, int tableSize);
}
