## Matriz Binária

- Criei uma classe chamada Matriz Binária para escrever a lógica do código. Para não dar erro logo de inicio, optei em fazer uma verificação simples para saber se existe uma matriz e caso não exista, será retornado o valor 0.

- Declarei variáveis para pegar todo comprimento da matriz(totalLinhas e totalColunas) e iniciei a variável maiorArea em 0.

- Usei um laço for para percorrer a linha atual e as próximas linhas, em seguida usei o mesmo raciocínio, mas para percorrer as colunas.

- Enquanto eu olho as linhas e colunas, vou diminuindo o valor da variável larguraMaxima toda vez que encontro um '0'. Isso serve para diminuir a largura do retângulo, porque ele só pode ser feito com '1'. 

- A variável alturaAtual (proximaLinha - linhaAtual + 1) conta quantas linhas tem. 

- A variável areaAtual segue a mesma lógica, só que para calcular a área do retângulo, em vez de somar, eu multiplico.

- O if depois serve para atualizar o valor da maiorArea, considerando a areaAtual. No final, será retornado o valor da maiorArea.

## Programa

- Para melhor organização e seguindo boas práticas que adquiri nos estudos na Generation, optei em separar a lógica do programa, pela facilidade em visualizar e testar os saídas conforme fui montando a lógica.

- Coloquei o valor na "minhaMatriz" conforme o enunciado, com a saída esperada.

- Declarei a variável "resultado" chamando a classe "MatrizBinaria" e o método "encontrarMaiorRetangulo", passando "minhaMatriz" como argumento para ser usado no cálculo.

- Finalmente imprimo a saída com o resultado do maior retangulo.

----

- Quando iniciei a soluçao para o problema, levei em consideração utilizar tipo int, mesmo que no enunciado a saída esperada estava com ''. Olhando a documentação das variaveis no site da Oracle, o tipo char seria a melhor opção para esse caso em especifico.

- Consultei exercícios que já tinha feito na escola 42, inclusive o Rush01, que precisava justamente percorrer uma matriz binária. Peguei a ideia, mas como era em C e escolhi usar Java, fiz pesquisas em sites acadêmicos e fóruns de programação como Stack Overflow.

- Antes de chegar ao resultado final, primeiro testei matriz 2 x 2 com apenas '1', depois apenas com '0', e fui aumentando para 3 x 3, seguindo a mesma lógica.




