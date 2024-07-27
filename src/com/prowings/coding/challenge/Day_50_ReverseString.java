 public class Day_50_ReverseString{
 
    public static String isReverse1(String s){
		
		System.out.println("Input string is " + s );
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return new String(sb);
	}
	
	public static String isReverse2(String s){
		
		System.out.println("Input string is " + s );
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = s.length()-1; i>=0;i--){
			
			sb.append(s.charAt(i));
		}
		return new String(sb);
	}
	
	
	public static String isReverse3(String s){
	
	    System.out.println("Input string is " + s );
		
		char[] data = s.toCharArray();
		
		int counter = 0;
		
		for(int i = s.length()-1;i>=0;i--){
			
			data[counter++] =s.charAt(i);
		}
		return new String(data);
	}
	
	public static void main(String[] args){
		
		System.out.println("Reverse String Using StringBuffer :"+ Day_50_ReverseString.isReverse1("Shree"));
		System.out.println("Reverse String Using Buffer :" + Day_50_ReverseString.isReverse2("Ram"));
		System.out.println("Reverse String Using Buffer :" + Day_50_ReverseString.isReverse3("Krishna"));
	}
 }