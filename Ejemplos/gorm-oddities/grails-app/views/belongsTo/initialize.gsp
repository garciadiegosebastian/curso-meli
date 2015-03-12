<html>
<head>
	<title>Pruebas con BelongsTo</title>
	<meta name="layout" content="main" />
	<style>
	</style>
</head>
<body>
	<h1>Borrar el usuario</h1>
	<p>Esta es la información actual en la base de datos</p>
	<meli:databaseStatus />


	<form method="post" action="${createLink(action: 'delete')}">
		<button>Click para borrar todos los usuaios</button>
	</form>
</body>
</html>