<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
<head>
    <title>Title</title>

   Hello  ${name}
</head>
<body>

<sql:setDataSource var = "Base" driver = "org.h2.Driver"
                   url = "jdbc:h2:tcp://localhost/~/Base"
                   user = "sa"  password = "" />

<sql:query dataSource = "${Base}"  var = "result">
    select ADRESS_PERSON from ADRESS WHERE info_id = ${ParamId};
</sql:query>

<table border = "1" width = "30%">
    <tr>
        <th>Emp ID</th>
    </tr>
    <c:forEach var = "row" items = "${result.rows}">
        <tr>
            <td> <c:out value = "${row.ADRESS_PERSON}"/></td>
        </tr>
    </c:forEach>
</table>
    <form action = "TreeTable" method = "POST">
        <input type = "text" name = "ParamId" value = ${ParamId}/>
        <table border = "0">
            <tr>
                <td><b>Назовите адрес </b></td>
                <td><input type = "text" name = "Adress"
                           value = "Zero" size = "70"/></td>
            </tr>
            <tr>
                <td colspan = "2"><input type = "submit" value = "Новый адрес"/></td>
            </tr>
        </table>
    </form>

</body>
