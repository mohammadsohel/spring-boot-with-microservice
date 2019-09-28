package com.sohel.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sohel.dto.CatalogDTO;
import com.sohel.entity.Catalog;
import com.sohel.helper.BeanHelper;
import com.sohel.repository.Catalogrepository;

@Component
public class CatalogHandler {

	@Autowired
	private Catalogrepository catalogRepository;

	public Catalog saveRecord(CatalogDTO catalogDTO)

	{

		return catalogRepository.save(BeanHelper.DTOToEntity(catalogDTO));
	}

	public Catalog getRecord(Long catalogId)

	{

		return catalogRepository.findByCatalogId(catalogId);
	}

}
