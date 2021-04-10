package com.company;

public class PrintStarPattern_JavaLab {
    public static void main(String[] args){
        int i,j;

        for (i=1;i<=3;i++){ //this loop runs
            for (j=1;j<=3;j++){ //then goes into this loops and then this loops runs until this loop condition finished
                System.out.print("*" + "\t");//then goes back to i which now is increased by 1 and loops runs again
            }
            System.out.println("");
        }


        //Another Star Pattern

        for (i=1;i<=5;i++){
            for (j=1;j<i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
    }
}
