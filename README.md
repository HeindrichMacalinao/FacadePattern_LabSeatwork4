# Simplified Intelligent Home System

The `HomeApp` manages various home services for an intelligent home system, including turning on and off the lights, TV, and air conditioning. 

The application uses the **Facade Design Pattern** to interact with these services through a simplified, single interface provided by `HomeInterface`. The `HomeInterface` class delegates user requests to the appropriate service classes (`Light`, `TV`, `AirConditioning`) while abstracting the service details from the user. Additionally, `HomeInterface` provides methods to turn on all services (`turnOnAll()`) and turn off all services (`turnOffAll()`) simultaneously.

---

## Class Definitions

* **`HomeService` (Interface):** Defines the common interface for all home services.
* **`Light`:** A service class implementing the `HomeService` interface, responsible for turning the lights on and off (`turnOn()` and `turnOff()`).
* **`TV`:** A service class implementing the `HomeService` interface, responsible for turning the TV on and off (`turnOn()` and `turnOff()`).
* **`AirConditioning`:** A service class implementing the `HomeService` interface, responsible for turning the air conditioning on and off (`turnOn()` and `turnOff()`).
* **`HomeInterface`:** The facade class that coordinates interactions between the client and individual home services. It includes `turnOnAll()` and `turnOffAll()` methods to control all services at once.
* **`HomeApp`:** The client class that uses the `HomeInterface` to access and utilize home services seamlessly.
