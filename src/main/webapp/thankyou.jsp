<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thank You</title>
    <style>
        .popup {
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            background-color: #f9f9f9;
            z-index: 1000;
        }

        .popup h2 {
            margin-top: 0;
            color: #333;
        }

        .popup button {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            background-color: #333;
            color: white;
            cursor: pointer;
            text-transform: uppercase;
        }

        .popup button:hover {
            background-color: #555;
        }

        .overlay {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background-color: rgba(0, 0, 0, 0.5);
            z-index: 999;
        }
    </style>
    <script>
        function closePopup() {
            document.getElementById('popup').style.display = 'none';
            document.getElementById('overlay').style.display = 'none';
            window.location.href = 'contact.jsp';
        }
    </script>
</head>
<body>
    <div id="overlay" class="overlay"></div>
    <div id="popup" class="popup">
        <h2>Thank You!</h2>
        <p>Thank you for your message. We will get back to you shortly.</p>
        <button onclick="closePopup()">Close</button>
    </div>
</body>
</html>
