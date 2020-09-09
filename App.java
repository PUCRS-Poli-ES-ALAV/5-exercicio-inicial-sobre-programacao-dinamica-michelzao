import java.math.BigInteger;

public class App
{
	public static void main(String[] args)
	{
		long start, end;
		BigInteger result;
		int[] n = {4, 8, 16, 32};
		int[] n1 = {4, 8, 16, 32, 128, 1000, 10000};

		System.out.println("=== Fibo Rec ===");

		for (int k : n)
		{
			start = System.nanoTime();
			result = Exercicios.fiboRec(k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d µs\t %d %n", k, (end - start) / 1000, result);
		}

		System.out.println();
		System.out.println("=== Fibo ===");

		for (int k : n1)
		{
			start = System.nanoTime();
			result = Exercicios.fibo(k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d µs\t %d %n", k, (end - start) / 1000, result);
		}

		System.out.println();
		System.out.println("=== Memoized Fibo ===");

		for (int k : n1)
		{
			BigInteger[] f = new BigInteger[k + 1];
			start = System.nanoTime();
			result = Exercicios.memoizedFibo(f, k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d µs\t %d %n", k, (end - start) / 1000, result);
		}
	}
}
