
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendors - add vendor</title>
</head>
<body>
	
		<form action='saveLoc' method='post'>
		<pre>
			ID :    <input type='text' name='id'/>
			Code:	<input type='text' name='code'/>
			Name:	<input type='text' name='name'/>
			Type: 	Wholesale :	<input type='checkbox' name='type' value='wholesale'/>
					Retail 	  : <input type='checkbox' name='type' value='retail'/>
			Email:  <input type='text' name='email'/>
			Phone:  <input type='text' name='phone'/>
			Address:<textarea name='address'></textarea>
					<input type='submit' value='save'/> 
			</pre>
		</form>
		
		<pre>
			${msg}
		</pre>
	<a href="displayVendors">Show All VENDORS</a>
</body>
</html>