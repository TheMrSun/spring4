<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<%@ page isELIgnored="false"%>

<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>

<%--  注意此处需要创建检查message配置,并在类中说明 ValidationMessages.properties--%>

  <body>
    <h1>Register show</h1>
    <sf:form method="POST" commandName="spitter">
      <sf:errors path="*" element="div" cssClass="errors" />
      First Name: <sf:input path="firstName" name="firstName" type="text"/><br/>
      Last Name: <sf:input path="lastName" name="lastName" type="text"/> <br/>
      Email: <sf:input path="email" name="email" type="email"/> <br/>
      Username: <sf:input path="username" name="username" type="text"/> <br/>
      Password: <sf:input path="password" name="password" type="password"/><br/>
      <input type="submit" value="Register" />
    </sf:form>
  </body>
</html>
