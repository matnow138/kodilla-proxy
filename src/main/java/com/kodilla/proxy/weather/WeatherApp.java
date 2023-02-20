package com.kodilla.proxy.weather;

import com.kodilla.proxy.weather.db.DbDataRetriever;
import com.kodilla.proxy.weather.db.LazyWeatherProxyReceiver;
import com.kodilla.proxy.weather.db.WeatherDataReceiver;

import java.util.Random;

public class WeatherApp {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            DbDataRetriever dbDataRetriever = new WeatherDataReceiver();
            int number = new Random().nextInt(100);
            if (number < 20) {
                dbDataRetriever.refreshData();
            } else {
                System.out.println(dbDataRetriever.getWeather());
            }
            System.out.println("Executeion #" + i + " just finished");
        }

        long end = System.currentTimeMillis();

        System.out.println("The execution took:" + (end - begin) + " [ms]");

        begin = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            DbDataRetriever dbDataRetriever = new LazyWeatherProxyReceiver();
            int number = new Random().nextInt(100);
            if (number < 20) {
                dbDataRetriever.refreshData();
            } else {
                System.out.println(dbDataRetriever.getWeather());
            }
            System.out.println("Executeion #" + i + " just finished");



        }
        end = System.currentTimeMillis();

        System.out.println("The execution took:" + (end - begin) + " [ms]");
    }
}
