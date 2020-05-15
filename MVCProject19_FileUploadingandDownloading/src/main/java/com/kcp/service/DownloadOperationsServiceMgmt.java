package com.kcp.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DownloadOperationsServiceMgmt implements DownloadOperationsFiles {

	@Override
	public List<String> fetchFiles(String uploadDir) {
		File uplfile = null;
		File[] file = null;
		List<String> filesList = null;
		// get all files names form uploaded folder store
		uplfile = new File(uploadDir);
		file = uplfile.listFiles();
		filesList = new ArrayList<String>();
		for (File f : file) {
			if (!f.isDirectory()) {
				filesList.add(f.getName());
			}
		}
		return filesList;
	}

}
