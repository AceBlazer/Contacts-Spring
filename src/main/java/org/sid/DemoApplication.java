package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ContactRepository cr;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		cr.save(new Contact ("Hasani","Med",df.parse("12/10/1994"),"fdfdg@fg.com",74290174,"Hassan.jpeg"));
		cr.save(new Contact ("Khaled","Thamer",df.parse("12/05/1995"),"fdg@fg.com",74290174,"Thamer.jpeg"));
cr.findAll().forEach(c->{
	System.out.println(c.getNom());
	
});

	}
}
