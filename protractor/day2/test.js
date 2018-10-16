describe("This is sample example", function() {

	it("THis is also IT example", function() {

//		
//		var selectDropdownbyNum = function ( element(by.model("operator")), optionNum ) {
//			  if ("MULTIPLICATION"){
//			    var options = element.all(by.tagName('option'))   
//			      .then(function(options){
//			        options["MULTIPLICATION"].click();
//			      });
//			  }
//			};

		browser.get('http://juliemr.github.io/protractor-demo/');
		element(by.model("first")).sendKeys("1");
		element(by.model('operator')).$('[value="MULTIPLICATION"]').click();
		element(by.model("second")).sendKeys("5");
		element(by.id("gobutton")).click();
		expect(element(by.className("ng-binding")).getText()).toEqual("5");
	})

})