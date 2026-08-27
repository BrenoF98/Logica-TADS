# Sistema completo de pedido com cupom e entrega

Uma loja deseja calcular o valor final de um pedido. Leia:

* valor dos produtos;
* tipo de cliente (`"COMUM"` ou `"PREMIUM"`);
* cupom (`"SEM"`, `"DESC10"` ou `"DESC20"`);
* distância de entrega em quilômetros.

## Regras

1. O valor dos produtos deve ser positivo e a distância não pode ser negativa.

2. Clientes `PREMIUM` recebem inicialmente **5% de desconto**.

3. Depois, analise o cupom:

   * `SEM`: nenhum desconto adicional;
   * `DESC10`: **10% de desconto**, válido somente para pedidos de pelo menos **R$ 100** e limitado a **R$ 20**;
   * `DESC20`: **20% de desconto**, válido somente para pedidos de pelo menos **R$ 300** e limitado a **R$ 50**.

4. O desconto do cupom deve ser calculado sobre o **valor original dos produtos**.

5. Os descontos de cliente `PREMIUM` e cupom podem ser acumulados.

6. Após os descontos, calcule o frete:

   * até **5 km**: R$ 10;
   * acima de **5 km até 15 km**: R$ 20;
   * acima de **15 km**: R$ 35.

7. O frete será grátis se:

   * o cliente for `PREMIUM` e o valor após os descontos for pelo menos **R$ 150**; ou
   * o cliente for `COMUM` e o valor após os descontos for pelo menos **R$ 300**.

## Saída

Mostre:

* valor original;
* desconto de cliente;
* desconto do cupom;
* valor após descontos;
* frete;
* valor final.

Para cupom ou tipo de cliente inválido, apresente uma mensagem de erro e **não realize o cálculo final**.
