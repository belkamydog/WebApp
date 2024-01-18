<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My first Web-app</title>
</head>
<body>

<h1>Hello World!</h1>
<h2>Products from Russia </h2>
Title: ${product.title}<br><br>
Description: ${product.description}<br><br>
Price: ${product.price}<br><br>
City: ${product.city}<br><br>
Author: ${product.author}<br><br>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="delete">
</form>
</body>
</html>