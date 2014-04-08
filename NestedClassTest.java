public class NestedClassTest {

	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
		
		nc.setMessage("This a Outer Class");
		System.out.println(nc.getMessage());
		
		NestedClass.InnerClass ic = nc.new InnerClass();
		
		ic.setMessage("This is a Inner Class");
		System.out.println(ic.getMessage());
		
		NestedClass.InnerClass.ChildClass cc = ic.new ChildClass();
		
		cc.setMessage("This is a Child Class");
		System.out.println(cc.getMessage());
	}

}
