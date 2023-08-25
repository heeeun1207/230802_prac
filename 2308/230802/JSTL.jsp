<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Example</title>
</head>
<body>
    <h1>People List</h1>
    
    <c:forEach var="person" items="${peopleList}">
        <c:if test="${person.age >= 18}">
            <p>${person.name} (Adult)</p>
        </c:if>
        <c:if test="${person.age < 18}">
            <p>${person.name} (Minor)</p>
        </c:if>
    </c:forEach>
</body>
</html>
