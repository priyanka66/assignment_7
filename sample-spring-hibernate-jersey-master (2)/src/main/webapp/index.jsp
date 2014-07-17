<!DOCTYPE html>
<html lang="en">
  
  <head>
    <meta charset="utf-8">
    <title>
    </title>
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.js" type="text/javascript"></script>
    <script src="https://www.google.com/jsapi" type="text/javascript"></script>
    <script src="assets/js/main.js" type="text/javascript"></script>
     <script src="assets/js/app.js" type="text/javascript"></script>
    <script src="assets/js/ngGoogleCharts.js" type="text/javascript"></script>
    <style type="text/css">
        .bigGraph {width:500px;height:500px;float:left;}
        .mediumGraph {width:400px;height:400px;float:left;}
        .smallGraph {width:200px;height:200px;float:left;}
    </style>
    
  </head>
  <body ng-controller="IndexCtrl">
    <div class="container">
      <div class="hero-unit">
            <div google-chart="BarChart" ng-model="data1" class="bigGraph"></div>
        	<div google-chart="BarChart" ng-model="data2" class="mediumGraph"></div>
        	<div google-chart="BarChart" ng-model="data3" class="mediumGraph"></div>
      </div>
      <div ng-repeat="i in items">
       
			      
      </div>
    </div>
    
    <script src="assets/js/jquery-1.8.3.js"></script>
    <script src="assets/js/bootstrap.js"></script>
  </body>
</html>
	