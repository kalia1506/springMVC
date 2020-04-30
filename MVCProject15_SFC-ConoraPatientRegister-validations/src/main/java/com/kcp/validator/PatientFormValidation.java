package com.kcp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kcp.commandClass.PatientCMD;

@Component
public class PatientFormValidation implements Validator {
	public PatientFormValidation() {
		System.out.println("PatientFormValidation.PatientFormValidation()");
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(PatientCMD.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PatientCMD pcmd = null;
		pcmd = (PatientCMD) target;
		if (pcmd.getPName().isEmpty() || pcmd.getPName().equalsIgnoreCase("") || pcmd.getPName() == null) {
			errors.rejectValue("pName", "name");
		} else if (pcmd.getPName().length() < 5 || pcmd.getPName().length() > 18) {
			errors.rejectValue("pName", "name.length");
		}

		if (pcmd.getAge() == null) {
			errors.rejectValue("age", "age");
		} else if (pcmd.getAge() < 3 || pcmd.getAge() > 100) {
			errors.rejectValue("age", "age.range");
		}

		if (pcmd.getGender().isEmpty() || pcmd.getGender() == null || pcmd.getGender().equalsIgnoreCase("")) {
			errors.rejectValue("gender", "gender");
		} else if (pcmd.getGender().equals("male") && pcmd.getGender().equals("female")) {
			errors.rejectValue("gender", "gender.maleORfemale");
		}

		if (pcmd.getPhoneNo() == null) {
			errors.rejectValue("phoneNo", "mobile");
		} else if (pcmd.getPhoneNo() > 10) {
			errors.rejectValue("phoneNo", "mobile.length");
		}

		if (pcmd.getAddress().isEmpty() || pcmd.getAddress() == null || pcmd.getAddress().equalsIgnoreCase("")) {
			errors.rejectValue("address", "address");
		} else if (pcmd.getAddress().length() < 4 || pcmd.getAddress().length() > 10) {
			errors.rejectValue("address", "address.length");
		}

	}

}
