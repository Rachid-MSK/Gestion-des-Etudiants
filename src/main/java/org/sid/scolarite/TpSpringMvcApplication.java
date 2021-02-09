package org.sid.scolarite;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sid.scolarite.dao.EtudiantRepository;
import org.sid.scolarite.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class TpSpringMvcApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx= SpringApplication.run(TpSpringMvcApplication.class, args);
		EtudiantRepository etudiantRepository= ctx.getBean(EtudiantRepository.class);
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		etudiantRepository.save(new Etudiant("Rachid", df.parse("1993-06-06"), "rachidmesky@gmail.com", "rachid.jpg"));
		etudiantRepository.save(new Etudiant("Taha", df.parse("2009-02-02"), "taha@gmail.com", "taha.jpg"));
		etudiantRepository.save(new Etudiant("Malak", df.parse("2010-03-03"), "malak@gmail.com", "malak.jpg"));
		
		Page<Etudiant> etds= etudiantRepository.chercherEtudiants("%h%", PageRequest.of(0, 5));
		etds.forEach(e -> System.out.println(e.getNom()));
		
	}

}
