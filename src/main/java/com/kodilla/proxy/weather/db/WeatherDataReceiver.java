package com.kodilla.proxy.weather.db;



public class WeatherDataReceiver implements DbDataRetriever {
    @Override
    public String getWeather(){
        return "good";
    }

    public void refreshData() throws InterruptedException{
        Thread.sleep(5000);
    }

    public WeatherDataReceiver()throws InterruptedException{
        refreshData();
    }
}
