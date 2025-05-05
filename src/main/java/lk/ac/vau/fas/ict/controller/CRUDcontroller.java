package lk.ac.vau.fas.ict.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

public class CRUDcontroller<K,T> {
	
	private Map<K, T> objects = new HashMap<K, T>();
	
	public Map<K, T> getMap() {
		return objects;
	}
	
	// get all
	@GetMapping("/")
	public Map<K, T> getAll() {
		return objects;
	}
	
	// get one
	@GetMapping("/{id}")
	public T get(@PathVariable("id") K id) {
		return objects.get(id);
	}
	
	// add new 
	public String add(K k,T t) {
		//objects.put(object, (T) object);
	return "New object added";
}
		// update
	
	
		// delete
	
	
}
