from flask import Flask, request, jsonify  # Import necessary modules from Flask
import pickle  # Import pickle module for loading the model and scaler
import numpy as np  # Import numpy for array manipulation

# Load the saved model and scaler
with open('cat_model', 'rb') as file:  # Open the file containing the model
    model = pickle.load(file)  # Load the model using pickle

with open('min_max', 'rb') as file:  # Open the file containing the scaler
    scaler = pickle.load(file)  # Load the scaler using pickle

app = Flask(__name__)  # Initialize the Flask application


@app.route('/predict', methods=['POST'])  # Define a route for POST requests to '/predict'
def predict():
    # Get the JSON data from the request
    data = request.json
    #If we do not handle the data in client side, we can handle it here with drop columns that we drop in the train but we handle it in client

    # Adjust the column indices as needed based on the columns you dropped during training
    # 2 for clock speed column, 7 for m dep column and 9 for n cores column 
    #dropped_columns_indices = [2, 7,9]  # Assuming you dropped the 1st column from the first dataset and the 5th column from the second dataset
    #features = [features[i] for i in range(len(features)) if i not in dropped_columns_indices] 
    
    # Extract the features from the JSON data
    features = data['features']

    # Reshape the features array to the required format for prediction
    features = np.array(features).reshape(1, -1)

    # Scale the features using the loaded scaler
    scaled_features = scaler.transform(features)

    # Make predictions using the loaded model
    prediction = model.predict(scaled_features)

    # Convert the NumPy array to a Python list before jsonify
    prediction_list = prediction.tolist()

    # Return the prediction as JSON response
    return jsonify({'prediction': prediction_list})


if __name__ == '__main__':
    app.run(debug=True)  # Run the Flask app in debug mode if this script is executed directly
