<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Futuristic Form</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: #000;
            overflow: hidden;
            color: #fff;
        }

        .background {
            position: absolute;
            width: 100%;
            height: 100%;
            background: radial-gradient(circle, #222, #000);
            z-index: -2;
        }

        .floating-squares {
            position: absolute;
            width: 100%;
            height: 100%;
            overflow: hidden;
            z-index: -1;
        }

        .square {
            position: absolute;
            width: 30px;
            height: 30px;
            background: rgba(255, 255, 255, 0.1);
            animation: float 15s infinite;
        }

        @keyframes float {
            0% {
                transform: translateY(0px);
                opacity: 0.5;
            }
            50% {
                opacity: 1;
            }
            100% {
                transform: translateY(-100vh);
                opacity: 0;
            }
        }

        .form-container {
            background: rgba(20, 20, 20, 0.95);
            padding: 40px;
            max-width: 500px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.8);
            text-align: center;
            position: relative;
            animation: fadeIn 2s ease;
        }

        .form-header {
            font-size: 2rem;
            margin-bottom: 20px;
            font-weight: bold;
            text-transform: uppercase;
            color: #fff;
            animation: glow 2s infinite alternate;
        }

        input[type="text"], select {
            width: 100%;
            padding: 12px;
            margin-bottom: 15px;
            border: 2px solid #444;
            border-radius: 8px;
            font-size: 1rem;
            background: #222;
            color: #fff;
            transition: all 0.3s ease;
        }

        input[type="text"]:focus, select:focus {
            border-color: #ff6f61;
            box-shadow: 0 0 10px rgba(255, 111, 97, 0.5);
            outline: none;
        }

        input[type="submit"] {
            padding: 12px 20px;
            border: none;
            border-radius: 8px;
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
            color: white;
            font-size: 1rem;
            font-weight: bold;
            text-transform: uppercase;
            cursor: pointer;
            animation: pulse 2s infinite;
        }

        input[type="submit"]:hover {
            background: linear-gradient(135deg, #ff5b79, #ff6a9c);
            transform: scale(1.05);
        }

        .footer {
            margin-top: 20px;
            font-size: 0.9rem;
            color: #888;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }

        @keyframes glow {
            from {
                text-shadow: 0 0 10px #ff758c;
            }
            to {
                text-shadow: 0 0 20px #ff7eb3;
            }
        }

        @keyframes pulse {
            0%, 100% {
                transform: scale(1);
            }
            50% {
                transform: scale(1.1);
            }
        }
    </style>
</head>
<body>
    <div class="background"></div>
    <div class="floating-squares">
        <div class="square" style="top: 80%; left: 20%; animation-duration: 12s; animation-delay: -2s;"></div>
        <div class="square" style="top: 60%; left: 40%; animation-duration: 10s; animation-delay: -3s;"></div>
        <div class="square" style="top: 90%; left: 70%; animation-duration: 15s; animation-delay: -1s;"></div>
        <div class="square" style="top: 50%; left: 10%; animation-duration: 8s; animation-delay: -4s;"></div>
    </div>

    <div class="form-container">
        <div class="form-header">User Information</div>
        <form action="add" method="post">
            <input type="text" id="name" name="name" placeholder="Name">
            <input type="text" id="phone" name="phone" placeholder="Phone Number">
            <input type="text" id="email" name="email" placeholder="Email">
            <input type="text" id="address" name="address" placeholder="Address">
            <select id="gender" name="gender">
                <option value="">Select Gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>
            <input type="submit" value="Submit">
        </form>
        <div class="footer">Made with <span style="color: #ff6f61;">♥</span> by You</div>
    </div>
</body>
</html>