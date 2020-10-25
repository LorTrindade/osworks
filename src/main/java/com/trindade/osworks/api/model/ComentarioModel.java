package com.trindade.osworks.api.model;

import java.time.OffsetDateTime;

public class ComentarioModel {
	
	private Long id;
	private String descricao;
	private OffsetDateTime data_envio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public OffsetDateTime getData_envio() {
		return data_envio;
	}
	public void setData_envio(OffsetDateTime data_envio) {
		this.data_envio = data_envio;
	}

}
