/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_recursion_assignment;

/**
 *
 * @author ogm2
 */
public class DS_Recursion_Assignment {

    public DS_Recursion_Assignment() {
    }

    public int sumOfDigits(long n) {
        if (n < 0){
            n = -1 * n;
        }
        
        if((n/10) == 0){
           return (int)(n); 
        }
        else{
            return (int)(((n%10) + sumOfDigits(n/10)));
        }
    }

    public int recur(int n) {
        int counter = 0;
        if (n<0){
            return -1;
        }
        do{
            counter++;
            n = n/10;
        }while (n>0);
        //counter++;
        return counter;
    }
    
    public int recurTest( int n ) {
        if (n < 0) {
            return -1;
        } else if (n < 10) {
            return 1;
        } else {
            return ( 1 + recurTest(n/10));
        }
    }


    public int recur2(int n) {
        if (n <0){
            n = -1 * n;
        }
        int a = 0;
        int result = 0;
        if (n<0){
            return -1;
        }
        if (n==0){
            return n;
        }
        while (n != 0){
            result = n%10;
            if ((n/10) == 0){
                result = n;
            }
            a = a + result;
            n = n/10;
        }
        return a;
    }
    
    public int recur2Test(int n){
        if (n < 0) {
            return -1;
        } else if (n < 10) {
            return n;
        } else {
            return ((n%10) + recur2Test(n/10));
        }
    }
    
    public int iterativeCollatz(int n) {
        int count = 1;
        while (n > 2){
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n +1;
            }
            count ++;
        }
        return count;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DS_Recursion_Assignment dsra = new DS_Recursion_Assignment();
        System.out.println("SUM OF DIGITS");
        System.out.println("-12 => " + dsra.sumOfDigits(-12));
        System.out.println("1234 => " + dsra.sumOfDigits(1234));
        System.out.println("2514 => " + dsra.sumOfDigits(2514));
        System.out.println("88888888 => " + dsra.sumOfDigits(88888888));
        System.out.println("\n\nRECUR");
        System.out.println("-12 => " + dsra.recur(-12));
        System.out.println("1234 => " + dsra.recur(1234));
        System.out.println("2514 => " + dsra.recur(2514));
        System.out.println("88888888 => " + dsra.recur(88888888));
        System.out.println("\n\nRECURTEST");
        System.out.println("-12 => " + dsra.recurTest(-12));
        System.out.println("1234 => " + dsra.recurTest(1234));
        System.out.println("2514 => " + dsra.recurTest(2514));
        System.out.println("88888888 => " + dsra.recurTest(88888888));
        System.out.println("\n\nRECUR2");
        System.out.println("-12 => " + dsra.recur2(-12));
        System.out.println("1234 => " + dsra.recur2(1234));
        System.out.println("2514 => " + dsra.recur2(2514));
        System.out.println("88888888 => " + dsra.recur2(88888888));
        System.out.println("\n\nRECUR2TEST");
        System.out.println("-12 => " + dsra.recur2Test(12));
        System.out.println("1234 => " + dsra.recur2Test(1234));
        System.out.println("2514 => " + dsra.recur2Test(2514));
        System.out.println("88888888 => " + dsra.recur2Test(88888888));
        System.out.println("\n\nCOLLATZ");
        System.out.println("You're all alone on this one ^^");
        System.out.println("7 => " + dsra.iterativeCollatz(7));
        System.out.println("8 => " + dsra.iterativeCollatz(8));
        System.out.println("15 => " + dsra.iterativeCollatz(15));
        System.out.println("40 => " + dsra.iterativeCollatz(40));
    }
    
}
