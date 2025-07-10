import java.util.Scanner;
class End0{
              public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter a number");
               int num=sc.nextInt();
               if(num%10==0){
                   System.out.println("Number Ends with 0");
               }
              else{
                   System.out.println("Number does not Ends with 0");
               }
        }
  } 