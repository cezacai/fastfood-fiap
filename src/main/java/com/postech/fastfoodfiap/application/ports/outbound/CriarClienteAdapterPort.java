package com.postech.fastfoodfiap.application.ports.outbound;

import com.postech.fastfoodfiap.application.core.domain.Cliente;

public interface CriarClienteAdapterPort {
    Cliente salvarCliente(Cliente cliente);
}
