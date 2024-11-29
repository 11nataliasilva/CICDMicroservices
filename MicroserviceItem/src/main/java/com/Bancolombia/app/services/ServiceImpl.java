package com.Bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancolombia.app.datasource.ItemRepository;
import com.Bancolombia.app.entities.Item;

@Service
public class ServiceImpl implements IService {
	@Autowired
	private ItemRepository repositorio;

	@Override
	public boolean insert(Item item) {
		return repositorio.insert(item);
	}

	@Override
	public List<Item> getAll() {
		return repositorio.getAll();
	}
		
}