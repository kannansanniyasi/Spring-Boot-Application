package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.WeatherDao;
import com.app.vo.WeatherVo;

@RestController
@RequestMapping("/weather")
public class Weather {
	
	@Autowired
	WeatherDao weatherDao;
	
	@RequestMapping("/message")
	public String sayApplication()
	{
		return "Spring Boot Application";
	}
	
	@RequestMapping("/weatherDetails")
	public List<WeatherVo> getWeatherDetails()
	{
		return weatherDao.getWeatherList();
	}
}
