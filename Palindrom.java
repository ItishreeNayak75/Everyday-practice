import java.util.Scanner;
          class Palindrom{
                  public static void main(String args[]){
		  Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
                    int num=sc.nextInt();
                    if(num%11==0){
                         System.out.println("Number is a palindrome number");
                      }
                     else{
                           System.out.println("Number is not a palindrome number");
			}
		}
}