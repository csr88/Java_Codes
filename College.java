package com.company.SetBuilder;

public class College {
    public static void main(String[] args) {
        Student_SetBuilder sb = new StudentBuilder().setName("Shishir").setFaculty("BCS").setId(123789).getStudent_SetBuilder();
        Student_SetBuilder sa = new StudentBuilder().setName("asdf").setFaculty("dfgh").setId(87452).getStudent_SetBuilder();

        System.out.println(sb);
        System.out.println(sa);
        System.out.println(sb);

    }
}
