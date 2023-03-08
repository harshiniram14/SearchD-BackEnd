package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;



import com.example.demo.Entity.movieEntity;
import com.example.demo.Repository.movieRepo;

@Service
public class movieService {
	@Autowired
	movieRepo r;
	
	public String add(movieEntity m) {
		r.save(m);
		return "Added";
	}
	public List<movieEntity> getDetails(){
		return r.findAll();
	}
	public List<movieEntity> getSorted(String field){
		return r.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<movieEntity> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<movieEntity> page =r.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	
	public movieEntity updateDetails(movieEntity e1)
	{
		return r.saveAndFlush(e1);
	}
	public void deleteDetails(int id)
	{
		r.deleteById(id);
	}

}
