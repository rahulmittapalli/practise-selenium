describe("This is NonAng example", function() {

	it("THis is also NonAng example", function() {

//		
//		var selectDropdownbyNum = function ( element(by.model("operator")), optionNum ) {
//			  if ("MULTIPLICATION"){
//			    var options = element.all(by.tagName('option'))   
//			      .then(function(options){
//			        options["MULTIPLICATION"].click();
//			      });
//			  }
//			};
//		Non Angular Application		
//		browser.ignoreSynchronization=true;
//		browser.get('http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html');
//		element(by.name("first_name")).sendKeys("Rahul");
//		element(by.name("last_name")).sendKeys("M");
//		element(by.name("maths")).click();
		
//		browser.driver.get method
		browser.driver.get('http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html');
		browser.driver.findElement(by.name("first_name")).sendKeys("Rahul");
		browser.driver.findElement(by.name("last_name")).sendKeys("M");
		browser.driver.findElement(by.name("maths")).click();
	})

})