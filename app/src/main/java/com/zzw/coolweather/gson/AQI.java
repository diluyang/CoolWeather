package com.zzw.coolweather.gson;

/**
 * Created by dly.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
