package com.serna.entidades;

public class Exhibitor extends Person{

   private Double salary;


   public Exhibitor(String name, String lastName, String email, Double salary) {
      super(name, lastName, email);
      this.salary = salary;
   }
   @Override
   public String toString() {
      return super.toString() +
              "salary=" + salary +
              '}';
   }
}
