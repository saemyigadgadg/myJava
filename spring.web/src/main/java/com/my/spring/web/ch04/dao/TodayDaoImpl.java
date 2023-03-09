package com.my.spring.web.ch04.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.spring.web.ch04.dao.map.TodayMap;

@Repository
public class TodayDaoImpl implements TodayDao {
	@Autowired private TodayMap todayMap;
	
	@Override
	public LocalDate selectToday() {
		return todayMap.selectToday();
	}
}
/*
@Repository
해당 클래스를 루트 컨테이너에 빈(Bean) 
객체로 생성해주는 어노테이션이다.
*/