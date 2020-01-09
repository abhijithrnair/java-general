//package com.dsa.general;
//
//import java.io.*;
//import java.util.stream.*;
//
//class SinglyLinkedListNode {
//    public int data;
//    public SinglyLinkedListNode next;
//
//    public SinglyLinkedListNode(int nodeData) {
//        this.data = nodeData;
//        this.next = null;
//    }
//}
//
//class SinglyLinkedList {
//    public SinglyLinkedListNode head;
//    public SinglyLinkedListNode tail;
//
//    public SinglyLinkedList() {
//        this.head = null;
//        this.tail = null;
//    }
//
//    public void insertNode(int nodeData) {
//        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
//
//        if (this.head == null) {
//            this.head = node;
//        } else {
//            this.tail.next = node;
//        }
//
//        this.tail = node;
//    }
//}
//
//class SinglyLinkedListPrintHelper {
//    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
//        while (node != null) {
//            bufferedWriter.write(String.valueOf(node.data));
//
//            node = node.next;
//
//            if (node != null) {
//                bufferedWriter.write(sep);
//            }
//        }
//    }
//}
//
//
//
//class Result {
//
//    /*
//     * Complete the 'mergeInBetween' function below.
//     *
//     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
//     * The function accepts following parameters:
//     *  1. INTEGER_SINGLY_LINKED_LIST list1
//     *  2. INTEGER_SINGLY_LINKED_LIST list2
//     *  3. INTEGER a
//     *  4. INTEGER b
//     */
//
//    /*
//     * For your reference:
//     *
//     * SinglyLinkedListNode {
//     *     int data;
//     *     SinglyLinkedListNode next;
//     * }
//     *
//     */
//
//    public static SinglyLinkedListNode mergeInBetween(SinglyLinkedListNode list1, SinglyLinkedListNode list2, int a, int b) {
//    // Write your code here
//    	   while (list1 != null) {
//    		   if (list1.next.data == a) {
//    			   list1.next = list2;
//   			}
//           }
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        SinglyLinkedList list1 = new SinglyLinkedList();
//
//        int list1Count = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, list1Count).forEach(i -> {
//            try {
//                int list1Item = Integer.parseInt(bufferedReader.readLine().trim());
//
//                list1.insertNode(list1Item);
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        SinglyLinkedList list2 = new SinglyLinkedList();
//
//        int list2Count = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, list2Count).forEach(i -> {
//            try {
//                int list2Item = Integer.parseInt(bufferedReader.readLine().trim());
//
//                list2.insertNode(list2Item);
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        int a = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int b = Integer.parseInt(bufferedReader.readLine().trim());
//
//        SinglyLinkedListNode result = Result.mergeInBetween(list1.head, list2.head, a, b);
//        SinglyLinkedListPrintHelper.printList(result, "\n", bufferedWriter);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
