package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	// ESTE METODO SERVE PARA QUE TENHAMOS ACESSO FORA DA CLASSE
	public int getCode() {
		return code;
	}
	//ESTE METODO VAZIA FUNCIONAR SEM PRECISAR INSTACIAR
	public static OrderStatus valueOf(int code) {
		//ESTE FOR É PARA QUE PERCORRAR TODOS OS VALORES E VEJAM QUAIS OS CORRESPONDENTE
		for(OrderStatus value : OrderStatus.values()) {
			//SE O GETCODE FOR IGUAL A CODE ELE RETORNARA OS VALORES DO ORDERSTATUS
			if(value.getCode() == code) {
				return value;
			}
		} 
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
