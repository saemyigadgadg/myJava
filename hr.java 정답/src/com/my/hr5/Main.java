package com.my.hr5;

import java.util.ArrayList;
import java.util.List;

import com.my.hr5.dao.LaborerDao;
import com.my.hr5.dao.LaborerDaoImpl;
import com.my.hr5.domain.Laborer;
import com.my.hr5.presentation.Console;
import com.my.hr5.presentation.LaborerIo;
import com.my.hr5.service.LaborerService;
import com.my.hr5.service.LaborerServiceImpl;

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
