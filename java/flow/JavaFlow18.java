package tw.luchienlin.java.flow;

public class JavaFlow18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		
		int max=0;
	    for(int i=2;i<=45;i++){
	        int count=0;
	        for(int j=2;j<=i;j++){
	            if(i%j==0){    
	                count++;
	            }
	        }
	        if(count==1){
	            max=i;
	            System.out.println(i);
	        }
	    }
	    System.out.println("max="+max);
	}
	}
