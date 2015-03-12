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

	<form method="post" action="${createLink(action: 'editWithoutSave')}">
		<button>Click para recuperar el usuario Fernando de la DB, modificarlo y olvidar de hacer save.</button>
	</form>
	<form method="post" action="${createLink(action: 'checkedException')}">
		<button>Click Lanzar una checked exception en una transaccion.</button>
	</form>
	<form method="post" action="${createLink(action: 'runtimeException')}">
		<button>Click Lanzar una runtime exception en una transaccion.</button>
	</form>
</body>
</html>