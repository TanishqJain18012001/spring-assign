package collections;
import java.util.*;

public class Emp {

	private String empName;
	private Map<String,String> empCourses;

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Map<String, String> getempCourses() {
		return empCourses;
	}
	public void setempCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	
	public Emp(String empName,Map<String, String> empCourses) {
		super();
		this.empName = empName;
		this.empCourses = empCourses;
	}
	
	public Emp() {
		super();
	}
	
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empCourses=" + empCourses + "]";
	}	
}
