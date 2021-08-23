<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>        
</head>
<body>		

	<sql:setDataSource var ="db" 
	driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3309/temp1" 
	user="root" password="admin"/>
	
	<sql:query var="rs" dataSource="${db}">select * from emp</sql:query>
	<table>
		<tr>
			<td>EID</td>
			<td>ENAME</td>
			<td>EDEPT</td>
		</tr>
		<c:forEach items="${rs.rows}" var="row">
				<tr>
				 <td> <c:out value = "${row.eid}"/> </td>
				 <td> <c:out value = "${row.ename}"/> </td>
				 <td> <c:out value = "${row.edeptname}"/></td>
				</tr>
		</c:forEach>
	</table>

</body>
</html> 	
