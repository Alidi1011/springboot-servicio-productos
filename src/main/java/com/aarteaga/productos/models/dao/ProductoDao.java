package com.aarteaga.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.aarteaga.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
