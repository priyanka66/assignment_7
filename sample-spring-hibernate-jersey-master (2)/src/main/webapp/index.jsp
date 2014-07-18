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
        
        <link href="assets/css/bootstrap.css" rel="stylesheet">
    	<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
     	<link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/css/bootstrap.css" rel="stylesheet" media="screen">
        <link href="assets/css/font-awesome.min.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">
        
    <title>
    </title>
    
    
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.js" type="text/javascript"></script>
    <script src="https://www.google.com/jsapi" type="text/javascript"></script>
    <script src="assets/js/main.js" type="text/javascript"></script>
     <script src="assets/js/main1.js" type="text/javascript"></script>
    
     <script src="assets/js/app.js" type="text/javascript"></script>
    <script src="assets/js/ngGoogleCharts.js" type="text/javascript"></script>
    <style type="text/css">
        .mediumGraph {width:400px;height:400px;float:left;}
        .bigGraph {width:500px;height:500px;float:left;}
        .smallGraph {width:200px;height:200px;float:left;}
        
    </style>
    
  </head>
  <body ng-controller="IndexCtrl">
		<div style="padding-top:70px;"> 
  		<div class="top-header navbar navbar-inverse navbar-fixed-top row" >
                <div>
                
                      <h2 class="title" align="center">Movie Database<br/></h2>
                       
                    </div>
                </div>
              
            </div>
            </div>
            <div class="col-md-6" bgcolor="black"> 
            		   <div google-chart="PieChart" ng-model="data1" class="bigGraph" bgcolor="black" ></div>
             </div>
          <div class=col-md-6>
        	<div google-chart="PieChart" ng-model="data2" class="bigGraph"></div>
        </div>
         <div class=col-md-6>
        	<div google-chart="BarChart" ng-model="data3" class="bigGraph"></div>
		</div>      
    	
    
    <script src="assets/js/jquery-1.8.3.js"></script>
    <script src="assets/js/bootstrap.js"></script>
  </body>
</html>
	