public class Mochila
{
	public static int mochilaBruta(int n, int c, int[] pesos, int[] valores)
	{
		if (n <= 0 || c <= 0)
		{
			return 0;
		}

		if (pesos[n - 1] > c)
		{
			return mochilaBruta(n - 1, c, pesos, valores);
		}
		return Math.max(
				valores[n - 1] + mochilaBruta(n - 1, c - pesos[n - 1], pesos, valores),
				mochilaBruta(n - 1, c, pesos, valores));
	}
}
