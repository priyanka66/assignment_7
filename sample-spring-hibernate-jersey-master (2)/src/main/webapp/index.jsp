<!DOCTYPE html>
<html lang="en">
  
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="favicon.ico">
               
        <!-- Fonts -->
        <link href="http://fonts.googleapis.com/css?family=Ubuntu:300,400,500,700,300italic,400italic,500italic,700italic" rel="stylesheet" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,700' rel='stylesheet' type='text/css'>
        
        <!-- CSS Files -->
        <link href="css/bootstrap.css" rel="stylesheet" media="screen">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    <title>
    </title>
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
    
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.js" type="text/javascript"></script>
    <script src="https://www.google.com/jsapi" type="text/javascript"></script>
    <script src="assets/js/main.js" type="text/javascript"></script>
    <script src="assets/js/main1.js" type="text/javascript"></script>
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
    <div class="top-header navbar-fixed-top row">
        </div>
            <div class="col-sm-5 collapse navbar-collapse pull-right">
                 <ul class="nav navbar-nav top-menu">
                        <li class=""><a href="">HOME</a></li>
                        <li class=""><a href="">FEATURES</a></li>
                        <li class=""><a href="">CONTACT US</a></li>
                    </ul>
                </div>
            </div>
      <div class="hero-unit">
            <div google-chart="PieChart" ng-model="data1" class="bigGraph"></div>
        	<div google-chart="PieChart" ng-model="data2" class="mediumGraph"></div>
        	<div google-chart="BarChart" ng-model="data3" class="mediumGraph"></div>
      </div>
      <div ng-repeat="i in items">
       
			      
      </div>
    </div>
    
    <script src="assets/js/jquery-1.8.3.js"></script>
    <script src="assets/js/bootstrap.js"></script>
  </body>
</html>
	