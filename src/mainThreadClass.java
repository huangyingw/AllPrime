public class mainThreadClass {
	public static void main(String[] args) {
		PrimeThread p1 = new PrimeThread(1, 200000);
		PrimeThread p2 = new PrimeThread(200001, 400000);
		PrimeThread p3 = new PrimeThread(400001, 600000);
		PrimeThread p4 = new PrimeThread(600001, 800000);
		PrimeThread p5 = new PrimeThread(800001, 1000000);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
}
