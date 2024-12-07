package com.dateapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {

        Set<String> allZones = ZoneId.getAvailableZoneIds();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        allZones.stream()
                .filter(zone -> zone.contains("Europe"))
                .forEach(zone -> {
                    ZoneId zoneId = ZoneId.of(zone);
                    ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
                    System.out.println(zone + ": " + formatter.format(zonedDateTime));
                });
    }
}
