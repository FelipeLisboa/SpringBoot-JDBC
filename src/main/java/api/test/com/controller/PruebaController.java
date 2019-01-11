package api.test.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.test.com.entity.Prueba;
import api.test.com.repository.PruebaRepository;
import io.swagger.annotations.Api;

@Controller
@Api(value="/prueba",produces ="application/json")
@RequestMapping(value="/prueba")
public class PruebaController {

	@Autowired
	PruebaRepository pruebaRepository;
	
	@CrossOrigin
	@GetMapping(path = "/findAll")
	public @ResponseBody List<Prueba> findAll() {
		return pruebaRepository.findAll();
	}
	
}
