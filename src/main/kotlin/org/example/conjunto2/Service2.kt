package org.example.conjunto2

import java.math.BigDecimal
import org.example.domain.PaymentType
import org.example.domain.ProductType
import org.example.domain.Repository

class Service2(private val repository: Repository) {

    fun execute(
        installmentId: Int,
        paymentValue: BigDecimal,
        paymentType: PaymentType,
        productType: ProductType
    ): BigDecimal {
        TODO()
    }

}