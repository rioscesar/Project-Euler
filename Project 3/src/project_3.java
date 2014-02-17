
public class project_3 {
	public static void main(String args[]){
		//600851475143 find largest prime factor
		 long n = 600851475143L;
		  int tmp = 2;
		  
		  while(true) {
		   if(n == tmp)
		    break;
		   
		   if(n%tmp == 0)
		    n /= tmp;
		   else
		    tmp += 1;
		  }
		  
		  System.out.println( n );
		  	
	}
}
