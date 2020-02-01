package com.example.tes;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Name;
    
public Employee(){
}

public int getID(){
	return ID;
}

public void setID(int ID){
    this.ID=ID;
}
public String getName(){
	return Name;
}


public void setName(String Name){
}
}



