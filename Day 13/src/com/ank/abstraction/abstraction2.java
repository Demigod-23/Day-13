package com.ank.abstraction;

abstract class Bike{  
	   Bike(){
		   System.out.println("bike is on");
		   }  
	   abstract void run();  
	   void changeGear(){
		   System.out.println("gear changed");
		   }  
	 }  
	 class Honda extends Bike{  
	 void run(){System.out.println("running safely");}  
	 }  
	 class abstraction2{  
	 public static void main(String args[]){  
	  Bike obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}  