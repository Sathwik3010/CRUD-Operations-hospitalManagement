package model;

public class Patient {
	private int id;
	private String name;
	private double billAmount;

	public Patient() {
		super();
	}

	public Patient(int id, String name, double billAmount) {
		super();
		this.id = id;
		this.name = name;
		this.billAmount = billAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", billAmount=" + billAmount + "]";
	}
}
