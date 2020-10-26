Title: Smart Alarm System 

Course: Mobile App Development 

Instructor: Dr. Dmytro Zubov 

Team Member: Nurlan Nogibaev, Abdul Hakim Ahmadi, and Jahanzaib Danish 

Goal: We, as a group, are going to create an android based mobile app of smart Alarm system especially for the people struggling to get up in the morning. As, a lot of people find it hard to get off of bed due to morning inactive and laziness. Our app will force such people to get off the bed as the saying goes the early birds catches the worm. 

Previous Work: We can a lot of android based mobile application which are already in the market and some are just custom build which comes pre-installed which one buys a new phone. We also found a lot of online code repositories and videos demonstrating how to build a simple alarm system, which we will modify to build our own smart alarm system. 

Approach: Since our smart alarm system would not be an ordinary one like the customs build  app we usually find in out phones. The best thing about this app would be its machine learning part of object detection with it. The whole project process is described in the following steps: 

Once the user installs the app in the phone, he will be asked to set the timer to wake him/her up in the morning. 

When the time approaches in the morning the alarms will start buzzing with a tone choose by user’s choice. 

There will be two buttons, one is to stop the alarm and the other is to snooze the alarm for at least  five to ten minutes. 

When the user clicks on the stop button, the camera will open and will demand from the user to take a picture of random choose pre input image. These images will be from the things that we usually use during morning which include toothbrush, toothpaste, toilet seat, water basin. Once the user clicks the photo the app will recognize the photo using the object recognition system and then, the alarm will stop making the person getting off the bed. 

Each time, through a randomizer, the app will demand different image form the user and the alarm will not stop at all cost until the user take the picture of the object the app demands. One cannot upload a photo from the gallery, rather the user can only use the camera to take the picture. 

Methodology:  

Front-end part: In the front-end part we don’t need much fancy interface of the complex application, rather we just need a sign-up page to keep track of the user. Then an interface where a user to set up a timer from the alarm and once the user clicks the stop button, we need an interface for the camera to open, identify the object and close upon detection. 

Back-end part: In back end we need a simple database to store the number of user and their details for tracking purpose. Then, we need a firebase machine learning object detection application to detect the object the user will take picture of. We also need a camera to open upon clicking of the stop button. 

Upon all these things the firebase back end part seems to be a bit difficult and need some experience and research get familiar with. In addition, using camera is also challenging for us since we do not have much experience with it. Other than those, other parts are relatively easy and can easily be done. As an alternative, if the object detection thing did not work out the way we are suggesting, we will use some basic general knowledge quiz instead of the object detection things which in a way make the use wake up from sleep. 

Testing Java Android App: We will test the application on an android phone and emulator to check whether it is working or not. The application will be considered completed when a user successfully set an alarm remainder and the app work properly by opening the camera when the stop button is pressed and successfully recognize the object it asked for and then stop. Our goal is set to completed when it helps the user to get off the bed especially in the morning as the app focus only the people who struggles while getting up in the morning. 

Summary: In this project we are developing an app for the people who are always find it hard to get up in the mooring. In the project we are using firebase machine learning with the simple alarm app so that when the user trying to stop the alarm, it will ask from the user to take the picture of random image which we usually use in the morning. That is how it will force the use to get off the bed. By the end of this project, we will be able to know how to create a simple application and especially how to make it work in the backend with simple database and contemporarily use firebase machine learning with the application. Since, now a days we are totally depended on the technology and simple application like these to help to live along. 

References:  

B, Jo2 (2017). Android Alarm Clock Tutorial. Retrieved from: https://javapapers.com/android/android-alarm-clock-tutorial/ 

ProgrammerWorld (2019). Create a simple Alarm Clock App in Android Studio. Retrieved from: https://programmerworld.co/android/create-a-simple-alarm-clock-app-in-android-studio/ 

Firebase (2020). ML Kit for Firebase. Retrieved from: https://firebase.google.com/docs/ml-kit 

 

 

 
