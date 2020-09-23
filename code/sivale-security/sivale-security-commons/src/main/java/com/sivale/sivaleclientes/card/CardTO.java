package com.sivale.sivaleclientes.card;

import java.math.BigDecimal;

public class CardTO {
	private String tipoTarjeta;
	private BigDecimal saldo;
	private String noTarjeta;
	private String error;

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getNoTarjeta() {
		return noTarjeta;
	}

	public void setNoTarjeta(String noTarjeta) {
		this.noTarjeta = noTarjeta;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public CardTO(String noTarjeta, String tipoTarjeta, BigDecimal saldo) {
		this.tipoTarjeta = tipoTarjeta;
		this.saldo = saldo;
		this.noTarjeta = noTarjeta; 
	}

	public CardTO(String error) {
		super();
		this.error = error;
	}
	
	
}
