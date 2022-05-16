/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verisoft_exec;

/**
 *
 * @author zivyahd
 */
public class Cat extends Animal implements Land{
    private int numberOfLengs;
    
    public Cat(boolean mammals,boolean carnivorous,int mood){
       
        super(true,true,mood);
    }
   @Override 
   public void sayHello(){
       // Cats usually make a "meow~"
       System.out.println("meow");
   }
   @Override
   public void sayHello(int mood){
    //when they are in a good mood,they make a "purr, purr" sound
       if(mood==MOOD_HAPPY)
        System.out.println("purr, purr");
    // when they are frightened,they make a "hiss" sound;
    if(mood==MOOD_SCARE)
        System.out.println("hiss");
   }
 
    @Override
   public int getNumberOfLengs(){
       numberOfLengs=4;
        System.out.println("Cat has "+numberOfLengs+" legs");
       return numberOfLengs;
   }
   
    
}
