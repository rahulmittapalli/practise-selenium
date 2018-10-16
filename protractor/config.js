var HtmlReporter = require('protractor-beautiful-reporter');


exports.config = {
  framework: 'jasmine',
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['day2/NonAng.js'],
  
  capabilities:{
		  browserName:'firefox'
//		  chromeOptions:{
//			  args:["--headless","--disable-gpu","--window-size=800,600"]
//		  }
  },

onPrepare: function() {
      // Add a screenshot reporter and store screenshots to
		// `/tmp/screenshots`:
      jasmine.getEnv().addReporter(new HtmlReporter({
         baseDirectory: 'Reports/screenshots'
      }).getJasmine2Reporter());
   }
}
