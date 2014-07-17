
'use strict';


var module = angular.module('myApp.services', []);

module.service('MovieService', function() {
	var movielist =[
	                {
	                    "count": 5649,
	                    "ratings": 1
	                },
	                {
	                    "count": 10476,
	                    "ratings": 2
	                },
	                {
	                    "count": 25041,
	                    "ratings": 3
	                },
	                {
	                    "count": 31576,
	                    "ratings": 4
	                },
	                {
	                    "count": 19529,
	                    "ratings": 5
	                }
	            ];
	this.list = function() {
		return movielist;
	};
	
});
