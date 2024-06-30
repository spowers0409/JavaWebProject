<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        .navbar {
            overflow: hidden;
            background-color: #4A4A68; /* Bluish gray color */
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0 10px; /* Optional padding for better spacing */
        }

        .navbar a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        .navbar .left {
            display: flex;
        }

        .navbar .right {
            display: flex;
        }

        .navbar .right a {
            margin-left: auto;
            padding: 0; /* Remove padding to fit the image */
        }

        .navbar .right img {
            height: 32px; /* Adjust height as needed */
            width: auto;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <div class="left">
            <a href="home.jsp">Home</a>
            <a href="about.jsp">About</a>
            <a href="contact.jsp">Contact</a>
        </div>
        <div class="right">
            <a href="https://github.com/spowers0409/JavaWebProject" target="_blank">
                <img src="images/github-mark.png" alt="GitHub">
            </a>
        </div>
    </div>
</body>
</html>
