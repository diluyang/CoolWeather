package com.zzw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dly.
 */

public class Suggestion {
    @SerializedName ("comf")
    public ComFort comFort;
    @SerializedName ("cw")
    public CarWash carWash;
    public Sport sport;
    public class ComFort{
        @SerializedName ("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName ("txt")
        public String info;
    }
    public class Sport{
        @SerializedName ("txt")
        public String info;
    }
}
