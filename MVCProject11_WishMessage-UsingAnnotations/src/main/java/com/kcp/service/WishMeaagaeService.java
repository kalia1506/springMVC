package com.kcp.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service("wish")
public class WishMeaagaeService {
	public String getWishMeaasge(String userName) {
		String WishMsg = null;
		Calendar calendar = Calendar.getInstance();
		int hr = calendar.get(Calendar.HOUR_OF_DAY);
		if (hr <= 12) {
			WishMsg = "good morning "+userName;
		} else if (hr <= 16) {
			WishMsg = "good afternoon "+userName;
		} else if (hr <= 20) {
			WishMsg = "good evning "+userName;
		} else {
			WishMsg = "good night "+userName;
		}
		return WishMsg;
	}
}
