package br.ufrgs.avatarfight;

/**
 * Define as funções básicas de um dobrador
 */
interface Dobrador extends Pessoa {

    /**
     * Pega o multiplicador do dano para o elemento fogo que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaFogo();

    /**
     * Pega o multiplicador do dano para o elemento ar que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaAr();

    /**
     * Pega o multiplicador do dano para o elemento água que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaAgua();

    /**
     * Pega o multiplicador do dano para o elemento terra que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaTerra();

}
