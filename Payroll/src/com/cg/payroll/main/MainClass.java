package com.cg.payroll.main;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.Bank;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {

	public static void main(String[] args) {
		//try	{
			PayrollServices payrollServices= new PayrollServicesImpl();
			Associate associate1 = new Associate (80000,"Ashish","Sharma","Software Associate","Con","HAEADF645","ashish.sharma@gmail.com",Salary(50000,1000,1000),Bank(452156542,"ICICI","ICICI51565"));
			System.out.println(associate1);
			int associateId=payrollServices.acceptAssociateDetails(new Associate());
			
			System.out.println("Associate Id:- "+associateId);
			Associate associate = payrollServices.getAssociateDetails(associateId);
			System.out.println(associate);
			//} catch(AssociateDetailsNotFoundException e) {
			//	e.printStackTrace();
				
			//}
		

	}

	private static Bank Bank(int i, String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Salary Salary(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

} 
