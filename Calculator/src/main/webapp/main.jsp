<!DOCTYPE html>
<html>
<head>
    <title>Real-Life Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .calculator {
            width: 300px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        input[type="text"] {
            width: 100%;
            margin-bottom: 10px;
            padding: 8px;
            box-sizing: border-box;
        }
        input[type="button"] {
            width: 48%;
            padding: 10px;
            font-size: 16px;
        }
        .row:after {
            content: "";
            display: table;
            clear: both;
        }
    </style>
</head>
<body>
    <div class="calculator">
        <h2>Real-Life Calculator</h2>
        <form action="CalculatorServlet" method="post">
            <input type="text" name="display" id="display" readonly>
            <div class="row">
                <input type="button" value="7" onclick="appendToDisplay('7')">
                <input type="button" value="8" onclick="appendToDisplay('8')">
                <input type="button" value="9" onclick="appendToDisplay('9')">
                <input type="button" value="/" onclick="appendToDisplay('/')">
            </div>
            <div class="row">
                <input type="button" value="4" onclick="appendToDisplay('4')">
                <input type="button" value="5" onclick="appendToDisplay('5')">
                <input type="button" value="6" onclick="appendToDisplay('6')">
                <input type="button" value="-" onclick="appendToDisplay('-')">
            </div>
            <div class="row">
                <input type="button" value="1" onclick="appendToDisplay('1')">
                <input type="button" value="2" onclick="appendToDisplay('2')">
                <input type="button" value="3" onclick="appendToDisplay('3')">
                <input type="button" value="+" onclick="appendToDisplay('+')">
            </div>
            <div class="row">
                <input type="button" value="0" onclick="appendToDisplay('0')">
                <input type="button" value="." onclick="appendToDisplay('.')">
                <input type="button" value="C" onclick="clearDisplay()">
                <input type="button" value="=" onclick="calculate()">
            </div>
        </form>
    </div>

    <script>
        function appendToDisplay(value) {
            document.getElementById("display").value += value;
        }

        function clearDisplay() {
            document.getElementById("display").value = "";
        }

        function calculate() {
            try {
                document.getElementById("display").value = eval(document.getElementById("display").value);
            } catch (error) {
                document.getElementById("display").value = "Error";
            }
        }
    </script>
</body>
</html>
