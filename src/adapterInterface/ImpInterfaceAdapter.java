package adapterInterface;

public class ImpInterfaceAdapter implements InterfaceAdapter{

	@Override
	public int get() {
	
		return 0;
	}
	
	public int getNewValue(){
		return 1;
	}	
	
	public static void main(String[] args) {
		InterfaceAdapter adapter = new ImpInterfaceAdapter();
		System.out.println(adapter.get());
		System.out.println(((ImpInterfaceAdapter)adapter).getNewValue());
	}

}
