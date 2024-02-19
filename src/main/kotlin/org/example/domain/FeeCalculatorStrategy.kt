package org.example.domain

import java.math.BigDecimal

interface FeeCalculatorStrategy {

    val productType: ProductType

    fun calculate(
        paymentValue: BigDecimal,
        paymentType: PaymentType,
    ): BigDecimal
}