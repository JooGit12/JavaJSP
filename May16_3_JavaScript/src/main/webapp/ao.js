function arrayTest() {
	// int[] ar = { 123, 54, 24 };
	var ar = [123, 54, 24];

	for (var i = 0; i < ar.length; i++) {
		alert(ar[i]);
	}
}

function objTest() {
	// Dog d = new Dog();
	// d.setName("ÈÄÃß");
	// d.setAge(3);
	// syso(d); 
	// syso(d.getName()); Ä¸½¶È­
	// syso(d.age)

	var d = { name: "ÈÄÃß", age: 3 };
	alert(d);
	alert(d.name);
	alert(d.age);
}

function aoTest() {
	// Dog[] dogs;
	// ArrayList<Dog> dogs;
	var dogs = [
		{ name: "ÈÄÃß", age: 3 },
		{ name: "È£ÃÊ", age: 2 },
		{ name: "ÈåÃ÷", age: 4 }
	];
	for (var i = 0; i < dogs.length; i++) {
		alert(dogs[i].name + " : " + dogs[i].age);
	}
	//alert(dogs);
	//alert(dogs[0]);
	//alert(dogs[0].name);
}




