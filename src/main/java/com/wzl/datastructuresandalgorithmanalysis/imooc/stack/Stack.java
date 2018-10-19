package com.wzl.datastructuresandalgorithmanalysis.imooc.stack;

public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}