import java.util.*;
public class Ex01{ 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L,W;
        System.out.println("Rectangle area calculator");
        System.out.print("Length : ");
        L = sc.nextInt();
        System.out.print("Width : ");
        W = sc.nextInt();   
        System.out.println("Area = "+(L*W));        
        sc.close();
    }
}
