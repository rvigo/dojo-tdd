package org.example.domain

/**
 * Classe responsavel pela criacao de estrategias de calculo de taxas baseado no tipo de produto
 */
class FeeCalculatorStrategyFactory {

    private val strategies: MutableSet<FeeCalculatorStrategy> = mutableSetOf()

    /**
     * Metodo responsavel por registrar uma estrategia de calculo de taxas para um tipo de produto
     *
     * @param strategy Estrategia de calculo de taxas
     */
    fun registerStrategy(strategy: FeeCalculatorStrategy) {
        strategies.add(strategy)
    }

    /**
     * Metodo responsavel por retornar a estrategia de calculo de taxas de acordo com o tipo de produto
     *
     * @param productType Tipo de produto
     * @return Estrategia de calculo de taxas
     */
    fun getStrategy(productType: ProductType) = strategies.find { it.productType == productType }
        ?: throw IllegalArgumentException("No strategy found for product type $productType")
}