# **Problem Definition**
#### Project Description:
>Build a Devices Price Classification System (AI System) using Python and SpringBoot. Mainly

#### the system will include two small projects:
>Python project: will allow you to predict the prices, allowing the sellers to classify the device's prices according to their characteristics
>
>SpringBoot project: Will contain a simple entity, and a few endpoints, to call the service
from the Python project for a bunch of test cases, and store them.


# **Explain Every Folder**
| **File** | **Description** |
|----------|----------|
| **Notebook**  | Contains the notebook `Device_price_prediction.ipynb`, The work of analysis and ML in this notebook. |
| **Database** | Contains `creation.sql`, It is the sql queries to create the tables |
| **FlaskAPI** | Contains `app.py` It is the server side application, contains `client.py` It is a client side to test the flaskAPI and also contains the pickle files. | 
| **Results** |Contains *`CatBoostingModel`* It is a folder that contains the pickle file of the model and also contains *`MinMaxScaler`* It is a folder that contains the pickle file of the minmaxscaler|
| **SpringBootService** |Contains two Versions, First one contains `SpringBootApplication`, and also contains `client.py` to test the service but this version without this endpoint  `POST /api/predict/{deviceId}` the second version is same as the first but with this endpoint.|
>
----
>


# **Steps for making a correct installation** 
1. **Python 3.x with those Libraries `Flask,numpy,json,request`}**
2. **Java with JDK 21**
3. **Oracle database**
4. **IDE for python to run the flaskAPI**
5. **IDE for java to run the spring boot**


