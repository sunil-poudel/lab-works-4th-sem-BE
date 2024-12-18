package com.lab_03;

import java.util.ArrayList;
import java.util.List;

class Queue{
    List<Object> objects;
    int size;
    public Queue(int size){
        this.size = size;
        objects = new ArrayList<>(size);
    }
    public void enQueue(Object object){
        if(objects.size()==size){
            System.out.println("Stack is full, can't add "+object);
        } else{
            objects.add(object);
        }
    }
    public void deQueue(Object object){
        if(!objects.contains(object)){
            System.out.println("Can't find "+object+" in the stack!");
        }
        else if(objects.getLast()==object){
            objects.remove(object);
        } else{
            System.out.println("Only last item can be deleted");
        }
    }
    public void display(){
        System.out.println(objects);
    }

}

public class EnqueDequeOperations {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enQueue("Sunil");
        queue.enQueue("Pacific");
        queue.enQueue(123);
        queue.display();
        queue.enQueue("Europe");
        queue.deQueue("Nepal");
        queue.deQueue("Sunil");
        queue.deQueue(123);
        queue.deQueue("Pacific");
        queue.deQueue("Sunil");
        queue.display();

    }
}
