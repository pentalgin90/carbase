<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>start page</title>
</head>
<body>
	<form action="FrontController" method="post"> 
		<input type="hidden" name="command" value="carsAll" />
		<input type="submit" name="carsAll" value="все машины" />
	 </form>
	 <form action="FrontController" method="post"> 
		<input type="hidden" name="command" value="create" />
		<input type="submit" name="create" value="добавить машину" />
	 </form>
	 <form action="FrontController" method="post"> 
		<input type="hidden" name="command" value="delitecar" />
		<input type="submit" name="delitecar" value="удалить машину" />
	 </form>
	 <form action="FrontController" method="post"> 
		<input type="hidden" name="command" value="updatecar" />
		<input type="submit" name="updatecar" value="изменить машину" />
	 </form>
	 <form action="FrontController" method="post"> 
		<input type="hidden" name="command" value="read" />
		<input type="submit" name="read" value="показать машину" />
	 </form>
</body>
</html>