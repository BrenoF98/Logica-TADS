# Avaliação de Aprendizagem III

Tecnologia em Análise e Desenvolvimento de Sistemas
Lógica de Programação
Professor Vinícius Fritzen Machado

Instituto Federal Rio Grande do Sul, Campus Rio Grande

---

Desenvolva 5 dos exercícios abaixo utilizando somente o que foi visto em sala de aula. Desenvolva cada exercício em um programa Java separado. Apresente mensagens claras para os resultados e para os casos de dados inválidos.

Envie por email os arquivos .java da solução para vinicius.machado+logica2026@riogrande.ifrs.edu.br

---

## Exercício 01

Exercício 01. Leia um vetor de 12 números inteiros. Solicite ao usuário um valor X. O programa deverá apresentar todos os índices em que X aparece e informar a quantidade total de ocorrências. Caso não exista, apresente uma mensagem apropriada.

## Exercício 02

Exercício 02. Leia um vetor contendo 15 números inteiros. Encontre a maior sequência de elementos consecutivos do vetor que estejam em ordem estritamente crescente. Os elementos precisam estar em posições consecutivas no vetor original. Apresente o índice inicial, o índice final, o comprimento e os valores da sequência. Exemplo:

Vetor: [5, 2, 4, 6, 8, 3, 7, 9, 1]

Maior sequência: [2, 4, 6, 8] Início: 1 Fim: 4 Comprimento: 4

## Exercício 03

Exercício 03. Leia dois vetores contendo 10 números inteiros cada. Crie um terceiro vetor contendo somente os valores presentes em ambos os vetores, sem repetições. Os elementos deverão aparecer na ordem de sua primeira ocorrência no primeiro vetor. Exemplo:

A = [5, 3, 8, 3, 1] B = [2, 3, 5, 9, 5]

Interseção = [5, 3]

## Exercício 04

Exercício 04. Leia dois vetores A e B, cujas quantidades de elementos serão definidas pelo usuário. Determine se todos os valores presentes em B também estão presentes em A, considerando os vetores como conjuntos, ou seja, sem considerar a quantidade de repetições. Exemplo:

A = [1, 2, 3, 4, 5] B = [2, 4, 5]

Resultado: B é subconjunto de A.

O programa também deverá apresentar os valores distintos de B que não foram encontrados em A, quando existirem.

## Exercício 05

Exercício 05. Leia um vetor contendo 15 números inteiros. Identifique quais valores aparecem mais de uma vez e apresente cada valor repetido apenas uma vez, acompanhado de sua quantidade de ocorrências. Exemplo:

Vetor: [4, 2, 4, 7, 2, 4, 9]

Resultado: 4 aparece 3 vezes 2 aparece 2 vezes

## Exercício 06

Exercício 06. Leia um vetor com 15 números inteiros. Determine o maior e o segundo maior valor distinto do vetor, sem ordenar seus elementos. Exemplo:

Vetor: [5, 9, 3, 9, 7, 5]

Maior valor: 9 Segundo maior: 7

Caso todos os elementos sejam iguais, informe que não existe um segundo maior valor distinto.

## Exercício 07

Exercício 07. Leia dois vetores A e B, cada um contendo 10 números inteiros. Crie um terceiro vetor C que represente a união dos dois conjuntos de valores, sem elementos repetidos. Os valores devem aparecer em C na ordem de sua primeira ocorrência: inicialmente os de A e depois os valores ainda não presentes de B.

Exemplo:

A = [1, 2, 3, 4] B = [3, 4, 5, 6]

C = [1, 2, 3, 4, 5, 6]

## Exercício 08

Exercício 08. Leia um vetor contendo 15 números inteiros, permitindo valores repetidos. Elimine as ocorrências duplicadas, preservando somente a primeira ocorrência de cada valor e mantendo a ordem original. A operação deverá ser realizada no próprio vetor, deslocando os elementos quando necessário. Exemplo:

Original: [5, 2, 5, 3, 2, 8, 3]

Resultado: [5, 2, 3, 8]

BOA AVALIAÇÃO

---

# Transcrição dos exercícios não feitos

Os exercícios que você não fez são o 2, o 4, o 5 e o 8. Seguem os enunciados transcritos, do mais difícil para o mais fácil.

## 1º: Exercício 08

Exercício 08. Leia um vetor contendo 15 números inteiros, permitindo valores repetidos. Elimine as ocorrências duplicadas, preservando somente a primeira ocorrência de cada valor e mantendo a ordem original. A operação deverá ser realizada no próprio vetor, deslocando os elementos quando necessário. Exemplo:

Original: [5, 2, 5, 3, 2, 8, 3]

Resultado: [5, 2, 3, 8]

É o mais difícil porque exige deslocar elementos dentro do próprio vetor, sem criar um vetor auxiliar. Isso é diferente do que você fez nos outros exercícios, onde construía um vetor novo.

## 2º: Exercício 02

Exercício 02. Leia um vetor contendo 15 números inteiros. Encontre a maior sequência de elementos consecutivos do vetor que estejam em ordem estritamente crescente. Os elementos precisam estar em posições consecutivas no vetor original. Apresente o índice inicial, o índice final, o comprimento e os valores da sequência. Exemplo:

Vetor: [5, 2, 4, 6, 8, 3, 7, 9, 1]

Maior sequência: [2, 4, 6, 8] Início: 1 Fim: 4 Comprimento: 4

Você precisa controlar a sequência atual e a melhor encontrada até o momento, guardando início e comprimento de cada uma. A lógica é parecida com a do Ex6, mas com mais variáveis para acompanhar.

## 3º: Exercício 04

Exercício 04. Leia dois vetores A e B, cujas quantidades de elementos serão definidas pelo usuário. Determine se todos os valores presentes em B também estão presentes em A, considerando os vetores como conjuntos, ou seja, sem considerar a quantidade de repetições. Exemplo:

A = [1, 2, 3, 4, 5] B = [2, 4, 5]

Resultado: B é subconjunto de A.

O programa também deverá apresentar os valores distintos de B que não foram encontrados em A, quando existirem.

Os tamanhos definidos pelo usuário são novidade. A busca de um valor em outro vetor você já domina do Ex3 e do Ex7. A parte mais delicada é listar os valores ausentes sem repetir, o que reaproveita a ideia de "já está em C?" do Ex7.

## 4º: Exercício 05

Exercício 05. Leia um vetor contendo 15 números inteiros. Identifique quais valores aparecem mais de uma vez e apresente cada valor repetido apenas uma vez, acompanhado de sua quantidade de ocorrências. Exemplo:

Vetor: [4, 2, 4, 7, 2, 4, 9]

Resultado: 4 aparece 3 vezes 2 aparece 2 vezes

É o mais acessível para você: o tamanho é fixo e a contagem de ocorrências é parecida com o Ex1. O único cuidado é não imprimir o mesmo valor repetido mais de uma vez.