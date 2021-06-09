package com.cg.demo.encap;

		class Phone{ // Parent class/ Super class
			
			void call() {
				System.out.println("Calling...");
			}
			
			void sms() {
				
				System.out.println("Sending sms...");
			}
		}
		
class FeaturePhone extends Phone {  // child class/ sub class
	void music() {
		System.out.println("Playing Music...");
	
	
	}
	
}
	class SmartPhone extends FeaturePhone {
		
		void camera() {
			
			System.out.println("CLick Pics");
		}
		
	}
		
public class PhoneDemo {
		public static void main(String[] args) {
			
				Phone phone = new Phone();
				phone.call();
				phone.sms();
			    FeaturePhone featurephone = new FeaturePhone();
			    featurephone.music();
			    featurephone.call();
			    featurephone.sms();
			    SmartPhone smartPhone = new SmartPhone();
			    smartPhone.camera();
			    smartPhone.call();
			    smartPhone.sms();
			    smartPhone.music();
			    
			    
			
		}
}
