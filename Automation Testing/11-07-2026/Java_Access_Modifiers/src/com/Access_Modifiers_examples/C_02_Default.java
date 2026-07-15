package com.Access_Modifiers_examples;

class C_02_Default {

	int marks = 90; // Default Access Modifier

	// Default members are accessible only within the same package.
	void displayMarks() { // Default Method
		System.out.println("Marks = " + marks);
	}

	public static void main(String[] args) {

		C_02_Default obj = new C_02_Default();

		System.out.println(obj.marks);
		obj.displayMarks();
	}
}