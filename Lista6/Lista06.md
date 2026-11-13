# Lista de Exercícios 06 — Matrizes


**Curso:** Tecnologia em Analise e Desenvolvimento de Sistemas  
**Disciplina:** Logica de Programacao  
**Linguagem:** Java


## Orientações gerais

Desenvolva os exercícios utilizando os conceitos de lógica de programação estudados em sala de aula. Soluções diferentes são encorajadas, desde que demonstrem domínio das estruturas e técnicas apresentadas.

- Utilize matrizes (vetores bidimensionais), vetores, variáveis, operadores, condicionais e estruturas de repetição (`for`, `while` e `do-while`).
- Utilize `Scanner` para leitura de dados e `java.util.Random` quando o enunciado solicitar valores aleatórios.
- Resolva cada exercício em um único programa Java, utilizando o método `main`.
- Não utilize métodos auxiliares, classes adicionais, coleções (`ArrayList`, `HashSet`, etc.) ou bibliotecas que resolvam automaticamente os problemas, como `Arrays.toString()`, `Arrays.deepToString()` e `Arrays.sort()`.
- Considere que os índices de linhas e colunas em Java começam em `0`. Quando o enunciado utilizar numeração a partir de 1 (por exemplo, "segunda linha"), faça a conversão para o índice correspondente.
- Sempre que a quantidade de linhas `L` e de colunas `C` for informada pelo usuário, valide os valores de acordo com o limite indicado no enunciado.
- Apresente as matrizes em formato de tabela, com uma linha da matriz por linha da tela.

Os exercícios estão organizados em cinco blocos, com dificuldade progressiva. Os primeiros enfatizam leitura, preenchimento e exibição; os intermediários trabalham linhas, colunas, diagonais e operações entre matrizes; os últimos exigem combinar diferentes estruturas para resolver problemas completos.

## Bloco 1 — Fundamentos de matrizes

Exercícios 1 a 8 · Nível básico

### Exercício 1 — Leitura e exibição

Crie um programa que leia os elementos de uma matriz de números inteiros com 3 linhas e 4 colunas.

Durante a leitura, indique ao usuário a posição que está sendo preenchida, por exemplo: `Elemento [1][2]:`.

Após a leitura, apresente a matriz em formato de tabela.

### Exercício 2 — Preenchimento sequencial

Leia a quantidade `L` de linhas e `C` de colunas de uma matriz, ambas entre `1` e `10`.

Crie duas matrizes `L x C`:

1. A primeira deverá ser preenchida automaticamente com os valores `1, 2, 3, ...`, percorrendo a matriz linha por linha.
2. A segunda deverá ser preenchida com os mesmos valores, mas percorrendo a matriz coluna por coluna.

Apresente as duas matrizes.

Exemplo para `L = 3` e `C = 4`:

```
Por linhas:        Por colunas:
 1  2  3  4         1  4  7 10
 5  6  7  8         2  5  8 11
 9 10 11 12         3  6  9 12
```

### Exercício 3 — Tabuada em matriz

Leia um número inteiro `N`, entre `1` e `10`, e crie uma matriz `N x N` em que cada elemento seja o produto do número da linha pelo número da coluna, considerando a numeração a partir de `1`.

Ou seja, o elemento de índice `[i][j]` deverá receber `(i + 1) * (j + 1)`.

Apresente a matriz gerada.

### Exercício 4 — Matriz identidade

Declare uma matriz de inteiros `5 x 5`.

Preencha com `1` os elementos da diagonal principal e com `0` os demais elementos, utilizando estruturas de repetição.

Apresente a matriz obtida.

### Exercício 5 — Tabuleiro de xadrez

Leia o tamanho `N` de uma matriz quadrada e preencha-a automaticamente com um padrão de tabuleiro de xadrez, alternando entre `0` e `1`.

Exemplo para `N = 4`:

```
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0
```

### Exercício 6 — Contagem de valores

Leia uma matriz `4 x 4` de números inteiros.

Determine e apresente:

1. A quantidade de valores maiores que `10`.
2. A quantidade de valores pares e de valores ímpares.
3. A quantidade de valores negativos.

### Exercício 7 — Maior e menor elemento

Leia uma matriz `4 x 4` de números inteiros e apresente-a em formato de tabela.

Determine o maior e o menor valor armazenado, apresentando também a localização (linha e coluna) da primeira ocorrência de cada um.

### Exercício 8 — Multiplicação por escalar

Leia uma matriz `A` de inteiros `3 x 3` e, em seguida, um número inteiro `K`.

Crie uma matriz `B` em que cada elemento seja o elemento correspondente de `A` multiplicado por `K`.

Apresente as matrizes `A` e `B`.

## Bloco 2 — Linhas, colunas e diagonais

Exercícios 9 a 16 · Nível básico a intermediário

### Exercício 9 — Somas selecionadas

Leia uma matriz `4 x 4` de números inteiros. Calcule e apresente a soma dos elementos:

1. Da linha de índice `2`.
2. Da coluna de índice `1`.
3. Da diagonal principal.
4. Da diagonal secundária.
5. De toda a matriz.

### Exercício 10 — Regiões da diagonal principal

Preencha uma matriz `6 x 6` com valores aleatórios entre `0` e `99` e apresente-a.

Em seguida:

1. Apresente somente os elementos que estão acima da diagonal principal.
2. Apresente somente os elementos que estão abaixo da diagonal principal.
3. Calcule a soma dos elementos de cada uma dessas duas regiões.

Observe a relação entre os índices `i` e `j` em cada região: acima da diagonal (`i < j`), na diagonal (`i == j`) e abaixo da diagonal (`i > j`).

### Exercício 11 — Leitura fora da diagonal

Crie uma matriz de inteiros `5 x 5`.

Leia do usuário somente os elementos que não pertencem à diagonal principal. Os elementos da diagonal principal deverão receber automaticamente o valor `0`, sem serem solicitados.

Ao final, apresente a matriz completa.

### Exercício 12 — Somas de linhas e colunas

Leia a quantidade `L` de linhas e `C` de colunas de uma matriz, ambas com no máximo `10`. Em seguida, leia uma matriz `L x C` de números inteiros.

Crie dois vetores:

- `SL`, em que cada posição armazena a soma de uma linha da matriz.
- `SC`, em que cada posição armazena a soma de uma coluna da matriz.

Apresente a matriz e os dois vetores.

Exemplo:

```
Matriz:
 5 -8 10
 1  2 15
25 10  7

SL = [7, 18, 42]
SC = [31, 4, 32]
```

### Exercício 13 — Maior elemento de cada linha

Leia a quantidade `L` de linhas e `C` de colunas de uma matriz, ambas com no máximo `10`. Em seguida, leia uma matriz `L x C` contendo apenas valores positivos.

Copie para um vetor o maior elemento de cada linha da matriz. Após o término da cópia, apresente o vetor.

Para cada linha, informe também o índice da coluna em que o maior valor foi encontrado.

### Exercício 14 — Linhas com soma X

Leia uma matriz `5 x 5` de números inteiros.

Em seguida, solicite repetidamente ao usuário um valor `X` e informe quais linhas da matriz possuem soma de elementos igual a `X`. Caso nenhuma linha atenda à condição, apresente uma mensagem apropriada.

O programa deverá encerrar quando o usuário informar `-999`.

Exemplo:

```
Matriz:
 2  4  6 -4  3
 4  9 -8  2  4
 1  5  0  7 -6
 3  9  3 -5 -3
-4  2  3 -1  1

X = 11
Linha 0
Linha 1

X = 7
Linha 2
Linha 3

X = 0
Nenhuma linha soma o valor informado.
```

### Exercício 15 — Consulta de valores

Leia a quantidade `L` de linhas e `C` de colunas de uma matriz, ambas com no máximo `10`. Em seguida, leia uma matriz `L x C` contendo apenas valores positivos.

Depois, leia uma quantidade indeterminada de valores. Para cada valor, informe se ele está armazenado na matriz e, em caso afirmativo, a localização (linha e coluna) da primeira ocorrência.

Para cada valor consultado, a mensagem deverá ser impressa apenas uma vez. O programa termina quando for informado um valor negativo.

### Exercício 16 — Matriz gerada por fórmula

Gere e apresente uma matriz `10 x 10`, em que cada elemento é calculado da seguinte forma:

```
A[i][j] = 2i + 7j - 2       se i < j
A[i][j] = 3i² - 1           se i = j
A[i][j] = 4i³ - 5j² + 1     se i > j
```

Calcule as potências utilizando multiplicações.

## Bloco 3 — Operações e transformações

Exercícios 17 a 24 · Nível intermediário

### Exercício 17 — Soma e diferença de matrizes

Leia duas matrizes `A` e `B`, ambas de inteiros com 3 linhas e 5 colunas.

Crie uma matriz `S` com a soma de `A` e `B` e uma matriz `D` com a diferença entre `A` e `B`. A operação é feita elemento a elemento, entre posições correspondentes.

Exemplo de soma:

```
| 0 1 2 |   | 4 2 3 |   | 4 3  5 |
| 4 0 1 | + | 3 5 9 | = | 7 5 10 |
```

Apresente a matriz `S` e, logo após, a matriz `D`.

### Exercício 18 — Maiores valores por posição

Leia duas matrizes `A` e `B` de inteiros, ambas `4 x 4`.

Crie uma terceira matriz `M` em que cada posição contenha o maior valor entre as posições correspondentes de `A` e `B`.

Apresente as três matrizes.

### Exercício 19 — Matriz transposta

Leia a quantidade `L` de linhas e `C` de colunas de uma matriz, ambas com no máximo `10`. Em seguida, leia uma matriz `A` com `L` linhas e `C` colunas.

Gere uma matriz `T`, transposta de `A`, em que as linhas de `A` se tornam as colunas de `T`. Apresente a matriz `T`.

Exemplo:

```
L = 2, C = 3

A:            T:
 5  3 20       5  2
 2  1 12       3  1
              20 12
```

### Exercício 20 — Matriz simétrica

Leia um número inteiro `N`, entre `1` e `10`, e uma matriz quadrada `N x N`.

Verifique se a matriz é simétrica, isto é, se `A[i][j]` é igual a `A[j][i]` para todas as posições.

Caso não seja, apresente a primeira posição em que a simetria é violada. Não crie a matriz transposta para realizar a verificação.

Exemplo de matriz simétrica:

```
1 7 3
7 4 5
3 5 6
```

### Exercício 21 — Matriz triangular inferior

Gere uma matriz `4 x 4` com valores aleatórios no intervalo `[1, 20]` e apresente-a.

Em seguida, transforme a própria matriz em uma matriz triangular inferior, atribuindo zero a todos os elementos acima da diagonal principal.

Apresente a matriz transformada.

### Exercício 22 — Troca de linhas, colunas e diagonais

Preencha uma matriz `M` de inteiros `10 x 10` com valores aleatórios entre `0` e `99` e apresente-a.

Realize as trocas abaixo, nesta ordem, apresentando a matriz após cada uma delas:

1. A segunda linha pela oitava linha.
2. A quarta coluna pela décima coluna.
3. A diagonal principal pela diagonal secundária, ou seja, em cada linha, o elemento da diagonal principal troca de lugar com o elemento da diagonal secundária.

### Exercício 23 — Operações sobre colunas

Leia uma matriz `3 x 6` de números reais.

Considerando as colunas numeradas de `1` a `6`:

1. Apresente a soma de todos os elementos das colunas ímpares (1ª, 3ª e 5ª).
2. Apresente a média aritmética dos elementos da 2ª e da 4ª colunas.
3. Substitua os valores da 6ª coluna pela soma dos valores da 1ª e da 2ª colunas da mesma linha.
4. Apresente a matriz modificada.

### Exercício 24 — Menu de operações

Leia duas matrizes `A` e `B`, ambas `2 x 2`, com valores reais.

Apresente um menu com as seguintes opções:

1. Somar as duas matrizes.
2. Subtrair a primeira matriz da segunda (`B - A`).
3. Adicionar uma constante às duas matrizes.
4. Imprimir as matrizes.
5. Encerrar o programa.

Nas duas primeiras opções, o resultado deve ser armazenado em uma terceira matriz `2 x 2` e apresentado. Na terceira opção, o valor da constante deve ser lido e o resultado deve ser armazenado nas próprias matrizes `A` e `B`.

Após cada operação, o programa deverá retornar ao menu, até que o usuário escolha encerrar.

## Bloco 4 — Aplicações com matrizes

Exercícios 25 a 32 · Nível intermediário a avançado

### Exercício 25 — Multiplicação de matrizes

Leia duas matrizes `A` e `B` de inteiros, ambas `3 x 3`.

Calcule e apresente:

1. A matriz `C = A * B`.
2. A matriz `D = A²`, ou seja, `A * A`.

Lembre-se de que o produto de matrizes não é feito elemento a elemento: cada elemento `C[i][j]` é a soma dos produtos dos elementos da linha `i` de `A` pelos elementos correspondentes da coluna `j` de `B`.

```
C[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j] + A[i][2] * B[2][j]
```

### Exercício 26 — Rotação de matriz

Leia um número inteiro `N`, entre `1` e `10`, e uma matriz quadrada `N x N`.

Crie uma nova matriz que corresponda à matriz original rotacionada 90 graus no sentido horário. Apresente as duas matrizes.

Exemplo:

```
Original:     Rotacionada:
1 2 3         7 4 1
4 5 6         8 5 2
7 8 9         9 6 3
```

Desafio extra: realize a rotação 90 graus no sentido anti-horário e 180 graus.

### Exercício 27 — Vendas anuais

Carregue uma matriz `12 x 4` com os valores das vendas de uma loja, em que cada linha representa um mês do ano e cada coluna uma semana do mês. Para fins de simplificação, considere que cada mês possui somente 4 semanas.

Calcule e apresente:

1. O total vendido em cada mês do ano.
2. O total vendido em cada semana, considerando o ano todo.
3. O total vendido no ano.
4. O mês com o maior total de vendas.

### Exercício 28 — Notas finais dos alunos

Crie uma matriz de inteiros com 5 linhas e 4 colunas, contendo informações sobre alunos de uma disciplina:

- Primeira coluna: número de matrícula.
- Segunda coluna: média das provas.
- Terceira coluna: média dos trabalhos.
- Quarta coluna: nota final.

O programa deverá:

1. Ler as três primeiras informações de cada aluno.
2. Calcular a nota final como a soma da média das provas com a média dos trabalhos, armazenando-a na quarta coluna.
3. Apresentar a matrícula do aluno que obteve a maior nota final (assuma que só existe uma maior nota).
4. Apresentar a média aritmética das notas finais.

### Exercício 29 — Pior prova de cada aluno

Leia uma matriz `10 x 3` com as notas de 10 alunos em 3 provas.

Em seguida, apresente:

- O número de alunos cuja pior nota foi na prova 1.
- O número de alunos cuja pior nota foi na prova 2.
- O número de alunos cuja pior nota foi na prova 3.

Em caso de empate entre as piores notas de um aluno, considere a primeira prova com a menor nota. Cada aluno deve ser contabilizado apenas uma vez.

### Exercício 30 — Correção de prova

Desenvolva um programa para corrigir uma prova com 10 questões de múltipla escolha (`a`, `b`, `c`, `d` ou `e`), em uma turma com 5 alunos. Cada questão vale 1 ponto.

O programa deverá:

1. Ler o gabarito e armazená-lo em um vetor de 10 posições.
2. Para cada aluno, ler sua matrícula, armazenando-a em um vetor, e suas 10 respostas, armazenando-as em uma linha de uma matriz `5 x 10`.
3. Comparar as respostas de cada aluno com o gabarito e armazenar a pontuação de cada um em um vetor denominado `resultado`.

Ao final, apresente para cada aluno sua matrícula, suas respostas e sua nota. Apresente também o percentual de aprovação da turma, considerando aprovados os alunos com nota maior ou igual a `7`.

### Exercício 31 — Loteria esportiva

Leia um vetor `G` de 13 elementos que contenha o gabarito da loteria esportiva, codificado da seguinte forma: `1` — coluna um, `2` — coluna do meio, `3` — coluna dois.

Logo após, leia uma matriz `13 x 3` que contenha a aposta de um jogador. Cada posição da matriz armazena `1` se a coluna foi apostada e `0` caso contrário.

Calcule e apresente o número de pontos obtidos pelo jogador. Apresente também o número de apostas simples, duplas e triplas utilizadas.

Exemplo:

```
Gabarito:
1 2 3 1 1 2 3 3 1 1 2 2 3

Aposta:
1 0 0
1 1 0
1 1 1
0 0 1
0 1 0
0 1 0
1 1 0
0 1 1
1 0 1
1 1 1
0 0 1
1 0 0
0 1 0

Resultado:
7 (pontos)
7 (simples)
4 (duplas)
2 (triplas)
```

### Exercício 32 — Quadrado mágico

Dizemos que uma matriz quadrada de inteiros é um quadrado mágico se a soma dos elementos de cada linha, a soma dos elementos de cada coluna e as somas das diagonais principal e secundária são todas iguais.

Leia um número inteiro `N`, entre `1` e `10`, e uma matriz `N x N`. Verifique se ela é um quadrado mágico.

Exemplo de quadrado mágico:

```
8  0  7
4  5  6
3 10  2
```

Todas as linhas, colunas e diagonais somam `15`.

## Bloco 5 — Desafios integradores

Exercícios 33 a 40 · Nível avançado

### Exercício 33 — Cartela de bingo

Gere automaticamente uma cartela de bingo com 5 linhas e 5 colunas, contendo números entre `0` e `99`.

A cartela não poderá conter números repetidos. A cada número sorteado, verifique se ele já existe na cartela antes de armazená-lo.

Apresente a cartela gerada.

Desafio extra: após gerar a cartela, simule um sorteio de números até que a cartela seja completada, informando quantos números foram sorteados.

### Exercício 34 — Movimentação com W, A, S, D

Crie uma matriz `10 x 10` preenchida com zeros e coloque o valor `5` na posição `[4][5]`.

A partir daí, permita que o usuário utilize as teclas `W`, `A`, `S` e `D` para movimentar o número `5` para cima, esquerda, baixo e direita, respectivamente. Após cada movimento, apresente a matriz atualizada.

O número não poderá sair dos limites da matriz. Movimentos inválidos devem produzir uma mensagem, sem alterar a posição. O programa deverá encerrar quando o usuário digitar `Q`.

### Exercício 35 — Matriz em espiral

Leia um número inteiro `N`, entre `1` e `10`, e preencha uma matriz `N x N` com os valores `1, 2, 3, ..., N²` em forma de espiral, no sentido horário, iniciando no canto superior esquerdo.

Exemplo para `N = 4`:

```
 1  2  3  4
12 13 14  5
11 16 15  6
10  9  8  7
```

### Exercício 36 — Maior produto de adjacentes

Na matriz `20 x 20` abaixo, quatro números ao longo de uma diagonal descendente foram destacados: `26`, `63`, `78` e `14`, iniciando na posição `[6][8]`. O produto desses números é `26 * 63 * 78 * 14 = 1788696`.

```
08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
```

Determine o maior produto de quatro números adjacentes em qualquer direção (horizontal, vertical ou em uma das duas diagonais). Apresente o produto, os quatro números e a posição inicial da sequência.

A matriz pode ser declarada diretamente no código. Atenção: em Java, números inteiros escritos com zero à esquerda (como `08` e `09`) não são interpretados como decimais, portanto remova os zeros à esquerda ao declarar a matriz.

### Exercício 37 — Próxima jogada no Jogo da Velha

Desenvolva um programa para determinar a próxima jogada em um Jogo da Velha.

O tabuleiro é representado por uma matriz `3 x 3`, em que cada posição pode conter:

- `-1`: uma peça minha.
- `0`: uma casa vazia.
- `1`: uma peça do meu oponente.

Leia o tabuleiro e indique a posição (linha e coluna) da próxima jogada, seguindo esta ordem de prioridade:

1. Se existir uma jogada que me faça vencer, escolha-a.
2. Caso contrário, se o oponente puder vencer na próxima jogada, bloqueie-o.
3. Caso contrário, jogue no centro, se estiver livre.
4. Caso contrário, jogue em um canto livre.
5. Caso contrário, jogue em qualquer casa livre.

Exemplo:

```
-1  1  1
-1 -1  0
 0  1  0
```

Neste caso, as posições `[1][2]`, `[2][0]` e `[2][2]` levam à vitória. Qualquer uma delas é uma resposta válida.

### Exercício 38 — Jogo da Velha

Implemente um Jogo da Velha para dois jogadores, utilizando uma matriz de caracteres `3 x 3` para representar o tabuleiro.

O programa deverá:

1. Apresentar o tabuleiro a cada jogada.
2. Alternar entre os jogadores `X` e `O`, solicitando a linha e a coluna da jogada.
3. Impedir jogadas fora do tabuleiro ou em casas já ocupadas, solicitando uma nova jogada.
4. Verificar, após cada jogada, se houve vitória em alguma linha, coluna ou diagonal, utilizando estruturas de repetição para percorrer a matriz.
5. Informar o vencedor ou o empate (velha) ao final da partida.

### Exercício 39 — Batalha Naval

Implemente uma versão simplificada do jogo Batalha Naval para um jogador.

O tabuleiro será uma matriz `8 x 8`. O programa deverá posicionar aleatoriamente 6 navios, cada um ocupando uma única casa, sem que dois navios ocupem a mesma posição.

O jogador terá 20 tiros. A cada tiro, deverá informar a linha e a coluna do alvo, e o programa deverá apresentar o tabuleiro do ponto de vista do jogador:

- `~` para casas ainda não atingidas.
- `X` para tiros que acertaram um navio.
- `O` para tiros na água.

Tiros fora do tabuleiro ou em posições já atingidas não devem ser contabilizados. O jogo termina quando todos os navios forem afundados ou quando os tiros acabarem. Ao final, apresente o resultado e revele a posição de todos os navios.

Desafio extra: utilize navios de tamanho 2 e 3, posicionados na horizontal ou na vertical, sem ultrapassar os limites do tabuleiro.

### Exercício 40 — Jogo de Damas

Implemente uma versão simplificada do Jogo de Damas para dois jogadores, utilizando uma matriz `8 x 8`.

Regras da versão simplificada:

1. As peças ocupam somente as casas escuras, isto é, as posições em que a soma da linha com a coluna é ímpar. Cada jogador começa com 12 peças, distribuídas nas três primeiras linhas do seu lado do tabuleiro.
2. Os jogadores se alternam. Em cada jogada, o jogador informa a posição de origem e a posição de destino da peça.
3. Uma peça pode se mover uma casa na diagonal, sempre para frente, para uma casa vazia.
4. Uma peça pode capturar uma peça adversária que esteja na casa diagonal à sua frente, saltando sobre ela para a casa vazia imediatamente seguinte. A peça capturada é removida do tabuleiro.
5. Jogadas inválidas devem ser recusadas com uma mensagem, solicitando nova jogada ao mesmo jogador.
6. O jogo termina quando um dos jogadores ficar sem peças.

Apresente o tabuleiro após cada jogada, com a numeração das linhas e colunas, e informe o vencedor ao final.

Desafio extra: implemente a promoção da peça a dama ao alcançar a última linha do lado adversário, permitindo que ela se mova também para trás.
