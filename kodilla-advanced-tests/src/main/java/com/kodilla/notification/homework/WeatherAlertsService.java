package com.kodilla.notification.homework;

import java.util.*;

public class WeatherAlertsService {

    HashMap<User, Set<Location>> weatherAlertsSubscribers = new HashMap<>();

    public void subscribeLocation(User user, Location location) {
        Set<Location> locations = weatherAlertsSubscribers.getOrDefault(user, new HashSet<>());
        locations.add(location);
        weatherAlertsSubscribers.put(user, locations);
    }

    public void sendGeneralInformation() {

        weatherAlertsSubscribers.forEach((user, locations) -> user.receiveGeneralInfo());
    }

    public void sendWeatherAlertAccordingToLocation(Location location) {

        for (Map.Entry<User, Set<Location>> weatherAlertsSubscribersEntry : weatherAlertsSubscribers.entrySet()) {
            weatherAlertsSubscribersEntry
                    .getValue()
                    .stream().filter(subscribedLocation -> subscribedLocation.equals(location))
                    .forEach(subLoc -> weatherAlertsSubscribersEntry.getKey().receiveWeatherAlert());
        }
    }

    public void unsubscribeTheParticularLocation(User user, Location location) {

        for (Map.Entry<User, Set<Location>> weatherAlertsSubscribersEntry : weatherAlertsSubscribers.entrySet()) {
            if (weatherAlertsSubscribersEntry.getKey().equals(user)) {
                Location locationToBeRemoved = weatherAlertsSubscribersEntry.getValue()
                        .stream()
                        .filter(subscribedLocation -> subscribedLocation.equals(location))
                        .findFirst()
                        .get();
                Set<Location> locations = weatherAlertsSubscribers.getOrDefault(user, new HashSet<>());
                locations.remove(locationToBeRemoved);
            }
        }
    }

    public void unsubscribeAllLocations(User user) {

        Set<Location> locations = weatherAlertsSubscribers.getOrDefault(user, new HashSet<>());

        for (Map.Entry<User, Set<Location>> weatherAlertsSubscribersEntry : weatherAlertsSubscribers.entrySet()) {
            if (weatherAlertsSubscribersEntry.getKey().equals(user)) {
                weatherAlertsSubscribersEntry.getValue().removeAll(locations);
            }
        }

    }

    public void removeTheLocation(Location location) {

        for (Map.Entry<User, Set<Location>> weatherAlertsSubscribersEntry : weatherAlertsSubscribers.entrySet()) {
            Set<Location> locations = weatherAlertsSubscribersEntry.getValue();
            locations.removeIf(subscribedLocation -> subscribedLocation.equals(location));
        }
    }
}