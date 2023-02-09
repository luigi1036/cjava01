package com.serna.entidades;

public class Exhibitor extends Person{

   private Float salary;


   public Exhibitor(String name, String lastName, String email, Float salary) {
      super(name, lastName, email);
      this.salary = salary;
   }

   public Float getSalary() {
      return salary;
   }

   public void setSalary(Float salary) {
      this.salary = salary;
   }

   @Override
   public String toString() {
      return "Exhibitor{" +
              super.toString() +
              "salary=" + salary +
              '}';
   }
}
