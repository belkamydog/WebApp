<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My first Web-app</title>
</head>
<body>

<h1>Simple Shop!</h1>
<h2>Products from Mary-El</h2>
<#list products as product>
    <div>
        <p>${product.title} ${product.price} <a href="/product/${product.id}"> More info </a> </p>
    </div>
</#list>
<hr>
<h3>Create new product</h3>
<form action="/product/create" method="post">
    Title: <input type="text" name="title"/><br><br>
    Description: <input type="text" name="description"/><br><br>
    Price: <input type="number" name="price"/><br><br>
    City: <input type="text" name="city"/><br><br>
    Author: <input type="text" name="author"/><br><br>
    <input type="submit" value="add"/><br>
</form>
</body>
</html>