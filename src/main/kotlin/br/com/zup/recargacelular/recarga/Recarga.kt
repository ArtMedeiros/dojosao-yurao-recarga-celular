package br.com.zup.recargacelular.recarga

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Recarga(
    val numCelular: String,
    @Enumerated(EnumType.STRING)
    val operadora: Operadora,
    val valorRecarga: BigDecimal
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val momentoRegistro: LocalDateTime = LocalDateTime.now()
}