var app = angular.module('blog', [ ]);

app.controller('HomeController', ['$scope', '$http', function($scope, $http) {
  $scope.helloWorld = 'Aplicatii Web cu suport Java!';

  $scope.persoane = [];
  $scope.keys = [];

  $scope.person = {};
  $scope.editPerson = {};



  $http.get('http://localhost:8080/persoana').then(
    function successCallback(response) {

    $scope.persoane = response;
    $scope.keys = Object.keys(response.data[0]);
  });


  $scope.addPersoana = function(person) {
    $scope.persoane.data.push(person);
    $http.post('http://localhost:8080/persoana', person);
    $scope.person = {};
  };

  $scope.setUpdatePerson = function(person) {
    $scope.editPerson = person;
  };

  $scope.updatePerson = function() {
    $http.put('http://localhost:8080/persoana', $scope.editPerson);
    $scope.editPerson = {};
  };

  $scope.deletePersoana = function(id) {
    $http.delete('http://localhost:8080/persoana/' + id)
    .then(
      function successCallback(response) {
        /* code goes here */
      },
      function errorCallback(response) {
        angular.element('[data-id=' + id + ']').remove();
    });
  };

  $scope.myArray = ['Elem 1', 'Elem 2', 'Elem 3', 'Elem 4'];
}]);
