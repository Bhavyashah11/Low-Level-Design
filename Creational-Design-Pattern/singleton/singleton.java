import java.util.*;
import java.io.*;

class singleton{
    public static void main(String[] args){
        SingletonData s1 = SingletonData.getInstance();
        SingletonData s2 = SingletonData.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}

class SingletonData{
    public static SingletonData singletonData;
    private void  singletonData()
    {
        
    }

    public static SingletonData  getInstance(){
        if(singletonData==null){
            singletonData = new SingletonData();
            return singletonData;
        }
        else 
        {
            return null;
        }
    }
    
}