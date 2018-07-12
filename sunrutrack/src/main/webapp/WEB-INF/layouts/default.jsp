<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="eng">
  <head>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <title><tiles:getAsString name="title"/></title>
  </head>
  <body>
  	<div class="container-fluid">
	<div class="row">
		<div class="col-md-12 col-sm-12">
		<tiles:insertAttribute name="header" />
		</div>
	</div>
	<div class="row">
		<div class="col-md-2 col-sm-2">
		<tiles:insertAttribute name="menu" />
		</div>
		<div class="col-md-10 col-sm-10">
		<tiles:insertAttribute name="content" />
		</div>
	</div>
	<div class="row">
		<div class="col-md-12 col-sm-12">
		<tiles:insertAttribute name="footer" />
		</div>
	</div>
</div>
  </body>
</html>


