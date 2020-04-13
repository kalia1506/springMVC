package com.kcp.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.kcp.service.WishMeaagaeService;

public class WishMessageFrontController extends AbstractController {
	private WishMeaagaeService wmsg;

	public WishMessageFrontController(WishMeaagaeService wmsg) {
		this.wmsg = wmsg;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String WishMsg = null;
		WishMsg=wmsg.getWishMeaasge("kalu");
		return new ModelAndView("result", "message", WishMsg);

	}
}
