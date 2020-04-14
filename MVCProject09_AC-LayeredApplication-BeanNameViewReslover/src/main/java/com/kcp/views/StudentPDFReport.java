package com.kcp.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.kcp.dto.StudentDTO;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class StudentPDFReport extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Paragraph paragraph = null;
		PdfPTable table = null;
		// get data model which is passed by the Spring container
		List<StudentDTO> listDTO = (List<StudentDTO>) model.get("resultList");
		paragraph = new Paragraph(Font.BOLDITALIC, "Student PDF report");
		paragraph.setAlignment(100);
		document.add(paragraph);
		// create columns
		table = new PdfPTable(6);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		table.addCell("Name");
		table.addCell("Roll No.");
		table.addCell("Address");
		table.addCell("Total Mark");
		table.addCell("Average Mark");
		table.addCell("Result");
			 for (StudentDTO dto : listDTO) {
				table.addCell(dto.getName());
				table.addCell(String.valueOf(dto.getRollNo()));
				table.addCell(dto.getAddress());
				table.addCell(String.valueOf(dto.getTotalMark()));
				table.addCell(String.valueOf(dto.getAvgMark()));
				table.addCell(dto.getResult());
			}
			 document.add(table);
	}

}
