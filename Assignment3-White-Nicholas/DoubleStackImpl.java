/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.EmptyStructureException;
import stacksandqueues.FullStructureException;


public class DoubleStackImpl<E> implements DoubleStackIF<E> {
    
    E[] array;
    int sizeIn, sizeOut;

    public DoubleStackImpl(E[] array) {
        this.array = array;
        this.sizeIn = 0;
        this.sizeOut = ((array.length-1)/2);
    }

    @Override
    public void pushIn(E element) throws FullStructureException {
        if (!isFull() || sizeIn != ((array.length)-1)/2){
            array[sizeIn] = element;
            sizeIn++;
        }
        else{
            throw new FullStructureException("In Stack is Full.");
        }
    }

    @Override
    public E popIn() throws EmptyStructureException {
        if (isEmptyIn())
            throw new EmptyStructureException("In Stack is Empty.");
        sizeIn--;
        return array[sizeIn];
    }

    @Override
    public void pushOut(E element) throws FullStructureException {
        if (!isFull()){
            array[sizeOut] = element;
            sizeOut++;
        }
        else{
            throw new FullStructureException("Out Stack is Full.");
        }
    }

    @Override
    public E popOut() throws EmptyStructureException {
        if (isEmptyOut())
            throw new EmptyStructureException("Out Stack is Empty.");
        sizeOut--;
        return array[sizeOut];
    }

    public boolean isEmpty() {
        return (sizeIn == 0 && sizeOut == (array.length/2));
    }

    @Override
    public boolean isFull() {
        return (sizeIn == ((array.length/2)-1) && sizeOut == array.length-1);
    }

    @Override
    public void display() {
        System.out.println("In Stack: ");
        for (int i=0;i<sizeIn;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println("Out Stack: ");
        for (int j=array.length/2;j<sizeOut;j++){
            System.out.print(array[j] +" ");
        }
    }

    @Override
    public E peekIn() throws EmptyStructureException {
        if (isEmptyIn())
            throw new EmptyStructureException("In Stack is Empty.");
        return array[sizeIn - 1];
    }

    @Override
    public boolean isEmptyIn() {
        return (sizeIn == 0);
    }

    @Override
    public E peekOut() throws EmptyStructureException {
        if (isEmptyOut())
            throw new EmptyStructureException("Out Stack is Empty.");
        return array[sizeOut - 1];
    }

    @Override
    public boolean isEmptyOut() {
        return (sizeOut == array.length/2);
    }
}
