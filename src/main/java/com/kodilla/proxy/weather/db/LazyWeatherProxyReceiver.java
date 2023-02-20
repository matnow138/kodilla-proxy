package com.kodilla.proxy.weather.db;

public class LazyWeatherProxyReceiver implements DbDataRetriever{

    private WeatherDataReceiver weatherDataReceiver;

    @Override
    public String getWeather() throws InterruptedException{
        return "very good";
    }

    @Override
    public void refreshData() throws InterruptedException {
        Thread.sleep(5000);
    }
}
