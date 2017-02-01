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
 */
public class ArithmeticExpressionEvaluator {

    MyStackIF<Character> MyCharStack;
    MyStackIF<Double> MyValueStack;
    Double[] array = new Double[1000];
    Character[] array2 = new Character[1000];
    double value = 0;
    
    public ArithmeticExpressionEvaluator() {
        MyCharStack = new MyStackImpl<>(array2);
        MyValueStack = new MyStackImpl<>(array);
        
    }

    public Double evaluateArithmeticExpression(String s) {
        try{
            do{
                for (int i=0; i<s.length();i++){
                    if (Character.isDigit(s.charAt(i))){
                        int digit = Character.getNumericValue(s.charAt(i));
                        MyValueStack.push((double)digit);
                    }
                    else if (s.charAt(i) == '(' || s.charAt(i) == '*' || s.charAt(i) == '/' 
                            || s.charAt(i) == '+' || s.charAt(i) == '-'){
                        MyCharStack.push(s.charAt(i));
                    }
                    else if (s.charAt(i) == ')'){
                        MyCharStack.push(s.charAt(i));
                        value = MyValueStack.pop();
                        MyCharStack.pop();
                        while (MyCharStack.peek() != '('){
                            switch (MyCharStack.peek()){
                                case '*':
                                    value = MyValueStack.pop() * value;
                                    MyCharStack.pop();
                                    
                                    break;
                                case '/':
                                    value = MyValueStack.pop() / value;
                                    MyCharStack.pop();
                                    break;
                                case '+':
                                    value = MyValueStack.pop() + value;
                                    MyCharStack.pop();
                                    
                                    break;
                                case '-':
                                    value = MyValueStack.pop() - value;
                                    MyCharStack.pop();
                                    
                                    break;
                            }
                        }
                        if (MyCharStack.peek() == '('){
                            MyValueStack.push(value);
                            MyCharStack.pop();
                        }
                    }
                }
            
            } while (!MyCharStack.isEmpty());
        }
        catch (FullStructureException e){}
        catch (EmptyStructureException e){}
        return value;
    }
}