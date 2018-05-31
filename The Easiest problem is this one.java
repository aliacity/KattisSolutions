import java.util.Scanner;
import java.io.IOException;
//import java.util.ArrayList;
public class EasiestProblem {
    public static void main (String args[]) throws IOException, NumberFormatException{
        Scanner in = new Scanner (System.in);
        //System.out.println("Enter a number");
        int  basenum = Integer.parseInt(in.nextLine()); // accepts the user input
        while (basenum!=0){
            System.out.println(magic(basenum));
            basenum = Integer.parseInt(in.nextLine());
        }
                
        in.close();
        
    }
    public static int magic(int num){
        int goal = total(num);
        int count = 11;
        int answer = 0;
        boolean run = true;
        while(run){
            //int test = count*num;
            if ((total(count*num))==goal){
                run = false;
                answer = count;
            }
            count++;
        }
        return answer;
    }
    
    public static int total(int num){
        int total = 0;
        String input = Integer.toString(num);
        String [] intarray = input.split("");
        for (String x:intarray){
         total += Integer.parseInt(x);          
        }
        return total;
    }
    

}
