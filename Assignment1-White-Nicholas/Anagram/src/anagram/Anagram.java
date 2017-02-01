/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anagram;
import java.util.Arrays;


/**
 * Palindrome is a generic class that checks whether an array of elements
 * is a palindrome.
 * It also displays the content of an array of elements.
 * @author marin
 * @param <T>
 */
public class Anagram<T> {
    
    
    

    /**
     * Constructor
     */
    public Anagram() {
    }
    
    public static void main(String[] args) {
        new MyIntegerAnagramClient().run();
        new MyCharacterAnagramClient().run();
    }
    
    
    /**
     * Checks whether an array of generic elements is a palindrome.
     * In other words, the array is equivalent to its reverse.
     * @param arr  the array to be checked
     * @return true if the checked array is a palindrome, false otherwise
     */
    public boolean isAnagram(String str1,String str2) {
        if ( str1.length() != str2.length() ) {
            return false;
        }
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String str1New = new String(char1);
        String str2New = new String(char2);
        if (!str1New.equals(str2New)){
            return false;
        }
        else{
            return true;
        }
    }
    
    
    
    
    /**
     * Displays the contents of an array of generic elements.
     * @param arr  the array to be displayed
     */
    public void display(T[] arr1, T[] arr2) {
        int i = 1;
        for (T arr1 : arr) {
            System.out.print(arr1.toString() + " ");
        }
        System.out.println("");
    }
    
   
    
    
}