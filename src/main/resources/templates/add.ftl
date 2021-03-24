<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Client add</title>
</head>
<body>
<form action="" method="POST">
    <label for="Sur name">Sur name</label>
    <label>
        <input type="text" name="Sur name" value="${(client.surName)!""}"/>
    </label>
    <br>
    <label for="First name">First name</label>
    <label>
        <input type="text" name="First name" value="${(client.firstName)!""}"/>
    </label>
    <br>
    <label for="Last name">Lasr name</label>
    <label>
        <input type="text" name="Last name" value="${(client.lastName)!""}"/>
    </label>
    <br>
    <label for="Phone number">Phone number</label>
    <label>
        <input type="number" name="Phone number" value="${(client.phoneNumber)!""}"/>
    </label>
    <br>
    <label for="email">Email</label>
    <label>
        <input type="email" name="Email" value="${(client.email)!""}"/>
    </label>
    <br>
    <label for="Passport number">Passport number</label>
    <label>
        <input type="number" name="Passport number" value="${(client.passportNumber)!""}"/>
    </label>
    <br>
    <input type="submit" value="submit"/>
</form>
</body>
</html>