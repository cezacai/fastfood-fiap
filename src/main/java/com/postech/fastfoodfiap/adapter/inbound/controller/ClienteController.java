package com.postech.fastfoodfiap.adapter.inbound.controller;


import com.postech.fastfoodfiap.adapter.inbound.controller.request.ClienteRequest;
import com.postech.fastfoodfiap.adapter.inbound.controller.response.ClienteResponse;
import com.postech.fastfoodfiap.application.core.usecase.CriarClienteUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final CriarClienteUseCase criarClienteUseCase;


    public ClienteController(CriarClienteUseCase criarClienteUseCase) {
        this.criarClienteUseCase = criarClienteUseCase;
    }

    @PostMapping()
    public ResponseEntity<ClienteResponse> criarCliente(@Valid @RequestBody ClienteRequest clienteRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteResponse.fromDomain(criarClienteUseCase.criarCliente(clienteRequest.toDomain())));
    }
}
