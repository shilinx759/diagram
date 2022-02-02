import java.io.InputStream;
import java.util.Scanner;



public class App {

    public static void sum(int a,int b){
        
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println(a+"到"+b+"="+sum);

    }
    public static void main(String[] args) throws Exception {
       Scanner in =new Scanner(System.in);
       sum(1,10);
       sum(20,30);

    }

  
}
