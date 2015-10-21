package br.com.sample.endpoint;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sample.PeopleService;
import br.com.sample.output.People;

@Controller
public class PeopleEndpoint implements PeopleService {

	 private static final String template = "Hello, %s!";

	    @RequestMapping(value = "/people",method=RequestMethod.GET)
	    public @ResponseBody People getPeople(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
	        return new People(1,String.format(template, name));
	    }
	    
	    @RequestMapping(value = "/people",method=RequestMethod.POST)
	    public @ResponseBody String update(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
	        return "post";
	    }
	    
	    @RequestMapping(value = "/people",method=RequestMethod.PUT)
	    public @ResponseBody String insert(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
	        return "put";
	    }
	    
	    @RequestMapping(value = "/people",method=RequestMethod.DELETE)
	    public @ResponseBody String delete(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
	        return "delete";
	    }

}