package com.postech.fastfoodfiap.application.core.usecase;

import com.postech.fastfoodfiap.application.core.domain.Cliente;
import com.postech.fastfoodfiap.application.ports.inbound.CriarClienteUseCasePort;
import com.postech.fastfoodfiap.application.ports.outbound.CriarClienteAdapterPort;

public class CriarClienteUseCase implements CriarClienteUseCasePort {

    private final CriarClienteAdapterPort salvarClienteAdapterPort;


    public CriarClienteUseCase(CriarClienteAdapterPort salvarClienteAdapterPort) {
        this.salvarClienteAdapterPort = salvarClienteAdapterPort;
    }

    @Override
    public Cliente criarCliente(Cliente cliente) {
            return salvarClienteAdapterPort.salvarCliente(cliente);
    }
}
