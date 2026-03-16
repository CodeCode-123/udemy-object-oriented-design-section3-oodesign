package com.code.design.section3_oodesign.assignment1_single_responsibility_principle.reporting;

public class ReportFormatter {
	String formatteredOutput;
	
	public ReportFormatter(Object object, FormatType formatType) {
		switch(formatType) {
		case XML:
			formatteredOutput = convertObjectToXML(object);
			break;
		case CSV:
			formatteredOutput = convertObjectToCSV(object);
			break;
		}
	}
	private String convertObjectToXML(Object object) {
		return "XML : <title>" + object.toString() + "</title>";
	}
	private String convertObjectToCSV(Object object) {
		return "CSV : ,,, " + object.toString() + ",,,,";
	}
	protected String getFormatteredValue() {
		return formatteredOutput;
	}

}
