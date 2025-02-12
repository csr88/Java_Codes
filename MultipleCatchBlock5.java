package com.company;
//here the order of exception is not good. The most general exception is at first and specific are at last. So the most specific exception should be at first and the general must be at last.

class MultipleCatchBlock5 {

    public static void main(String args[]) {

        try {
            int a[] = new int[5];
            a[4] = 30 / 0;

        }
        //This is how it's done. The specific ones should be at first and the more general one must be at last. #ordering is important
//        catch (Exception e)
//        {
//            System.out.println("common task completed");
//        }
        catch (ArithmeticException e)
        {
            System.out.println("task1 is completed");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("task 2 completed");
        }
        catch (Exception e)
        {
            System.out.println("common task completed");
        }

        System.out.println("rest of the code...");

    }
}