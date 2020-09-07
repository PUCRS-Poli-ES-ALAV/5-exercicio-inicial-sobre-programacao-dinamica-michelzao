public class Exercicios
{

	/*
	FIBO-REC (n)
		se n ≤ 1
			então devolva n
		senão a ← FIBO-REC (n − 1)
			  b ← FIBO-REC (n − 2)
			  devolva a + b
	*/
	public static long fiboRec(int n)
	{
		if (n <= 1)
		{
			return n;
		}
		long a = fiboRec(n - 1);
		long b = fiboRec(n - 2);
		return a + b;
	}

	/*
	FIBO (n)
		f [0] ← 0
		f [1] ← 1
		para i ← 2 até n faça
			f[i] ← f[i-1]+f[i-2]
		devolva f [n]
	*/
	public static long fibo(int n)
	{
		long[] f = new long[n + 2];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

	/*
	MEMOIZED-FIBO (f, n)
		para i ← 0 até n faça
			f [i] ← −1
		devolva LOOKUP-FIBO (f, n)
	*/
	public static long memoizedFibo(long[] f, int n)
	{
		for (int i = 0; i <= n; i++)
		{
			f[i] = -1;
		}
		return lookupFibo(f, n);
	}

	/*
	LOOKUP-FIBO (f, n)
		se f [n] ≥ 0
			então devolva f [n]
		se n ≤ 1
			então f [n] ← n
		senão f [n] ← LOOKUP-FIBO(f, n − 1) + LOOKUP-FIBO(f, n − 2)
		devolva f [n]
	*/
	public static long lookupFibo(long[] f, int n)
	{
		if (f[n] >= 0)
		{
			return f[n];
		}
		if (n <= 1)
		{
			f[n] = n;
		}
		else
		{
			f[n] = lookupFibo(f, n - 1) + lookupFibo(f, n - 2);
		}
		return f[n];
	}
}