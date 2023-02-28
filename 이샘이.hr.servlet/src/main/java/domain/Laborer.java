package domain;

import java.time.LocalDate;

public class Laborer {
	private int laborerId;
	private String laborerName;
	private LocalDate hireDate;
	
	public Laborer(int laborerId, String laborerName, LocalDate hireDate) {
		this.laborerId = laborerId;
		this.laborerName = laborerName;
		this.hireDate = hireDate;
	}

	public int getLaborerId() {
		return laborerId;
	}

	public void setLaborerId(int laborerId) {
		this.laborerId = laborerId;
	}

	public String getLaborerName() {
		return laborerName;
	}

	public void setLaborerName(String laborerName) {
		this.laborerName = laborerName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
}