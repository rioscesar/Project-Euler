
public class project_9 {
	    public static int findPythagonTriplet(){
	        int k=0;        
	        
	        for(int i=1;i<1000;i++){
	            for(int j=i+1;j<999;j++){
	                k = (int) Math.sqrt(i*i + j*j);
	                
	                if(i+j+k==1000 && i<j && j<k){
	                    if(i*i+j*j==k*k)
	                    return i*j*k;
	                }
	            }
	        }
	        
	        return 0;
	    }
	    
	    public static void main(String [] args){
	        System.out.print(findPythagonTriplet());
	    }
	}