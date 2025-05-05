package lk.ac.vau.fas.ict.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class AppController extends CRUDcontroller<String, Student> {
	// create some student objects
	Student Bob = new Student("2021IT01", "Bob Marely", 23, "IT", 3.2);
	Student Alice = new Student("2021IT02", "Alice corner", 24, "IT", 3.6);
	Student John = new Student("2021IT03", "John Parker", 23, "IT", 3.3);

	public AppController() {	
		getMap().put(Alice.getRegNo(), Alice);
		getMap().put(Bob.getRegNo(), Bob);
		getMap().put(John.getRegNo(), John);
	}

}
