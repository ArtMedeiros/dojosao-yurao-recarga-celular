package br.com.zup.recargacelular.recarga

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpResponse

@RestController
@RequestMapping("api/recarga")
class RecargaController(val repository: RecargaRepository){

    @PostMapping
    fun criaRecarga(@RequestBody request: RecargaRequest): ResponseEntity<Any>{
        val recarga = request.toModel()
        repository.save(recarga)
        return ResponseEntity.ok().build()
    }
}