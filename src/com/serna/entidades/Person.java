package com.serna.entidades;

public class Person {

    private final int code;
    private final String name;
    private final String lastName;
    private final String email;

    public static int counter = 1;

    public Person(String name, String lastName, String email) {
        this.code = counter++;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }
    @Override
    public String toString() {
        return "{code=" + code +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' + ", " ;
    }
}
