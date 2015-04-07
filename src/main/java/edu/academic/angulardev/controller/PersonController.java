package edu.academic.angulardev.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.academic.angulardev.model.Person;


@Controller	
public class PersonController {
	
	@RequestMapping(value="/Personas", method=RequestMethod.GET)
	public @ResponseBody Collection<Person> getPeople(){
		List<Person> people=new ArrayList<Person>();
		people.add(new Person(1, "Jerson Viveros"));
		people.add(new Person(1, "Paola Ramirez"));
		return people;  
	}

}
