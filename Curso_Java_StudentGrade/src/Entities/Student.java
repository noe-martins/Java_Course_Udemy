package Entities;

public class Student {
	//Attributes
	private String name;
	private double firstTrimester, secondTrimester, thirdQuarter;
	
	//Special Methods
	public Student() {
		super();
		this.firstTrimester = 0;
		this.secondTrimester = 0;
		this.thirdQuarter = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFirstTrimester() {
		return firstTrimester;
	}
	public void setFirstTrimester(double firstTrimester) {
		if (firstTrimester >= 0 && firstTrimester <= 30.00) {
			this.firstTrimester = firstTrimester;
		} else {
		}
	}
	public double getSecondTrimester() {
		return secondTrimester;
	}
	public void setSecondTrimester(double secondTrimester) {
		if (secondTrimester >= 0 && secondTrimester <= 35.00) {
			this.secondTrimester = secondTrimester;
		} else {
		}
	}
	public double getThirdQuarter() {
		return thirdQuarter;
	}
	public void setThirdQuarter(double thirdQuarter) {
		if (thirdQuarter >= 0 && thirdQuarter <= 35.00) {
			this.thirdQuarter = thirdQuarter;
		} else {
		}
	}
	
	//Methods
	public double FinalGrade() {
		return (this.getFirstTrimester() + this.getSecondTrimester() + this.getThirdQuarter());
	}
	public String StudentStatus() {
		if (FinalGrade() >= 60.00) {
			return "PASS";
		} else {
			double missing = (60.00 - FinalGrade());
			return "FAILED\nMISSING " + String.format("%.2f", missing) + " POINTS";
		}
	}
	
}
