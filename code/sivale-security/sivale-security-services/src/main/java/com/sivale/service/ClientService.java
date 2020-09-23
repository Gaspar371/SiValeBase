package com.sivale.service;

import java.util.List;

import com.sivale.sivaleclientes.cliente.DetailClientTO;

public interface ClientService {

	List<DetailClientTO> getAllClients();
	
	DetailClientTO getDetailClient(Integer idClient);

	String exceptionSimulator();
	
	String activateCard(Integer idClient);
}
