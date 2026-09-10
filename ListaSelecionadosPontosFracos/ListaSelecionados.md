# Exercícios Selecionados para Treino — Na Íntegra

## Bloco 1 — Leitura Antecipada e Múltiplos Motivos de Falha

### Lista 02 — Exercício 19: Validação de usuário e senha
Leia um nome de usuário e uma senha.
* usuário correto: "admin";
* senha correta: "java123".
O programa deve informar separadamente se o usuário está incorreto ou se a senha está incorreta. O acesso só deve ser permitido quando os dois estiverem corretos.

### Lista 02 — Exercício 21: Empréstimo simplificado
Leia:
* salário mensal;
* valor solicitado de empréstimo;
* quantidade de parcelas.
Nenhum valor pode ser zero ou negativo. Se os dados forem válidos, calcule o valor da parcela.
O empréstimo será aprovado somente se:
* a parcela não ultrapassar 30% do salário;
* o valor solicitado não ultrapassar 10 vezes o salário.
Informe o motivo da reprovação quando alguma condição não for atendida.

### Lista 02 — Exercício 26: Autorização para brinquedo
Leia a idade e a altura de uma pessoa.
Um brinquedo exige:
* idade mínima de 12 anos;
* altura mínima de 1,50 m.
Informe:
* se a pessoa pode entrar;
* caso não possa, qual requisito não foi atendido;
* caso nenhum requisito seja atendido, informe os dois motivos.

### Lista 02 — Exercício 37: Processo seletivo
Leia:
* nota da prova técnica;
* nota da entrevista;
* anos de experiência.
O candidato só pode ser aprovado se tiver:
* pelo menos nota 7 na prova técnica;
* pelo menos nota 6 na entrevista.
Se atender a esses dois critérios:
* com 2 anos ou mais de experiência: **Aprovado**;
* com menos de 2 anos: **Cadastro reserva**.
Caso contrário, informe em qual etapa o candidato não atingiu a nota mínima.

### Lista 02 — Exercício 49: Análise de crédito
Leia:
* renda mensal;
* valor da parcela desejada;
* idade;
* se possui dívida em atraso ("S" ou "N").
Regras:
1. dados numéricos devem ser positivos;
2. se houver dívida em atraso, o crédito é **negado**;
3. caso não haja dívida:
   * parcela até 25% da renda: condição financeira adequada;
   * acima de 25% e até 35%: condição financeira de atenção;
   * acima de 35%: crédito negado;
4. para clientes com menos de 21 anos, mesmo com condição financeira adequada, o resultado deve ser **"Análise adicional necessária"**;
5. para clientes com 65 anos ou mais, a parcela não pode ultrapassar 20% da renda.
Apresente o resultado final e o motivo principal da decisão.

### Lista 02 — Exercício 50: Sistema completo de pedido com cupom e entrega
Uma loja deseja calcular o valor final de um pedido. Leia:
* valor dos produtos;
* tipo de cliente ("COMUM" ou "PREMIUM");
* cupom ("SEM", "DESC10" ou "DESC20");
* distância de entrega em quilômetros.
Siga as regras abaixo na ordem indicada:
1. O valor dos produtos deve ser positivo e a distância não pode ser negativa.
2. Clientes **PREMIUM** recebem inicialmente 5% de desconto.
3. Depois, analise o cupom:
   * "SEM": nenhum desconto adicional;
   * "DESC10": 10% de desconto, válido somente para pedidos de pelo menos R$ 100 e limitado a R$ 20;
   * "DESC20": 20% de desconto, válido somente para pedidos de pelo menos R$ 300 e limitado a R$ 50.
4. O desconto do cupom deve ser calculated sobre o **valor original dos produtos**.
5. Os descontos de cliente premium e cupom podem ser acumulados.
6. Após os descontos, calcule o frete:
   * até 5 km: R$ 10;
   * acima de 5 km até 15 km: R$ 20;
   * acima de 15 km: R$ 35.
7. O frete será grátis se:
   * o cliente for PREMIUM e o valor após os descontos for pelo menos R$ 150; ou
   * o cliente for COMUM e o valor após os descontos for pelo menos R$ 300.
8. Mostre:
   * valor original;
   * desconto de cliente;
   * desconto do cupom;
   * valor após descontos;
   * frete;
   * valor final.
9. Para cupom ou tipo de cliente inválido, apresente uma mensagem de erro e não realize o cálculo final.

---

## Bloco 2 — Formatação de Saída com `System.out.printf`

### Lista 02 — Exercício 16: Desconto por faixa de compra
Leia o valor de uma compra e aplique:
* abaixo de R$ 100,00: sem desconto;
* de R$ 100,00 até R$ 299,99: 5%;
* de R$ 300,00 até R$ 499,99: 10%;
* R$ 500,00 ou mais: 15%.
Mostre o percentual applied, o valor do desconto e o valor final.

### Lista 02 — Exercício 20: Tipo de combustível
Leia o tipo de combustível ("G" para gasolina ou "E" para etanol) e a quantidade de litros abastecida.
Considere:
* gasolina: R$ 6,20 por litro;
* etanol: R$ 4,10 por litro.
Se forem abastecidos mais de 30 litros, conceda 5% de desconto. Informe o tipo, o valor antes do desconto, o desconto e o valor final. Caso o tipo informado seja inválido, mostre uma mensagem de erro.

### Lista 02 — Exercício 29: Cálculo de salário com bônus
Leia o salário fixo de um vendedor e o valor total vendido no mês.
Bônus:
* até R$ 5.000 em vendas: sem bônus;
* acima de R$ 5.000 até R$ 10.000: 5% sobre o salário;
* acima de R$ 10.000: 10% sobre o salário.
Se o vendedor ultrapassar R$ 20.000 em vendas, acrescente ainda um prêmio fixo de R$ 300.
Mostre salário, bônus, prêmio e salário final.

### Lista 03 — Exercício 18: Folha de pagamento semanal
Leia a quantidade de funcionários de uma empresa. Para cada funcionário, leia:
* horas trabalhadas na semana;
* valor da hora normal.
Regras:
* até 40 horas: todas as horas são pagas pelo valor normal;
* acima de 40 horas: as horas excedentes são pagas com adicional de 50%.
Para cada funcionário, mostre o salário bruto semanal.
Ao final, apresente:
* total gasto pela empresa com salários;
* quantidade de funcionários que fizeram hora extra;
* maior salário bruto calculado.

### Lista 03 — Exercício 22: Caixa de supermercado
Leia o valor de cada produto de uma compra. O valor 0 indica que não há mais produtos.
Valores negativos são inválidos e devem ser ignorados.
Ao final, apresente:
* quantidade de produtos comprados;
* valor total da compra;
* produto de maior valor;
* quantidade de produtos com preço acima de R$ 100,00.
Se o total da compra for maior ou igual a R$ 500, aplique 5% de desconto e apresente também o valor final com desconto.

---

## Bloco 3 — Validação de Entrada e Casos de Borda (`while`)

### Lista 03 — Exercício 7: Número dentro de uma faixa
Solicite um número inteiro entre 10 e 50, inclusive.
Enquanto o valor estiver fora dessa faixa, informe que o valor é inválido e solicite uma nova entrada. Quando um valor válido for informado, apresente-o na tela.

### Lista 03 — Exercício 10: Nota válida
Leia uma nota de 0 a 10.
Enquanto a nota estiver fora do intervalo permitido, solicite uma nova nota. Quando uma nota válida for informada, classifique-a como:
* APROVADO, se nota maior ou igual a 6;
* REPROVADO, caso contrário.

### Lista 03 — Exercício 11: Cadastro de idade
Solicite a idade de uma pessoa. Uma idade válida deve estar entre 1 e 120 anos.
Enquanto o usuário informar uma idade inválida, solicite novamente. Ao final, informe a idade aceita e classifique a pessoa como:
* criança: até 11 anos;
* adolescente: 12 a 17 anos;
* adulto: 18 a 59 anos;
* idoso: 60 anos ou mais.