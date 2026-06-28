## Determinando o Nível de Satisfação

O objetivo deste exercício é criar um programa em Java que, com base em um número fornecido pelo usuário (representando o nível de satisfação), determine e exiba o feedback correspondente.
### Instruções:

1. Verificação do Número:

    - Declare uma variável inteira chamada `nivel` para armazenar o valor fornecido pelo usuário.

    - Utilize a estrutura de controle `switch` para avaliar o valor de `nivel` e atribuir o feedback apropriado com base nos seguintes critérios:

        - Se `nivel` for 1, o feedback é "Muito insatisfeito".

        - Se `nivel` for 2, o feedback é "Insatisfeito".

        - Se `nivel` for 3, o feedback é "Neutro".

        - Se `nivel` for 4, o feedback é "Satisfeito".

        - Se `nivel` for 5, o feedback é "Muito satisfeito".

        - Caso contrário, o feedback é "Opção inválida (deve estar entre 1 e 5)".

    - Exiba o feedback resultante na saída padrão usando `System.out.println`.

2. Tipo de `switch` a ser usado:

    - Use o `switch` expressao, aquele com a setinha ->.