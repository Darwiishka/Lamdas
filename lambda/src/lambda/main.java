package lambda;

public class main {

	public static void main(String[] args) {
		
		greating g1 = new greating() {
			public void welcome() {
				System.out.println("Darwiish");
			}
		};
		
		greating g = new greating();
		g.welcome();
		g1.welcome();

	}

}
