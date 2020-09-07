public class App
{
	public static void main(String[] args)
	{
		long start, end;
		int[] n = {4, 8, 16, 32};
		int[] n1 = {4, 8, 16, 32, 128, 1000, 10000};

		System.out.println("=== Fibo Rec ===");

		for (int k : n)
		{
			start = System.nanoTime();
			Exercicios.fiboRec(k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d ns%n", k, (end - start));
		}

		System.out.println();
		System.out.println("=== Fibo ===");

		for (int k : n1)
		{
			start = System.nanoTime();
			Exercicios.fibo(k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d ns%n", k, (end - start));
		}

		System.out.println();
		System.out.println("=== Memoized Fibo ===");

		for (int k : n1)
		{
			long[] f = new long[k + 1];
			start = System.nanoTime();
			Exercicios.memoizedFibo(f, k);
			end = System.nanoTime();
			System.out.printf("n%d\t= %d ns%n", k, (end - start));
		}
	}
}
