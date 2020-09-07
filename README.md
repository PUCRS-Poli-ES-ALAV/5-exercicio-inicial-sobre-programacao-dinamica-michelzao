# Exercício inicial sobre Programação Dinâmica
## Resultados
### Tempo em nanosegundos
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
    <td align="right">455.550</td>
    <td align="right">4.000</td>
    <td align="right">152.600</td>
    <td align="right">15.285.200</td>
    <td align="center">-</td>
    <td align="center">-</td>
    <td align="center">-</td>
  </tr>
  <tr>
    <td>Fibo</td>
    <td align="right">2.500</td>
    <td align="right">900</td>
    <td align="right">1.100</td>
    <td align="right">1.600</td>
    <td align="right">4.100</td>
    <td align="right">35.100</td>
    <td align="right">299.500</td>
  </tr>
  <tr>
    <td>Memoized-Fibo</td>
    <td align="right">4.000</td>
    <td align="right">1.800</td>
    <td align="right">2.800</td>
    <td align="right">5.000</td>
    <td align="right">33.550</td>
    <td align="right">209.700</td>
    <td align="right">1.714.500</td>
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
