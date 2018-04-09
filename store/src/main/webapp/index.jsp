<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Hello World!</h1>
	<form action="/store-0.0.1-SNAPSHOT/PeopleView" method="post">
		<fieldset>
			<legend>Ingreso de Personal</legend>
			<label for="nombre">Nombre: <input id="nombre" type="text"
				name="nombre">
			</label> <label for="telefono">Telefono: <input id="telefono"
				name="telefono" type="text">
			</label> <input type="submit" value="Registrar">
		</fieldset>
	</form>
</body>
</html>
