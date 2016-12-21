package com.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 
public class Employee implements  Comparable {
 
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
 
 public Employee(String name, int id) {
        this.name=name;
        this.id=id;
}
 
 @Override
 public int compareTo(Object in) {
        int no= new Integer(this.id).compareTo(((Employee)in).id);
        if (no==0){
        	System.out.println("Duplicate object:"+no+""+this.getId()+""+this.getName());
        }
        return no;
  }
 public static void main(String[] args) {
 
        Employee e1= new Employee("xyz", 37);
        Employee e2= new Employee("abc", 39);
        Employee e3= new Employee("sai", 389);
        Employee e4= new Employee("sai", 38);

      if(e1.compareTo(e2)==0){
    	  System.out.println("Duplicate value.....................");
      };
        ArrayList al= new ArrayList();
 
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
    
        Collections.sort(al);
        Iterator itr= al.iterator();
 
     while (itr.hasNext()) {
            Employee em = (Employee) itr.next();
            System.out.println(em.getId()+" "+em.getName());            
       }
}
}