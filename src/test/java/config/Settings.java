package config;

import lombok.Data;

@Data
public class Settings {
    private String browser;
    private String searchQuery;
    private String searchQueryNoResult;
    private int waitTime;
    private int sleepTime;



}
