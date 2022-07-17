
public class callByValAndCallByRef {
	
	int p;
	int q;//global variable

	public static void main(String[] args) {
		
		callByValAndCallByRef obj=new callByValAndCallByRef();
		int x=10;
		int y=20;
		obj.testSum(x, y);//call by value(pass the copy of the value to method...doen't effect the main value)
	    
		obj.p=50;
		obj.q=60;//these are non-statics so we have to access it using obj refrence
	    
		
		obj.swap(obj);//access the method and pass the refrence of class i.e the obj
	     //after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	
	
	
	public int testSum(int a,int b) {
		a=30;
		b=40;
		int c=a+b;
		return c;
	}
	
	//call by reference(we are passing the value of object reference)
	public void swap(callByValAndCallByRef t) {//pass the reference variable of this class
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}


}
