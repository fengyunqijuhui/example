package for循环;

public class ForNewUse {

	public static void main(String[] args) {
		for (int i = 0; true; i++) {
			if(i == 10){
				System.out.println(i);
				break;
			}
		}
	}
}
