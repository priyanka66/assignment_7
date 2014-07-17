"use strict";

/*We need to manually start angular as we need to
wait for the google charting libs to be ready*/  
google.setOnLoadCallback(function () {  
    angular.bootstrap(document.body, ['my-app']);
});

google.load('visualization', '1', {packages: ['corechart']});


var myApp = myApp || angular.module("my-app",["google-chart"]);


myApp.controller('IndexCtrl',function($scope,$http){  
    $scope.data1= {};
    //$scope.data1=MovieService.list();
//    $scope.data=[
//	                {
//	                    "count": 5649,
//                    "ratings": "1"
//	                },
//	                {
//	                    "count": 10476,
//	                    "ratings":" 2"
//	                },
//	                {
//	                    "count": 25041,
//	                    "ratings": "3"
//	                },
//	                {
//	                    "count": 31576,
//	                    "ratings": "4"
//	                },
//	                {
//	                    "count": 19529,
//	                    "ratings": "5",
//	                   
//	                }
//	            ];
//    $scope.data1.dataTable = new google.visualization.DataTable();
//    $scope.data1.dataTable.addColumn("string","Name");
//    $scope.data1.dataTable.addColumn("number","Qty");
//    for(var i=0; i<$scope.data.length;i++)
//    	{
//    	 $scope.data1.dataTable.addRow([$scope.data[i].ratings,$scope.data[i].count]);
//    	}
//   


    $scope.data2 = {};
    $scope.data2.dataTable = new google.visualization.DataTable();
    $scope.data2.dataTable.addColumn("string","Name");
    $scope.data2.dataTable.addColumn("number","Qty");
    $scope.data2.dataTable.addRow(["Test",1]);
    $scope.data2.dataTable.addRow(["Test2",2]);
    $scope.data2.dataTable.addRow(["Test3",3]);


    $scope.data3 = {};
    $scope.data3.dataTable = new google.visualization.DataTable();
    $scope.data3.dataTable.addColumn("number","ratings");
    $scope.data3.dataTable.addColumn("number","count");
    $scope.data3.dataTable.addRow([1,122]);
    $scope.data3.dataTable.addRow([2,233]);
    $scope.data3.dataTable.addRow([3,333]);
    
    

        $scope.items = [];
        
       
            $http({method : 'GET',url : 'http://localhost:8080/api/ratings/getmovies',headers: {
                "Content-Type": "application/json"
            }})
                .success(function(data, status) {
                    $scope.items = data;
                    console.log($scope.items);
                    $scope.data1.dataTable = new google.visualization.DataTable();
                    $scope.data1.dataTable.addColumn("number","Name");
                    $scope.data1.dataTable.addColumn("number","Qty");
                    for(var i=0; i<$scope.items.length;i++)
                    	{
                    	 $scope.data1.dataTable.addRow([$scope.items[i].ratings,$scope.items[i].count]);
                    	}
                   
                })
                .error(function(data, status) {
                   alert("Error");
                });
        
        
            	
    
        });
