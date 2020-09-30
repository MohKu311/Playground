import java.util.*;

class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-->0){
    	int N = sc.nextInt();
      	int ans = ((1<<N)-1)%1000000007;
      	System.out.println(ans);
    }
  }
}