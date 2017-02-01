/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere;

/**
 *
 * @author Nicholas_White
 */
class Vigenere {
    public static void main(String args[]){
      new Vigenere().run();
    }
    
    public void Encrypt(String s1, String s2) {
        String phrase = s1;
        String key = s2;
        phrase = phrase.toLowerCase();
        key = key.toLowerCase();
        for (int i=0; i<key.length();i++){
            if (key.length() < phrase.length()){
                key = key+key.charAt(i); 
            }
        }
        Character[] Phrase = new Character[phrase.length()];
        Character[] Key = new Character[key.length()];
        Character[] Alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        //Character[] Phrase = new Character[phrase.length()];
        for (int i =0;i<phrase.length();i++){
            char phraseChar = phrase.charAt(i);
//          System.out.print(phrase.substring(i,i+1));
            //System.out.println(phraseChar);
            Phrase[i] = phraseChar;
        }
        for (int i=0;i<phrase.length();i++){
            char keyChar = key.charAt(i);
            Key[i] = keyChar;
        }
        int[] phraseNum = new int[phrase.length()];
        int[] keyNum = new int[key.length()];
        int[] finalNum = new int[phrase.length()];
        char[] codedArray = new char[finalNum.length];
        for (int j=0;j<phrase.length();j++){
            for(int i=0;i<Alphabet.length;i++){
                if (Phrase[j] == Alphabet[i]){
                    phraseNum[j] = i%26;
                   // System.out.println(phraseNum);
                }
            }
        }
        for (int j=0;j<key.length();j++){
            for(int i=0;i<Alphabet.length;i++){
                if (Key[j] == Alphabet[i]){
                    keyNum[j] = i%26;
                  //  System.out.println(keyNum);
                }
            }
        }

        for (int i=0;i<phraseNum.length;i++){
            finalNum[i] = phraseNum[i] + keyNum[i];
        }
        
        for (int i=0;i<finalNum.length;i++){
            codedArray[i] = Alphabet[finalNum[i]%26];
            System.out.print(codedArray[i]);
            
        }
        
       // for (int i=0;i<phrase.length();i++){
      //      System.out.print(Key[i]);
      //  }
    }
        
//        String Str = new String("Welcome to Tutorialspoint.com");
//        //Character[] Phrase = new Character[Str.length()];
//        for (int i=0;i<Str.length();i++){
//            char firstletter = Str.charAt(i);
//          //Phrase[i] = firstletter;
//            System.out.println(firstletter);
    
    void run(){
        new Vigenere().Encrypt("ABC","NYUSH");
    }

//    Vigenere() {
  //      this.Phrase = new Character[];
    //}

    
}
