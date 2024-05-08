# Flask Model Deployment

This script deploys a machine learning model using Flask. The model and scaler are loaded using pickle, and predictions are made based on JSON input data.

## Code Explanation

1. Import necessary modules:
    - `Flask`: For creating the Flask application.
    - `request`: For handling HTTP requests.
    - `jsonify`: For returning JSON responses.
    - `pickle`: For loading the machine learning model and scaler.
    - `numpy`: For array manipulation.

2. Load the saved model and scaler:
    - `cat_model`: Load the trained machine learning model.
    - `min_max`: Load the scaler used for feature scaling.

3. Initialize the Flask application.

4. Define a route `/predict` for handling POST requests:
    - Extract features from the JSON data received in the request.
    - Reshape the features array to match the required format for prediction.
    - Scale the features using the loaded scaler.
    - Make predictions using the loaded model.
    - Convert the prediction to a list before returning it as a JSON response.

5. Run the Flask application if the script is executed directly.

## How to Use

1. Ensure you have Python installed on your system.

2. Install Flask and other required libraries:
    ```
    pip install Flask numpy
    ```

3. Save your trained model as `cat_model` and scaler as `min_max` using pickle.

4. Execute the script:
    ```
    python app.py
    ```

5. Send POST requests to `http://localhost:5000/predict` with JSON data containing the features for prediction.

6. Receive predictions as JSON responses.

