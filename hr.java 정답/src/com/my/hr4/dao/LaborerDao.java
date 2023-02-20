package com.my.hr4.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr4.domain.Laborer;

public interface LaborerDao {
	List<Laborer> selectLaborers();
	void insertLaborer(String laboerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int laborerId);
}