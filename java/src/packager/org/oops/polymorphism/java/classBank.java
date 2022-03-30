package packager.org.oops.polymorphism.java;

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank {
	float getRateOfInterest() {
		return 4.5f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 5.7f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 6.9f;
	}
}