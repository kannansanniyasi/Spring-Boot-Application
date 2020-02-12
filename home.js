var appWeb=angular.module("myApp",["ngRoute","dark-sky"]);

appWeb.config(function($routeProvider)
{
	      $routeProvider
	      .when("/",
	    	{
	    	  templateUrl:"views/home.html",
	    	  controller:"home"
	    	});
});

appWeb.config(['darkSkyProvider', function(darkSkyProvider) {
 	darkSkyProvider.setApiKey('386a6b5438a63ac6366fef9ed61a3f43');
}]);

appWeb.controller("home",['$scope','$http','darkSky',function($scope,$http,darkSky)
{
	$scope.title="Spring Boot Assignment";
	$scope.weather=[];
	 $http.get('http://localhost:9898/myApp/weather/weatherDetails').then(function(response) 
	 {
		         //alert(angular.toJson(response.data));
		 		 $scope.weather=response.data
		         console.log(response.data.length);
	  }, function(error) {
		    	 alert(error);
	 });
	 
	 $http.post('http://free.worldweatheronline.com/feed/weather.ashx?q=Washington,USA&key=5d1e95fa482749f68b0164059201202&format=json&no_of_days=2&includeLocation=yes')
	 .then(function(response) 
	 {
				         alert(angular.toJson(response.data));
			  }, function(error) {
				    	 alert(error);
	});
	
}]);

