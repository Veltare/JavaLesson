/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Notebook
 */
public class User {
    String FIO;
    String number;
   
    static  public int count_User = 0;
    User()
    {
        count_User++;
    }
    User(String _FIO,String _number)
    {
        FIO = _FIO;
        number = _number;
        count_User++;
    }
    String getFIO()
    {
        return FIO;
    }
    String getNumber()
    {
        return number;
    }
    void setFIO(String _FIO)
    {
        FIO = _FIO;
    }
    void setNumber(String _number)
    {
        number = _number;
    }
}
