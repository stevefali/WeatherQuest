# Weather Quest

Thank you for taking the time to check out my code!

***Please note that I have replaced the API keys in the code so as not to make them public; so if you run the app from this code, the API calls for auto-complete and fetching weather data will not work!***


This Android app displays the current weather data and weather forecast for the user's location or any location that the user enters in the search bar. The search bar checks data from a server to give suggestions for locations as the user types. When a location is selected, the location is geocoded to get the gps coordinates, which are used to fetch the weather data from the server. Since I made this app as a demonstration, I am currently using free account versions on the servers, so I am limited to 1000 API calls per day for each the geocoding API, the autocomplete API, and the weather data API. Therefore, I designed the app to try to limit the number of API calls being made to only the necessary ones. Before fetching weather data, the app first checks if the data needs to be refreshed, i.e., whether the data is from long ago enough to make an API call worth while, or whether the request is for a new location, etc. This also reduces the user's network usage. The most recent weather data is stored on the user's device in SQL databases. Android libraries that I used for this app include Dagger/Hilt for dependency injection, Room for SQL databases, and Retrofit and Moshi for server API calls. I also built the UI of this app using the Android Jetpack Compose library, since that is now what Android recommends over the old View-based system. The UI has some animations, and the background image changes based on the current weather conditions.

The directory you want to look in (where the files containing most of my code are) is [app/src/main/java/com/steve/weatherquest](app/src/main/java/com/steve/weatherquest).

 The fully-functioning app can also be downloaded from the Google Play Store [here](https://play.google.com/store/apps/details?id=com.steve.weatherquest).
