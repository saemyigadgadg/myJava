package com.my.hr4;

import java.util.ArrayList;
import java.util.List;

import com.my.hr4.dao.LaborerDao;
import com.my.hr4.dao.LaborerDaoImpl;
import com.my.hr4.domain.Laborer;
import com.my.hr4.presentation.Console;
import com.my.hr4.presentation.LaborerIo;
import com.my.hr4.service.LaborerService;
import com.my.hr4.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
		Console.info("end.");
	}
}
