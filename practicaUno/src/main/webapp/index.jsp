<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>inicio Formulario</title>
</head>
<body>
	<h1>Practica Uno</h1>
	<div>
		<form action="/practicaUno-0.0.1-SNAPSHOT/formulario" method="post">
			<legend>Nuevo Formulario</legend>
			<div>
				<label for="nombre">Nombre <input name="nombre" id="nombre"
					type="text" />
				</label>
			</div>
			<div>
				<label for="apellidos">Apellidos <input name="apellidos"
					id="apellidos" type="text" />
				</label>
			</div>
			<div>
				<label for="telefono">Telefono <input id="telefono"
					name="telefono" type="text" />
				</label>
			</div>
			<div>
				<label for="cedula">Cedula <input id="cedula" name="cedula"
					type="text" />
				</label>
			</div>
			<input type="submit" value="Enviar" />
		</form>
	</div>

</body>
</html>
