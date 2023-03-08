package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.movieEntity;
import com.example.demo.Service.movieService;

@RestController
@CrossOrigin
public class movieController {
	@Autowired
	movieService s;
	
	@GetMapping("/get")
	public List<movieEntity> showDetails(){
		return s.getDetails();
	}
	
	@PostMapping("/post")
	public String addDetails(@RequestBody movieEntity m) {
		s.add(m);
		return "Added movie "+m.getId();
	}
	
	@GetMapping("product/{field}")
	public List<movieEntity> getWithSort(@PathVariable String field){
		return s.getSorted(field);
	}
	
	@GetMapping("/product/{offset}/{pageSize}")
	public List<movieEntity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		return s.getWithPagination(offset, pageSize);
	}
	
	@PutMapping("/updateDetails")
	public movieEntity updateInfo(@RequestBody movieEntity st1)
	{
		return s.updateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteInfo(@PathVariable("id") int sid)
	{
		s.deleteDetails(sid);
		return "Deleted the Element";
	}

}
