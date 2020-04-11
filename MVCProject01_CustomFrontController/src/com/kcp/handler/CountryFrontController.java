package com.kcp.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CountryFrontController implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Locale[] locale=null;
		List<String> countList=null;
		locale=Locale.getAvailableLocales();
		countList=new ArrayList<String>();
		for(Locale cont:locale) {
			countList.add(cont.getDisplayCountry());
		}
		req.setAttribute("show_county", countList);
		return"countries";
	}
}
