import requests

# Define the base URL of your Spring Boot application
base_url = 'http://192.168.100.10:8080/api/devices'

# Function to test the GET endpoint for retrieving all devices
def test_get_all_devices():
    url = f"{base_url}/test"
    response = requests.get(url)
    print("GET /api/devices")
    print("Status code:", response.status_code)
    if response.status_code == 200:
        print("Response body:", response.json())
    else:
        print("Error:", response.text)

# Function to test the GET endpoint for retrieving a specific device by ID
def test_get_device_by_id(device_id):
    url = f"{base_url}/{device_id}"
    response = requests.get(url)
    print(f"GET {url}")
    print("Status code:", response.status_code)
    if response.status_code == 200:
        print("Response body:", response.json())
    else:
        print("Error:", response.text)

# Function to test the POST endpoint for adding a new device
def test_add_device(device_data):
    response = requests.post(base_url, json=device_data)
    print("POST /api/devices")
    print("Status code:", response.status_code)
    if response.status_code == 200:
        print("Response body:", response.json())
    else:
        print("Error:", response.text)

# Test the endpoints
test_get_all_devices()
test_get_device_by_id(1)  # Replace 1 with the ID of the device you want to retrieve
#test_add_device({"name": "New Device", "price": 100})  # Replace with the data of the device you want to add
