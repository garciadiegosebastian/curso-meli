<html>
<head>
	<title>Pruebas con BelongsTo</title>
	<meta name="layout" content="main" />
	<style>
	</style>
</head>
<body>
	<h1>Probar transacciones</h1>

	<h2>Usuarios</h2>
	<ul>
		<g:each var="usuario" in="${usuarios}">
			<li>${usuario.id}. ${usuario.nombre}</li>
		</g:each>
	</ul>

	<h2>Telefonos</h2>
	<ul>
		<g:each var="telefono" in="${telefonos}">
			<li>${telefono.id}. ${telefono.numero}</li>
		</g:each>
	</ul>

	<h2>Direcciones</h2>
	<ul>
		<g:each var="direccion" in="${direcciones}">
			<li>${direccion.id}. ${direccion.calle}</li>
		</g:each>
	</ul>

	<a href="${createLink(controller: 'showcase', action: 'index')}">Volver al home</a>
</body>
</html>