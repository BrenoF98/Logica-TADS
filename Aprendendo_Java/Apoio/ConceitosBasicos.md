# Conteitos básicos de java.

## 1. Compilação e JVM

Java tem duas etapas separadas, feitas por dois programas diferentes:

- **`javac`** (compilador): pega o código-fonte (`.java`) e gera **bytecode** (`.class`). Se houver erro de sintaxe, tipo ou nome não resolvido, o `.class` **não é gerado**.
- **`java`** (JVM): pega o bytecode e **traduz e executa ao mesmo tempo**, sem gerar nenhum arquivo novo. Não é um linker — não existe uma etapa de "terminei de preparar" separada de "agora executa".

**Portabilidade:** o `.class` é idêntico em qualquer sistema. O que muda de máquina pra máquina é a JVM instalada (uma versão para Windows, outra para Linux, etc.) — é ela quem traduz o mesmo bytecode para cada hardware.

**Regra do nome do arquivo:** se uma classe é `public`, o nome do arquivo `.java` precisa ser idêntico ao nome dela (o compilador procura assim). Só a classe pública do arquivo tem essa exigência.

**Classpath:** por padrão, `java NomeDaClasse` procura o `.class` na pasta onde o comando é executado.

---

## 2. Variáveis e tipos

Java é **tipado estaticamente**: o tipo é declarado antes de rodar o programa, o que permite ao compilador reservar a memória certa e pegar erros de tipo antes da execução.

| Tipo | Guarda | Exemplo |
|---|---|---|
| `int` | número inteiro | `int idade = 26;` |
| `double` | número decimal | `double altura = 1.75;` |
| `boolean` | verdadeiro/falso | `boolean ativo = true;` |
| `char` | um caractere | `char letra = 'A';` |
| `String` | texto | `String nome = "Breno";` |

**Primitivo vs. referência:**
- Tipos primitivos (`int`, `char`, `boolean`, `double`...) guardam o **valor** diretamente. `==` compara valor.
- `String` (e outras classes) guardam uma **referência** (endereço de memória). `==` compara se é o **mesmo objeto**, não o conteúdo.

```java
String a = "gato";
String b = "gato";
String c = new String("gato");

a == b        // true  → literais reaproveitam o mesmo objeto (string pool)
a == c        // false → new String cria um objeto novo
a.equals(c)   // true  → .equals() compara conteúdo, não endereço
```

**Regra prática:** para comparar conteúdo de `String`, sempre use `.equals()`, nunca `==`.

---

## 3. Condicionais

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else if (idade >= 12) {
    System.out.println("Adolescente");
} else {
    System.out.println("Criança");
}
```

Operadores: `==` `!=` `>` `<` `>=` `<=` `&&` (E) `||` (OU) `!` (negação).

---

## 4. Laços de repetição

### `while` — checa a condição **antes** de rodar

```java
int contador = 1;
while (contador <= 10) {
    System.out.println(contador);
    contador++;
}
```

⚠️ Esquecer o incremento (`contador++`) causa **loop infinito**.
⚠️ Errar `<` por `<=` (ou vice-versa) causa **off-by-one error** (fica faltando ou sobrando um passo).

### `for` — mesma coisa, mais compacto para contagem

```java
for (int contador = 1; contador <= 10; contador++) {
    System.out.println(contador);
}
```

Três partes no cabeçalho: inicialização (uma vez) → condição (checada antes de cada volta) → incremento (no fim de cada volta).

### `do-while` — roda o bloco **pelo menos uma vez**, condição checada **depois**

```java
do {
    System.out.println(contador);
    contador++;
} while (contador <= 10);
```

Útil quando a condição depende de algo que só existe **depois** de rodar uma vez — por exemplo, menus e leitura de input:

```java
int opcao;
do {
    System.out.println("1-Cadastrar 2-Listar 3-Sair");
    opcao = scanner.nextInt();
} while (opcao != 3);
```

### Ler entrada do usuário: `Scanner`

```java
import java.util.Scanner;
// ...
Scanner scanner = new Scanner(System.in);
int numero = scanner.nextInt();
// ... ao terminar de usar:
scanner.close();
```

Precisa de `import` porque `Scanner` não é nativo (`java.lang`) — mora no pacote `java.util`.

---

## 5. Arrays (vetores)

Guardam vários valores do **mesmo tipo**, em posições indexadas **a partir de 0**, com **tamanho fixo**.

```java
int[] numeros = new int[5];      // 5 posições, todas 0 no início
int[] idades = {20, 25, 30, 18}; // literal já preenchido

numeros[0] = 10;                 // acessar/atribuir por índice
int tamanho = numeros.length;    // .length é atributo, sem parênteses
```

**Percorrer com `for`:**

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### Padrões de acumulador

- **Soma**: pode começar em `0` com segurança — `0` é elemento neutro da soma.
  ```java
  int soma = 0;
  for (int i = 0; i < numeros.length; i++) soma += numeros[i];
  double media = (double) soma / numeros.length; // cast evita divisão truncada
  ```
- **Maior/menor**: **não** pode começar num valor chutado como `0` (falha com todos negativos, por exemplo). Precisa começar com um valor **real** do array, obtido **depois** da leitura:
  ```java
  int maior = numeros[0]; // só depois de numeros já estar preenchido
  for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maior) maior = numeros[i];
  }
  ```

---

## 6. Matrizes (arrays 2D)

Em Java, `int[][] matriz` é um **array de arrays**: `matriz` guarda referências para outros arrays `int[]` independentes, cada um vivendo separado na memória.

```java
int[][] matriz = new int[3][3]; // 3 linhas, 3 colunas

for (int linha = 0; linha < matriz.length; linha++) {
    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        System.out.print(matriz[linha][coluna] + " ");
    }
    System.out.println();
}
```

- `matriz.length` → número de linhas (tamanho do array "de fora").
- `matriz[linha].length` → número de colunas **daquela linha específica** (tamanho do array "de dentro").

Como cada linha é um array independente, elas podem ter tamanhos diferentes (**jagged array**) — por isso `.length` precisa ser consultado linha por linha, e não existe um `.length` único para colunas.

---

## 7. Próximo tema: Métodos

```java
public static int somar(int[] numeros) {
    int soma = 0;
    for (int i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }
    return soma;
}
```

- `public static` — por enquanto, mantém sempre assim.
- Tipo antes do nome (`int`) — o que o método **retorna**. Use `void` se não retorna nada.
- Parênteses — os **parâmetros** que o método recebe.
- `return` — devolve o valor calculado para quem chamou o método.
