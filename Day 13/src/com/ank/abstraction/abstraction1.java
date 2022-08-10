package com.ank.abstraction;

abstract class Shape{  
abstract void draw();  
}  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
class abstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();  
Shape r=new Rectangle();
s.draw();  
r.draw();
}  
}  