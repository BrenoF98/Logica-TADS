# Lista de Exercícios 05 — Vetores


**Curso:** Tecnologia em Analise e Desenvolvimento de Sistemas  
**Disciplina:** Logica de Programacao  
**Linguagem:** Java


## Orientações gerais

Desenvolva os exercícios utilizando os conceitos de lógica de programação estudados em sala de aula. Soluções diferentes são encorajadas, desde que demonstrem domínio das estruturas e técnicas apresentadas.

- Utilize vetores unidimensionais, variáveis, operadores, condicionais e estruturas de repetição (`for`, `while` e `do-while`).
- Utilize `Scanner` para leitura de dados quando necessário.
- Resolva cada exercício em um único programa Java, utilizando o método `main`.
- Não utilize matrizes, métodos auxiliares, classes adicionais, coleções (`ArrayList`, `HashSet`, etc.) ou bibliotecas que resolvam automaticamente os problemas.
- Implemente manualmente as operações de busca, comparação, inversão, deslocamento e ordenação quando solicitadas.
- Considere que as posições dos vetores em Java começam no índice `0`.

Os exercícios estão organizados em cinco blocos, com dificuldade progressiva. Os primeiros enfatizam acesso e percorrimento; os intermediários trabalham buscas e manipulação; os últimos exigem combinar diferentes estruturas e algoritmos.

## Bloco 1 — Fundamentos de vetores

Exercícios 1 a 8 · Nível básico

### Exercício 1 — Armazenamento e exibição

Crie um programa que leia 8 números inteiros e os armazene em um vetor. Após a leitura, apresente todos os elementos na mesma ordem em que foram digitados, indicando o índice de cada um.

### Exercício 2 — Acesso e alteração de posições

Crie um vetor de 6 posições contendo os valores `{1, 0, 5, -2, -5, 7}`.

O programa deverá:

1. Calcular e apresentar a soma dos elementos dos índices `0`, `1` e `5`.
2. Substituir o elemento do índice `4` pelo valor `100`.
3. Exibir o vetor atualizado, com um elemento por linha.

### Exercício 3 — Soma dos elementos

Leia 10 números inteiros, armazene-os em um vetor e calcule a soma de todos os elementos.

Apresente o vetor completo e o resultado da soma.

### Exercício 4 — Média aritmética

Leia as notas de 10 alunos, armazenando-as em um vetor de números reais.

Calcule e apresente a média da turma e a quantidade de alunos que obtiveram nota maior ou igual à média calculada.

### Exercício 5 — Contagem de pares e ímpares

Leia 12 números inteiros e armazene-os em um vetor.

Apresente a quantidade de números pares e ímpares. Em seguida, exiba primeiro todos os valores pares e depois todos os ímpares, preservando a ordem original de cada grupo.

### Exercício 6 — Valores positivos, negativos e zeros

Leia um vetor de 15 números inteiros.

Determine a quantidade de elementos positivos, negativos e iguais a zero. Calcule também a soma dos positivos e a soma dos negativos, separadamente.

### Exercício 7 — Exibição em ordem inversa

Leia 10 números inteiros e armazene-os em um vetor.

Apresente os valores na ordem inversa à leitura, sem modificar o conteúdo do vetor original e sem criar outro vetor.

### Exercício 8 — Maior e menor elemento

Leia um vetor contendo 10 números inteiros.

Determine o maior e o menor valor armazenado, apresentando também o índice da primeira ocorrência de cada um.

## Bloco 2 — Percorrimento, condições e buscas

Exercícios 9 a 16 · Nível básico a intermediário

### Exercício 9 — Comparação com um elemento

Leia um vetor de 15 números inteiros e, em seguida, solicite ao usuário um índice válido do vetor.

Utilize o valor armazenado nesse índice como referência e apresente quantos elementos do vetor são maiores, menores ou iguais a ele.

Inclua o próprio elemento de referência na contagem dos iguais.

### Exercício 10 — Múltiplos de um número

Leia 12 números inteiros e armazene-os em um vetor. Em seguida, solicite ao usuário um número inteiro `X`, diferente de zero.

Apresente todos os valores do vetor que são múltiplos de `X`, juntamente com seus índices. Ao final, informe a quantidade encontrada.

### Exercício 11 — Busca por valor

Leia 15 números inteiros e armazene-os em um vetor.

Solicite um número `X` e procure por ele no vetor. O programa deverá apresentar o índice da primeira ocorrência ou uma mensagem informando que o valor não foi encontrado.

### Exercício 12 — Busca com múltiplas ocorrências

Leia um vetor de 12 números inteiros. Solicite ao usuário um valor `X`.

O programa deverá apresentar todos os índices em que `X` aparece e informar a quantidade total de ocorrências. Caso não exista, apresente uma mensagem apropriada.

### Exercício 13 — Consulta de posições

Leia um vetor de 10 números inteiros.

Depois da leitura, permita que o usuário consulte repetidamente uma posição do vetor, exibindo seu valor. O programa deverá terminar quando o usuário informar `-1`.

Posições fora do intervalo válido devem produzir uma mensagem de erro, sem encerrar o programa.

### Exercício 14 — Acima e abaixo da média

Leia um vetor com 10 números reais.

Calcule a média aritmética e apresente separadamente os valores que estão acima dela e os que estão abaixo dela. Informe também quantos valores são exatamente iguais à média.

### Exercício 15 — Votação de candidatos

Desenvolva um programa para contabilizar votos em uma eleição com 5 candidatos, identificados pelos números de `1` a `5`.

Os votos devem ser lidos até que o usuário digite `-1`. Valores fora do intervalo devem ser desconsiderados.

Utilize um vetor para armazenar a quantidade de votos de cada candidato. Ao final, apresente a votação completa e indique o candidato vencedor. Caso exista empate na maior quantidade de votos, apresente todos os candidatos empatados.

### Exercício 16 — Pesquisa de nomes

Leia e armazene os nomes de 10 pessoas em um vetor.

Após a leitura, permita que o usuário pesquise nomes repetidamente. Para cada pesquisa, apresente `ACHEI` ou `NÃO ACHEI`.

O programa deverá encerrar quando for digitada a palavra `FIM`. A pesquisa deve desconsiderar diferenças entre letras maiúsculas e minúsculas.

## Bloco 3 — Manipulação e transformação

Exercícios 17 a 24 · Nível intermediário

### Exercício 17 — Troca de posições

Leia 10 números inteiros e armazene-os em um vetor.

Em seguida, solicite dois índices válidos e troque os valores armazenados nessas posições. Mostre o vetor após a troca.

Permita novas trocas até que o usuário informe `-1` como primeiro índice.

### Exercício 18 — Inversão em um segundo vetor

Leia 10 números inteiros e armazene-os em um vetor `A`.

Crie um segundo vetor `B` que contenha os mesmos elementos, mas na ordem inversa.

Apresente os dois vetores ao final.

### Exercício 19 — Transformação conforme o índice

Leia um vetor `A` contendo 10 números inteiros positivos.

Crie um vetor `B` seguindo estas regras:

- Se o índice for par, o elemento correspondente de `B` receberá o valor de `A` dividido por `2`, considerando apenas a parte inteira.
- Se o índice for ímpar, receberá o valor de `A` multiplicado por `3`.

Apresente os vetores `A` e `B`.

### Exercício 20 — Soma acumulada

Leia 10 números inteiros e armazene-os em um vetor `A`.

Crie um vetor `B` em que cada elemento seja a soma de todos os valores de `A` desde o índice `0` até o índice correspondente.

Exemplo:

```
A = [2, 4, 1, 3, 5]
B = [2, 6, 7, 10, 15]
```

### Exercício 21 — Soma de dois vetores

Solicite ao usuário a quantidade `N` de elementos, sendo `N` um número inteiro entre `1` e `20`.

Leia dois vetores `A` e `B`, ambos com `N` elementos inteiros.

Crie um terceiro vetor `C`, em que cada posição contenha a soma dos valores das posições correspondentes dos dois primeiros vetores.

Apresente os três vetores.

### Exercício 22 — Separação em pares e ímpares

Leia um vetor de 15 números inteiros.

Crie dois novos vetores: um contendo somente os números pares e outro contendo somente os ímpares.

Os elementos devem manter a ordem em que apareceram originalmente. Exiba apenas as posições efetivamente preenchidas de cada vetor.

### Exercício 23 — Comparação de vetores

Solicite um valor inteiro positivo `N` e leia dois vetores `A` e `B`, ambos com `N` elementos.

Verifique se os dois vetores são idênticos, isto é, se possuem os mesmos valores nas mesmas posições.

Caso sejam diferentes, apresente o índice da primeira posição em que ocorre uma diferença.

### Exercício 24 — Rotação circular

Leia um vetor de 10 números inteiros e, em seguida, solicite uma quantidade `K` de deslocamentos, com `K` entre `0` e `10`.

Desloque circularmente os elementos `K` posições para a direita. Os elementos que ultrapassarem a última posição deverão retornar ao início.

Exemplo:

```
Original: [10, 20, 30, 40, 50]
K = 2
Resultado: [40, 50, 10, 20, 30]
```

O vetor original deverá ser modificado, sem utilizar um segundo vetor.

## Bloco 4 — Algoritmos de busca e reorganização

Exercícios 25 a 32 · Nível intermediário a avançado

### Exercício 25 — Identificação de elementos repetidos

Leia um vetor contendo 15 números inteiros.

Identifique quais valores aparecem mais de uma vez e apresente cada valor repetido apenas uma vez, acompanhado de sua quantidade de ocorrências.

Exemplo:

```
Vetor: [4, 2, 4, 7, 2, 4, 9]

Resultado:
4 aparece 3 vezes
2 aparece 2 vezes
```

### Exercício 26 — Leitura sem valores duplicados

Crie um vetor para armazenar 10 números inteiros diferentes.

A cada número digitado, verifique se ele já foi inserido anteriormente. Caso exista, apresente uma mensagem e solicite outro número, sem avançar para a próxima posição.

Ao final, apresente o vetor com os 10 valores distintos.

### Exercício 27 — Compactação de um vetor

Leia um vetor de 15 números inteiros, que poderá conter valores iguais a zero.

Remova logicamente todos os zeros do vetor, deslocando os elementos restantes para a esquerda, de maneira a não deixar espaços entre eles.

O programa deverá modificar o próprio vetor e apresentar somente seus elementos válidos ao final.

Exemplo:

```
Original:   [4, 0, 7, 0, 0, 2, 9]
Compactado: [4, 7, 2, 9]
```

Não utilize um segundo vetor.

### Exercício 28 — Remoção de duplicatas

Leia um vetor contendo 15 números inteiros, permitindo valores repetidos.

Elimine as ocorrências duplicadas, preservando somente a primeira ocorrência de cada valor e mantendo a ordem original.

A operação deverá ser realizada no próprio vetor, deslocando os elementos quando necessário.

Exemplo:

```
Original: [5, 2, 5, 3, 2, 8, 3]
Resultado: [5, 2, 3, 8]
```

Apresente apenas os elementos válidos após a compactação.

### Exercício 29 — Ordenação crescente (Bubble Sort)

Leia um vetor contendo 12 números inteiros.

Implemente manualmente o algoritmo de ordenação Bubble Sort, organizando os elementos em ordem crescente.

Após cada passagem completa pelo vetor, apresente seu estado atual, permitindo acompanhar o processo de ordenação.

Não utilize `Arrays.sort()` ou outro recurso pronto de ordenação.

### Exercício 30 — Inserção em vetor ordenado

Leia um vetor com 10 números inteiros já fornecidos em ordem crescente.

Em seguida, solicite um novo número `X` e insira-o na posição correta, mantendo a ordenação.

Para isso, utilize um vetor com capacidade para 11 elementos e desloque os elementos necessários para a direita.

Exemplo:

```
Original: [2, 5, 8, 12, 20]
X = 10

Resultado: [2, 5, 8, 10, 12, 20]
```

Não reordene o vetor inteiro depois da inserção.

### Exercício 31 — Intercalação de vetores ordenados

Leia dois vetores `A` e `B`, cada um contendo 8 números inteiros em ordem crescente.

Crie um terceiro vetor `C` com 16 posições, contendo todos os elementos dos vetores anteriores, também em ordem crescente.

O programa deverá realizar a intercalação comparando os elementos dos dois vetores, sem utilizar algoritmos de ordenação no vetor resultante.

Exemplo:

```
A = [1, 4, 7, 10]
B = [2, 3, 8, 12]

C = [1, 2, 3, 4, 7, 8, 10, 12]
```

### Exercício 32 — Busca binária

Leia um vetor com 15 números inteiros distintos, fornecidos em ordem crescente.

Solicite ao usuário um número `X` e implemente uma busca binária para encontrá-lo.

A cada comparação, apresente o índice consultado e o valor encontrado nessa posição.

Ao final, informe o índice de `X`, caso exista, e a quantidade total de comparações realizadas.

Não utilize busca sequencial.

## Bloco 5 — Desafios integradores

Exercícios 33 a 40 · Nível avançado

### Exercício 33 — União de dois vetores

Leia dois vetores `A` e `B`, cada um contendo 10 números inteiros.

Crie um terceiro vetor `C` que represente a união dos dois conjuntos de valores, sem elementos repetidos.

Os valores devem aparecer em `C` na ordem de sua primeira ocorrência: inicialmente os de `A` e depois os valores ainda não presentes de `B`.

Exemplo:

```
A = [1, 2, 3, 4]
B = [3, 4, 5, 6]

C = [1, 2, 3, 4, 5, 6]
```

### Exercício 34 — Interseção de dois vetores

Leia dois vetores contendo 10 números inteiros cada.

Crie um terceiro vetor contendo somente os valores presentes em ambos os vetores, sem repetições.

Os elementos deverão aparecer na ordem de sua primeira ocorrência no primeiro vetor.

Exemplo:

```
A = [5, 3, 8, 3, 1]
B = [2, 3, 5, 9, 5]

Interseção = [5, 3]
```

### Exercício 35 — Verificação de subconjunto

Leia dois vetores `A` e `B`, cujas quantidades de elementos serão definidas pelo usuário.

Determine se todos os valores presentes em `B` também estão presentes em `A`, considerando os vetores como conjuntos, ou seja, sem considerar a quantidade de repetições.

Exemplo:

```
A = [1, 2, 3, 4, 5]
B = [2, 4, 5]

Resultado: B é subconjunto de A.
```

O programa também deverá apresentar os valores distintos de `B` que não foram encontrados em `A`, quando existirem.

### Exercício 36 — Organização de pares e ímpares

Leia um vetor contendo 15 números inteiros.

Reorganize seus elementos para que:

1. Os números pares apareçam primeiro, em ordem crescente.
2. Os números ímpares apareçam depois, em ordem decrescente.

Exemplo:

```
Original: [7, 2, 9, 4, 1, 8, 3]

Resultado: [2, 4, 8, 9, 7, 3, 1]
```

A reorganização deverá ocorrer no próprio vetor, sem utilizar vetores auxiliares.

### Exercício 37 — Maior sequência crescente consecutiva

Leia um vetor contendo 15 números inteiros.

Encontre a maior sequência de elementos consecutivos do vetor que estejam em ordem estritamente crescente. Os elementos precisam estar em posições consecutivas no vetor original.

Apresente o índice inicial, o índice final, o comprimento e os valores da sequência.

Exemplo:

```
Vetor: [5, 2, 4, 6, 8, 3, 7, 9, 1]

Maior sequência: [2, 4, 6, 8]
Início: 1
Fim: 4
Comprimento: 4
```

Em caso de empate, apresente a primeira sequência encontrada.

### Exercício 38 — Segundo maior valor distinto

Leia um vetor com 15 números inteiros.

Determine o maior e o segundo maior valor distinto do vetor, sem ordenar seus elementos.

Exemplo:

```
Vetor: [5, 9, 3, 9, 7, 5]

Maior valor: 9
Segundo maior: 7
```

Caso todos os elementos sejam iguais, informe que não existe um segundo maior valor distinto.

### Exercício 39 — Controle de estoque com vetores

Uma pequena loja possui 8 produtos, identificados pelos códigos de `1` a `8`.

Crie um vetor que armazene a quantidade disponível de cada produto. Inicialmente, o usuário deverá informar o estoque de todos os produtos, utilizando apenas quantidades não negativas.

Após a leitura inicial, apresente um menu com as seguintes operações:

1. Consultar o estoque de um produto.
2. Registrar a entrada de uma quantidade de unidades.
3. Registrar a venda de uma quantidade de unidades.
4. Listar todos os produtos e seus estoques.
5. Apresentar o produto com a maior quantidade em estoque.
6. Encerrar o programa.

As vendas somente deverão ocorrer quando houver estoque suficiente. Entradas e vendas deverão utilizar quantidades inteiras positivas.

Após cada operação, o programa deverá retornar ao menu, até que o usuário escolha encerrar.

### Exercício 40 — Simulação de fila de atendimento

Desenvolva um sistema de fila de atendimento que utilize um vetor de 10 posições para armazenar senhas numéricas.

O sistema deverá apresentar um menu com as seguintes opções:

1. Adicionar senha: solicitar uma senha numérica positiva e inseri-la no final da fila, desde que haja espaço e ela ainda não esteja presente.
2. Atender próxima senha: apresentar e remover a primeira senha da fila.
3. Consultar fila: apresentar todas as senhas na ordem de atendimento.
4. Consultar posição: solicitar uma senha e informar sua posição atual na fila, começando por `1`.
5. Encerrar programa.

A fila deverá respeitar a ordem de chegada (FIFO — First In, First Out).

Quando uma senha for atendida, os demais elementos deverão ser deslocados para a esquerda. O sistema também deverá tratar as situações de fila vazia, fila cheia e senha não encontrada.

Utilize somente um vetor para armazenar a fila, além das variáveis necessárias ao controle das operações.
