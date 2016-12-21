package com.test;

import java.util.Comparator;

public class EmoSortByName implements Comparator<Employee1> {
 
    @Override
	public int compare(Employee1 arg0, Employee1 arg1) {
        return arg0.getName().compareTo(arg1.getName());
    }
 
}