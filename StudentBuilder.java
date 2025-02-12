package com.company.SetBuilder;

public class StudentBuilder {
    private String name;
    private String address;
    private long number;
    private String faculty;
    private int id;

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setNumber(long number) {
        this.number = number;
        return this;
    }

    public StudentBuilder setFaculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public Student_SetBuilder getStudent_SetBuilder(){
        return new Student_SetBuilder(name, address, number, faculty, id);
    }
}
