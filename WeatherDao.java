	package com.app.dao;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.springframework.stereotype.Service;
	
	import com.app.vo.WeatherVo;
	
	@Service
	public class WeatherDao {
	
		public List<WeatherVo> getWeatherList() {
			// TODO Auto-generated method stub
			List<WeatherVo>  obj=new ArrayList<WeatherVo>();
			WeatherVo vo=new WeatherVo();
			
			vo=new WeatherVo();
			vo.setsNo(1);
			vo.setCity("Cambell");
			vo.setCountry("CA");
			vo.setWeather("44C");
			obj.add(vo);
			
			
			
			
			vo=new WeatherVo();
			vo.setsNo(1);
			vo.setCity("Omaha");
			vo.setCountry("NE");
			vo.setWeather("36C");
			obj.add(vo);
			
			vo=new WeatherVo();
			vo.setsNo(2);
			vo.setCity("Austin");
			vo.setCountry("TX");
			vo.setWeather("31C");
			obj.add(vo);
			
			vo=new WeatherVo();
			vo.setsNo(3);
			vo.setCity("Niseko");
			vo.setCountry("Japan");
			vo.setWeather("38C");
			obj.add(vo);
			
			vo=new WeatherVo();
			vo.setsNo(3);
			vo.setCity("Nara");
			vo.setCountry("Japan");
			vo.setWeather("32C");
			obj.add(vo);
			
			vo=new WeatherVo();
			vo.setsNo(3);
			vo.setCity("Jakarta");
			vo.setCountry("Indonesia");
			vo.setWeather("46C");
			obj.add(vo);
			
			
			return obj;
		}
	
	}
