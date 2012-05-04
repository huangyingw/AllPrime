public class mainThreadClass {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			PrimeThread p = new PrimeThread(1 + 200000 * (i - 1), 200000 * i);
			p.start();
		}
	}
}
