package ru.jegensomme.humans;

public class Human {
   private String name;
   
   public Human(String name) {
      this.name = name;
   }
   
   @Override
   public String toString() {
      return "Human {" + name + "}";
   }
}
