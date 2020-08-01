package emppack;

public class Employee
{
	private String name, desig;
	private double Salary;
	/**
	 * 
	 */
	/**
	 * 
	 */
	public Employee() {
		super();
		System.out.println("Inside Employee Default");
	}
	/**
	 * @param name
	 * @param desig
	 * @param salary
	 */
	public Employee(String name, String desig, double salary) {
		super();
		this.name = name;
		this.desig = desig;
		Salary = salary;
		
		System.out.println("Inside Employee param");
	}
	/**
	 * @return the name
	 */
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the desig
	 */
	public String getDesig() {
		return desig;
	}
	/**
	 * @param desig the desig to set
	 */
	public void setDesig(String desig) {
		this.desig = desig;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return Salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		Salary = salary;
	}
	
}
