package otherchallenges.code.classes;

public class Employee {
	
	String name;
	double wage;
	String cargo;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setLiquidWage() {
		
		double discounts = 100;
		
		System.out.printf("Your liquid wage is: %.1f\n", wage -= discounts);
		
	}

}
