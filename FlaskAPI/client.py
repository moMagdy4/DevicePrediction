import requests

# Define the URL of the Flask API endpoint
url = 'http://localhost:5000/predict'

# Define the input features as a dictionary
#Those featuers from test dataset to test the API
data = features = {
    'features': [1043, 1, 1, 14, 0, 5, 193, 16, 226, 1412, 3476, 12, 7, 2, 0, 1, 0]
}  # Example features, replace with your own data

# Send a POST request to the endpoint with JSON data
response = requests.post(url, json=data)

# Check if the request was successful (status code 200)
if response.status_code == 200:
    # Print the prediction returned by the API
    print('Prediction:', response.json()['prediction'])
else:
    print('Error:', response.status_code)
