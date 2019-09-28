package com.sohel.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sohel.entity.Catalog;

@Repository
public interface Catalogrepository extends CrudRepository<Catalog, Long> {

	Catalog findByCatalogId(Long catalogId);
}
