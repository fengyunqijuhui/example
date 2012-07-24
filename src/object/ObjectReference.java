package object;

public class ObjectReference {

	public static void main(String[] args) {
		ObjectReference reference = new ObjectReference();
		
		ObjectReference o1 = reference;
		
		ObjectReference o2 = o1;
		
		o1 = null;
		
		System.out.println(o2);
		System.out.println(o1);
	}
}
