
public class project2 {
	 public static void main(String args[]){
		 int prev1=1; 
		 int prev2=2;
		 int curr=0;
		 int sum=2;
		 
		while(curr<=4000000){
		 curr=prev1+prev2;
		 prev1=prev2;
		 prev2=curr;
		 if(curr%2==0){
		 sum=sum+curr;
		 }
		 }
		 System.out.println(sum);
		    
		  }
		  }