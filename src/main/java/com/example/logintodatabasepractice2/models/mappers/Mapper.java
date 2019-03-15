package com.example.logintodatabasepractice2.models.mappers;

public interface Mapper<K,V> {
    public abstract V map(K key);
}
