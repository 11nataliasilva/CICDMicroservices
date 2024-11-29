package com.Bancolombia.app.services;

import java.util.List;
import com.Bancolombia.app.entities.Item;

public interface IService {
	
	boolean insert(Item item);
	List<Item> getAll();
}