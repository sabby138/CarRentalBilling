var employeeApp = angular.module("employee",[]);
employeeApp.controller("employeeController", function(){
	this.clearFields = function(){
		obj.value = '';
	};

});


employeeApp.controller("myCon", function($scope){
	$scope.go = function(){
		console.log('hereva');
	};

});