import java.util.*;

class Main
{
  static boolean isPrime(int num){
    if(num == 0)
      return false;
    if(num == 1)
      return false;
    if(num == 2)
      return true;
    for(int i=2; i<=(num/2)+1; i++){
    	if(num%i==0)
          return false;
    }
    return true;
  }
  
  static int primeSum(int num){
    int sum=0;
  	for(int i=2; i<num; i++){
        if(isPrime(i)){
          	//System.out.println("prime is : "+i);
           	sum = sum+i;
        }
    }
    return sum;
  }
  
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    char[] str = S.toCharArray();
    int num = 0;
    boolean isDigit = true, isNeg = false;
    if(str[0] == '-')
      isNeg = true;
    for(int i=0; i<str.length; i++){
      	if(i==0 && isNeg)
          i++;
    	if(str[i]>'9' || str[i]<'0'){
        	isDigit = false;
          	break;
        }
      	else{
        	num = num*10 + (str[i] - '0');
        }
    }
   
    if(isDigit){
    	if(isNeg){
        	num = num*11;
          	System.out.println(num);
        }
      	else{
        	System.out.println(primeSum(num));
        }
    }
    else
      System.out.println(0);
  }
}