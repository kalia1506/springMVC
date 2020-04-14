package com.kcp.views;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.kcp.dto.StudentDTO;

public class StudentXLSReport extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Sheet sheet = null;
		int rowCount = 1;
		// get data model which is passed by the Spring container
		List<StudentDTO> listDTO = (List<StudentDTO>) model.get("resultList");
		// create a new Excel sheet
		sheet = workbook.createSheet("Student Result Sheet");
		// create style for header cells
		// Font font=workbook.createFont();
		// create header row and name
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Name");
		row.createCell(1).setCellValue("Roll Number");
		row.createCell(2).setCellValue("Address");
		row.createCell(3).setCellValue("Total Mark");
		row.createCell(4).setCellValue("Result");
		row.createCell(5).setCellValue("Average Mark");
		for (StudentDTO dto : listDTO) {
			Row arow = sheet.createRow(rowCount);
			arow.createCell(0).setCellValue(dto.getName());
			arow.createCell(1).setCellValue(dto.getRollNo());
			arow.createCell(2).setCellValue(dto.getAddress());
			arow.createCell(3).setCellValue(dto.getTotalMark());
			arow.createCell(4).setCellValue(dto.getResult());
			arow.createCell(5).setCellValue(dto.getAvgMark());
			rowCount++;
		}

	}
}
