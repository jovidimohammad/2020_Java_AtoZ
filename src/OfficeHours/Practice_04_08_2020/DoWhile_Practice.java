package OfficeHours.Practice_04_08_2020;

public class DoWhile_Practice {
    public static void main(String[] args) {
    /*
            do{
                   statements;
            }while(Condition);
        execution order:
            1.  statements;
            2. Condition
                    if true: repeats step1
                    if false: stops the loop
     */


        boolean b = false;

        while(b){
            System.out.println("Hello World");
        }

        System.out.println("========================================");

        do{
            System.out.println("Hello Cybertek");
        }while(b);




    }

}
