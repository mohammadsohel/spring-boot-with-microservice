package com.sohel.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sohel.config.RibbonConfig;
import com.sohel.dto.OrderDTO;
import com.sohel.handler.OrderHandler;

@RestController
@RibbonClient(name = "ribbon-config", configuration = RibbonConfig.class)
public class OrderController {

	@Autowired(required = true)
	RestTemplate restTemplate;

	@Autowired
	OrderHandler orderHandler;

	@Value("${server.port}")
	private Integer port;

	@PostMapping(value = "/saverecord", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> saveRecord(@RequestBody OrderDTO orderDto) {
		System.out.println(port);
		return new ResponseEntity<>(this.orderHandler.saveRecord(orderDto), null);

	}

	@GetMapping(value = "/getrecord/{orderId}")
	public ResponseEntity<?> getRecord(@PathVariable("orderId") Long orderId) {
		System.out.println(port);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		String url = "http://ct-service/getrecord/" + orderId;
		String json = restTemplate.exchange(url, HttpMethod.POST, entity, String.class).getBody();

		return new ResponseEntity<>(json, null);

	}

}
