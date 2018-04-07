package br.edu.positivo.scpe.clientWs;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.positivo.scpe.dal.PhoneResource;
import br.edu.positivo.scpe.model.Phone;

@SpringBootApplication
public class ClientWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientWsApplication.class, args);
		
		PhoneResource cr = new PhoneResource();
		Phone phone = new Phone(1,41,30130725);
		
		cr.postPhone(phone);
		
	}
}
