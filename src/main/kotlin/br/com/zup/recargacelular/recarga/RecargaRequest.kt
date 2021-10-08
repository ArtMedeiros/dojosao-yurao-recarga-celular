package br.com.zup.recargacelular.recarga

import com.sun.istack.NotNull
import java.math.BigDecimal

class RecargaRequest(

    @field: NotNull
    val numCelular: String,

    @field: NotNull
    val valorRecarga: BigDecimal,

    @field: NotNull
    val operadora: Operadora,
){
    fun toModel(): Recarga{
        return Recarga(
            numCelular = numCelular,
            valorRecarga = valorRecarga,
            operadora = operadora
        )
    }
}