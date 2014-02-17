
public class project_7 {
	public static void main(String args[]){
	    	
		  int num=0;
		   int primesFound=0;
		   
		   while(primesFound<=10001) {
		    num++;
		    
		    if(isPrime(num))
		     primesFound++;
		   }
		   
		   System.out.println(num);
		        
		 }

		 public static boolean isPrime(int number){
		  for(int i=2; i<number; i++){
		      if(number%i == 0)
		          return false;
		    }
		    return true; 
		 }
		}