package br.com.zup.recargacelular.recarga

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RecargaRepository: JpaRepository<Recarga, Long> {

}