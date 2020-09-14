# Exercício inicial sobre Programação Dinâmica
## Resultados
### Fibonacci (tempo de execução em µs)
<table>
<thead>
  <tr>
    <th>Algoritmo</th>
    <th>N4</th>
    <th>N8</th>
    <th>N16</th>
    <th>N32</th>
    <th>N128</th>
    <th>N1.000</th>
    <th>N10.000</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>Fibo-Rec</td>
    <td align="right">1.073</td>
    <td align="right">16</td>
    <td align="right">797</td>
    <td align="right">92.372</td>
    <td align="center">-</td>
    <td align="center">-</td>
    <td align="center">-</td>
  </tr>
  <tr>
    <td>Fibo</td>
    <td align="right">42</td>
    <td align="right">1</td>
    <td align="right">2</td>
    <td align="right">3</td>
    <td align="right">144</td>
    <td align="right">227</td>
    <td align="right">5.307</td>
  </tr>
  <tr>
    <td>Memoized-Fibo</td>
    <td align="right">17</td>
    <td align="right">5</td>
    <td align="right">9</td>
    <td align="right">25</td>
    <td align="right">88</td>
    <td align="right">384</td>
    <td align="right">5.344</td>
  </tr>
</tbody>
</table>

### Mochila
<table>
<thead>
  <tr>
    <th></th>
    <th></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td></td>
    <td align="right"></td>
  </tr>
</tbody>
</table>

## Enunciados
### 1. Dadas as três versões de implementação de Fibonacci abaixo:
  - implemente os algortimos;
  - teste todos para os inteiros 4, 8, 16, 32; 
  - teste os dois últimos também para os inteiro 128, 1000 e 10.000.
    
   ```java
   FIBO-REC (n)
      se n ≤ 1
      então devolva n
      senão a ← FIBO-REC (n − 1)
            b ← FIBO-REC (n − 2)
            devolva a + b
   ```
    
   ```java
   FIBO (n)
        f [0] ← 0 
	f [1] ← 1
	para i ← 2 até n faça
           f[i] ← f[i-1]+f[i-2]
  	devolva f [n]
   ```
    
   ```java
   MEMOIZED-FIBO (f, n)
	para i ← 0 até n faça
	     f [i] ← −1
	devolva LOOKUP-FIBO (f, n)

   LOOKUP-FIBO (f, n)
	se f [n] ≥ 0
        então devolva f [n]
	se n ≤ 1
	então f [n] ← n
	senão f [n] ← LOOKUP-FIBO(f, n − 1) + LOOKUP-FIBO(f, n − 2)
	devolva f [n]
   ```
    
### 2. Monte uma tabela com os resultados das execuções acima. As linhas da tabela são os algoritmos implementados, as colunas os valores para testar e contabilizar.

### 3. Resolva o problema da mochila conforme o enuciado em sala de aula. 
  - Ache uma solução que testa todas as combinações possíveis e seleciona a melhor, aplicando divisão-e-conquista ou não;
  - Contabilize o número de iterações;
  - Implemente e teste sua solução, para o caso exposto em aula e outros de mesmo porte (;-)).

### 4. Resolva o problema da mochila utilizando o algoritmo com programação dinâmica visto em aula, teste e contabilize o número de iterações.

```javascript
   Inteiro backPackPD(Inteiro N, Inteiro C, Tupla<Inteiro, Inteiro> itens)
	
   	N = número de produtos;
	
   	C = capacidade real da mochila;
	
   	itens[N +1];   // (O índice 0 guarda null), Tupla com peso e valor
	
   	maxTab[N+1][C+1];
	
   	Inicialize com 0 toda a linha 0 e também a coluna 0;
	
   	para i = 1 até N
	
      		para j = 1 até C
		
         		se item itens[i].peso <= j // se o item cabe na mochila atual
			
            			maxTab[i][j] = Max(maxTab[i-1][j], 
				
                               			itens[i].valor + 
						
                                 		maxTab[i-1][j – itens[i].peso]);
						
         		senão
			
            			maxTab[i][j] = maxTab[i-1][j];

   	retorne maxTab[N][C] // valor máximo para uma mochila de capacidade C e 		         
                        //que pode conter itens que vão do item 1 até o item N.

```

### 5. Monte uma tabela com os resultados e número de iterações de ambas a implementações, para os testes de casos disponíveis no moodle.

### 6. Resolva o problema da distância de edição conforme o enuciado em sala de aula.
  - Ache uma solução que testa todas as combinações possíveis e seleciona a melhor, aplicando divisão-e-conquista ou não;
  - Contabilize o número de iterações;
  - Implemente e teste sua solução, para (pelos menos) os caso abaixo.
  
    **1.** 
    ```s1 = "Casablanca"```
    ```s2 = "Portentoso"```
 
    **2.** 
    ```
    s1 = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
    		"simplify the build processes in the Jakarta Turbine project. There were several" + 
			" projects, each with their own Ant build files, that were all slightly different." +
			"JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
			"definition of what the project consisted of, an easy way to publish project information" +
			"and a way to share JARs across several projects. The result is a tool that can now be" +
			"used for building and managing any Java-based project. We hope that we have created " +
			"something that will make the day-to-day work of Java developers easier and generally help " +
			"with the comprehension of any Java-based project.";
    ```
    ```
    s2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
			"kernels. They are universally applicable in any machine learning algorithm. Why you might" +
			"ask? I am going to try to answer this question in this article." + 
			"Go to the profile of Marin Vlastelica Pogančić" + 
			"Marin Vlastelica Pogančić Jun";
    ```
