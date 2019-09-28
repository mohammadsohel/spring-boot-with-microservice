package com.sohel.controller;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sohel.dto.CatalogDTO;
import com.sohel.handler.CatalogHandler;



	@RestController

	public class CatalogController {

		@Autowired
		CatalogHandler catalogHandler;
		
		
		@Autowired(required=true)
		RestTemplate restTemplate;
		

		@Value("${server.port}")
		private Integer port;

		@PostMapping(value = "/saverecord", consumes = "application/json", produces = "application/json")
		public ResponseEntity<?> saveRecord(@RequestBody CatalogDTO catalog) {
			System.out.println(port);
			return new ResponseEntity<>(this.catalogHandler.saveRecord(catalog), HttpStatus.OK);

		}

	
		@RequestMapping(value = "/getrecord/{catalogId}", method = RequestMethod.POST)
		public ResponseEntity<?> getRecord(@PathVariable("catalogId") Long catalogId) throws IOException {
			System.out.println(port);
			
			return new ResponseEntity<>(this.catalogHandler.getRecord(catalogId), HttpStatus.OK);

		}

	}

