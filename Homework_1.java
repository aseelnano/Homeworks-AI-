package homework_1;

import java.util.Scanner;

public class homework_1 {

    
    public static void main(String[] args) {
       
     Scanner x = new Scanner(System.in);
     
     int input = x.nextInt();
     

  for (int i = 1; i <= input ; i++) {

            if( (input % i) == 0){
                
                System.out.println(i );
            }
            
        }

    }
    
}