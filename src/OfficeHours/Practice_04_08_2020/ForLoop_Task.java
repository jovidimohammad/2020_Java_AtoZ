package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {
    /*
    print all the numbers between 0 ~ 100 that can be divided by 3
     */
       for(int i = 0; i <= 100; i++){
           if(i%3 == 0||i%5 == 0){
               System.out.println(i+" ");
           }
       }
        System.out.println();
        System.out.println("===============================");

        String name = "Jovid";
        String result ="";
         int lastIndex = name.length()-1;

         for(int i = lastIndex; i >= 0; i--) {
             result = result + name.charAt(i);
         }



    }
}
