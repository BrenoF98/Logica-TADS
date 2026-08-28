# Lista 03 — Estruturas de Repetição com `while`

**Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas  
**Disciplina:** Lógica de Programação  
**Linguagem:** Java

Desenvolva os exercícios abaixo utilizando somente os conteúdos trabalhados em sala de aula. Novas soluções são encorajadas, no entanto, é necessário demonstrar domínio sobre as técnicas apresentadas.

## Conteúdos permitidos

- instruções e algoritmos;
- variáveis e tipos de dados;
- entrada de dados com `Scanner`;
- saída com `System.out.print` e `System.out.println`;
- operadores aritméticos (`+`, `-`, `*`, `/`, `%`);
- operadores relacionais e lógicos;
- estruturas condicionais (`if`, `if...else`, `else if`);
- estrutura de repetição `while`.

## Regras gerais

1. Cada exercício deve ser implementado em um programa Java separado.
2. Todas as entradas indicadas nos enunciados devem ser informadas pelo usuário em tempo de execução utilizando `Scanner`.
3. Utilize `while` como estrutura de repetição principal. Não utilize `for` ou `do...while`.
4. Não utilize vetores, matrizes, coleções, `switch`, operador ternário, métodos criados pelo aluno ou recursos ainda não estudados.
5. Quando for necessário comparar textos (`String`), utilize `.equals(...)`.
6. Sempre que o exercício solicitar validação de entrada, o programa deve continuar solicitando o valor enquanto ele for inválido.
7. Nos exercícios com quantidade indeterminada de dados, observe com atenção o **valor sentinela** que encerra a leitura e se ele deve ou não participar dos cálculos.
8. Antes de programar, identifique quais variáveis funcionarão como **contador**, **acumulador**, **maior/menor valor** e **controle da repetição**.

---

# Bloco 1 — Fundamentos do `while`

> Objetivo: compreender controle de repetição, contadores e acumuladores simples.

### 1. Contagem progressiva
Leia um número inteiro positivo `n` e escreva todos os números de `1` até `n`, um por linha.

Caso `n` seja menor ou igual a zero, apresente uma mensagem informando que o valor é inválido.

### 2. Contagem regressiva
Leia um número inteiro positivo e apresente uma contagem regressiva desse número até `0`.

Ao final, escreva a mensagem `FIM DA CONTAGEM`.

### 3. Soma dos números
Leia um número inteiro positivo `n` e calcule a soma de todos os números inteiros de `1` até `n`.

Exemplo: para `n = 5`, o resultado corresponde a `1 + 2 + 3 + 4 + 5`.

### 4. Pares de um intervalo
Leia um número inteiro positivo `n` e apresente todos os números pares existentes entre `1` e `n`.

Ao final, informe também **quantos números pares foram encontrados**.

### 5. Tabuada
Leia um número inteiro e apresente sua tabuada de multiplicação de `1` até `10` utilizando `while`.

Exemplo de saída para o número 4:

```text
4 x 1 = 4
4 x 2 = 8
...
4 x 10 = 40
```

### 6. Soma de uma sequência informada
Leia uma quantidade `n` de números que serão digitados pelo usuário. Em seguida, leia exatamente `n` valores reais e apresente:

- a soma de todos os valores;
- a média dos valores informados.

O valor de `n` deve ser maior que zero.

---

# Bloco 2 — Validação e controle de entrada

> Objetivo: utilizar o `while` para repetir leituras até que uma condição seja satisfeita.

### 7. Número dentro de uma faixa
Solicite um número inteiro entre `10` e `50`, inclusive.

Enquanto o valor estiver fora dessa faixa, informe que o valor é inválido e solicite uma nova entrada. Quando um valor válido for informado, apresente-o na tela.

### 8. Divisão segura
Leia um número real `a`. Depois, solicite um segundo número real `b`.

Enquanto `b` for igual a zero, informe que o divisor é inválido e solicite novamente apenas o segundo número.

Quando um divisor válido for informado, apresente o resultado de `a / b`.

### 9. Senha com número de tentativas
Solicite uma senha inteira. A senha correta é `2026`.

O programa deve continuar solicitando a senha enquanto ela estiver incorreta. Ao final, informe:

- que o acesso foi permitido;
- o número total de tentativas realizadas.

### 10. Nota válida
Leia uma nota de `0` a `10`.

Enquanto a nota estiver fora do intervalo permitido, solicite uma nova nota. Quando uma nota válida for informada, classifique-a como:

- `APROVADO`, se nota maior ou igual a 6;
- `REPROVADO`, caso contrário.

### 11. Cadastro de idade
Solicite a idade de uma pessoa. Uma idade válida deve estar entre `1` e `120` anos.

Enquanto o usuário informar uma idade inválida, solicite novamente. Ao final, informe a idade aceita e classifique a pessoa como:

- criança: até 11 anos;
- adolescente: 12 a 17 anos;
- adulto: 18 a 59 anos;
- idoso: 60 anos ou mais.

### 12. Valor até acertar a condição
Solicite números inteiros repetidamente até que o usuário informe um número que seja simultaneamente:

- positivo;
- par;
- múltiplo de 5.

Cada valor inválido deve gerar uma mensagem explicando que ele não atende às condições. Ao final, mostre o número aceito e quantas tentativas foram necessárias.

---

# Bloco 3 — `while` com decisões dentro da repetição

> Objetivo: combinar repetição com `if`, contadores condicionais e acumuladores separados.

### 13. Análise de dez números
Leia exatamente 10 números inteiros. Ao final, informe:

- quantos são positivos;
- quantos são negativos;
- quantos são iguais a zero;
- a soma de todos os números positivos.

### 14. Pares e ímpares
Leia uma quantidade `n` de números inteiros. Para os valores informados, calcule e apresente:

- quantidade de números pares;
- quantidade de números ímpares;
- soma dos números pares;
- soma dos números ímpares.

Considere o número zero como par.

### 15. Média da turma
Leia a quantidade de alunos de uma turma. Para cada aluno, leia uma nota entre `0` e `10`.

Cada nota inválida deve ser solicitada novamente e **não deve contar como um aluno lido**.

Ao final, apresente:

- média da turma;
- quantidade de alunos aprovados (`nota >= 6`);
- quantidade de alunos reprovados (`nota < 6`);
- quantidade de alunos com nota igual ou superior a `9`.

### 16. Maior e menor valor
Leia uma quantidade `n` de números inteiros, sendo `n > 0`.

Informe ao final:

- o maior número digitado;
- o menor número digitado;
- a diferença entre o maior e o menor número.

Não assuma previamente que os números serão positivos.

### 17. Controle de estoque
Uma loja deseja analisar `n` produtos. Para cada produto, leia:

- quantidade atual em estoque;
- quantidade mínima desejada.

Para cada produto, informe `REPOR ESTOQUE` quando a quantidade atual for menor que a quantidade mínima, ou `ESTOQUE SUFICIENTE` caso contrário.

Ao final, apresente:

- quantidade de produtos analisados;
- quantidade de produtos que precisam de reposição;
- quantidade total de unidades que faltam para que todos os produtos atinjam seus respectivos estoques mínimos.

### 18. Folha de pagamento semanal
Leia a quantidade de funcionários de uma empresa. Para cada funcionário, leia:

- horas trabalhadas na semana;
- valor da hora normal.

Regras:

- até 40 horas: todas as horas são pagas pelo valor normal;
- acima de 40 horas: as horas excedentes são pagas com adicional de 50%.

Para cada funcionário, mostre o salário bruto semanal.

Ao final, apresente:

- total gasto pela empresa com salários;
- quantidade de funcionários que fizeram hora extra;
- maior salário bruto calculado.

---

# Bloco 4 — Quantidade indeterminada e valores sentinela

> Objetivo: trabalhar repetições cujo número de execuções não é conhecido antecipadamente.

### 19. Levantamento de idades
Leia idades de pessoas até que seja informado o valor `0`. O zero encerra a entrada e não deve participar dos cálculos.

Ao final, apresente:

- quantidade de pessoas informadas;
- média das idades;
- menor idade;
- maior idade;
- quantidade de menores de 18 anos;
- quantidade de pessoas com 60 anos ou mais.

Considere que pelo menos uma idade válida será informada antes do zero.

### 20. Movimentação bancária
Uma conta inicia com saldo de R$ 0,00. Exiba repetidamente o seguinte menu:

```text
1 - Consultar saldo
2 - Depositar
3 - Sacar
0 - Encerrar
```

Regras:

- depósitos devem ser positivos;
- saques devem ser positivos;
- um saque só pode ser realizado se houver saldo suficiente;
- opções diferentes de `0`, `1`, `2` e `3` devem gerar uma mensagem de erro.

Ao encerrar, informe:

- saldo final;
- quantidade de depósitos realizados;
- quantidade de saques realizados com sucesso;
- quantidade de tentativas de saque recusadas por saldo insuficiente.

### 21. Pesquisa de satisfação
Uma empresa deseja registrar notas de satisfação de clientes. As notas válidas são de `1` a `5`. O valor `0` encerra a pesquisa.

Valores diferentes de `0` que estejam fora da faixa de `1` a `5` são inválidos e devem ser ignorados.

Ao final, informe:

- quantidade de respostas válidas;
- média das notas;
- quantidade de notas 1;
- quantidade de notas 5;
- quantidade de entradas inválidas.

### 22. Caixa de supermercado
Leia o valor de cada produto de uma compra. O valor `0` indica que não há mais produtos.

Valores negativos são inválidos e devem ser ignorados.

Ao final, apresente:

- quantidade de produtos comprados;
- valor total da compra;
- produto de maior valor;
- quantidade de produtos com preço acima de R$ 100,00.

Se o total da compra for maior ou igual a R$ 500, aplique `5%` de desconto e apresente também o valor final com desconto.

### 23. Eleição simplificada
Em uma eleição existem três candidatos:

- `1` — candidato A;
- `2` — candidato B;
- `3` — candidato C;
- `0` — voto em branco.

Qualquer outro valor positivo deve ser considerado voto nulo. O valor `-1` encerra a votação e não deve ser contabilizado.

Ao final, apresente:

- votos de cada candidato;
- votos em branco;
- votos nulos;
- total de eleitores que votaram;
- candidato vencedor.

Considere que não haverá empate entre os candidatos.

### 24. Monitoramento de temperatura
Um equipamento registra temperaturas durante seu funcionamento. Leia valores reais de temperatura até que seja digitado `-999`, que representa o fim das medições e não deve ser contabilizado.

Ao final, informe:

- quantidade de medições;
- temperatura média;
- maior temperatura;
- menor temperatura;
- quantidade de medições acima de 35 °C;
- quantidade de medições abaixo de 5 °C.

Considere que pelo menos uma temperatura será informada antes do sentinela.

---

# Bloco 5 — Problemas de evolução e processamento iterativo

> Objetivo: utilizar `while` para representar processos que evoluem passo a passo até atingir determinado estado.

### 25. Crescimento de uma aplicação financeira
Leia:

- valor inicial aplicado;
- taxa de rendimento mensal em percentual;
- valor desejado como objetivo.

Considere que, a cada mês, o saldo aumenta de acordo com a taxa informada e que não serão realizados novos depósitos.

Utilizando `while`, determine quantos meses serão necessários para que o saldo fique **maior ou igual ao valor desejado**.

Apresente:

- quantidade de meses;
- saldo final alcançado.

Os valores devem ser positivos e o objetivo deve ser maior que o valor inicial.

### 26. Crescimento populacional
Leia as populações iniciais de duas cidades, `A` e `B`, e suas respectivas taxas anuais de crescimento em percentual.

O programa deve calcular quantos anos serão necessários para que a população da cidade A fique maior ou igual à população da cidade B.

Antes de iniciar a simulação, verifique se os dados permitem que A alcance B. Considere que:

- inicialmente, população de A é menor que a população de B;
- ambas as populações e taxas devem ser positivas;
- se a taxa de crescimento de A for menor ou igual à taxa de B, informe que, segundo esse modelo, A não alcançará B.

### 27. Redução de bateria
Um equipamento inicia com uma porcentagem de bateria informada pelo usuário. A cada ciclo de funcionamento, ele consome uma porcentagem fixa da **carga atual**, também informada pelo usuário.

Exemplo: se a bateria atual é 80% e o consumo por ciclo é 10%, após um ciclo ela passa a ter 72%.

Utilizando `while`, determine quantos ciclos serão necessários para que a bateria fique abaixo de `20%`.

Mostre a porcentagem restante após cada ciclo e, ao final, a quantidade total de ciclos.

### 28. Caixa eletrônico com vários saques
Um caixa eletrônico deve realizar vários saques. Solicite valores inteiros positivos até que o usuário informe `0`.

Para cada saque, determine a menor quantidade possível de cédulas utilizando apenas:

- R$ 100;
- R$ 50;
- R$ 20;
- R$ 10;
- R$ 5;
- R$ 2;
- R$ 1.

Mostre somente as cédulas efetivamente utilizadas.

Ao final de todos os saques, informe:

- quantidade de saques realizados;
- valor total sacado;
- quantidade total de cédulas entregues pelo caixa.

Valores negativos são inválidos e não encerram o programa.

---

# Bloco 6 — Desafios

> Objetivo: combinar repetição, condicionais, múltiplos acumuladores e raciocínio algorítmico mais elaborado.

### 29. Análise dos dígitos de vários números
Leia números inteiros positivos até que seja informado `0`.

Para cada número, utilize operações de divisão inteira e resto (`/` e `%`) juntamente com `while` para analisar seus dígitos individualmente.

Para cada número, apresente:

- quantidade de dígitos;
- soma dos dígitos;
- quantidade de dígitos pares;
- quantidade de dígitos ímpares;
- maior dígito encontrado.

Exemplo: para `5728`, a soma dos dígitos é `22` e o maior dígito é `8`.

Ao finalizar todas as entradas, informe também quantos números foram analisados.

**Restrição:** não transforme o número em `String` para resolver o exercício.

### 30. Sistema de vendas de um evento
Um evento possui quantidade limitada de ingressos. Leia inicialmente:

- quantidade total de ingressos disponíveis;
- preço normal de cada ingresso.

Enquanto ainda houver ingressos disponíveis, o sistema deve receber uma nova solicitação de compra contendo:

- quantidade de ingressos desejada;
- tipo de cliente (`"NORMAL"`, `"ESTUDANTE"` ou `"IDOSO"`).

Regras:

1. Quantidades menores ou iguais a zero são inválidas.
2. Não permita uma venda cuja quantidade solicitada seja maior que o estoque restante.
3. Cliente `NORMAL` paga o valor integral.
4. Cliente `ESTUDANTE` recebe `50%` de desconto.
5. Cliente `IDOSO` recebe `50%` de desconto.
6. Tipos de cliente diferentes dos três previstos são inválidos e a venda não deve ser realizada.
7. Depois de cada venda válida, atualize a quantidade de ingressos restantes.
8. O programa termina quando:
   - todos os ingressos forem vendidos; **ou**
   - o usuário informar `0` como quantidade desejada, indicando que deseja encerrar as vendas antes do fim do estoque.

Ao final, informe:

- quantidade de ingressos vendidos;
- quantidade de ingressos restantes;
- número de vendas realizadas;
- quantidade de ingressos vendidos com meia-entrada;
- valor total arrecadado;
- maior valor registrado em uma única venda.

---

## Observações para resolução

Nos exercícios desta lista, procure identificar antes de escrever o código:

- **condição de permanência:** enquanto o quê a repetição deve continuar?
- **variável de controle:** qual variável precisa ser alterada para evitar um `while` infinito?
- **contador:** quantas vezes determinado evento aconteceu?
- **acumulador:** qual valor precisa ser somado ao longo das repetições?
- **maior e menor:** como inicializar corretamente valores que serão comparados durante a repetição?
- **sentinela:** qual entrada indica que os dados terminaram?
- **validação:** uma entrada inválida deve ser repetida, ignorada ou encerrar o programa?
- **condicional dentro do `while`:** quais dados devem ser classificados ou processados de maneira diferente a cada repetição?

O objetivo não é apenas fazer o programa repetir instruções, mas compreender **como controlar a repetição e como atualizar o estado do algoritmo a cada iteração**.
