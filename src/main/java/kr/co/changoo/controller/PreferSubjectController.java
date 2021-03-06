package kr.co.changoo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.changoo.model.PreferSubject;
import kr.co.changoo.service.PreferSubjectService;

@Controller
public class PreferSubjectController {

	private PreferSubjectService preferSubjectService;

	@Autowired
	public void setPreferSubjectService(PreferSubjectService preferSubjectService) {
		this.preferSubjectService = preferSubjectService;
	}

	public PreferSubjectService getPreferSubjectService() {
		return preferSubjectService;
	}

	@RequestMapping(value = "/createPreferSubject")
	public String addPreferSubject(Model model) {
		model.addAttribute("preferSubject", new PreferSubject());
		return "createPreferSubject";
	}

	@RequestMapping(value = "/doCreatePreferSubject")
	public String addPreferSubejct(Model model, @Valid PreferSubject preferSubject, BindingResult result) {
		if (result.hasErrors()) {
			return "createPreferSubject";
		}

		preferSubjectService.insert(preferSubject);

		return "createdPreferSubject";
	}
	
	@RequestMapping(value ="/showPreferSubjects")
	public String showPreferSubjects(Model model){
		List<PreferSubject> prefersubjects=preferSubjectService.getPreferSubjects();
		model.addAttribute("prefersubjects",prefersubjects);
		return "showPreferSubjects";
	}

}
