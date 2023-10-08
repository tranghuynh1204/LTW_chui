<%-- 
    Document   : thanks
    Created on : 31 thg 8, 2023, 13:53:46
    Author     : huynhthihuyentrang
--%>

<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
    <h1>Thanks for joining our survey</h1>

    <p>Here is the information that you entered:</p>
    
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>Date of Birth:</label>
    <span>${user.dateofBirth}</span><br>
    <label>You know us via:</label>
    <span>${user.knowVia}</span><br>
    <label>And you said that:</label>
    <span>${user.yes[0]}</span>
    <span>${user.yes[1]}</span><br>
    <label>Contact you by :</label>
    <span>${user.contact}</span><br>
<p>To enter another survey, click on the Back 
    button in your browser or the Return button shown 
    below.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>

