package Raw;

public class Test {

	public static void main(String[] args) {
		System.out.println(testing(10));
	}
	
	public static int testing (int x) {
		
		while(true) {
			if(x==6) {
				return 10;
			}
			x--;
		}
	}
}
