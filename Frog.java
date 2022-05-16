/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verisoft_exec;

/**
 *
 * @author zivyahd
 */
public class Frog extends Animal implements Water,Land{
    public int numberOfLengs;
    public Frog(boolean mammals,boolean carnivorous,int mood){
        
        super(false, false, mood);
    }
   @Override 
   public void sayHello(){   
   }
   @Override
   public void sayHello(int mood){
      //When the frog is in a good mood, it will sing "quack quack quack"
    if(mood==MOOD_HAPPY)
        System.out.println("quack quack quack");
    if(mood==MOOD_SCARE)
        //when frightened, it will "plop into the water"
        System.out.println("plop into the water"); 
   }
 @Override
   public int getNumberOfLengs(){
        numberOfLengs=2;
        System.out.println("Frog has "+numberOfLengs+" legs");
        return numberOfLengs;
   }
  

    
   @Override
    public boolean hasGills() {
        
        return true;
        
    }

    @Override
    public boolean hasLaysEggs() {
       
     return true;
    
}

    
}
