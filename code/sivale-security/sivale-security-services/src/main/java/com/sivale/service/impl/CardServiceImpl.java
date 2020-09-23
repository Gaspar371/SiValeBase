package com.sivale.service.impl;

import java.net.URI;
import java.util.Optional;

import com.sivale.architecture.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sivale.dao.ParamDAO;
import com.sivale.entity.WParam;
import com.sivale.service.CardService;
import com.sivale.sivaleclientes.Constants;

@Service
public class CardServiceImpl extends BaseService implements CardService {
	
	@Autowired
	private ParamDAO paramDAO;
	
	@Override
	@HystrixCommand(fallbackMethod = "errorGetCard")
	public String activateCard(Integer idClient) {
		Optional<WParam> urlCard = paramDAO.findById(Constants.ID_URL_ACTIVATE_CARD);
		URI uri = URI.create(urlCard.get().getDsValue()+idClient);
		return restTemplate.getForObject(uri, String.class);
	}

	@Override
	@HystrixCommand(fallbackMethod = "errorGetCard")
	public String getInfoCard(Integer idCard) {
		LOG.info("detail  customer ");
		Optional<WParam> urlCard = paramDAO.findById(Constants.ID_URL_CARD);
		URI uri = URI.create(urlCard.get().getDsValue()+idCard);
		return restTemplate.getForObject(uri, String.class);
	}

	private final RestTemplate restTemplate;

	public CardServiceImpl(RestTemplate rest) {
		this.restTemplate = rest;
	}

	public String errorGetCard(Integer idCard) {
		return "El servicio de consulta de tarjetas no esta disponible.";
	}

}
