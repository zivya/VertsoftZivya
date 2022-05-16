/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verisoft_exec;

/**
 *
 * @author zivyahd
 */
abstract class Animal {
    protected boolean mammals;
    protected boolean carnivorous;
    protected int MOOD_HAPPY=0;
    protected int MOOD_SCARE=1;
    protected int mood;
    public Animal(boolean mammals,boolean carnivorous,int mood ){
      this.mammals= mammals ;
      this.carnivorous=carnivorous;
      this.mood=mood;        
    }
    public void sayHello(){ 
    }
    public void sayHello(int mood){ 
    } 
    public boolean isMammals(){
        System.out.println(mammals);
        return mammals;
    }
    public void setMammals(boolean mammals){
        this.mammals= mammals;
    }
      public boolean isCarnivorous(){
        return carnivorous;
      }
     public void setCarnivorous(boolean carnivorous){
        carnivorous=this.carnivorous;
    }
}
