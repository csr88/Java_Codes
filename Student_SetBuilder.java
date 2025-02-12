package com.company.SetBuilder;

//Builder Pattern
public class Student_SetBuilder {
    private String name;
    private String address;
    private long number;
    private String faculty;
    private int id;

    public Student_SetBuilder(String name, String address, long number, String faculty, int id) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.faculty = faculty;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student_SetBuilder{" +
                "Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Number=" + number +
                ", Faculty='" + faculty + '\'' +
                ", id=" + id +
                '}';
    }
}
