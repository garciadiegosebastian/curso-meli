<html>
<head>
	<title>Pruebas con BelongsTo</title>
	<meta name="layout" content="main" />
	<style>
	</style>
</head>
<body>
	<h1>Probar transacciones</h1>
	<meli:databaseStatus />

	<form method="post" action="${createLink(action: 'noTransactions')}">
		<button>No usar transacciones, y tampoco usar Flush: true</button>
	</form>

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