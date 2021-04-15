package p2;

public class EmployeeService {
	private String employees[] = {"1010010","102001","1030020","1040030","1050020","1060020"};
	

	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}
		
		return codes;
	}
	
	public String[] getCityCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(6,9);
		}
		
		return codes;
	}
}
