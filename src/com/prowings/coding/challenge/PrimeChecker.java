import java.util.Scanner;

public class PrimeChecker{

public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    
	int no = sc.nextInt();
	
PrimeChecker.isPrime(no);

}   
    public static int isPrime(int number){
	   
	     int temp = 0;
	 
	    for( int i =2; i<=number-1;i++){
	 
	        if(number%i==0){
	 
	             temp = temp+1;
	        }
        }
	    if(temp == 0){
	
	    System.out.println( number + " IS PRIME NUMBER");	
        }
        else{
        System.out.println( number + " IS NOT PRIME NUMBER");   
        }
	    return temp;   
    }
}

