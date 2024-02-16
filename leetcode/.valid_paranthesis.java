
// the solution for leetcode problem "valid paranthesis"
public boolean isValid(String str) {
         Stack<Character> stack = new Stack<Character>();
        
	    for(int i=0;i<str.length();i++)
	    {
	        
	        if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')  
	        {
	            stack.push(str.charAt(i));
	          
	        }  
	        else if(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']')
	        {
	        	if(stack.empty())
	        	{
	        		stack.push(' ');
	        		break;
	        	}

	        	if(!stack.empty())
	        	{
	        	if(str.charAt(i)==(char)(stack.peek()+1) || str.charAt(i)==(char)(stack.peek()+2))
	        	{
	        		stack.pop();
	        	}
	        	else
	        	{
	        		return false;
	        	}
	        }
	        
	       
	       
	    }
		
	    }
	    
	    if(stack.empty())
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
		
		
}
