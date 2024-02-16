package org.example.domain

data class PaymentRuleNotAllowedException(
    override val message: String = "regra não permitida"
) : RuntimeException()