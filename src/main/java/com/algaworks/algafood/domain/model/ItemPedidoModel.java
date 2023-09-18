package com.algaworks.algafood.domain.model;

import java.math.BigDecimal;

import org.springframework.hateoas.RepresentationModel;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPedidoModel extends RepresentationModel<ItemPedidoModel> {
	
	@ApiModelProperty(example = "1")
	private Long produtoId;
	
	@ApiModelProperty(example = "Porco com molho agridoce")
	private String produtoNome;
	
	@ApiModelProperty(example = "78.90")
	private BigDecimal precoUnitario;
	
	@ApiModelProperty(example = "157.80")
	private BigDecimal precoTotal;
	
	@ApiModelProperty(example = "2")
	private Integer quantidade;
	
	@ApiModelProperty(example = "Menos picante, por favor")
	private String observacao;

}
