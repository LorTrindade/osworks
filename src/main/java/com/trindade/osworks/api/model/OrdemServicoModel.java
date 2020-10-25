package com.trindade.osworks.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.trindade.osworks.domain.model.StatusOrdemServico;

public class OrdemServicoModel {
	
	private Long id;
	private ClienteResumoModel cliente;
	private String descricao;
	private BigDecimal preco;
	private StatusOrdemServico status;
	private OffsetDateTime data_abertura;
	private OffsetDateTime data_finalizacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public ClienteResumoModel getCliente() {
		return cliente;
	}
	public void setCliente(ClienteResumoModel cliente) {
		this.cliente = cliente;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public StatusOrdemServico getStatus() {
		return status;
	}
	public void setStatus(StatusOrdemServico status) {
		this.status = status;
	}
	public OffsetDateTime getDdata_abertura() {
		return data_abertura;
	}
	public void setData_abertura(OffsetDateTime data_abertura) {
		this.data_abertura = data_abertura;
	}
	public OffsetDateTime getData_finalizacao() {
		return data_finalizacao;
	}
	public void setData_finalizacao(OffsetDateTime data_finalizacao) {
		this.data_finalizacao = data_finalizacao;
	}
	
	

}
