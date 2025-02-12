package com.company;

class One {
    String name;
    public One()
    {
        this.name = "Ram";
        System.out.println("This is A");
    }
}

class Two extends One {
public Two(){
    System.out.println(super.name);
    System.out.println("This is B");
}

    public static void main(String[] args) {
        Two obj = new Two();
    }

}