This is the ATM managment application where the customer can deposit , WIthdraw and check Balance .

To start the application run the AtmMachineMain.java 

First It will test some of the test cases of the program after that it runs the full working application with the choices of 
Deposite , Withdraw and check balance. and the user can type the into into it and choose the option what is suitable.

In this there are four design patterns used.

1.State design pattern
State design pattern is used to show the all the posible states of the atm and the main method is in AtmMachineMain.java

2.Proxy design pattern
Proxy design pattern is used to limit acces of the other classes. The user can se only what is required. 
In this application proxy is used to show how much cash is there in the ATM and the current state of the ATM

3.Factory design pattern
Factory design pattern is used in this we create an object with revieling the original logic of the program.
So in this application the factory is used for the currency note that show which currency is accepted by the ATM.

4.Observer design pattern
Observer pattern is used to send the sms to the user if any of the transactions had happened the user recieves the sms.


All the design pattern code is in different packages and named properly