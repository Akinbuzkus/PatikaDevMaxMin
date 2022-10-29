
import java.util.Scanner;


public class PatikaDevMaxMin {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the number :");
        int number=scan.nextInt();
        int max = 0,min = 0;
        do {            
            for(int i=1;i<=number;i++){
                System.out.print(i+" enter the number :");
                int num=scan.nextInt();
                
                if(i==1){
                max=num;
                min=num;
                
                }
                if(num>max){
                    max=num;
                }
                if(num<min){
                    min=num;
                }
            }
                System.out.println("Max :"+max);
                System.out.println("Min :"+min);
            
            
        } while (number==0);
    }
}
