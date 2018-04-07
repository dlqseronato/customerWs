package br.edu.positivo.scpe.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.positivo.scpe.model.Customer;
import br.edu.positivo.scpe.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, String>{

}
