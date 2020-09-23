package com.sivale.sivaleclientes.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sivale.architecture.controller.BaseController;
import com.sivale.service.CardService;
import com.sivale.service.ClientService;

@RestController
@RequestMapping("/customer")
public class ClientController extends BaseController {

	@Autowired
	private ClientService userService;
	@Autowired
	private CardService cardService;

	@GetMapping()
	public List<DetailClientTO> getClients() {
		return userService.getAllClients();
	}

	@GetMapping("{idClient}")
	public DetailClientTO getDetailClient(@PathVariable("idClient") Integer idClient) {
		return userService.getDetailClient(idClient);
	}

	@GetMapping("/exception")
	public String getDetailClient() {
		return userService.exceptionSimulator();
	}
	
	@GetMapping("{idClient}/card")
	public String getDetailClientCard(@PathVariable("idClient") Integer idClient) {
		return cardService.getInfoCard(idClient);
	}
	
	@PostMapping("/activate")
	public String activateCard(@RequestBody DetailClientTO client) {
	    return userService.activateCard(client.getId());
	  }

}
