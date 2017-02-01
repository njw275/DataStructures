/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.*;

/**
 *
 * @author ogm2
 * @param <E>
 */
public class QueueFromDequeImpl<E> 
                            implements MyQueueIF<E> {

    MyDequeIF<E> myDeque;

    public QueueFromDequeImpl(E[] array) {
        myDeque = new MyDequeImpl<>(array);
    }

    @Override
    public void enqueue(E element) throws FullStructureException {
        if (isFull()){
            throw new FullStructureException("Queue is full.");
        }
        myDeque.insertRight(element);
    }

    @Override
    public E dequeue() throws EmptyStructureException {
        if (isEmpty()){
            throw new EmptyStructureException("Queue is empty.");
        }
        return(myDeque.removeLeft());
    }

    @Override
    public E peek() throws EmptyStructureException {
        if (isEmpty()){
            throw new EmptyStructureException("Queue is empty.");
        }
        return (myDeque.peekLeft());
    }

    @Override
    public boolean isEmpty() {
        return myDeque.isEmpty();
    }

    @Override
    public boolean isFull() {
        return myDeque.isFull();
    }

    @Override
    public void display() {
        myDeque.display();
    }
}
