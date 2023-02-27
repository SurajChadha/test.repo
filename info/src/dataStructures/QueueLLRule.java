package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLLRule {
    public static void main(String[] args) {
        //creating queue using the linked list class
        Queue<Integer> numbers = new LinkedList();
        //offer elements to the queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        //Access elements of the queue
        int accessedNumber = numbers.peek();
        System.out.println("AccessedElement: "+accessedNumber);
        //Remove elements from the queue
        int removedNumber = numbers.poll();
        System.out.println("Removed element:"+removedNumber);
        System.out.println("Updated queue"+numbers);

    } 
}
