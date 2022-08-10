package com.ank.abstraction;

interface printable{  
void print();  
}  
class abstraction4 implements printable{  
public void print(){System.out.println("Hello! how are you?");}  
  
public static void main(String args[]){  
	abstraction4 obj = new abstraction4();  
obj.print();  
 }  
}  