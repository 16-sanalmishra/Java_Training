<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travel Details</title>
</head>
<body>
	<h1 style="text-align: center;">Hey here are the available flights.</h1>

	<table border="1" style="margin-left: auto; margin-right: auto;">
		<tr>
			<th>Source</th>
			<th>Destination</th>
			<th>Flight</th>
			<th>Price</th>
			<th>Status</th>
		</tr>
		<tr>
			<td>Bangalore</td>
			<td>Delhi</td>
			<td>Spicejet</td>
			<td>5584</td>
			<td><a href="confirmationTicket.html" style="text-align: center;">Book</a></td>
			</tr>
			<tr>
			<td>Bangalore</td>
			<td>Delhi</td>
			<td>Indigo</td>
			<td>6584</td>
			<td><a href="confirmationTicket.html" style="text-align: center;">Book</a></td>
			</tr>
			<tr>
			<td>Bangalore</td>
			<td>Delhi</td>
			<td>Air-Asia</td>
			<td>7584</td>
			<td><a href="confirmationTicket.html" style="text-align: center;">Book</a></td>
			</tr>
			<tr>
			<td>Bangalore</td>
			<td>Delhi</td>
			<td>Air India</td>
			<td>4584</td>
			<td><a href="confirmationTicket.html" style="text-align: center;">Book</a></td>
			</tr>
			<tr>
			<td>Bangalore</td>
			<td>Delhi</td>
			<td>Vistara</td>
			<td>9584</td>
			<td><a href="confirmationTicket.html" style="text-align: center;">Book</a></td>
			</tr>
		</table>
</body>
</html>