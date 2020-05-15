package com.kcp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcp.command.StudentCommand;
import com.kcp.service.DownloadOperationsFiles;

@Controller
public class StudentProfileRegistractionController {
	@Resource
	private DownloadOperationsFiles service;

	@GetMapping("/upload.py")
	public String showForm(@ModelAttribute("upload_download") StudentCommand stdcmd) {
		return "uploadPage";
	}

	@PostMapping("/upload.py")
	public String uploadFrom(Map<String, Object> map, @ModelAttribute("upload_download") StudentCommand sCMD,
			BindingResult br, HttpServletRequest req) throws IOException {

		ServletContext sc = null;
		String location = null;
		InputStream pis = null, ris = null;
		OutputStream ros = null, pos = null;
		// get access to servletContext object
		sc = req.getServletContext();
		// read context parama value
		location = sc.getInitParameter("upload");
		File file = new File(location);
		if (!file.exists()) {
			file.mkdir();
		}
		// get name of the upload files
		String photo = sCMD.getPhoto().getOriginalFilename();
		String resume = sCMD.getResume().getOriginalFilename();
		// get inputstreams representing uploaded file content
		pis = sCMD.getPhoto().getInputStream();
		ris = sCMD.getResume().getInputStream();
		// create outputStreams pointing to destination file
		ros = new FileOutputStream(location + "/" + resume);
		pos = new FileOutputStream(location + "/" + photo);
		// complete file copy operation
		IOUtils.copy(ris, ros);
		IOUtils.copy(pis, pos);
		pis.close();
		ris.close();
		pos.close();
		ros.close();
		map.put("photo", photo);
		map.put("resume", resume);
		return "success_upload";

	}

	@GetMapping("/allFils.py")
	public String getUploadedFiles(Map<String, Object> map, HttpServletRequest req) {
		ServletContext sc = null;
		String uploadFileDir = null;
		// get access to servletContext object
		sc = req.getServletContext();
		// read context parama value
		uploadFileDir = sc.getInitParameter("upload");
		// use service
		List<String> listFiles = service.fetchFiles(uploadFileDir);
		map.put("allfils", listFiles);
		return "show_files";

	}

	@RequestMapping("/download.py")
	public String downloadFile(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// access Servlet Context object
		ServletContext sc = req.getServletContext();
		// read additional req param value to get the filename to be download
		String fName = req.getParameter("fileName");
		// locate the file
		File file = new File(sc.getInitParameter("upload") + "/" + fName);
		// get length of the file and make as response content length
		res.setContentLengthLong(file.length());
		// get the mime type of the file and make it as response content type
		String mimeType = sc.getMimeType(file.getAbsolutePath());
		res.setContentType(mimeType != null ? mimeType : "application/octet-stream");
		// get inputStream Pointing to the file
		InputStream is = new FileInputStream(file);
		// create outputStream pointing to response object
		OutputStream os = res.getOutputStream();
		// instruct to browser to make received output as download file
		res.addHeader("Content-Disposition", "attachment;filename=" + fName);
		// copy file content to response object
		IOUtils.copy(is, os);
		// close stream
		is.close();
		os.close();
		return null;

	}
}
