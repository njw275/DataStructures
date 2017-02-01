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
 * 
 */
public class AgesOfHollywood{
    
    String line = "";
    int count = 0;
    MyPriorityQueueIF<String> myQueue;
    HollywoodCelebrity hollywood = new HollywoodCelebrity();
    String[] array = new String[100];

    public AgesOfHollywood() {
        //this.array = array;
        myQueue = new MyPriorityQueueImpl<>(array);
    }
    
    public void parseTextFile(String pathname) {
        try{
            Scanner sc = new Scanner(new File(pathname));
            
            do{
                line = sc.nextLine();
                //line = line.replaceAll("\\n", "");
                hollywood.setFirstName(line.substring(0, line.indexOf(' ')));
                hollywood.setLastName(line.substring(line.indexOf(' '), line.lastIndexOf(' ')));
                hollywood.setYearOfBirth(Integer.parseInt(line.substring(line.indexOf('1'),line.length())));
                myQueue.insert(hollywood.toString(), hollywood.getYearOfBirth());
            } while (sc.hasNextLine());
            myQueue.display();
            
        }
        catch(FileNotFoundException e){}
        catch(FullStructureException e){}
    }
    
    
    
}
