class Over1{
	void show(){
		System.out.println("parent");
	}
}
class C extends Over1{
	void show()
	{
		System.out.println("Child's");
		
	}
	public static void main(String[] args)
	{
		Over1 obj1 = new C();
		obj1.show();


	
	    C obj2 = new C();
		obj2.show();
		obj1.show();
	}
}
 
    
