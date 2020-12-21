<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Vendors</title>
</head>
<body>
	<pre>
		<form action="updateLoc" method="POST"> 
		<pre>
			ID :    <input type='text' name='id' value="${vendor.id}" readonly/>
			Code:	<input type='text' name='code' value="${vendor.code}"/>
			Name:	<input type='text' name='name' value="${vendor.name}"/>
			Type: 	Urban :	<input type='checkbox' name='type' value='wholesale' ${vendor.type == 'urban' ? 'checked':''} />
					Rural : <input type='checkbox' name='type' value='retail' ${vendor.type == 'rural' ? 'checked':''}/>
			Email:  <input type='text' name='email' value="${vendor.email}"/>
			Phone: <input type='text' name='phone' value="${vendor.phone}"/>
			Address: <textarea name='address'>${vendor.address}</textarea>
					<input type='submit' value='save'/> 
		</pre>
	</pre>
	<p>
		${msg}
	</p>
	<p>
		<a href="displayVendors">View All</a>
	</p>
</body>
</html>