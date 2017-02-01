/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.Random;

/**
 * MyIntegerPalindromeClient uses the generic Palindrome class to
 * check whether the array of Integers it generates is indeed a palindrome.
 * @author marin
 */
public class MyIntegerAnagramClient {

    /**
     * Size of the Integer array
     **/
    int size;

    /**
     * Constructor
     * @param size  the fixed size of the Integer array 
     */
    public void MyIntegerAnagramClient() {
        this.size = size;
    }

    /**
     * Generates a new Integer array that is a palindrome.
     * @param size  the fixed size of the generated Integer array
//     * @return the generated Integer array 
//     */
//    public Integer[] generateAnagram(int size) {
//        Integer[] arr = new Integer[size];
//        Random randomGenerator = new Random();
//        for (int i = 0; i < size; i++) {
//            int randomInt = randomGenerator.nextInt(10);
//            arr[i] = randomInt;
//         //   System.out.print(arr[i]);
//        }
//        return arr;
//    }
//    
//    public Integer[] generateAnagram2(Integer arr[]) {
//        Integer[] arr2 = new Integer[size];
//        for (int i=size; i<0;i--){
//            for (int j=0;j<size;j++){
//                arr2[j]=arr[i];
//            }
//        }
////        Random randomGenerator = new Random();
////        for (int i = 0; i < size; i++) {
////            int randomInt = randomGenerator.nextInt(10);
////            arr2[i] = randomInt;
////            System.out.print(arr2[i]);
////        }
//        return arr2;
//        
        
        

    /**
     * Generates a new Integer array that is PROBABLY NOT a palindrome.
     * @param size  the fixed size of the generated Integer array
     * @return the generated Integer array 
//     */
//    public Integer[] generateNotAnagram(int size) {
//        Random rd = new Random();
//        Integer arr[] = new Integer[size];
//        for (Integer arr1 : arr) {
//            arr1 = new Integer(rd.nextInt(101));
//        }
//        for (int i = 0; i < size; i++) {
//            arr[i] = new rd.nextInt(101);
//        }
//        return arr;
//    }


    /**
     * Tests the class.
     * Generates a new array of Integer, displays its contents, then
     * instantiates an Integer-typed Palindrome object called myPal,
     * uses it to display the contents of the array, and finally gets
     * it to check if the array is a palindrome.
     */
    public void run() {
        Anagram<Integer> myAna = new Anagram<Integer>();
        String str1 = "1234";
        String str2 = "4231";
        if(myAna.isAnagram(str1,str2)){
            System.out.println("Its an anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }
//        Integer arr1[] = this.generateAnagram(size);
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr1[i]);
//        }
//        System.out.print(' ');
//        Anagram<Integer> myAna2 = new Anagram<Integer>();
//        Integer arr2[] = this.generateAnagram2(arr1);
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr2[i]);
//        }
//    
//        myAna.display(arr1);
//        if (myAna.isAnagram(arr1)) {
//            System.out.println("We have an anagram");
//        } else {
//            System.out.println("Nope");
//        }
//        Integer arr2[] = this.generateNotAnagram(size/2);
//        myAna.display(arr2);
//        if (myAna.isAnagram(arr2)) {
//            System.out.println("We have an anagram");
//        } else {
//            System.out.println("Nope");
//        }
}
