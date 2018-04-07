package br.edu.positivo.scpe.dal;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.positivo.scpe.model.Phone;

@RestController
@RequestMapping("/Phone")
public class PhoneResource {
	@Autowired
	private PhoneRepository repository;
	
	@PostMapping()
	public Phone postPhone(@RequestBody @Valid Phone Phone) {
		return repository.save(Phone);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Phone> listaPhones() {
		Iterable<Phone> listaPhones = repository.findAll();
		return listaPhones;
	}
	
	@DeleteMapping()
	public Phone deletaPhone(@RequestBody Phone Phone) {
		repository.delete(Phone);
		return Phone;
	}
}
