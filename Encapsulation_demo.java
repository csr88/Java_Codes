package com.company;

public class Encapsulation_demo {
    private String name;
    private int age;
    private String id;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setAge( int age) {
        this.age = age;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public void setId( String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Encapsulation_demo ed = new Encapsulation_demo();
        ed.setName("Shishir");
        ed.setAge(121);
        ed.setAge(20);

        System.out.println("\nName: " + ed.getName() + "\nID: " + ed.getId() + "\nAge: " + ed.getAge() + "\nClass: " + ed.getClass() );
    }
}