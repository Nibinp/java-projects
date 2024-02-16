public class stack {

	 public int[] arr =new int[10];
	public int tos;
	 stack(){
	 	tos =-1;
	}
	 
	 public void push(int item)
	 {
		if(tos<9) {
			tos++;
		   arr[tos]=item;}
		else
			System.out.println("Array is fully ocuupied..");
	 }
	
	 public int pop()
	 {
		 if(tos<0) {
			System.out.println("stack underflow..");
		 	return 0;
		 }
		 else
			return arr[tos--];
			 
	 }
	
}
