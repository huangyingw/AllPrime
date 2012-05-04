public class mainThreadClass {
	public static void main(String[] args) {
		System.out.println("Inside main  ");
		int i;
		for (i = 1; i <= 10; i++) {
			PrimeThread p = new PrimeThread(1, 200000);
			p.start();
		}
	}
}
