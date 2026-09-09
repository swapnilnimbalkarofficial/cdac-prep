package Day3;

public class PermenantEmployee extends Employee {
	private float da,hra;

	public PermenantEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PermenantEmployee(int empNo, String name, float basicSalary, float da, float hra) {
		super(empNo, name, basicSalary);
		this.da = da;
		this.hra = hra;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	@Override
	public float processSalary() {
		float finalsalary=getBasicSalary()+da+hra;
		return finalsalary;
	}

}
