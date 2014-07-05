package rml.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import rml.model.MUser;
import rml.service.MUserServiceI;

@Controller
@RequestMapping("/muserController")
public class MUserController {

	private MUserServiceI muserService;

	public MUserServiceI getMuserService() {
		return muserService;
	}

	@Autowired
	public void setMuserService(MUserServiceI muserService) {
		this.muserService = muserService;
	}
	
	@RequestMapping(value="/listUser")
	public String listUser(HttpServletRequest request) {
		
		List <MUser> list = muserService.getAll();
		request.setAttribute("userlist", list);
		return "listUser";
	}
	
	@RequestMapping(value="/addUser")
	public String addUser(MUser muser) {
			
		String id = UUID.randomUUID().toString();
		muser.setId(id);
		muserService.insert(muser);
		return "redirect:/muserController/listUser.do";
	}
	
	@RequestMapping(value="/deleteUser")
	public String deleteUser(String id) {
		
		muserService.delete(id);
		return "redirect:/muserController/listUser.do";
	}
	
	@RequestMapping(value="/updateUserUI")
	public String updateUserUI(String id, HttpServletRequest request) {
		
		MUser muser = muserService.selectByPrimaryKey(id);
		request.setAttribute("user", muser);
		return "updateUser";
	}

	@RequestMapping(value="/updateUser")
	public String updateUser(MUser muser) {
		
		muserService.update(muser);
		return "redirect:/muserController/listUser.do";
	}
}
