package com.kcpit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;
@Service
public class FatchLanguagesServiceImpl implements FatchLanguagesService {

	@Override
	public List<String> getAllLanguages() throws Exception {
		Locale locales[]=null;
		List<String> langList=null;
		//get all Locales
		locales=Locale.getAvailableLocales();
		langList=new ArrayList<String>();
		for (Locale loc : locales) {
			langList.add(loc.getDisplayLanguage());
		}
		return langList;
	}

}
