package com.util;

import java.util.ArrayList;

public class Container {

	public static ArrayList<Object[]> getEmpAnalyseDataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			new ExcelUtility("./src/main/java/com/testdata/NewiQaptureData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int rowNum = 2; rowNum <= ExcelUtility.getRowCount("capture"); rowNum++) {
			String searchItem = ExcelUtility.getCellData("capture", "searchItem", rowNum);
			String empNo = ExcelUtility.getCellData("capture", "empNo", rowNum);
			String empName = ExcelUtility.getCellData("capture", "empName", rowNum);
			String cityNo = ExcelUtility.getCellData("capture", "cityNo", rowNum);
			String empFee = ExcelUtility.getCellData("capture", "empFee", rowNum);
			String empFormFee = ExcelUtility.getCellData("capture", "empFormFee", rowNum);
			String empRegFee = ExcelUtility.getCellData("capture", "empRegFee", rowNum);
			String sscPercentage = ExcelUtility.getCellData("capture", "sscPercentage", rowNum);
			String interPercentage = ExcelUtility.getCellData("capture", "interPercentage", rowNum);
			String graduationPercentage = ExcelUtility.getCellData("capture", "graduationPercentage", rowNum);
			String mastersPercentage = ExcelUtility.getCellData("capture", "mastersPercentage", rowNum);
			String qualification = ExcelUtility.getCellData("capture", "qualification", rowNum);
			
			String joiningYear = ExcelUtility.getCellData("capture", "joiningYear", rowNum);
			String joiningMonth = ExcelUtility.getCellData("capture", "joiningMonth", rowNum);
			String joiningDate = ExcelUtility.getCellData("capture", "joiningDate", rowNum);
			String exitYear = ExcelUtility.getCellData("capture", "exitYear", rowNum);
			String exitMonth = ExcelUtility.getCellData("capture", "exitMonth", rowNum);
			String exitDate = ExcelUtility.getCellData("capture", "exitDate", rowNum);
			
			String companyEnvironment = ExcelUtility.getCellData("capture", "companyEnvironment", rowNum);
			String salaryIncrement = ExcelUtility.getCellData("capture", "salaryIncrement", rowNum);
			String overAll = ExcelUtility.getCellData("capture", "overAll", rowNum);
			String ddSelect = ExcelUtility.getCellData("capture", "ddSelect", rowNum);
			String yesNoNa = ExcelUtility.getCellData("capture", "yesNoNa", rowNum);
			String checkBox1 = ExcelUtility.getCellData("capture", "checkBox1", rowNum);
			String checkBox2 = ExcelUtility.getCellData("capture", "checkBox2", rowNum);
			String checkBoxQ2 = ExcelUtility.getCellData("capture", "checkBoxQ2", rowNum);
			
			Object ob[] = {searchItem, empNo, empName, cityNo, empFee, empFormFee, empRegFee, 
					sscPercentage, interPercentage, graduationPercentage, mastersPercentage, qualification,
					joiningYear, joiningMonth, joiningDate, exitYear, exitMonth, exitDate,
					companyEnvironment, salaryIncrement, overAll, ddSelect, yesNoNa, checkBox1, checkBox2, checkBoxQ2};
			myData.add(ob);
		}
		return myData;
	}
	
	
	
}
