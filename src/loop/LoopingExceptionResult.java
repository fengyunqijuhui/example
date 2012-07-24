package loop;

public class LoopingExceptionResult {

	
	public static void main(String[] args) {
		try {
			int i = 0;
			while (true) {
				i ++;
				System.out.println(i);
				if(i == 10){
					throw new Exception();
				}
			}
		} catch (Exception e) {
			System.out.println("End");
			
		}
	}
}
