package a;

  class Test {
	 void Show() {                           // simple method (to call we have to create object)
		System.out.println(1);
	}
	 static void show() {                    // static method ( directly called by class name)
		 System.out.println(2);
	 }
	public static void main(String[] args) {
		Test t = new Test();
		t.Show();
		Test.show();
	}
     
}
