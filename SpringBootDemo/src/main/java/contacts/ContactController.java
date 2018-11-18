package contacts;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
//@RequestMapping("/")
public class ContactController {

	/*@Autowired
	private ContactRepository contactRepository;
	
	
//	public ContactController(ContactRepository contactRepository){
//		this.contactRepository = contactRepository;
//	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Map<String,Object> map){
		List<Contact> contacts = contactRepository.findAll();
		map.put("contacts", contacts);
		return "home";
	}
	
	@RequestMapping(value="aaa",method=RequestMethod.POST)
	public String submit(Contact contact){
		contactRepository.save(contact);
		return "redirect:/";
	}*/
}
