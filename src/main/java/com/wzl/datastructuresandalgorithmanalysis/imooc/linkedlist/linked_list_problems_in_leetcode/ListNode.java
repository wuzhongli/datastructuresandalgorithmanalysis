package com.wzl.datastructuresandalgorithmanalysis.imooc.linkedlist.linked_list_problems_in_leetcode;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    /**
     * 链表节点的构造函数 使用arr为参数，创建一个链表，当前的ListNode为链表头结点
     */
    public ListNode(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }

        this.val = arr[0];
        ListNode current = this;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
    }

    /**
     * 以当前节点为头结点的链表信息字符串
     */
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            s.append(current.val + "->");
            current = current.next;
        }
        s.append("null");
        return s.toString();
    }
}