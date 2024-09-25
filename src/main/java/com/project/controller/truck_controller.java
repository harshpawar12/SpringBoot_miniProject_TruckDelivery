package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.truck_model;
import com.project.repo.truck_repo;

class TruckOverloadedException extends Exception
{
	TruckOverloadedException(String msg)
	{
		super(msg);
	}
}
@Controller
public class truck_controller {
	
	@Autowired
	private  truck_repo repo;
	
	@RequestMapping("/truck")
	public String isTruckload(@ModelAttribute truck_model ob,Model m) throws TruckOverloadedException 
	{
		if(ob.getCapacity()<ob.getLoading())
		{
			return "index.jsp?msg="+new TruckOverloadedException("TruckOverlodedException...!!");
		}else {
		repo.save(ob);
		
		
		}
		return "index.jsp";
	}
	@RequestMapping("/fetch")
	public String isdetail(Model m)
	{
		List<truck_model>al=repo.findAll();
		m.addAttribute("isdata", al);
		return "fetchh.jsp";
	}
	@RequestMapping("/delivery/{id}")
	public String isDelivered()
	{
		return "redirect:/delivery.jsp";
	}
	@RequestMapping("/del/{id}")
	public String deleteOrder(@PathVariable int id)
	{
		repo.deleteById(id);
		return "redirect:/fetch";
	}
	@RequestMapping("/{id}")
	public String isOldData(@PathVariable int id,Model m)
	{
		truck_model ob=repo.getById(id);
		m.addAttribute("isget", ob);
		return "Olddataaa.jsp";
	}
	@RequestMapping("/updatehere")
	public String isUpdated(@ModelAttribute truck_model ob)
	{
		truck_model ob1=repo.findById(ob.getId());
		if(ob1!=null)
		{
			ob1.setId(ob.getId());
			ob1.setName(ob.getName());
			ob1.setCapacity(ob.getCapacity());
			ob1.setLoading(ob.getLoading());
			ob1.setRoute(ob.getRoute());
			repo.save(ob1);
		}
		return "redirect:/fetch";
	}

}
