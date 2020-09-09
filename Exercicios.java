import java.math.BigInteger;

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
	public static BigInteger fiboRec(int n)
	{
		if (n <= 1)
		{
			return BigInteger.valueOf(n);
		}
		BigInteger a = fiboRec(n - 1);
		BigInteger b = fiboRec(n - 2);
		return a.add(b);
	}

	/*
	FIBO (n)
		f [0] ← 0
		f [1] ← 1
		para i ← 2 até n faça
			f[i] ← f[i-1]+f[i-2]
		devolva f [n]
	*/
	public static BigInteger fibo(int n)
	{
		BigInteger[] f = new BigInteger[n + 2];
		f[0] = BigInteger.valueOf(0);
		f[1] = BigInteger.valueOf(1);
		for (int i = 2; i <= n; i++)
		{
			f[i] = f[i - 1].add(f[i - 2]);
		}
		return f[n];
	}

	/*
	MEMOIZED-FIBO (f, n)
		para i ← 0 até n faça
			f [i] ← −1
		devolva LOOKUP-FIBO (f, n)
	*/
	public static BigInteger memoizedFibo(BigInteger[] f, int n)
	{
		for (int i = 0; i <= n; i++)
		{
			f[i] = BigInteger.valueOf(-1);
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
	public static BigInteger lookupFibo(BigInteger[] f, int n)
	{
		if (f[n].compareTo(BigInteger.valueOf(0)) > 0)
		{
			return f[n];
		}
		if (n <= 1)
		{
			f[n] = BigInteger.valueOf(n);
		}
		else
		{
			f[n] = lookupFibo(f, n - 1).add(lookupFibo(f, n - 2));
		}
		return f[n];
	}
}