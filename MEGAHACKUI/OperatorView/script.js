document.getElementById("dispatchFirefighters").addEventListener("click", () => {
    const message = "Dispatched Firefighters";
    // Store the message in localStorage
    localStorage.setItem("emergencyMessage", message);
});