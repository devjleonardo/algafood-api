package com.algaworks.algafood.api.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.api.v1.openapi.controller.FluxoPedidoControllerOpenApi;
import com.algaworks.algafood.core.security.CheckSecurity;
import com.algaworks.algafood.domain.service.FluxoPedidoService;

@RestController
@RequestMapping(path = "/v1/pedidos/{codigoPedido}", produces = MediaType.APPLICATION_JSON_VALUE)
public class FluxoPedidoController implements FluxoPedidoControllerOpenApi {
	
	@Autowired
	private FluxoPedidoService fluxoPedido;
	
	@CheckSecurity.Pedidos.PodeGerenciasPedidos
	@Override
	@PutMapping("/confirmacao")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void confirmar(@PathVariable String codigoPedido) {
		fluxoPedido.confirmar(codigoPedido);
	}
	
	@CheckSecurity.Pedidos.PodeGerenciasPedidos
	@Override
	@PutMapping("/cancelamento")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void cancelar(@PathVariable String codigoPedido) {
		fluxoPedido.cancelar(codigoPedido);
	}
	
	@CheckSecurity.Pedidos.PodeGerenciasPedidos
	@Override
	@PutMapping("/entrega")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void entregar(@PathVariable String codigoPedido) {
		fluxoPedido.entregar(codigoPedido);
	}
	
}
