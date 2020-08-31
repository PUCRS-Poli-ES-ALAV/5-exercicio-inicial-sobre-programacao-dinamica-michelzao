public class Exercicios{

    /*FIBO-REC (n)
    se n ≤ 1
    então devolva n
    senão a ← FIBO-REC (n − 1)
          b ← FIBO-REC (n − 2)
          devolva a + b
          */

    public int fiborec (int n){
        if (n <= 1){
            return n;
        }
        else{
            int a = fiborec(n -1);
            int b = fiborec(n -2);
            return a + b;
        }
    }

    /*FIBO (n)
    f [0] ← 0 
    f [1] ← 1
    para i ← 2 até n faça
        f[i] ← f[i-1]+f[i-2]
    devolva f [n]*/

    public int fibo (int n){
        int[] f = new int[n+2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i ++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}