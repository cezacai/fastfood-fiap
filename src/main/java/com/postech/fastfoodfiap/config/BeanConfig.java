package com.postech.fastfoodfiap.config;

import com.postech.fastfoodfiap.adapter.outbound.repository.SalvarClienteAdapter;
import com.postech.fastfoodfiap.application.core.usecase.CriarClienteUseCase;
import com.postech.fastfoodfiap.application.ports.inbound.CriarClienteUseCasePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public CriarClienteUseCasePort criarClienteUseCasePort(SalvarClienteAdapter salvarClienteAdapter){
        return new CriarClienteUseCase(salvarClienteAdapter);

    }

    @Bean
    public CriarClienteUseCase criarClienteUseCase(SalvarClienteAdapter salvarClienteAdapter){
        return new CriarClienteUseCase(salvarClienteAdapter);
    }


}
