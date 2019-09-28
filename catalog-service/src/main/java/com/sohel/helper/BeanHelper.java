package com.sohel.helper;

import org.springframework.beans.BeanUtils;

import com.sohel.dto.CatalogDTO;
import com.sohel.entity.Catalog;

public class BeanHelper {

	public static CatalogDTO entityToDTO(Catalog catalog) {
		CatalogDTO catalogDTO = new CatalogDTO();

		BeanUtils.copyProperties(catalog, catalogDTO);
		return catalogDTO;
	}

	public static Catalog DTOToEntity(CatalogDTO catalogDto) {
		Catalog catalog = new Catalog();

		BeanUtils.copyProperties(catalogDto, catalog);
		return catalog;
	}

}
