<%@ include file="header.jsp" %>
<% String error = (String) request.getAttribute("error");
   if (error != null) { %>
  <p style="color: red"><%= error %></p>
<% } %>
<form action="${pageContext.request.contextPath}/auth" method="post">
  Username: <input name="username" autocomplete="username"><br>
  Password: <input type="password" name="password" autocomplete="current-password"><br>
  <button type="submit">Login</button>
</form>
<p>Demo credentials: admin / 1234</p>
