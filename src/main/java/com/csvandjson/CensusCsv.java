package com.csvandjson;

public class CensusCsv {
    private String state;
    private  String population;
    private  String AreaInSqKm;
    private  String DensityPerSqKm;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getAreaInSqKm() {
        return AreaInSqKm;
    }

    public void setAreaInSqKm(String areaInSqKm) {
        AreaInSqKm = areaInSqKm;
    }

    public String getDensityPerSqKm() {
        return DensityPerSqKm;
    }

    public void setDensityPerSqKm(String densityPerSqKm) {
        DensityPerSqKm = densityPerSqKm;
    }
}
