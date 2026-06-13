# Variáveis e Tipos de Dados

O contexto é uma mudança, se imagine organizando essa mudança e para isso, tu usa várias caixas de papelão, em uma caixa você escreve "Livros" e coloca livros dentro; em outra, escreve "Pratos" e guarda as louças, e segue a mudança...

Na programação, uma **variável** é exatamente isso: uma "caixa" na memória do computador onde você guarda um dado (um número, um texto, uma data) para usar mais tarde no seu programa. E como o próprio nome diz, o conteúdo dessa caixa pode **variar** ao longo do tempo.

No **Java**, existem algumas regrinhas muito importantes sobre como essas caixas funcionam, porque o Java é uma linguagem **fortemente tipada**. Isso significa que você precisa dizer exatamente o que vai guardar na caixa assim que a cria.

---

## Como criar uma variável no Java?

Para criar (declarar) uma variável em Java, você sempre segue a estrutura:
`tipoDaVariavel nomeDaVariavel = valor;`

Veja este exemplo:

```java
int idade = 25;
String nome = "Maria";

```

* `int` e `String` são os **tipos** de dados (o que a caixa pode receber).
* `idade` e `nome` são os **nomes** das variáveis (o rótulo da caixa).
* `25` e `"Maria"` são os **valores** guardados.

---

## Os Principais Tipos de Variáveis

O Java divide seus tipos de variáveis em dois grandes grupos: **Tipos Primitivos** (mais simples e leves) e **Tipos de Referência** (objetos mais complexos). Aqui estão os mais comuns que você vai usar no dia a dia:

### 1. Números Inteiros

* `int`: O tipo mais comum para números inteiros (ex: `10`, `–50`, `12000`).
* `long`: Para números inteiros gigantescos (ex: a população da Terra).

### 2. Números Decimais (com vírgula/ponto)

* `double`: O mais usado para números quebrados e cálculos de alta precisão (ex: `3.1415`, `1500.75`).
* `float`: Uma versão mais leve que o double, mas armazena menos números após o ponto.

### 3. Texto e Caracteres

* `char`: Guarda apenas **um** caractere ou letra. Usa aspas simples (ex: `'A'`, `'7'`, `'$'`).
* `String`: Guarda textos completos. Usa aspas duplas (ex: `"Olá, Mundo!"`). *Nota: String tecnicamente é uma classe/objeto no Java, não um tipo primitivo, mas funciona como um.*

### 4. Lógicos (Verdadeiro ou Falso)

* `boolean`: Só aceita dois valores: `true` (verdadeiro) ou `false` (falso). É a base para tomadas de decisão no código.

---

## Tabela Resumo

| Tipo | O que armazena? | Exemplo de Código |
| --- | --- | --- |
| `int` | Números inteiros | `int quantidade = 10;` |
| `double` | Números decimais | `double preco = 49.90;` |
| `char` | Uma única letra/símbolo | `char genero = 'F';` |
| `boolean` | Estado verdadeiro/falso | `boolean estaLogado = true;` |
| `String` | Textos em geral | `String usuario = "Dev_Java";` |

---

## Fixar

1. **A tipagem é rígida:** Se você criou uma variável como `int`, você **nunca** poderá guardar um texto dentro dela. O Java vai dar um erro antes mesmo do programa rodar.
2. **Case Sensitive:** O Java diferencia letras maiúsculas de minúsculas. `int idade;` e `int Idade;` são duas caixas totalmente diferentes.
3. **O ponto e vírgula `;`:** Toda linha de comando onde você declara uma variável precisa terminar com `;`.