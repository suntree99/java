
<%@ page import="java.util.Date" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%--init value--%>
<% request.setAttribute("namaLengkap", new String("Budi Darmawan")); %>
<% request.setAttribute("saldo", new BigDecimal(10000000)); %>
<% request.setAttribute("tanggal", new Date()); %>

<%--init list value--%>
<%! List<String> items = Arrays.asList("Java 8", "Java Database Connectivity", "PostgreSQL", "Java Web", "Java Persistence API"); %>
<% request.setAttribute("technologies", items); %>

<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Belajara JSP - JSTL Function</title>
</head>
<body>

<h3>containsIgnonreCase</h3>
<c:if test="${ fn:containsIgnoreCase(namaLengkap, 'budi darmawan') }">
  <c:out value="Nama lengkap sama seperti pembandingnya"/>
</c:if>

<h3>Jumlah Element Array</h3>
<c:if test="${ fn:length(technologies) >= 1 }">
  <c:out value="Jumlah element dari array technologies lebih dari atau sama dengan 1"/>
</c:if>

<h3>Jumlah Element String</h3>
<c:if test="${ fn:length(namaLengkap) >= 1 }">
  <c:out value="Jumlah element dari array namaLengkap lebih dari atau sama dengan 1"/>
</c:if>


</body>
</html>