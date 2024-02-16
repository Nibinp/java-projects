import java.util.*;
public class Main
{


public static boolean valid(Stack<Character> stack)

{
     String str="()";
        stack.push(str.charAt(0));
	    for(int i=1;i<str.length();i++)
	    {
	        
	        if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')  
	        {
	            stack.push(str.charAt(i));
	        }  
	        else
	        {
	            char a =stack.pop();
	            if(a-2==stack.peek()||a-1==stack.peek())
	            
	            {
	                if(stack.empty())
	        {
	            continue;
	        }
	        else{
	            return false;
	        }
	            }
	        
	        
	        
	        }
	        
	  
	          
	    }
    
    return true;
}

	public static void main(String[] args) {
	    Stack<Character> stack = new Stack<Character>();
	   
	    System.out.println(valid(stack));
	}

}
