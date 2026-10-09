# Lista 04 - Estruturas de Repeticao, Controle de Fluxo e `switch-case`

**Curso:** Tecnologia em Analise e Desenvolvimento de Sistemas  
**Disciplina:** Logica de Programacao  
**Linguagem:** Java

Desenvolva os exercicios abaixo utilizando os conteudos trabalhados nos materiais 05, 06 e 07. A lista foi organizada em ordem de dificuldade crescente.

## Conteudos permitidos

- variaveis e tipos primitivos;
- entrada com `Scanner` e saida com `System.out.print` e `System.out.println`;
- operadores aritmeticos, relacionais e logicos;
- estruturas `if`, `if...else` e `else if`;
- estruturas de repeticao `while`, `for` e `do...while`;
- comandos `break` e `continue`;
- estrutura `switch-case` tradicional.

## Regras gerais

1. Cada exercicio deve ser implementado em um programa Java separado.
2. Todas as entradas devem ser informadas pelo usuario em tempo de execucao.
3. Nao utilize vetores, matrizes, colecoes, classes criadas pelo aluno, objetos criados pelo aluno ou metodos criados pelo aluno.
4. Nao utilize `Math.pow`, conversao de numeros para `String` ou bibliotecas que resolvam o problema automaticamente.
5. Nos exercicios que indicarem uma estrutura especifica, utilize essa estrutura como laco principal.
6. Valide entradas quando o enunciado solicitar. Entradas invalidas nao devem ser contabilizadas.
7. Procure manter cada programa entre 20 e 100 linhas de codigo, sem contar linhas em branco.
8. Use nomes de variaveis claros e apresente resultados identificados.

---

# Bloco 1 - Fundamentos do `for`

> Use `for` nos exercicios deste bloco. O objetivo e praticar inicializacao, condicao, atualizacao e acumuladores.

### 1. Multiplos de um numero

Leia um numero inteiro positivo `n` e apresente os 10 primeiros multiplos dele, do primeiro ao decimo.

### 2. Intervalo com passo

Leia tres inteiros: inicio, fim e passo positivo. Apresente os valores do intervalo, iniciando em `inicio` e aumentando pelo `passo` enquanto nao ultrapassar `fim`. Valide o passo.

### 3. Soma dos quadrados

Leia um inteiro positivo `n` e calcule a soma dos quadrados dos numeros de `1` ate `n`.

### 4. Produto acumulado

Leia um inteiro positivo `n` e calcule o produto de todos os inteiros de `1` ate `n`. Informe tambem se o resultado ultrapassar 32 bits durante o calculo.

### 5. Potencia por multiplicacoes

Leia uma base real e um expoente inteiro nao negativo. Calcule a potencia usando apenas multiplicacoes repetidas. Nao use `Math.pow`.

### 6. Sequencia numerica

Leia um inteiro positivo `n` e apresente os `n` primeiros termos da sequencia `2, 5, 8, 11...`. Ao final, informe a soma dos termos.

### 7. Numeros divisiveis por dois valores

Leia um limite positivo e dois divisores positivos. Apresente, dentro do intervalo de `1` ate o limite, os numeros divisiveis pelos dois divisores e conte quantos foram encontrados.

### 8. Media de temperaturas

Leia exatamente 12 temperaturas reais, uma para cada mes. Calcule a media e informe quantas temperaturas ficaram acima da media. Nao use vetor.

### 9. Conversao de segundos

Leia uma quantidade inteira positiva de segundos e, usando um `for`, mostre uma contagem regressiva segundo a segundo ate zero. Ao final, mostre `FIM`.

### 10. Fatorial com relatorio

Leia um inteiro de `0` a `12`. Calcule seu fatorial e apresente cada multiplicacao realizada. Para zero, considere `0! = 1`.

---

# Bloco 2 - Figuras com lacos aninhados

> Todas as figuras deste bloco devem ser feitas com dois lacos de repeticao aninhados: um para as linhas e outro para as colunas. Use condicionais somente quando for necessario decidir entre imprimir `*` e espaco.

### 11. Quadrado cheio

Leia o lado `n` e desenhe um quadrado cheio de asteriscos com `n` linhas e `n` colunas.

### 12. Quadrado oco

Leia o lado `n` e desenhe um quadrado oco. Imprima `*` na primeira e na ultima linha e tambem na primeira e na ultima coluna; nos demais pontos, imprima espaco.

### 13. Retangulo cheio

Leia a quantidade de linhas e de colunas e desenhe um retangulo cheio de asteriscos.

### 14. Triangulo reto crescente

Leia a altura `n` e desenhe um triangulo com uma estrela na primeira linha, duas na segunda, ate `n` estrelas na ultima linha.

### 15. Triangulo reto invertido

Leia a altura `n` e desenhe um triangulo iniciando com `n` estrelas e diminuindo uma estrela a cada linha.

### 16. Triangulo alinhado a direita

Leia a altura `n` e desenhe um triangulo reto alinhado a direita, usando espacos antes dos asteriscos.

### 17. Triangulo invertido alinhado a direita

Leia a altura `n` e desenhe o triangulo anterior de forma invertida, iniciando pela linha mais larga.

### 18. Piramide

Leia uma altura impar `n` e desenhe uma piramide centralizada. Cada linha deve conter espacos antes dos asteriscos e uma quantidade impar de asteriscos.

### 19. Piramide invertida

Leia uma altura impar `n` e desenhe uma piramide centralizada invertida, iniciando pela maior quantidade de asteriscos.

### 20. Losango

Leia uma altura impar `n` e desenhe um losango formado por uma piramide crescente seguida de uma piramide decrescente.

---

# Bloco 3 - Validacao e `do-while`

> Nos exercicios deste bloco, use `do-while` para garantir que a entrada ou o menu seja apresentado pelo menos uma vez.

### 21. Nota dentro da faixa

Leia uma nota entre `0` e `10`. Enquanto a entrada for invalida, solicite novamente usando `do-while`. Ao final, classifique a nota em insuficiente, suficiente, boa ou excelente.

### 22. Menu de conversao

Exiba repetidamente, usando `do-while`, o menu:

```text
1 - Celsius para Fahrenheit
2 - Fahrenheit para Celsius
3 - Quilometros para milhas
0 - Sair
```

Leia a opcao com `switch`, solicite o valor necessario e apresente o resultado. Opcoes invalidas devem gerar mensagem.

### 23. Soma ate valor positivo

Solicite numeros inteiros usando `do-while` ate que o usuario informe um numero positivo. Mostre quantas tentativas foram necessarias e a soma dos valores negativos digitados.

### 24. Confirmacao de cadastro

Solicite uma idade e uma confirmacao (`S` ou `N`) para cadastrar uma pessoa. O programa deve repetir a pergunta usando `do-while` enquanto a idade for invalida ou a confirmacao for diferente de `S` e `N`. Ao final, informe se o cadastro foi confirmado.

### 25. Menu de calculos

Crie um menu repetitivo com `do-while` e `switch`:

```text
1 - Dobro
2 - Triplo
3 - Quadrado
0 - Sair
```

Para cada opcao valida, leia um numero e mostre o resultado. O menu deve continuar ate a opcao zero.

### 26. Jogo de tentativas

Defina o numero secreto como `37`. Solicite palpites usando `do-while` ate o usuario acertar ou informar `-1` para desistir. Informe se o palpite e maior ou menor, alem da quantidade de tentativas.

### 27. Senha com limite

Solicite uma senha numerica usando `do-while`. A senha correta e `2468` e o usuario possui no maximo cinco tentativas. Informe acesso permitido, bloqueio ou quantidade de tentativas restantes.

### 28. Validador de horario

Solicite hora, minuto e segundo. Repita a leitura completa com `do-while` ate que o horario esteja entre `00:00:00` e `23:59:59`. Ao final, informe o horario aceito.

### 29. Parcelamento valido

Leia o valor de uma compra e a quantidade de parcelas. Repita a quantidade com `do-while` ate que esteja entre `1` e `12`. Calcule o valor de cada parcela e informe se ha desconto para pagamento a vista.

### 30. Menu de temperatura

Exiba um menu com `do-while` e `switch` para registrar uma temperatura, converter Celsius para Fahrenheit, classificar a temperatura ou encerrar. A opcao de registro deve ocorrer antes das opcoes de conversao e classificacao.

---

# Bloco 4 - Figuras geometricas com lacos aninhados

> Continue usando um laco para linhas e outro para colunas. Nestes exercicios, use `if` para decidir se a posicao atual deve receber `*` ou espaco.

### 31. Moldura retangular

Leia a quantidade de linhas e colunas e desenhe somente a borda de um retangulo. As posicoes internas devem receber espacos.

### 32. Letra X

Leia um tamanho impar `n` e desenhe um `X`. Imprima `*` quando a coluna for igual a linha ou quando a coluna for a distancia entre a linha e o fim da figura.

### 33. Sinal de mais

Leia um tamanho impar `n` e desenhe um sinal de `+`: a linha e a coluna centrais devem conter asteriscos; as demais posicoes devem conter espacos.

### 34. Tabuleiro alternado

Leia um tamanho `n` e desenhe um tabuleiro de asteriscos e espacos alternados. A cada linha, alterne o primeiro caractere para produzir o padrao de xadrez.

### 35. Diagonais

Leia um tamanho `n` e desenhe duas figuras, uma com a diagonal principal e outra com a diagonal secundaria. Use dois lacos aninhados e uma condicao para decidir onde imprimir `*`.

---

# Bloco 5 - `break` e `continue`

> Use `break` para encerrar uma busca ou leitura quando encontrar a situacao indicada. Use `continue` para ignorar somente a iteracao atual.

### 36. Cadastro de produtos validos

Leia 10 pares de preco e quantidade. Use `continue` quando algum dado for invalido. Para os pares validos, calcule o valor total e use `break` se o estoque acumulado ultrapassar 1.000 unidades.

### 37. Contagem sem multiplos

Leia um limite positivo. Percorra os numeros de `1` ate o limite, ignorando com `continue` os multiplos de `3` ou `5`. Apresente os demais e informe a soma deles.

### 38. Leitura ate codigo de parada

Leia codigos inteiros. Codigos negativos devem ser ignorados com `continue`; o codigo `0` encerra com `break`; os positivos devem ser classificados como pares ou impares. Ao final, mostre os totais.

### 39. Tentativa de senha com cancelamento

Leia senhas inteiras em um laco. A senha `1357` permite acesso e encerra com `break`; `-1` cancela a operacao e tambem encerra; outros valores devem ser contabilizados como tentativas incorretas. Limite a leitura a 10 tentativas.

### 40. Soma dos termos aceitos

Leia 15 numeros reais. Ignore com `continue` os valores menores que zero. Interrompa com `break` se for informado o valor `1000`. Apresente a soma, a quantidade aceita e a maior entrada aceita.

---

# Bloco 6 - `switch-case` com repeticao

> Combine `do-while` para manter o menu ativo e `switch-case` para selecionar a operacao. Nao use classes de negocio, vetores ou metodos auxiliares.

### 41. Calculadora inteira

Crie um menu com as opcoes somar, subtrair, multiplicar, dividir e sair. Use `switch` para executar a operacao. Valide a divisao por zero e mostre uma mensagem para opcoes invalidas.

### 42. Conversor de medidas

Crie um menu com conversoes de metros para centimetros, centimetros para metros, quilogramas para gramas e gramas para quilogramas. Mantenha o menu em repeticao ate a opcao de saida.

### 43. Dia da semana

Leia numeros de `1` a `7` repetidamente e use `switch` para apresentar o dia correspondente. O valor `0` encerra; outros valores devem ser informados como invalidos e nao contam como dia.

### 44. Classificacao de conceito

Leia conceitos `A`, `B`, `C`, `D` ou `E` ate `X` ser informado. Use `switch` para apresentar a descricao de cada conceito e contabilize quantas vezes cada conceito valido apareceu. Nao use vetor.

### 45. Menu de conta corrente

Inicie um saldo com valor informado pelo usuario. Crie um menu com consultar saldo, depositar, sacar e sair. Use `switch`, valide valores positivos e nao permita saque acima do saldo.

### 46. Bilhete de transporte

Crie um menu para escolher tipo de bilhete: comum, estudante, idoso ou sair. Leia a quantidade de bilhetes e calcule o total conforme os precos definidos no enunciado pelo professor. Use `switch` e valide a quantidade.

### 47. Pedido de lanchonete

Use um menu com tres produtos e a opcao de finalizar. A cada produto escolhido, leia a quantidade, some o subtotal e conte os itens vendidos. Ao finalizar, mostre quantidade total e valor da compra.

### 48. Jogo de par ou impar

Repita um menu com `switch` para o usuario escolher par, impar ou sair. Leia um numero, informe se ele atende a escolha e contabilize acertos e erros. Valores negativos devem ser rejeitados.

### 49. Relatorio de chamados

Leia codigos de chamados ate a opcao de encerramento. Use `switch` para classificar cada chamado como duvida, erro, solicitacao ou outro. Ao final, informe a quantidade de cada categoria e o total recebido.

### 50. Caixa de operacoes

Crie um programa com saldo inicial zero e menu com `switch`: entrada de valor, retirada de valor, consulta do saldo, relatorio e sair. O relatorio deve apresentar quantidade de entradas, quantidade de retiradas, total movimentado e saldo final. Nao permita retirada maior que o saldo.

---

## Observacoes para resolucao

Antes de programar, identifique:

- qual variavel controla cada repeticao;
- se a quantidade de repeticoes e conhecida ou indeterminada;
- quando a entrada deve ser repetida, ignorada ou encerrar o programa;
- quais valores serao usados como contadores e acumuladores;
- onde o `break` deve encerrar o laco;
- onde o `continue` deve pular apenas a iteracao atual;
- quais lacos representam linhas e colunas nas figuras;
- quais valores fixos podem ser organizados com `switch-case`.

Os exercicios desta lista nao exigem vetores, matrizes, colecoes, classes, objetos ou metodos criados pelo aluno. Cada solucao deve concentrar-se em variaveis simples, condicionais e estruturas de repeticao.

Bom estudo e boa programacao!

![alt text](image.png)