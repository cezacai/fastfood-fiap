package com.postech.fastfoodfiap.application.ports.inbound;

import com.postech.fastfoodfiap.application.core.domain.Cliente;

public interface CriarClienteUseCasePort {
    Cliente criarCliente(Cliente cliente);
    Boolean existeClienteComCPF(String cpf);
}
