import java.util.*;

class Main
{
  static int problem(int N){
  	int count = 0;
    int a = (N&(N-1));
    
    if(a==0)
      return 1;
    
    while(N>0){
    	if(N%2==0)
          N=N/2;
      	else{
        	N--;
          	count++;
        }
    }
    return count;
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-->0){
    	int N = sc.nextInt();
      	System.out.println(problem(N));
    }
  }
}