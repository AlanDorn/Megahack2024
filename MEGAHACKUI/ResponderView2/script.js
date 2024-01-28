document.addEventListener("DOMContentLoaded", () => {
    // Get the DOM element where you want to display the weather information
    const weatherElement = document.getElementById("weather");
  
    // Check if geolocation is available in the user's browser
    if ("geolocation" in navigator) {
      navigator.geolocation.getCurrentPosition(async (position) => {
        // Get the user's latitude and longitude
        const { latitude, longitude } = position.coords;
  
        // Make a request to the OpenWeatherMap API to fetch weather data
        try {
          const apiKey = "c7a0394f78ca2a31820df7d16afa0c2b";
          const apiUrl = `https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&units=imperial&appid=${apiKey}`;
  
          const response = await fetch(apiUrl);
          const data = await response.json();
  
          // Extract and display the weather information (e.g., temperature and description)
          const temperature = data.main.temp;
          const description = data.weather[0].description;
  
          weatherElement.textContent = `Temperature: ${temperature}°F, Description: ${description}`;
        } catch (error) {
          console.error("Error fetching weather data:", error);
          weatherElement.textContent = "Unable to fetch weather data";
        }
      });
    } else {
      // Geolocation is not available in the user's browser
      weatherElement.textContent = "Geolocation is not supported in your browser.";
    }
  });
        // Function to check for incoming messages in localStorage
        function checkForMessages() {
          const message = localStorage.getItem("emergencyMessage");
          if (message) {
              // Display the received message as an emergency type
              document.getElementById("emergencyType").textContent = message;
              // Clear the message from localStorage
              localStorage.removeItem("emergencyMessage");
          }
      }

      // Check for messages periodically
      setInterval(checkForMessages, 3000);