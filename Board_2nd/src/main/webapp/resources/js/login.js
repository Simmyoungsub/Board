/**
 * 
 */

var login = function(){
	
	this.init = function(){
		callMain();
	};
	
	var callMain = function(){
		var main = new Vue({
			el : '.mainContainer',
			data : {
				id : '',
				password : '',
				name : ''
			},
			methods : {
				login : login
			}
		});
	};
	
	var login = function(){
		/*console.log(this.message);
		console.log(this.password);
		var param = {
			id : this.message,
			password : this.password,
			name : this.name
		};
		
		axios({
			method : "post",
			url : "login.json",
			data : param,
			responseType : "json"
		}).then(function(response){
			console.log(response);
			location.href="http://localhost:8080/board/board.page";
		}).catch(function(error){
			console.log(error);
		})*/
		
		console.log(this.id);
	};
};

module.exports = login;