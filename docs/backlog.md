== Especificação ==
    O programa possui recebe uma string correspondente a uma senha como entrada, a mesma é analisada
    e uma avaliação é retornada.
    
 * Avaliação pode ser definida como: EASY, MEDIUM, STRONG, VERY_STRONG e EXTREMELY_STRONG. Tem seu valor inicial informado como "muito fraco"
    * Pontuação, que está diretamente associada a um veredido em intervalos.
        - abaixo de 4 para EASY;
        - 4 a 6 para MEDIUM;
        - 7 a 9 para STRONG;
        - 10 e 12 para VERY_STRONG;
        - acima de 13 para EXTREMELY_STRONG.
    * Pontuação inicia com valor 0
    * Verifica quantidade de caracteres existentes na senha:
        - se tamanho de senha menor que 5:
        -     soma-se 3 a pontuação
        - se tamanho de senha maior que 5 e menor que 8:
        -    soma-se 6 a pontuação
        - se tamanho de senha maior que 7 e menor que 16:
        -    soma-se 12 a pontuação
        - se tamanho de senha maior que 16:
        -    soma-se 18 a pontuação
    * Soma-se 1 a pontuação se existir algum caracter minúsculos da senha
    * Soma-se 5 a pontuação se existir algum caracter maiúsculos da senha
    * Soma-se 5 a pontuação se existir algum caracter da senha
    * Se existirem mais de 3 dígitos:
        - soma-se 3 a pontuação
    * São caracteres especiais: !, @, #, $, %, ^, &, *, ?, _ , ~
        - se existe mais de 1 caracter especial:
            - soma-se 5 a pontuação
        - se existem mais de 2 caracteres especiais:
            - soma-se 5 a pontuação
    * Se existirem tanto caracteres maiusculos quanto minúsculos, soma-se 2 a pontuação
    * Se existir pelo menos um caracter e um número, soma-se 2 a pontuação
    * Se existir pelo menos um caracter, ou um número, e um caracter especial, soma-se 2 a pontuação
    * Gera o veredito sobre o critério definido
    * Imprime pontuação
    * Imprime veredito

== Modificações ==

* Reestruturar o método `int checkPasswordStrength(String passwd)` de modo que a sua lógica seja
encapsulada e separada em pequenos métodos privados 
* Remover redundâncias de código
* Utilizar funções built-in, evitando reinventar a roda
* Correções de typos