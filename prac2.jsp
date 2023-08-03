<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <button id="myButton" onclick="changeButtonText()">Heeeun!</button>

  <script>
    function changeButtonText() {
      const button = document.getElementById("myButton");
      button.innerText = "Clicked!";
    }
  </script>
</body>
</html>
