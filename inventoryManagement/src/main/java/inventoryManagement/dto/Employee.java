package inventoryManagement.dto;

public class Employee {
	private Long employeeId;
	private String employeeName;
	private Integer salary;
	private String jobTitle;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Long employeeId, String employeeName, Integer salary, String jobTitle) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", jobTitle=" + jobTitle + "]";
	}

}
