package br.edu.positivo.scpe.dal;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.edu.positivo.scpe.model.Phone;


@WebService
public class PhoneDAO {
	protected List<Phone> phones = new ArrayList<Phone>();
	protected PhoneResource cr = new PhoneResource();
	@WebMethod
	public void addphone(Phone phone){
		cr.postPhone(phone);
	}
	@WebMethod
	public List<Phone> getphones(){
		return (List<Phone>) cr.listaPhones();
	}
	
	@WebMethod
	public String getAss(){
		return "ASS";
	}
	
	@WebMethod
	public String getPing(String ping){
		return "pong "+ ping;
	}
}
