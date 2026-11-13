<%@ page contentType="text/html;charset=UTF-8" import="java.util.Date" %>
<html>
<body>
  <h2>JSP Scripting Elements</h2>
  <p>Date: <%=new Date()%></p>

  <hr/>
  <h2>Print Phrase N Times</h2>
  <form method="post" action="index.jsp">
    <label for="num">Enter a number:</label>
    <input type="number" id="num" name="num" min="1" required />
    <input type="submit" value="Print" />
  </form>

  <%
    String numParam = request.getParameter("num");
    if (numParam != null && !numParam.isEmpty()) {
      int times = Integer.parseInt(numParam);
  %>
      <h3>Output (<%=times%> times):</h3>
      <% for (int i = 1; i <= times; i++) { %>
        <p><%=i%>. Write once, Run anywhere</p>
      <% } %>
  <% } %>

</body>
</html>

