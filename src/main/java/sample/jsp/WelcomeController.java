/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.jsp;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import sample.dao.DataDAOInterface;
import sample.dao.*;

@Controller

public class WelcomeController {

	@Autowired
	private DataDAOInterface data;
	private DataInRepository dataInRepository;
	private AdressRepository adressRepository;

	public WelcomeController(DataInRepository dataInRepository, AdressRepository adressRepository) {
		this.dataInRepository = dataInRepository;
		this.adressRepository = adressRepository;
	}


	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);

		return "welcome";
	}

	@RequestMapping(value = "/TwoTable", method = RequestMethod.POST)  //передаём с таблицы welcome POST
	public String post(@RequestParam("ParamName") String ParamName,    //С этими параметрами
					   @RequestParam("ParamSurname") String ParamSurname,
					   @RequestParam("ParamPan") String ParamPan ) {


		DataJPA dataJPA = new DataJPA();

		dataJPA.setName(ParamName);
		dataJPA.setSurname(ParamSurname);
		dataJPA.setPatronymic(ParamPan);

		dataInRepository.save(dataJPA);


		return "TwoTable";
	}
	@RequestMapping(value = "/ObjPerson", method = RequestMethod.POST)
	public String search(@RequestParam("ParamId") int ParamId, Map<String, Object> id) { //получаем со страницы welcome paramID

		String ret, name;

		try {name = this.data.getData(ParamId).getName();} catch (NullPointerException e){ return "Null" ;};
		ret = "ObjPerson";
		id.put("name", name);
		id.put("ParamId", ParamId);
		return ret;
	}
	@RequestMapping(value = "/TreeTable", method = RequestMethod.POST)
	public String AddAdress(@RequestParam("Adress") String Adress,
						 	@RequestParam("ParamId") int ParamId){

		DataAdress dataAdress = new DataAdress();

		dataAdress.setInfo_id(ParamId);
		dataAdress.setAdress_Person(Adress);
		adressRepository.save(dataAdress);

		return null;
	}

	@RequestMapping("/foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}
}

