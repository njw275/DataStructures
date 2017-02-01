/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import stacksandqueues.*;

/**
 *
 * @author ogm2
 */
public class DelimiterValidation {

    
    MyStackIF<Character> myStack;
    Character[] array = new Character[100];
    String line = "";
 
    public DelimiterValidation() {
        myStack = new MyStackImpl<>(array);
    }

    public void checkFile(String pathname) {
        try{
            Scanner sc = new Scanner(new File(pathname));
            do{
                line = sc.nextLine();
                //System.out.println(line);
                for(int i=0;i<line.length();i++){
                    char a = line.charAt(i);
                    switch (a){
                        case '{':
                        case '[':
                        case '(':
                            myStack.push(a);
                            break;
                        case '}':
                        case ']':
                        case ')':
                            if (!myStack.isEmpty()){
                                char b = myStack.pop();
                                if (a == '}' && b != '{' ||
                                    a == ']' && b !='['  ||
                                    a == ')' && b != '('){
                                    System.out.println("Missing match for "+a+" at line "+i);
                                }
                            }
                            else{
                                System.out.println("Missing match for "+a+" at line "+i);
                            }
                            break;
                        default:
                            break;
                    }
                }
            } while (sc.hasNextLine());
            if (!myStack.isEmpty()){
                System.out.println("Missing end delimiter.");
            }
            else{
                System.out.println("File search completed. Delimiters are all matched.");
            }

        }
        
        catch (FileNotFoundException e){}
        catch (FullStructureException e){}
        catch (EmptyStructureException e){}
    }
}
