<jsp:useBean id="user" class="com.example.User" scope="session"/><h2>Welcome, <jsp:getProperty name="user" property="username"/>!</h2><jsp:include page="footer.jsp"/>
