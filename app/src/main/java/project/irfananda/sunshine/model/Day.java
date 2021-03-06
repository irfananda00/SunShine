package project.irfananda.sunshine.model;

import java.util.List;

/**
 * Created by irfananda on 02/04/16.
 */
public class Day {

    /**
     * dt : 1459591200
     * temp : {"day":6.47,"min":-1,"max":9.67,"night":4.58,"eve":9.67,"morn":-1}
     * pressure : 1029.28
     * humidity : 100
     * weather : [{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}]
     * speed : 2.01
     * deg : 217
     * clouds : 0
     */

    private int dt;
    /**
     * day : 6.47
     * min : -1
     * max : 9.67
     * night : 4.58
     * eve : 9.67
     * morn : -1
     */

    private TempBean temp;
    private double pressure;
    private int humidity;
    private double speed;
    private int deg;
    private int clouds;
    private String weekDay;

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    /**
     * id : 800
     * main : Clear
     * description : clear sky
     * icon : 01d
     */



    private List<WeatherBean> weather;

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public TempBean getTemp() {
        return temp;
    }

    public void setTemp(TempBean temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public List<WeatherBean> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherBean> weather) {
        this.weather = weather;
    }

    public static class TempBean {
        private double day;
        private double min;
        private double max;
        private double night;
        private double eve;
        private double morn;

        public double getDay() {
            return day;
        }

        public void setDay(double day) {
            this.day = day;
        }

        public double getMin() {
            return min;
        }

        public void setMin(double min) {
            this.min = min;
        }

        public double getMax() {
            return max;
        }

        public void setMax(double max) {
            this.max = max;
        }

        public double getNight() {
            return night;
        }

        public void setNight(double night) {
            this.night = night;
        }

        public double getEve() {
            return eve;
        }

        public void setEve(double eve) {
            this.eve = eve;
        }

        public double getMorn() {
            return morn;
        }

        public void setMorn(double morn) {
            this.morn = morn;
        }
    }

    public static class WeatherBean {
        private int id;
        private String main;
        private String description;
        private String icon;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
