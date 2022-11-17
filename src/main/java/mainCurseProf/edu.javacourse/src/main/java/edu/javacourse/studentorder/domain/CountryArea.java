package edu.javacourse.studentorder.domain;

public class CountryArea {

    private String AreaId;
    private String areaName;

    public CountryArea() {
    }

    public CountryArea(String areaId, String areaName) {
        AreaId = areaId;
        this.areaName = areaName;
    }

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String areaId) {
        AreaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
