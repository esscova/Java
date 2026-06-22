# Operadores em Java

Em Java, **operadores** são símbolos especiais utilizados para realizar operações em variáveis e valores (chamados de operandos). Eles são a base para a construção de qualquer lógica dentro de um programa.

Abaixo, explico em detalhes as quatro categorias que você pediu, com exemplos práticos:

---

### 1. Operadores Aritméticos
São usados para realizar operações matemáticas básicas, como na matemática tradicional.

*   `+` **(Adição)**: Soma dois valores. (Também usado para concatenar/juntar Strings).
*   `-` **(Subtração)**: Subtrai o valor da direita do valor da esquerda.
*   `*` **(Multiplicação)**: Multiplica dois valores.
*   `/` **(Divisão)**: Divide o valor da esquerda pelo da direita. *Atenção:* Se você dividir dois números inteiros (ex: `5 / 2`), o Java vai truncar o resultado e retornar `2`. Para ter casas decimais, pelo menos um número deve ser `float` ou `double` (ex: `5.0 / 2`).
*   `%` **(Módulo/Resto)**: Retorna o resto de uma divisão. Muito útil para descobrir se um número é par ou ímpar (ex: `x % 2 == 0`).

**Exemplo:**
```java
int a = 10;
int b = 3;
System.out.println(a + b); // 13
System.out.println(a / b); // 3 (divisão de inteiros)
System.out.println(a % b); // 1 (resto de 10 dividido por 3)
```

---

### 2. Operadores Unários
Os operadores unários precisam de apenas **um operando** para funcionar. Eles são usados para incrementar, decrementar, inverter sinais ou inverter valores lógicos.

*   `+` **(Sinal Positivo)**: Indica que um número é positivo. (Geralmente omitido, pois os números já são positivos por padrão).
*   `-` **(Sinal Negativo)**: Inverte o sinal de um número (transforma positivo em negativo e vice-versa).
*   `++` **(Incremento)**: Adiciona 1 ao valor da variável.
    *   **Pré-incremento (`++x`)**: Incrementa primeiro, depois usa o valor.
    *   **Pós-incremento (`x++`)**: Usa o valor atual, depois incrementa.
*   `--` **(Decremento)**: Subtrai 1 do valor da variável. (Também possui pré `--x` e pós `x--`).
*   `!` **(Negação Lógica)**: Inverte o valor de um booleano (`true` vira `false`, e `false` vira `true`).

**Exemplo:**
```java
int x = 5;
System.out.println(-x); // -5 (inverteu o sinal)

int y = 5;
System.out.println(++y); // 6 (Soma 1 antes de imprimir)

int z = 5;
System.out.println(z++); // 5 (Imprime o 5, e SÓ DEPOIS muda para 6)

boolean chovendo = true;
System.out.println(!chovendo); // false (negação)
```

---

### 3. Operadores de Comparação (Relacionais)
São usados para comparar dois valores. O resultado de uma comparação em Java é **sempre** um valor booleano (`true` ou `false`).

*   `==` **(Igual a)**: Verifica se os dois valores são iguais. *(Não confunda com `=`, que é atribuição de valor).*
*   `!=` **(Diferente de)**: Verifica se os valores são diferentes.
*   `>` **(Maior que)**: Verifica se o valor da esquerda é maior que o da direita.
*   `<` **(Menor que)**: Verifica se o valor da esquerda é menor que o da direita.
*   `>=` **(Maior ou igual a)**: Verifica se é maior OU igual.
*   `<=` **(Menor ou igual a)**: Verifica se é menor OU igual.

**Exemplo:**
```java
int idade = 18;
System.out.println(idade == 18); // true
System.out.println(idade != 20); // true
System.out.println(idade > 18);  // false
System.out.println(idade >= 18); // true
```

---

### 4. Operadores Lógicos
São usados para combinar duas ou mais expressões booleanas. Eles são fundamentais para criar condições complexas em estruturas como `if` e `while`.

*   `&&` **(E lógico / AND)**: Retorna `true` APENAS SE **todas** as condições forem verdadeiras.
*   `||` **(OU lógico / OR)**: Retorna `true` se **pelo menos uma** das condições for verdadeira.
*   `!` **(NÃO lógico / NOT)**: É o mesmo operador unário de negação visto acima.

*Nota sobre "Curto-circuito" (Short-circuit):* Em Java, o `&&` e o `||` são inteligentes. Se você usa `&&` e a primeira condição for `false`, o Java nem avalia a segunda, pois sabe que o resultado final já será `false`. O mesmo ocorre no `||` se a primeira for `true`.

**Exemplo:**
```java
int nota = 8;
int faltas = 2;

// Para ser aprovado: nota maior ou igual a 7 E faltas menores que 5
boolean aprovado = (nota >= 7) && (faltas < 5); 
System.out.println(aprovado); // true (ambas as condições são verdadeiras)

boolean temCarteiraDeMotorista = false;
boolean estaAcompanhado = true;

// Pode dirigir se tiver carteira OU estiver acompanhado por um instrutor
boolean podeDirigir = temCarteiraDeMotorista || estaAcompanhado;
System.out.println(podeDirigir); // true (uma das condições é verdadeira)
```

**Resumo prático:**
Você vai usar os **Aritméticos** para fazer contas, os **Unários** para atalhos matemáticos e inversões rápidas, os de **Comparação** para testar relações entre variáveis, e os **Lógicos** para juntar tudo isso em regras de negócio mais complexas!