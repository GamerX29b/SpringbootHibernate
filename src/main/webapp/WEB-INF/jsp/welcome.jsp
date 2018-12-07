<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Plugin tester</title>
</head>

<body>
<h1>Главная страница</h1>
<form action = "TwoTable" method = "POST">
	<table border = "0">

		<tr>
			<td><b>Назовите имя </b></td>
			<td><input type = "text" name = "ParamName"
					   value = "Zero" size = "70"/></td>
		</tr>
		<tr>
			<td><b>Назовите фамилию </b></td>
			<td><input type = "text" name = "ParamSurname"
					   value = "one" size = "70"/></td>
		</tr>
		<tr>
			<td><b>Назовите отчество </b></td>
			<td><input type = "text" name = "ParamPan"
					   value = "two" size = "70"/></td>
		</tr>

		<tr>
			<td colspan = "2"><input type = "submit" value = "Поприветствовать"/></td>
		</tr>

	</table>
</form>

${time}	${message}

<form action = "ObjPerson" method = "POST">
	<table border = "0">

		<tr>
			<td><b>Id</b></td>
			<td><input type = "text" name = "ParamId"
					   value = "1" size = "70"/></td>
		</tr>
		<tr>
			<td colspan = "2"><input type = "submit" value = "Найти"/></td>
		</tr>

	</table>
</form>
</body>
</html>
