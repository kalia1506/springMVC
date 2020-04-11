package com.kcp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kcp.handler.CountryFrontController;
import com.kcp.handler.Handler;
import com.kcp.handler.LanguageFrontController;

//@WebServlet("/customurl")
public class CustomFrontController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = null, target = null;
		Handler handler = null;
		String logicalViewName = null;
		RequestDispatcher rd = null;
		path = req.getServletPath();
		System.out.println(path);
		if (path.equalsIgnoreCase("/language.do")) {
			handler = new LanguageFrontController();
		} else if (path.equalsIgnoreCase("/country.do")) {
			handler = new CountryFrontController();
		} else {
			throw new IllegalArgumentException("invalid URL provide");
		}

		try {
			logicalViewName = handler.handle(req, res);
			System.out.println(logicalViewName);
			if (logicalViewName.equalsIgnoreCase("language")) {
				target = "/show_language.jsp";
			} else if (logicalViewName.equalsIgnoreCase("countries")) {
				target = "/show_countries.jsp";
			} else {
				throw new IllegalArgumentException("invalid logical name");
			}
			rd = req.getRequestDispatcher(target);
			rd.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
