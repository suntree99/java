<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Belajar JSP Scriptlet</title>
</head>
<body>
    <jsp:scriptlet>
      out.println("Halo ini menggunakan scriptlet XML");
    </jsp:scriptlet>

    <% out.println("Halo ini menggunakan scriptlet expression"); %>
</body>
</html>