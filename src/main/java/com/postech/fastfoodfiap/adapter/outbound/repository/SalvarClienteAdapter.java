package com.postech.fastfoodfiap.adapter.outbound.repository;

import com.postech.fastfoodfiap.adapter.outbound.repository.entity.ClienteEntity;
import com.postech.fastfoodfiap.application.core.domain.Cliente;
import com.postech.fastfoodfiap.application.ports.outbound.CriarClienteAdapterPort;

import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class SalvarClienteAdapter implements CriarClienteAdapterPort {

    private final ClienteRepository clienteRepository;


    public SalvarClienteAdapter(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    @Transactional
    public Cliente salvarCliente(Cliente cliente) {
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setNome(cliente.getNome());
        clienteEntity.setCpf(cliente.getCpf());
        clienteEntity.setEndereco(cliente.getEndereco());
        clienteEntity.setEmail(cliente.getEmail());

        cliente.setId(clienteRepository.save(clienteEntity).getId());

        return cliente;
    }

    @Override
    public Boolean validarPorCpf(String cpf) {
        return clienteRepository.existsByCpf(cpf);
    }
}
