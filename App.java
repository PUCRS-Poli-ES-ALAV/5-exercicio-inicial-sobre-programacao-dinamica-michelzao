import java.math.BigInteger;

public class App
{
	public static void main(String[] args)
	{
		//testFibo();
		testMochila();
	}

	private static void testMochila()
	{
		int c = 165;
		int[] pesos = {23, 31, 29, 44, 53, 38, 63, 85, 89, 82};
		int[] valores = {92, 57, 49, 68, 60, 43, 67, 84, 87, 72};
		System.out.println(Mochila.mochilaBruta(pesos.length, c, pesos, valores));

		c = 190;
		pesos = new int[]{56, 59, 80, 64, 75, 17};
		valores = new int[]{50, 50, 64, 46, 50, 5};
		System.out.println(Mochila.mochilaBruta(pesos.length, c, pesos, valores));
	}

	private static void testFibo()
	{
		long start, end;
		BigInteger result;
		int[] n = {4, 8, 16, 32};
		int[] n1 = {4, 8, 16, 32, 128, 1000, 10000};

		System.out.println("=== Fibo Rec ===");

		for (int k : n)
		{
			start = System.nanoTime();
			result = Fibonacci.fiboRec(k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d µs\t %d %n", k, (end - start) / 1000, result);
		}

		System.out.println();
		System.out.println("=== Fibo ===");

		for (int k : n1)
		{
			start = System.nanoTime();
			result = Fibonacci.fibo(k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d µs\t %d %n", k, (end - start) / 1000, result);
		}

		System.out.println();
		System.out.println("=== Memoized Fibo ===");

		for (int k : n1)
		{
			BigInteger[] f = new BigInteger[k + 1];
			start = System.nanoTime();
			result = Fibonacci.memoizedFibo(f, k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d µs\t %d %n", k, (end - start) / 1000, result);
		}
	}
}
