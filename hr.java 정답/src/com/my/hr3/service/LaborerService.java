package com.my.hr3.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr3.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaborers();
	void addLaborer(String laborerName, LocalDate hireDate);
	void fixLaborer(Laborer laborer);
	void delLaborer(int laborerId);
}
