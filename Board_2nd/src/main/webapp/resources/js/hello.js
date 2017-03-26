

var hello = function(){
	
	this.init = function(){
		helloW();
	};
	
	var helloW = function(){
		
		var hello = new Vue({
			el : '#hello',
			data : {
				hello_message : 'Hello Webpack with Spring'
			}
		});
		
	};
};

module.exports = hello;