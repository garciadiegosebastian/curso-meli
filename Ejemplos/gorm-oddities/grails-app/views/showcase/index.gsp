<html>
<head>
	<title>Cosas raras de GORM</title>
	<meta name="layout" content="main" />
	<style>
	</style>
</head>
<body>
	<meli:databaseStatus />
	<h1>Casos de prueba de GORM</h1>
	<ul>
		<li>
			<a href="${createLink(controller: 'belongsTo', action: 'index')}">BelongsTo como mapa y como asignación</a>: Este ejemplo creara un usuario y le agregará un teléfono y una dirección. Luego lo borrará. Finalmente verificaremos el estado de la base de datos en todas las tablas</li>
		</li>
		<li>
			<a href="${createLink(controller: 'transactions', action: 'index')}">Persistencia de objetos</a>: Dependiendo de que suceda durante una transacción el estado en la base de dato se actualiza o no.</li>
		</li>
	</ul>
</body>
</html>