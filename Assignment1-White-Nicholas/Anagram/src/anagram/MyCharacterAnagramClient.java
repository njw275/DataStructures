/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;
import java.util.Random;

/**
 *
 * @author Nicholas_White
 */
public class MyCharacterAnagramClient {
    /**
     * Size of the Character array
     **/
    int size;

    /**
     * Constructor
     * @param size  the fixed size of the Character array 
     */
    public void MyCharacterAnagramClient() {
        this.size = size;
    }

    /**
     * Generates a new Character array that is a palindrome.
     * @param size  the fixed size of the generated Character array
     * @return the generated Character array 
//     */
//    public Character[] generateAnagram(int size) {
//       Character[] arr = new Character[size];
//        Random randomGenerator = new Random();
//        for (int i = 0; i < size; i++) {
//            int randomInt = randomGenerator.nextInt(26)+97;
//            arr[i] = (char)(randomInt);
//            System.out.print(arr[i]);
//        }
//        return arr;
//        
//    }
//    public Character[] generateAnagram2(int size) {
//        Character[] arr= new generateAnagram(this.size);
//        Character[] arr2 = new Character[size];
//        int k=0;
//        for (int i = arr.length; i > 0; i--) {
//            arr2[i] = arr[k];
//            k++;
//            System.out.print(arr[i]);
//        }
//        
//        return arr2;
//    }

    /**
     * Generates a new Character array that is PROBABLY NOT a palindrome.
     * @param size  the fixed size of the generated Character array
     * @return the generated Character array 
//     */
//    public Character[] generateNotAnagram(int size) {
//        Character[] arr = new Character[size];
//        Random randomGenerator = new Random();
//        for (int i = 0; i < size; i++) {
//            int randomInt = randomGenerator.nextInt(26)+97;
//            arr[i] = (char)(randomInt);
//            System.out.print(arr[i]);
//        }
//        return arr;
    

    
    /**
     * Tests the class.
     * Generates a new array of Character, displays its contents, then
     * instantiates an Character-typed Palindrome object called myPal,
     * uses it to display the contents of the array, and finally gets
     * it to check if the array is a palindrome.
     */
    public void run() {
        Anagram<Character> myAna = new Anagram<Character>();
        String str1 = "abcd";
        String str2 = "affd";
        if(myAna.isAnagram(str1,str2)){
            System.out.println("Its an anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }

    
    
}
