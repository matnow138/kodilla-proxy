package com.kodilla.proxy.weather.db;

public interface DbDataRetriever {
    String getWeather() throws InterruptedException;
    void refreshData() throws InterruptedException;

}
