package org.example.domain

import java.math.BigDecimal

interface Repository {

    fun save(installmentId: Int, fee: BigDecimal): Boolean
}