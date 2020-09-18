# 1. Design a course management system (Like Canvas)

## Student
   Data: name, loginCredentials <br>
   Behaviors: LogIn, CheckCourseInfo, WriteAsign, WatchVedio, LogOut <br>

## Instructor
   Data: name, loginCredentials <br>
   Behaviors: LogIn, UpLoadAsign, CheckAsign, UploadVedio, UplodTranscript, UploadMessage, LogOut <br>

## TA
   Data: name, loginCredentials <br>
   Behaviors: LogIn, CheckAsign, RankAsign, LogOut <br>

## Course
   Data: name, profile, startTime, endTime, courseNumber, InstuctorName, Address <br>
   Behaviors: <br>

## Asignment
   Data: Number, Problem, Answer DueDay, Score <br>
   Behaviors: <br>

## Transcript
Data: Studentname, Score <br>
 Behaviors: <br>
```
Instructor siva;
Student zimu;
TA yafei;
zimu.login(loginCredentials);
Course INFO5100=zimu.CheckCourseInfo(name, profile, startTime, endTime, courseNumber, InstuctorName, Address);
siva.logIn(loginCredentials);
siva.UploadVedio;
zimu.WatchVedio;
yafei.LogIn(loginCredentials);
yafei.UploadAsign(Number, Problem, DueDay);
if zimu finish asignment
 if zimu finish asignment on time
  zimu.WriteAsign(Answer);
  yafei.CheckAsign(Answer);
  yafei.RankAsign(Score);
 else zimu do not finish asignment on time
else zimu do not finish asignment
siva.UplodTranscript(Studentname, Score);
```

# 2. Design a pet adoption platform

## Adopter:
 Data: name, loginCredentials,address,phone <br>
 Behaviors: LogIn, search, contact, LogOut <br>

## Pet: 
 Data: breed,color,size, age <br>
 Behaviors: <br>

## Adoption Center
 Data: name, pets, address, phone <br>
 Behaviors: checkout, sendConfirmMess, sendRegectMess <br>
```
Adopter zimu;
Adoption Center DogFamily;
zimu.LogIn(loginCredentials);
Pet max = zimu.search(breed,color,size, age);
zimu.contact(DogFamily);
DogFamily.checkout(zimu.address, zimu.phone);
if AdopterData is NoProblem
 DogFamily.sendConfirmMess(zimu);
else
 DogFamliy.sendRegectMess(zimu);
```

# 3. Design an app to book airline ticket.

## Customer:
 Data: emailAddress, Name, loginCredentials, Address, Phone, credit card, PassengerInfo <br>
 Behaviors: logIn, enter, Buy, requestCancelOrder, requestRefund, Search <br>

## Flight:
 Data: Number, Origin, destination, time <br>
 Behaviors:  <br>

## Airline ticket seller
 Data: Flights <br>
 Behaviors: sendReceipt, checkOut, refund, sendSuccessfulMessage <br>
```
Customer zimu;
Airline ticket seller delta;
Flight D1222= zimu.search(Number, Origin, destination, time);
if D1222 is Unfull
 zimu.enter(PassengerInfo);
 zimu.buy(D1222);
 delta.checkout(zimu.address, zimu.phone, zimu.creditCard);
 delta.sendReceipt(zimu.emailAddress);
 if zimu change his mind
  zimu.requestCancelOrder(D1222);
  zimu.requestRefund(D1222, delta);
  delta.refund(D1222, zimu);
 else
  delta.sendSuccessfulMessage(zimu.phone)
else D1222 is Full
```
# 4.Design a course registration platform.

## Student
 Data: name, loginCredentials <br>
 Behaviors: LogIn, search, registerCourse, DropCourse, LogOut <br>

## Course
 Data: name, profile, startTime, endTime, courseNumber, InstuctorName, Address <br>
 Behaviors: <br>
```
Student zimu;
zimu. login(loginCredentials);
Course INFO5100=zimu.search(name, profile, startTime, endTime, courseNumber, InstuctorName, Address);
if INFO5100 is NoTimeConflict
 if INFO5100 is Unfull
  zimu.registerCourse(INFO5100);
  if zimu change his mind
   zimu.DropCourse(INFO5100);
  else
   zimu.registerCourse(INFO5100)=success;
 else INFO5100 is full
else INFO5100 is TimeConflict
```

# 5. Order food in a food delivery app.(Like Uber Eats)

## Customer:
 Data: emailAddress, Name, loginCredentials, Address, Phone, credit card <br>
 Behaviors: logIn, Buy, writeReview, requestCancelOrder, requestRefund, Search, writeReview <br>

## Online restaurant:
 Data: Foods, Address, OpenTime, Couriers <br>
 Behaviors: sendReceipt, checkOut, refund, allocateCourier,ship <br>

## Food:
 Data: Name, Taste, price, size <br>
 Behaviors: <br>

## Courier:
 Data: Name, <br>
 Behaviors: deliverFood, contactCustomer <br>
```
Customer zimu;
Online restaurant: KFC;
zimu. login(loginCredentials);
Food wings = zimu.search(Name,Taste, price, size);
if KFC is inOpenTime
 if wings isInStock
  zimu.buy(wings);
  KFC.checkout(zimu.address, zimu.phone, zimu.creditCard);
  KFC.sendReceipt(zimu.emailAddress);
  if zimu change his mind
   zimu.requestCancelOrder(wings);
   zimu.requestRefund(wings, KFC);
   KFC.refund(wings, zimu);
  else
   KFC.ship(wings);
   Courier tom = KFC.allocateCourier;
   tom.contactCustomer(zimu);
   tom.deliverFood(wings, zimu.address);
   if zimu satisfied with the food
     zimu.writeReview("*****");
   else
     zimu.writeReview("ooooo");
     zimu.requestRefund(wings, KFC);
     KFC.refund(zimu);
 else wings outOfStock
else KFC is Closed
```
