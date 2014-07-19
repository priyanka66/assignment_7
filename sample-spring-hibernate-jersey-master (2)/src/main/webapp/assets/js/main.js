"use strict";

/*We need to manually start angular as we need to
 wait for the google charting libs to be ready*/
google.setOnLoadCallback(function() {
	angular.bootstrap(document.body, [ 'my-app' ]);
});

google.load('visualization', '1', {
	packages : [ 'corechart' ]
});

var myApp = myApp || angular.module("my-app", [ "google-chart" ]);

myApp.controller('IndexCtrl', function($scope, $http, $timeout) {
	$scope.data1 = {};
	$scope.data1.dataTable = new google.visualization.DataTable();
	$scope.data1.dataTable.addColumn("string", "Name");
	$scope.data1.dataTable.addColumn("number", "Ratings");
	$scope.data1.title="Top 20 movies based on review";
	
	
	
	$scope.data2 = {};
	$scope.data2.dataTable = new google.visualization.DataTable();
	$scope.data2.dataTable.addColumn("string", "Name");
	$scope.data2.dataTable.addColumn("number", "Qty");
	$scope.data2.title="Top 20 movies based on profession";

	$scope.data3 = {};
	$scope.data3.dataTable = new google.visualization.DataTable();
	$scope.data3.dataTable.addColumn("string", "Movies");
	$scope.data3.dataTable.addColumn("number", "Year");
	$scope.data3.title="Number of movies based on Year";

//	$scope.data3.dataTable.addRow([ 1, 122 ]);
//	$scope.data3.dataTable.addRow([ 2, 233 ]);
//	$scope.data3.dataTable.addRow([ 3, 333 ]);

	$scope.items = [];

	$http({
		method : 'GET',
		url : 'http://localhost:8080/api/ratings/getmovies',
		headers : {
			"Content-Type" : "application/json"
		}
	}).success(
			function(data, status) {
				$scope.items = data;
				console.log($scope.items);

				for (var i = 0; i < $scope.items.length; i++) {
					$scope.data1.dataTable.addRow([ $scope.items[i].movieName,
							$scope.items[i].count ]);
				}

			}).error(function(data, status) {
		alert("Error");
	});
	$scope.items1=[];
	$http({
		method : 'GET',
		url : 'http://localhost:8080/api/ratings/getmoviesbypro',
		headers : {
			"Content-Type" : "application/json"
		}
	}).success(
			function(data4, status) {
				$scope.items1 = data4;
				console.log($scope.items1);

				for (var i = 0; i < $scope.items1.length; i++) {
					$scope.data2.dataTable.addRow([ $scope.items1[i].profession,
							$scope.items1[i].count ]);
				}

			}).error(function(data1, status) {
		alert("Error");
	});
	
	$scope.items2=[];
	$http({
		method : 'GET',
		url : 'http://localhost:8080/api/movies/moviesByYear',
		headers : {
			"Content-Type" : "application/json"
		}
	}).success(
			function(data5, status) {
				$scope.items2 = data5;
				console.log($scope.items2);

				for (var i = 0; i < $scope.items2.length; i++) {
					$scope.data3.dataTable.addRow([ $scope.items2[i].year,
							$scope.items2[i].count ]);
				}

			}).error(function(data5, status) {
		alert("Error");
	});

});
