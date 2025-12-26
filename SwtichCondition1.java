package first.basic.program;

public class SwtichCondition1 {

	public static void main(String[] args) {
	
		int a = 4;
		
		switch(a) {
		case 1: System.out.println("THAT IS ONE");
				System.out.println("1---FIRST");
				break;
		case 2: System.out.println("THAT IS TWO");
		System.out.println("2---SECOND");
		break;
		
		case 3: System.out.println("THAT IS THREE");
		System.out.println("3---THIRD");
		break;
		
		case 4: System.out.println("THAT IS FOUR");
		System.out.println("4---FOURTH");
		break;
		
		case 5: System.out.println("THAT IS FIVE");
		System.out.println("5---FIFTH");
		break;
		
		default : System.out.println("INVALID NUMBER");
		}

	}

}
