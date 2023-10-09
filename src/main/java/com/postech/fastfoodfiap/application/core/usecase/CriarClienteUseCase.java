package com.postech.fastfoodfiap.application.core.usecase;

import com.postech.fastfoodfiap.application.core.domain.Cliente;
import com.postech.fastfoodfiap.application.ports.inbound.CriarClienteUseCasePort;
import com.postech.fastfoodfiap.application.ports.outbound.CriarClienteAdapterPort;

public class CriarClienteUseCase implements CriarClienteUseCasePort {

    private final CriarClienteAdapterPort criarClienteAdapterPort;


    public CriarClienteUseCase(CriarClienteAdapterPort salvarClienteAdapterPort) {
        this.criarClienteAdapterPort = salvarClienteAdapterPort;
    }

    @Override
    public Cliente criarCliente(Cliente cliente) {
        if (!existeClienteComCPF(cliente.getCpf())){
            return criarClienteAdapterPort.salvarCliente(cliente);
        }
        throw new RuntimeException("Cliente já cadastrado");
    }

    @Override
    public Boolean existeClienteComCPF(String cpf) {
        return criarClienteAdapterPort.validarPorCpf(cpf);
    }
}
