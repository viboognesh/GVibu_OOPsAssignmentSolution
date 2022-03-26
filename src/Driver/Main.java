package Driver;

import departments.*;

public class Main {

	public static void main(String[] args) {
		Admin_Department admdep = new Admin_Department();
		System.out.println("Welcome to " + admdep.departmentName());
		System.out.println(admdep.getTodaysWork());
		System.out.println(admdep.getWorkDeadline());
		System.out.println(admdep.isTodayAHoliday());
		System.out.println();
		
		HR_Department hrdep = new HR_Department();
		System.out.println("Welcome to " + hrdep.departmentName());
		System.out.println(hrdep.doActivity());
		System.out.println(hrdep.getTodaysWork());
		System.out.println(hrdep.getWorkDeadline());
		System.out.println(hrdep.isTodayAHoliday());
		System.out.println();
		
		Tech_Department techdep = new Tech_Department();
		System.out.println("Welcome to " + techdep.departmentName());
		System.out.println(techdep.getTodaysWork());
		System.out.println(techdep.getWorkDeadline());
		System.out.println(techdep.getTechStackInformation());
		System.out.println(techdep.isTodayAHoliday());
		System.out.println();
		
		

	}

}
