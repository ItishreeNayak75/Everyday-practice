class Armstrong{
                  public static void main(String args[]){
                  int num=567;
                  int ld=num%10;
                  int sld=(num/10)%10;
                  int tld=(num/10)/10;
                  int num1=ld*ld*ld;
                  int num2=sld*sld*sld;
                  int num3=tld*tld*tld;
                  if(num==num1+num2+num3){
                     System.out.println("number is a armstrong");
                   }
                  else{
                      System.out.println("number is not a armstrong");
                   }
           }
   }