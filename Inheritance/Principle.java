
public class Principle extends Person{
private double salary;



public Principle (){
	super();
	this.setsalary(0.0);
	
	
}
public Principle (String name, double salary) {
	super(name);
	this.setsalary(salary);
}
private void setsalary(double salary) {
	this.salary = salary;
}
public double getsalary() {
	return this.salary;
}

public String toString() {
	return super.toString() + "- $" + this.getsalary() + " Yearly";
}

}
