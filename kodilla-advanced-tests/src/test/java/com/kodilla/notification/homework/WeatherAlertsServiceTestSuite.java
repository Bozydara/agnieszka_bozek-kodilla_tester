package com.kodilla.notification.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertsServiceTestSuite {

    WeatherAlertsService weatherAlertsService = new WeatherAlertsService();

    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    User user4 = Mockito.mock(User.class);

    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);
    Location location4 = Mockito.mock(Location.class);
    Location location5 = Mockito.mock(Location.class);
    Location location6 = Mockito.mock(Location.class);

    @BeforeEach

    public void setUpSubscriptions() {

        weatherAlertsService.subscribeLocation(user1, location1);
        weatherAlertsService.subscribeLocation(user1, location2);
        weatherAlertsService.subscribeLocation(user1, location3);

        weatherAlertsService.subscribeLocation(user2, location3);
        weatherAlertsService.subscribeLocation(user2, location4);

        weatherAlertsService.subscribeLocation(user3, location5);

        weatherAlertsService.subscribeLocation(user4, location6);
    }

    @Test
    public void generalInfoShouldBeSentToAllSubscribers() {

        weatherAlertsService.sendGeneralInformation();

        Mockito.verify(user1, Mockito.times(1)).receiveGeneralInfo();
        Mockito.verify(user2, Mockito.times(1)).receiveGeneralInfo();
        Mockito.verify(user3, Mockito.times(1)).receiveGeneralInfo();
        Mockito.verify(user4, Mockito.times(1)).receiveGeneralInfo();
    }

    @Test
    public void weatherAlertShouldBeSentToSubscribersForParticularLocation() {

        weatherAlertsService.sendWeatherAlertAccordingToLocation(location3);
        weatherAlertsService.sendWeatherAlertAccordingToLocation(location4);

        Mockito.verify(user1, Mockito.times(1)).receiveWeatherAlert();
        Mockito.verify(user2, Mockito.times(2)).receiveWeatherAlert();
        Mockito.verify(user4, Mockito.never()).receiveWeatherAlert();
    }

    @Test
    public void subscriptionShouldBeRemovedForParticularLocation() {

        weatherAlertsService.unsubscribeTheParticularLocation(user2, location3);
        weatherAlertsService.unsubscribeTheParticularLocation(user1, location2);
        weatherAlertsService.sendWeatherAlertAccordingToLocation(location4);
        weatherAlertsService.sendWeatherAlertAccordingToLocation(location5);


        Mockito.verify(user2, Mockito.times(1)).receiveWeatherAlert();
        Mockito.verify(user1, Mockito.never()).receiveWeatherAlert();
        Mockito.verify(user3, Mockito.times(1)).receiveWeatherAlert();

    }

    @Test
    public void subscriptionShouldBeRemovedForAllObservedLocations() {

        weatherAlertsService.unsubscribeAllLocations(user2);
        weatherAlertsService.sendWeatherAlertAccordingToLocation(location3);
        weatherAlertsService.sendWeatherAlertAccordingToLocation(location4);

        Mockito.verify(user2, Mockito.never()).receiveWeatherAlert();

    }

    @Test
    public void particularLocationShouldBeRemoved() {

        weatherAlertsService.removeTheLocation(location3);
        weatherAlertsService.sendWeatherAlertAccordingToLocation(location3);
        weatherAlertsService.sendWeatherAlertAccordingToLocation(location2);

        Mockito.verify(user2, Mockito.never()).receiveWeatherAlert();
        Mockito.verify(user1, Mockito.times(1)).receiveWeatherAlert();
    }
}