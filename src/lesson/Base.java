/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson2;
import Database.Data;
/**
 *
 * @author Notebook
 */
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Data TestData = new Data(1);
        TestData.SetInfo(0,"Test Test Test","7943453453");
        TestData.ShowFIO();
        TestData.ShowNumber();
        // TODO code application logic here
    }
    
}
