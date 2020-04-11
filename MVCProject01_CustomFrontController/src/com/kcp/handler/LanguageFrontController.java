package com.kcp.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LanguageFrontController implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Locale[] locale=null;
		List<String> langList=null;
		locale=Locale.getAvailableLocales();
		langList=new ArrayList<String>();
		for (Locale lang : locale) {
			langList.add(lang.getDisplayLanguage());
		}
		req.setAttribute("show_lang", langList);
		return"language";
		
	}

}
