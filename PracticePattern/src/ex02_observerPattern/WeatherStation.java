﻿package ex02_observerPattern;

import ex02_observerPattern.InterfaceObj.*;

public class WeatherStation {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
