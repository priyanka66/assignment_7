"use strict";

/*We need to manually start angular as we need to
wait for the google charting libs to be ready*/  
google.setOnLoadCallback(function () {  
    angular.bootstrap(document.body, ['my-app']);
});
google.load('visualization', '1', {packages: ['corechart']});


var myApp = myApp || angular.module("my-app",["google-chart"]);

myApp.controller("IndexCtrl",function($scope){  
    $scope.data1= {};
    $scope.data1.dataTable = new google.visualization.DataTable();
    $scope.data1.dataTable.addColumn("string","Name")
    $scope.data1.dataTable.addColumn("number","Qty")
    $scope.data1.dataTable.addRow(["Technician",1]);
    $scope.data1.dataTable.addRow(["Writer",1]);
    $scope.data1.dataTable.addRow(["Executive",1]);
    $scope.data1.dataTable.addRow(["Administrator",1]);
    $scope.data1.dataTable.addRow(["Student",1]);
    $scope.data1.dataTable.addRow(["Lawyer",1]);
    $scope.data1.dataTable.addRow(["Scientist",1]);
    $scope.data1.dataTable.addRow(["Others",1]);
    $scope.data1.title=" Based on occupation"

    $scope.data2 = {};
    $scope.data2.dataTable = new google.visualization.DataTable();
    $scope.data2.dataTable.addColumn("string","Name")
    $scope.data2.dataTable.addColumn("number","Qty")
    $scope.data2.dataTable.addRow(["Test",1]);
    $scope.data2.dataTable.addRow(["Test2",2]);
    $scope.data2.dataTable.addRow(["Test3",3]);


    $scope.data3 = {};
    $scope.data3.dataTable = new google.visualization.DataTable();
    $scope.data3.dataTable.addColumn("string","Name")
    $scope.data3.dataTable.addColumn("number","Qty")
    $scope.data3.dataTable.addRow(["Test",1]);
    $scope.data3.dataTable.addRow(["Test2",2]);
    $scope.data3.dataTable.addRow(["Test3",3]);
});
