# Lista 02  — Estruturas Condicionais

**Disciplina:** Lógica de Programação  
**Linguagem:** Java  
**Conteúdo:** `if`, `if...else`, `else if`, operadores relacionais e operadores lógicos.

## Orientações

Desenvolva **um programa Java para cada exercício**, utilizando somente os conteúdos trabalhados até o momento:

- instruções e algoritmos;
- variáveis;
- tipos de dados;
- `Scanner`;
- `System.out.print` / `System.out.println`;
- operadores aritméticos (`+`, `-`, `*`, `/`, `%`);
- operadores relacionais (`>`, `<`, `>=`, `<=`, `==`, `!=`);
- operadores lógicos (`&&`, `||`, `!`);
- estruturas condicionais `if`, `if...else` e `else if`.

### Regras

1. **Todas as entradas devem ser informadas pelo usuário em tempo de execução utilizando `Scanner`.**
2. Não utilize laços de repetição (`for`, `while`, `do...while`).
3. Não utilize vetores, matrizes, métodos criados pelo aluno, `switch`, operador ternário ou outros recursos ainda não estudados.
4. Quando houver comparação de textos (`String`), utilize `.equals(...)`.
5. A partir do **exercício 11**, os problemas exigem **múltiplas decisões**, podendo envolver `if` independentes, cadeias `if / else if / else` e/ou condicionais aninhadas.
6. Procure organizar a solução em pequenos passos: leitura dos dados, cálculos necessários, testes condicionais e apresentação do resultado.

---

## Nível 1 — Primeiras decisões

### 1. Positivo ou negativo
Leia um número inteiro e informe se ele é **positivo** ou **negativo**. Considere o zero como positivo.

### 2. Maior de idade
Leia a idade de uma pessoa e informe se ela é **maior de idade** (`idade >= 18`) ou **menor de idade**.

### 3. Par ou ímpar
Leia um número inteiro e informe se ele é **par** ou **ímpar**.

### 4. Pode dividir?
Leia dois números reais. Antes de realizar a divisão do primeiro pelo segundo, verifique se o segundo número é diferente de zero. Se for zero, apresente uma mensagem informando que a divisão não pode ser realizada.

### 5. Nota suficiente
Leia a nota final de um aluno. Informe **APROVADO** quando a nota for maior ou igual a `6.0` e **REPROVADO** caso contrário.

### 6. Temperatura
Leia uma temperatura em graus Celsius. Informe **"Temperatura elevada"** quando ela for maior que `30` graus e **"Temperatura normal"** caso contrário.

### 7. Desconto simples
Leia o valor de uma compra. Se o valor for maior ou igual a `200`, aplique `10%` de desconto. Caso contrário, mantenha o valor original. Mostre o valor final da compra.

### 8. Número múltiplo de 5
Leia um número inteiro e informe se ele é ou não **múltiplo de 5**.

### 9. Senha simples
Leia uma senha inteira. Se a senha digitada for `4321`, mostre **"Acesso permitido"**. Caso contrário, mostre **"Senha incorreta"**.

### 10. Comparação entre dois valores
Leia dois números inteiros e informe qual deles é o maior. Caso sejam iguais, informe **"Valores iguais"**.

---

## Nível 2 — Múltiplas decisões

> A partir deste ponto, cada exercício exige mais de uma decisão lógica.

### 11. Positivo, negativo e paridade
Leia um número inteiro. Primeiro informe se ele é **positivo**, **negativo** ou **zero**. Depois, caso seja diferente de zero, informe também se ele é **par** ou **ímpar**.

### 12. Classificação por idade
Leia a idade de uma pessoa e classifique-a como:

- **Criança:** de 0 a 11 anos;
- **Adolescente:** de 12 a 17 anos;
- **Adulto:** de 18 a 59 anos;
- **Idoso:** 60 anos ou mais.

Caso a idade seja negativa, informe que o valor é inválido.

### 13. Maior entre três números
Leia três números inteiros e informe qual é o maior. O programa também deve identificar o caso em que os três valores são iguais.

### 14. Menor e maior entre três valores
Leia três números inteiros e informe:

- o maior valor;
- o menor valor.

Considere que os valores podem ser iguais.

### 15. Classificação de nota
Leia uma nota de `0` a `10` e classifique:

- `>= 9`: **Excelente**;
- `>= 7`: **Bom**;
- `>= 6`: **Suficiente**;
- `< 6`: **Insuficiente**.

Se a nota estiver fora do intervalo de `0` a `10`, mostre uma mensagem de erro.

### 16. Desconto por faixa de compra
Leia o valor de uma compra e aplique:

- abaixo de R$ 100,00: sem desconto;
- de R$ 100,00 até R$ 299,99: `5%`;
- de R$ 300,00 até R$ 499,99: `10%`;
- R$ 500,00 ou mais: `15%`.

Mostre o percentual aplicado, o valor do desconto e o valor final.

### 17. Faixa de temperatura
Leia uma temperatura em graus Celsius e classifique:

- abaixo de `0`: **Congelante**;
- de `0` a `15`: **Frio**;
- acima de `15` até `25`: **Agradável**;
- acima de `25` até `35`: **Quente**;
- acima de `35`: **Muito quente**.

### 18. Média de duas notas
Leia duas notas, calcule a média e informe:

- **Aprovado:** média `>= 7`;
- **Recuperação:** média `>= 5` e `< 7`;
- **Reprovado:** média `< 5`.

Antes do cálculo, verifique se ambas as notas estão entre `0` e `10`. Caso alguma seja inválida, não calcule a média.

### 19. Validação de usuário e senha
Leia um nome de usuário e uma senha.

- usuário correto: `"admin"`;
- senha correta: `"java123"`.

O programa deve informar separadamente se o usuário está incorreto ou se a senha está incorreta. O acesso só deve ser permitido quando os dois estiverem corretos.

### 20. Tipo de combustível
Leia o tipo de combustível (`"G"` para gasolina ou `"E"` para etanol) e a quantidade de litros abastecida.

Considere:

- gasolina: R$ 6,20 por litro;
- etanol: R$ 4,10 por litro.

Se forem abastecidos mais de 30 litros, conceda `5%` de desconto. Informe o tipo, o valor antes do desconto, o desconto e o valor final. Caso o tipo informado seja inválido, mostre uma mensagem de erro.

---

## Nível 3 — Condicionais combinadas e aninhadas

### 21. Empréstimo simplificado
Leia:

- salário mensal;
- valor solicitado de empréstimo;
- quantidade de parcelas.

Nenhum valor pode ser zero ou negativo. Se os dados forem válidos, calcule o valor da parcela.

O empréstimo será aprovado somente se:

- a parcela não ultrapassar `30%` do salário;
- o valor solicitado não ultrapassar `10` vezes o salário.

Informe o motivo da reprovação quando alguma condição não for atendida.

### 22. Frete por região e valor da compra
Leia o valor da compra e a região de entrega:

- `"S"` — Sul;
- `"SE"` — Sudeste;
- `"CO"` — Centro-Oeste.

Fretes:

- Sul: R$ 20;
- Sudeste: R$ 30;
- Centro-Oeste: R$ 40.

Se a compra for igual ou superior a R$ 500, o frete será grátis, independentemente da região. Caso a região seja inválida, informe erro. Mostre o valor da compra, frete e total final.

### 23. Ingresso de cinema
Leia a idade do cliente, informe se ele é estudante (`"S"` ou `"N"`) e leia o preço normal do ingresso.

Regras:

- menores de 12 anos pagam `50%`;
- pessoas com 60 anos ou mais pagam `50%`;
- entre 12 e 59 anos, estudantes pagam `50%`;
- demais clientes pagam o preço integral.

A idade não pode ser negativa e a opção de estudante deve ser válida.

### 24. Categoria de nadador e autorização
Leia a idade de um nadador e informe a categoria:

- até 8 anos: **Mirim**;
- 9 a 13: **Infantil**;
- 14 a 17: **Juvenil**;
- 18 ou mais: **Adulto**.

Depois, informe se ele pode participar de uma prova que exige idade mínima de 14 anos. Idades negativas devem ser rejeitadas.

### 25. Compra de maçãs e pagamento
Leia a quantidade de maçãs e o valor entregue pelo cliente.

Preço:

- menos de 12 maçãs: R$ 1,50 por unidade;
- 12 ou mais: R$ 1,30 por unidade.

Calcule o total. Depois informe se o valor entregue é suficiente. Se for, calcule o troco; caso contrário, informe quanto ainda falta pagar. Quantidades e valores negativos são inválidos.

### 26. Autorização para brinquedo
Leia a idade e a altura de uma pessoa.

Um brinquedo exige:

- idade mínima de 12 anos;
- altura mínima de 1,50 m.

Informe:

- se a pessoa pode entrar;
- caso não possa, qual requisito não foi atendido;
- caso nenhum requisito seja atendido, informe os dois motivos.

### 27. Plano de celular
Leia a quantidade de minutos utilizados no mês e a quantidade de gigabytes de internet utilizados.

Plano básico:

- R$ 50 inclui até 100 minutos e até 10 GB;
- cada minuto excedente custa R$ 0,50;
- cada GB excedente custa R$ 5,00.

Calcule separadamente os excedentes de voz e internet e mostre o valor final. Valores negativos devem ser rejeitados.

### 28. Resultado de uma partida
Leia o nome de dois times e a quantidade de gols de cada um. Informe o vencedor ou empate.

Depois, classifique a partida:

- total de gols igual a 0: **Sem gols**;
- total entre 1 e 3: **Poucos gols**;
- total entre 4 e 6: **Jogo movimentado**;
- total acima de 6: **Muitos gols**.

Gols negativos são inválidos.

### 29. Cálculo de salário com bônus
Leia o salário fixo de um vendedor e o valor total vendido no mês.

Bônus:

- até R$ 5.000 em vendas: sem bônus;
- acima de R$ 5.000 até R$ 10.000: `5%` sobre o salário;
- acima de R$ 10.000: `10%` sobre o salário.

Se o vendedor ultrapassar R$ 20.000 em vendas, acrescente ainda um prêmio fixo de R$ 300.

Mostre salário, bônus, prêmio e salário final.

### 30. Verificação de triângulo
Leia três valores representando os lados de um possível triângulo.

Primeiro verifique se os valores são positivos. Depois verifique se realmente podem formar um triângulo.

Caso seja válido, classifique-o como:

- **Equilátero**;
- **Isósceles**;
- **Escaleno**.

---

## Nível 4 — Regras de negócio com várias condições

### 31. Cupom de desconto
Leia o valor da compra e um cupom.

Cupons disponíveis:

- `"VALE10"`: `10%` de desconto, limitado a R$ 10, válido somente para compras de pelo menos R$ 30;
- `"VALE20"`: `20%` de desconto, limitado a R$ 25, válido somente para compras de pelo menos R$ 100.

Caso o cupom seja inválido, a compra permanece sem desconto.

Mostre o desconto calculado, informe quando o limite precisar ser aplicado e apresente o valor final.

### 32. Aprovação com frequência
Leia duas notas e o percentual de frequência de um aluno.

Regras:

- frequência abaixo de `75%`: **Reprovado por frequência**;
- com frequência suficiente:
  - média `>= 7`: **Aprovado**;
  - média `>= 5` e `< 7`: **Recuperação**;
  - média `< 5`: **Reprovado por nota**.

Notas devem estar entre `0` e `10` e a frequência entre `0` e `100`.

### 33. Compra com forma de pagamento
Leia o valor da compra e a forma de pagamento:

- `"PIX"`;
- `"DINHEIRO"`;
- `"CARTAO"`.

Regras:

- PIX: `10%` de desconto;
- dinheiro: `5%` de desconto;
- cartão: sem desconto.

Se o pagamento for em cartão e o valor for maior que R$ 1.000, acrescente uma taxa de `2%`.

Mostre desconto, taxa e valor final. Formas de pagamento diferentes das três indicadas devem ser rejeitadas.

### 34. Tarifa de estacionamento
Leia a quantidade total de minutos que um veículo permaneceu estacionado.

Regras:

- até 15 minutos: grátis;
- de 16 a 60 minutos: R$ 5;
- de 61 a 180 minutos: R$ 10;
- acima de 180 minutos: R$ 10 mais R$ 2 para cada hora adicional.

Para este exercício, considere que os minutos acima de 180 serão informados em múltiplos de 60. Valores negativos são inválidos.

### 35. Conta de energia
Leia o consumo mensal em kWh e o tipo de imóvel:

- `"R"` — residencial;
- `"C"` — comercial.

Tarifa:

- residencial:
  - até 100 kWh: R$ 0,60 por kWh;
  - acima de 100 kWh: R$ 0,75 por kWh sobre todo o consumo;
- comercial:
  - até 200 kWh: R$ 0,80 por kWh;
  - acima de 200 kWh: R$ 0,95 por kWh sobre todo o consumo.

Se o valor calculado da conta for inferior a R$ 30, cobre a tarifa mínima de R$ 30.

### 36. Pedido de restaurante
Leia o código de um prato e a quantidade:

- `1` — Hambúrguer — R$ 25;
- `2` — Pizza — R$ 40;
- `3` — Salada — R$ 20.

Calcule o subtotal.

Depois leia se o cliente possui cupom (`"S"` ou `"N"`). Caso possua e o subtotal seja maior ou igual a R$ 50, aplique `10%` de desconto. Caso o código, a quantidade ou a resposta do cupom sejam inválidos, apresente uma mensagem adequada.

### 37. Processo seletivo
Leia:

- nota da prova técnica;
- nota da entrevista;
- anos de experiência.

O candidato só pode ser aprovado se tiver:

- pelo menos nota `7` na prova técnica;
- pelo menos nota `6` na entrevista.

Se atender a esses dois critérios:

- com 2 anos ou mais de experiência: **Aprovado**;
- com menos de 2 anos: **Cadastro reserva**.

Caso contrário, informe em qual etapa o candidato não atingiu a nota mínima.

### 38. Seguro de veículo
Leia:

- idade do motorista;
- quantidade de anos de habilitação;
- valor base do seguro.

Regras:

- motorista com menos de 21 anos: acréscimo de `20%`;
- de 21 a 25 anos: acréscimo de `10%`;
- acima de 25 anos: sem acréscimo por idade.

Além disso, se tiver menos de 2 anos de habilitação, acrescente mais `15%` sobre o valor base.

Mostre cada acréscimo separadamente e o valor final. Idade e tempo de habilitação não podem ser negativos, e o tempo de habilitação não pode ser maior que a idade.

### 39. Entrega de pedido
Leia:

- valor do pedido;
- distância da entrega em quilômetros;
- tipo de cliente (`"COMUM"` ou `"PREMIUM"`).

Frete-base:

- até 5 km: R$ 8;
- acima de 5 km até 15 km: R$ 15;
- acima de 15 km: R$ 25.

Clientes premium têm frete grátis em compras de pelo menos R$ 100. Clientes comuns têm frete grátis em compras de pelo menos R$ 200.

Mostre frete e valor total.

### 40. Reserva de hotel
Leia:

- quantidade de diárias;
- tipo de quarto (`"SIMPLES"` ou `"LUXO"`);
- se é alta temporada (`"S"` ou `"N"`).

Valores por diária:

- simples: R$ 180;
- luxo: R$ 350.

Na alta temporada, acrescente `20%` ao valor das diárias. Para reservas com 7 ou mais diárias, aplique depois um desconto de `10%` sobre o valor calculado.

Valide todos os dados antes de calcular.

---

## Nível 5 — Desafios com várias etapas de decisão

### 41. Simulação de financiamento
Leia:

- salário mensal;
- valor do bem;
- valor da entrada;
- quantidade de parcelas.

Regras:

1. Todos os valores devem ser positivos, e a entrada não pode ser maior que o valor do bem.
2. Calcule o valor financiado: `valor do bem - entrada`.
3. Calcule a parcela sem juros: `valor financiado / quantidade de parcelas`.
4. O financiamento só pode ser aprovado se a parcela não ultrapassar `30%` do salário.
5. Se a entrada for pelo menos `30%` do valor do bem, informe **"Boa entrada"**; caso contrário, informe **"Entrada baixa"**.
6. Se aprovado e a entrada for baixa, informe também **"Aprovação com maior risco"**.

### 42. Avaliação de desempenho de funcionário
Leia três notas de `0` a `10`:

- produtividade;
- qualidade;
- pontualidade.

Calcule a média e classifique:

- média `>= 9`: **Excelente**;
- média `>= 7`: **Bom**;
- média `>= 5`: **Regular**;
- média `< 5`: **Insuficiente**.

Entretanto:

- se qualquer nota for menor que `4`, a classificação máxima permitida é **Regular**;
- se duas ou mais notas forem menores que `4`, a classificação deve ser **Insuficiente**.

Valide todas as notas antes de calcular.

### 43. Loja com desconto e frete
Leia:

- valor da compra;
- estado de destino (`"RS"`, `"SC"` ou `"PR"`);
- se o cliente é premium (`"S"` ou `"N"`).

Desconto:

- cliente premium: `10%`;
- cliente comum com compra acima de R$ 500: `5%`;
- demais casos: sem desconto.

Frete:

- RS: R$ 20;
- SC: R$ 30;
- PR: R$ 35.

Após aplicar o desconto, se o valor restante for igual ou superior a R$ 700, o frete será grátis.

Mostre valor original, desconto, frete e total final.

### 44. Sistema de autenticação com nível de acesso
Leia usuário, senha e código de perfil.

Credenciais:

- usuário: `"admin"`;
- senha: `"1234"`.

Somente após validar usuário e senha, analise o perfil:

- `1`: **Administrador**;
- `2`: **Operador**;
- `3`: **Consulta**.

Se usuário estiver incorreto, não é necessário verificar a senha. Se a senha estiver incorreta, não é necessário verificar o perfil. Códigos de perfil diferentes de 1, 2 e 3 são inválidos.

### 45. Resultado de campeonato
Leia os gols de dois times em uma partida e os pontos que cada time possuía antes do jogo.

Regras de pontuação:

- vitória: 3 pontos;
- empate: 1 ponto para cada;
- derrota: 0 pontos.

O programa deve:

1. validar que os gols e pontos não são negativos;
2. identificar vencedor ou empate;
3. atualizar os pontos de cada time;
4. informar qual time ficou com mais pontos após a partida;
5. informar se os dois terminaram com a mesma pontuação.

### 46. Correção de prova
Leia:

- nota da prova (`0` a `10`);
- quantidade de exercícios entregues (`0` a `10`);
- percentual de presença (`0` a `100`).

Regras:

1. presença abaixo de `75%` causa reprovação por frequência;
2. caso a presença seja suficiente:
   - nota `>= 7` e pelo menos 8 exercícios: **Aprovado**;
   - nota `>= 7` e menos de 8 exercícios: **Recuperação por atividades**;
   - nota entre `5` e `6.9`: **Recuperação por nota**;
   - nota abaixo de `5`: **Reprovado**.
3. Se a nota for `10`, os 10 exercícios tiverem sido entregues e a presença for pelo menos `90%`, mostre também **"Desempenho de destaque"**.

### 47. Locação de veículo
Leia:

- tipo de veículo (`"ECONOMICO"` ou `"SUV"`);
- quantidade de dias;
- quantidade de quilômetros percorridos.

Preços:

- Econômico: R$ 120 por dia + R$ 0,80 por km;
- SUV: R$ 220 por dia + R$ 1,20 por km.

Regras adicionais:

- com 7 ou mais dias, desconto de `10%` sobre o valor das diárias;
- se a quilometragem total ultrapassar 1.000 km, acrescente taxa fixa de R$ 150;
- se a locação tiver 7 ou mais dias **e** até 500 km, conceda mais R$ 50 de desconto.

Mostre os componentes do cálculo e o total final.

### 48. Conta de restaurante com taxa de serviço
Leia:

- valor consumido;
- qualidade do atendimento (`"OTIMO"`, `"BOM"` ou `"REGULAR"`);
- quantidade de pessoas na mesa.

Taxa de serviço:

- ótimo: `15%`;
- bom: `10%`;
- regular: `5%`.

Regras adicionais:

- mesas com 6 ou mais pessoas recebem `5%` de desconto sobre o consumo antes da taxa;
- se o valor consumido for superior a R$ 500, aplique mais `5%` de desconto sobre o consumo;
- os dois descontos podem ser acumulados.

Calcule descontos, taxa de serviço e total final.

### 49. Análise de crédito
Leia:

- renda mensal;
- valor da parcela desejada;
- idade;
- se possui dívida em atraso (`"S"` ou `"N"`).

Regras:

1. dados numéricos devem ser positivos;
2. se houver dívida em atraso, o crédito é **negado**;
3. caso não haja dívida:
   - parcela até `25%` da renda: condição financeira adequada;
   - acima de `25%` e até `35%`: condição financeira de atenção;
   - acima de `35%`: crédito negado;
4. para clientes com menos de 21 anos, mesmo com condição financeira adequada, o resultado deve ser **"Análise adicional necessária"**;
5. para clientes com 65 anos ou mais, a parcela não pode ultrapassar `20%` da renda.

Apresente o resultado final e o motivo principal da decisão.

### 50. Sistema completo de pedido com cupom e entrega
Uma loja deseja calcular o valor final de um pedido. Leia:

- valor dos produtos;
- tipo de cliente (`"COMUM"` ou `"PREMIUM"`);
- cupom (`"SEM"`, `"DESC10"` ou `"DESC20"`);
- distância de entrega em quilômetros.

Siga as regras abaixo na ordem indicada:

1. O valor dos produtos deve ser positivo e a distância não pode ser negativa.
2. Clientes **PREMIUM** recebem inicialmente `5%` de desconto.
3. Depois, analise o cupom:
   - `"SEM"`: nenhum desconto adicional;
   - `"DESC10"`: `10%` de desconto, válido somente para pedidos de pelo menos R$ 100 e limitado a R$ 20;
   - `"DESC20"`: `20%` de desconto, válido somente para pedidos de pelo menos R$ 300 e limitado a R$ 50.
4. O desconto do cupom deve ser calculado sobre o **valor original dos produtos**.
5. Os descontos de cliente premium e cupom podem ser acumulados.
6. Após os descontos, calcule o frete:
   - até 5 km: R$ 10;
   - acima de 5 km até 15 km: R$ 20;
   - acima de 15 km: R$ 35.
7. O frete será grátis se:
   - o cliente for PREMIUM e o valor após os descontos for pelo menos R$ 150; ou
   - o cliente for COMUM e o valor após os descontos for pelo menos R$ 300.
8. Mostre:
   - valor original;
   - desconto de cliente;
   - desconto do cupom;
   - valor após descontos;
   - frete;
   - valor final.
9. Para cupom ou tipo de cliente inválido, apresente uma mensagem de erro e não realize o cálculo final.

---

## Observação final

O objetivo desta lista é exercitar a **construção do raciocínio condicional**. Em especial nos exercícios finais, antes de programar, identifique:

- quais dados precisam ser lidos;
- quais dados precisam ser validados;
- quais decisões são independentes;
- quais decisões dependem de uma condição anterior;
- quando é mais adequado utilizar `if` aninhado;
- quando uma cadeia `if / else if / else` representa melhor as faixas de valores;
- quais cálculos devem ocorrer antes ou depois de cada decisão.
