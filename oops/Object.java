package oops;

 class Object {
	 public void disp() {
		  String fName ;
		  String sName ;
		  int age ;
		  
		  fName = "Shubham";
		  sName = "Rathee";
		  age = 21;
		  
		  System.out.println("First name of person is "+fName);
		  System.out.println("Last name of person is "+sName);
		  System.out.println("Age of person is "+age);
		  
	 }
	 public static void main(String[] args) {
		 Object info = new Object() ;
		 
		 info.disp();
		 
	 }
	 

}
