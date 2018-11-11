/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.util.ArrayList;
/**
 *
 * @author Notebook
 */
public class Data {
    private ArrayList<User> Massive = new ArrayList<User>();
    
    Data()
    {
        
    }
    public Data(int _size)
    {
        System.out.println("Массив инициализирован");
        for(int i = 0;i < _size;i++)
        {
             User newUser = new User();
             Massive.add(newUser);
        }
         
    }
    public void Add(User _entity)
    {
        Massive.add(_entity);
    }
    public User Get(int id)
    {
        if(Massive.size() == 0)
           throw new NullPointerException("Ошибка база данных пуста!");
        if(Massive.size()  < id)
           throw new NullPointerException("Ошибка выход за границу массива!");
        return Massive.get(id);
    }
    public void SetU(int id,User _entity)
    {
         if(Massive.size()  < id)
           throw new NullPointerException("Ошибка выход за границу массива!");
         if(Massive.size() == 0)
           throw new NullPointerException("Ошибка база данных пуста!");
        Massive.set(id,_entity);
    }
    public void SetInfo(int id,String _FIO,String _number)
    {
         if(Massive.size() < id)
           throw new NullPointerException("Ошибка выход за границу массива!");
         if(Massive.size() == 0)
           throw new NullPointerException("Ошибка база данных пуста!");
       this.Get(id).setFIO(_FIO);
       this.Get(id).setNumber(_number);
        
    }
    public void ShowFIO()
    {
        for(int i = 0;i < Massive.size();i++)
            System.out.println(Massive.get(i).getFIO());
    }
    public void ShowNumber()
    {
        for(int i = 0;i < Massive.size();i++)
            System.out.println(Massive.get(i).getNumber());
    }
}
