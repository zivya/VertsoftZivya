/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verisoft_exec;

/**
 *
 * @author zivyahd
 */
public class Dog extends Animal implements Land{
    public int numberOfLengs;
    
    
    public Dog(boolean mammals,boolean carnivorous,int mood){
         super(true,true,mood);
        //super(mammals, carnivorous, mood); 
    }

    
    @Override
     public void sayHello(){
     //Dogs usually greet people by "wagging their tails"
        
     System.out.println("wagging their tails");
     }
   
   @Override 
   public void sayHello(int mood){
       //When they feel comfortable being touched, they will bark loudly
        if(mood == MOOD_HAPPY)
           System.out.println("bark loudly");
       //When they are frightened and upset, they will make a "whooping" sound
       if(mood == MOOD_SCARE) 
           System.out.println("whooping");

       
   }
 
    @Override
   public int getNumberOfLengs(){
        numberOfLengs=4;
        System.out.println("Dog has "+numberOfLengs+" legs");
       return numberOfLengs;
       
   }
   
    
}

