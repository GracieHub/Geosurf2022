
# Mobile App Development Assignment 1 2022

Name: Grace Doyle

## Overview

Geosurf is an android appl created in Android studio and written in Kotlin. 
This app is for assignment 1 for Mobile app dev as part of HDip in Computer Science in SETU. 
Geosurf is an app for surfers to be able to add and store surfspots on an app in their account.
The following features are included:

+ Users can add a title, location, image, Ability rating and date to each surfspot
+ Full CRUD functionality (users can create, read, update and delete surfspots in app )
+ Persistent in JSON implemetned for surfspots and Users
+ User can Sign up (register) and Log in
+ Splash screen when the app launches with the ability to LogOut or continue to account
+ View each surfspot Location on the map activity (connected via API)
+ ability to update location of the surfspot by long click and hold and drag
+ Use of UI elements rating bar and date picker

## To run the app.. 

+ Clone this repository with the following command: `git clone https://github.com/GracieHub/Geosurf2022`
+ Open project in Android studio and run (note this will require and emulator running API 29)
+ You will need a Google API key key to run this map app feature

### Splash Screen

Custom splash screen containing the app logo runs for few seconds when the appl is launched.

>Splash Screen

![Splash Screen](/app/src/images/splashscreen.PNG)

### Authentication/sign up

On application launch, users may log in to their account or alternatively create an account. For illustration purposes, certain constraints are used and appropriate error messages are displayed back to the user.

>Login Screen

![Login](/app/src/images/login.PNG)

>Signup Screen

![Signup](/app/src/images/register.PNG)

### List surfspots

All surfpsots are displayed back to the user in a recycler view on the app home page. Each surfspot is clickable so the user can read and edit its details

>List all surfspots

![List Surfspots](/app/src/images/surfspot_list.png)

### Add surfpsots

Users can add surfspot page. Users can add the The location, title description, rating, location and image.

>Add new surfspot

![Add Surfspots](/app/src/images/surfspots_add.png)

### Search and filter surfspots

Users can search surfspots by location on the main page. Users may also filter surfspot by category.

### map view

Users can view Individual surfspots. If they click on the marker  the lat long info will be displayed

>View surfspot on map

![Surfspots Map](/app/src/images/surfspots_map.png)

>Welcome Screen
![Welcome Screen](/app/src/images/welcome.png)
> 
### Other Features
>Date Picker
![Date_Picker](/app/src/images/datepicker.png)

>Spinner for ability level
![Spinner_for_ability_level_Rating](/app/src/images/abilitySpinner.png)

![Rating](/app/src/images/rating.png)
## References

https://www.youtube.com/watch?v=Q0gRqbtFLcw&ab_channel=Stevdza-San
https://www.geeksforgeeks.org/how-to-change-font-of-toolbar-title-in-an-android-app/
https://www.geeksforgeeks.org/togglebutton-in-kotlin/#:~:text=In%20Android%2C%20ToggleButton%20is%20just,is%20just%20like%20a%20button.
https://www.geeksforgeeks.org/datepicker-in-kotlin/#:~:text=Android%20DatePicker%20is%20a%20user,will%20select%20a%20valid%20date.
https://stackoverflow.com/questions/39192945/serialize-java-8-localdate-as-yyyy-mm-dd-with-gson
https://www.tutorialkart.com/kotlin-android/login-form-example-in-kotlin-android/
