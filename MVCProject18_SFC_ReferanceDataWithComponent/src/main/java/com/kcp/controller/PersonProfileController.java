package com.kcp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kcp.command.PersonCommand;

@Controller
//@SessionAttributes(value = "personDetails")
public class PersonProfileController {
	@ModelAttribute("genderList")
	public List<String> getGenders() {
		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");
		return genderList;
	}
	@ModelAttribute("hobiesList")
	public List<String> getHobies() {
		List<String> hobiesList = new ArrayList<String>();
		hobiesList.add("Cricket");
		hobiesList.add("Photography ");
		hobiesList.add("Gardening");
		hobiesList.add(" Cooking ");
		hobiesList.add("Writing");
		hobiesList.add("Learning");
		return hobiesList;
	}
	@ModelAttribute("coursesList")
	public List<String> getCourses() {
		List<String> coursesList = new ArrayList<String>();
		coursesList.add("Java");
		coursesList.add("Angular");
		coursesList.add("python");
		coursesList.add("UI");
		coursesList.add("Dot Net");
		coursesList.add("RectJs");
		coursesList.add("ReactNative");
		return coursesList;
	}
	@ModelAttribute("qulfyList")
	public List<String> getqulfy() {
		List<String> qulfyList = new ArrayList<String>();
		qulfyList.add("MCA");
		qulfyList.add("BCA");
		qulfyList.add("B.Sc");
		qulfyList.add("MBA");
		qulfyList.add("MBBS");
		qulfyList.add("B.Tech");
		qulfyList.add("MFC");
		return qulfyList;
	}
	
	 @GetMapping("/home.py")
	public String showProfileForm(@ModelAttribute("personDetails") PersonCommand pCMD) {
		return "personRegister";
	}
}
