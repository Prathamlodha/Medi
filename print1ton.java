import java.util.Scanner;
public class print1ton {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 0 ;
        while(counter<= range){
            System.out.print(counter + " ");
            counter++;

        }
        System.out.println("the range is completed ");
    }
    
}
