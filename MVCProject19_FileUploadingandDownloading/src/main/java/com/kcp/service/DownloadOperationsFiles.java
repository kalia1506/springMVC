package com.kcp.service;

import java.util.List;

public interface DownloadOperationsFiles {
	List<String> fetchFiles(String uploadDir);
}
