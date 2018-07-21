package study.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JSONPropertyClass {

    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("statusMessage")
    private String statusMessage;

    @JsonProperty("ipAddress")
    private String ip;

    @JsonProperty("countryCode")
    private String countryCode;

    @JsonProperty("countryName")
    private String countryName;

    @JsonProperty("regionName")
    private String region;

    @JsonProperty("cityName")
    private String city;

    @JsonProperty("zipCode")
    private String zipCode;

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("longtitude")
    private String longtitude;

    @JsonProperty("timeZone")
    private String timeZone;

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getIp() {
        return ip;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public String getTimeZone() {
        return timeZone;
    }
}
