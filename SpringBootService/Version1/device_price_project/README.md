# Device Price Prediction API

This project is a Spring Boot application that provides an API for predicting device prices based on their features. It consists of several Java classes including controllers, services, entities, and repositories.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK)
- Maven

## Setup

1. Clone this repository to your local machine.

2. Open the project in your preferred Java IDE.

3. Ensure that Maven dependencies are resolved.

## Running the Application

To run the application, you can run it from any IDE:


The application will start, and the API endpoints will be accessible.

## API Endpoints

### 1. Retrieve a List of All Devices

- **URL:** `/api/devices/test`
- **Method:** `GET`
- **Response:** Returns a list of all devices.

### 2. Retrieve Details of a Specific Device by ID

- **URL:** `/api/devices/{id}`
- **Method:** `GET`
- **Parameters:** `{id}` - ID of the device
- **Response:** Returns details of the device with the specified ID.

### 3. Add a New Device

- **URL:** `/api/devices`
- **Method:** `POST`
- **Request Body:** JSON representation of the new device
- **Response:** Returns the saved device object with its ID.

