<g:if test="${usuarios}">
	<h2>Usuarios</h2>
	<ul>
		<g:each var="usuario" in="${usuarios}">
			<li>${usuario.id}. ${usuario.nombre}</li>
		</g:each>
	</ul>
</g:if>

<g:if test="${telefonos}">
	<h2>Telefonos</h2>
	<ul>
		<g:each var="telefono" in="${telefonos}">
			<li>${telefono.id}. ${telefono.numero}</li>
		</g:each>
	</ul>
</g:if>

<g:if test="${direcciones}">
	<h2>Direcciones</h2>
	<ul>
		<g:each var="direccion" in="${direcciones}">
			<li>${direccion.id}. ${direccion.calle}</li>
		</g:each>
	</ul>
</g:if>