// Zachary Berezanksy Practice set #2
package MainPackage;

public class MyInteger {
	private int value;

	public int getValue() {
		return value;
	}

	public MyInteger(int value) {
		this.value = value;
	}

	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;

		} else {
			return false;
		}
	}

	public static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;

		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isPrime() {
		int placeholder = 0;
		for (int i = 2; i < this.value; i++) {
			double value2 = this.value;
			double primecheck1 = value2 / i;
			int primecheck2 = this.value / i;
			// System.out.println(primecheck1);
			// System.out.println(primecheck2);
			if (primecheck1 == primecheck2) {
				placeholder = 1;
				i = i + this.value;
			}
		}
		if (placeholder == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;

		} else {
			return true;
		}
	}

	public static boolean isPrime(int value) {
		int placeholder = 0;
		for (int i = 2; i < value; i++) {
			double value2 = value;
			double primecheck1 = value2 / i;
			int primecheck2 = value / i;
			// System.out.println(primecheck1);
			// System.out.println(primecheck2);
			if (primecheck1 == primecheck2) {
				placeholder = 1;
				i = i + value;
			}
		}
		if (placeholder == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isPrime(MyInteger myInt) {
		int placeholder = 0;
		for (int i = 2; i < myInt.getValue(); i++) {
			double value2 = myInt.getValue();
			double primecheck1 = value2 / i;
			int primecheck2 = myInt.getValue() / i;
			// System.out.println(primecheck1);
			// System.out.println(primecheck2);
			if (primecheck1 == primecheck2) {
				placeholder = 1;
				i = i + myInt.getValue();
			}
		}
		if (placeholder == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isOdd(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return false;

		} else {
			return true;
		}
	}

	private static int equalvalue;

	public int getEqualvalue() {
		return equalvalue;
	}

	public static boolean equals(MyInteger myInt) {
		if (myInt.getValue() == myInt.getEqualvalue()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean equals(int value) {
		if (value == equalvalue) {
			return true;
		} else {
			return false;
		}
	}
	public static int parseInt(char charlist[]){
		int addedvalue = 0;
		for (int i = 0; i <= charlist.length; i++){
			addedvalue = addedvalue + charlist[i];
				
			}
		return addedvalue;
		}
	public static int parseInt(String number){
		int numbervalue = Integer.parseInt(number);
		return numbervalue;
		
		
		
	}

}