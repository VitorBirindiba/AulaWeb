<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href ="css/bootstrap.css" rel="stylesheet">
	
<title>Insert title here</title>
</head>
<body>
<div claas= panel "panel-primary painel-cadstro">
	<div class= "panel-heading">Cadastro</div>
	<div class= "panel-body">
	<form method="post" action="EditarCliente/acao-cadsatral">

	
	<fieldset>
	
		<div class="form-group">
			<label for ="nome">Nome completo</label>
			<input type= "text" class="form-control" id="nome" name="nome" autofocus required>
		</div>
		
		<div class="form-group">
			<label for="login">Usuário</label>
			<input type="text" class="form-control" id="login" name="login" required>
		</div>
		
		<div class="form-group">
			<label for="senha1">Senha</label>
			<input type="password" class="form-control" id="senha1" nome = "senha1" required>
		</div>
		
		<div class = "form-group">
			<label for="senha2">Repita a senha</label>
			<input type="password" class="form-control" id="senha2" name="senha2" required >
		</div>
	</fieldset>
		</div>	
</div>
	<input type="submit" class="btn btn-primary" value="confirmar">
</form>
</div>
</body>
</html>