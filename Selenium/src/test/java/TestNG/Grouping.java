package TestNG;

import org.testng.annotations.Test;
/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity  
paymentReturnbyBank  - regression
*/

public class Grouping {
  @Test(priority = 1 , groups = {"sanity","regression"})
   void loginByEmail() {
	  
	  System.out.println("This is Login by Email");
  }
  @Test(priority = 2, groups = {"sanity"})
  void loginByFacebook() {
	  System.out.println("This is Login by FaceBook");
 }
  @Test(priority = 3,  groups = {"sanity"})
  void loginByTwitter() {
	  System.out.println("This is Login by Twitter");
 }
  @Test(priority = 4,groups = {"sanity","regression"})
  void signupByEmail() {
	  System.out.println("This is SignUp By Email");
 }
  @Test(priority = 5 ,groups  = {"regression"})
  void signupByFacebook() {
	  System.out.println("This is SignUp By FaceBook");
 }
  @Test(priority = 6 ,groups  = {"regression"})
  void signupByTwitter() {
	  System.out.println("This is SignUp By Twitter ");
 }
  @Test(priority = 7 ,groups = {"sanity","regression"})
  
  void paymentinrupees() {
	  System.out.println("This is Paymentinrupees");
	  
  }
  @Test(priority = 8 , groups = {"sanity"})
 void paymentindollars() {
	  System.out.println("This is Paymentindollars");
	  
  }
  @Test(priority = 9 ,groups  = {"regression"})
 void paymentReturnByBank() {
	  System.out.println("This is PaymentTReturnByBank" );
	  		}
 
 
 
  
}
