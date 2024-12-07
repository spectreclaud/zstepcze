package com.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main03 {
    public static void main(String[] args) {
        Map<String, LocalTime> timeZonesMap = getMapTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        timeZonesMap.forEach((zone, time) -> System.out.println(zone + ": " + time.format(formatter)));
    }

    public static Map<String, LocalTime> getMapTime() {
        Set<String> allZones = ZoneId.getAvailableZoneIds();

        return allZones.stream()
                .collect(Collectors.toMap(
                        zone -> zone,
                        zone -> LocalTime.now(ZoneId.of(zone))
                ));
    }
}
