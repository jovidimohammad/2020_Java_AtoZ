package HM;
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        if(start =="A" && end == "B"){
            System.out.println("right: B found");
        }else if(start == "B" && end == "C" ){
            System.out.println("down: C found");
        }else if(start == "C" && end == "D" ){
            System.out.println("lef: D found");
        }else if(start == "D" && end == "A" ){
            System.out.println("up: A found");
        }
        //}else if(start == "B" && end == "C" ){
        //System.out.println("down: C found");
        //System.out.println("right: B found");
    }
}