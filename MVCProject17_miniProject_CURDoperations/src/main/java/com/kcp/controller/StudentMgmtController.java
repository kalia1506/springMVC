package com.kcp.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kcp.command.Studentcmd;
import com.kcp.dto.StudentDTO;
import com.kcp.service.StudentService;

@Controller
@SessionAttributes("StdCmd")
public class StudentMgmtController {
	@Autowired
	private StudentService service;

	@ModelAttribute("StdCmd")
	public Studentcmd getSessionAttributes() {
		return new Studentcmd();

	}

	@RequestMapping("/home.py")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/liststudent.py")
	public String getAllstudent(Map<String, Object> map) {
		System.out.println("StudentMgmtController.getAllstudent()");
		List<StudentDTO> listDTO = service.fatchStudent();
		map.put("resultList", listDTO);
		return "StudentList";

	}

	// update operation logic
	@GetMapping("/update.py")
	public String showStdUpadatePage(@RequestParam("eno") Integer eno, @ModelAttribute("StdCmd") Studentcmd stdCMD) {
		System.out.println("StudentMgmtController.showStdUpadatePage()");
		StudentDTO dto = service.FatchStudentbyRNO(eno);
		BeanUtils.copyProperties(dto, stdCMD);
		return "student_update_form";

	}

	@PostMapping("/update.py")
	public String updatestudentForm(HttpSession session, @ModelAttribute("StdCmd") Studentcmd sCMD, BindingResult br) {
		System.out.println("StudentMgmtController.updatestudentForm()");
		System.out.println(sCMD.toString());
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(sCMD, dto);
		String msg = service.fatchUpdateStudentbyRNO(dto);
		List<StudentDTO> listDTO = service.fatchStudent();
		session.setAttribute("Msg", msg);
		session.setAttribute("resultList", listDTO);
		return "StudentList";
	}

	// delete student
	@GetMapping("/delete.py")
	public String deleteStudent(@RequestParam("eno") Integer rno, HttpSession session,
			@ModelAttribute("StdCmd") Studentcmd sCMD, BindingResult br) {
		System.out.println("StudentMgmtController.deleteStudent()");
		String msg = service.removeStudentByRNO(rno);
		List<StudentDTO> listDTO = service.fatchStudent();
		session.setAttribute("Msg", msg);
		session.setAttribute("resultList", listDTO);
		return "StudentList";
	}

	// insert operation
	@GetMapping(value = "/registerPage.py")
	public String initialStudentPage(@ModelAttribute("StdCmd") Studentcmd StdCmd, BindingResult br) {
		System.out.println(StdCmd.toString());
		return "Student_register";
	}

	@PostMapping(value = "/registerPage.py")
	public String submitStudentPage(Map<String,Object> map, @ModelAttribute("StdCmd") Studentcmd StdCmd,
			BindingResult br) {
		System.out.println("StudentMgmtController.submitStudentPage()");
		System.out.println(StdCmd.toString());
		StudentDTO dto = null;
		dto = new StudentDTO();
		BeanUtils.copyProperties(StdCmd, dto);
		String msg = service.fatchStudent(dto);
		map.put("insertMsg", msg);
		return "Student_register";
	}
}
