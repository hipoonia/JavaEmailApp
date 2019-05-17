package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Deep", "poonia");
		
		em1.setAlternateEmail("zeroperiod@gmail.com");
		
		System.out.println(em1.showInfo());
		
		
		
	}

}
