package com.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 
public class Employee1  {
 
    String name;
    int id;
 
 public String getName() {
        return name;
 }
 
 public void setName(String name) {
        this.name = name;
 }
 
public int getId() {
 
       return id;
 }
 
public void setId(int id) {
        this.id = id;
}
 
 public Employee1(String name, int id) {
        this.name=name;
        this.id=id;
}
 
 
 public static void main(String[] args) {
 
        Employee1 e1= new Employee1("xyz", 37);
        Employee1 e2= new Employee1("abc", 46);
        Employee1 e3= new Employee1("sai", 38);
 
        ArrayList al= new ArrayList();
 
        al.add(e1);
        al.add(e2);
        al.add(e3);
       Collections.sort(al, new EmoSortByName());
        Iterator itr= al.iterator();
 
     while (itr.hasNext()) {
            Employee1 em = (Employee1) itr.next();
            System.out.println(em.getId()+" "+em.getName());            
       }
}
}


