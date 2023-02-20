package com.my.hr2.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr2.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaborers();
	void addLaborer(String laborerId, LocalDate hireDate);
	void fixLaborer(Laborer laborer);
	void delLaborer(int laborerId);
}
