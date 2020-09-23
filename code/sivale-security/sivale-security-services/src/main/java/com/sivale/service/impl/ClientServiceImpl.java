package com.sivale.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivale.architecture.service.BaseService;
import com.sivale.dao.UserDAO;
import com.sivale.entity.KUser;
import com.sivale.service.CardService;
import com.sivale.service.ClientService;
import com.sivale.sivaleclientes.cliente.DetailClientTO;
import com.sivale.sivaleclientes.exceptions.ExceptionCustomer;

@Service
public class ClientServiceImpl extends BaseService implements ClientService{

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private CardService cardService;
	
	public List<DetailClientTO> getAllClients() {

		List<KUser> clientsDO = userDAO.findAll();
		List<DetailClientTO> clientes = Optional.ofNullable(clientsDO).map(d -> d.stream().
				map(a -> new DetailClientTO(a.getDsName(), a.getDsLastName(), a.getQtAge(), a.getIdUser())).collect(Collectors.toList())).orElse(null);
		return clientes;
	}
	
	public DetailClientTO getDetailClient(Integer idClient) {
		DetailClientTO detailClient = null;
		Optional<KUser> optionalDO = userDAO.findById(idClient);
		if(optionalDO.isPresent()) {
			detailClient = new DetailClientTO();
			KUser userDO = optionalDO.get();
			detailClient.setNombre(userDO.getDsName());
			detailClient.setApellido(userDO.getDsLastName());
			detailClient.setEdad(userDO.getQtAge());
		}
		LOG.info("detail  customer ");
		return detailClient;
	}
	
	@Override
	public String exceptionSimulator() {
		throw ExceptionCustomer.CLIENTE_NO_ENCONTRADO;
	}

	@Override
	public String activateCard(Integer idClient) {
		LOG.info("active customer card");
		return cardService.activateCard(idClient);
	}

}
