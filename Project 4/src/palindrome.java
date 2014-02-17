
public class palindrome {
	public static void main(String args[]){
		int x=0;
		 int y=0;
		 int sum=0;
		 int reverse=0;
		 int temp=0;
		 int value=0;
		 for(x=0;x<=999;x++){
		  for(y=0;y<=999;y++){
		   sum=x*y;
		   temp=sum;
		   reverse=0;
		   while(temp>0){
		    reverse*=10;
		    reverse=reverse+(temp%10);
		    temp/=10;
		   }
		   if((reverse==sum)&&(sum>value)){
		     value=reverse;

		   }
		   }
		  }
		 System.out.println(value);
		 }
}
