function clickMe() {
     //alert("hello !!!");
    readInputText();
}

function readInputText() {
    var usernameText = document.getElementById("username").value;
    var passwordText = document.getElementById("pass").value;
    var passrepeatText = document.getElementById("passrepeat").value;
    var txtarea1Text = document.getElementById("txtarea1").value;
    var emailText = document.getElementById("email).value;

    if (usernameText.length === 0) {
            alert("Please Enter the username");
           }

    if (passwordText.length === 0) {
            alert("Please Enter the password");
        }

    if (passrepeatText.length === 0) {
             alert("Please repeat the password");
         }

    if (txtarea1Text.length === 0) {
                 alert("Please enter the Address");
             }
    if (emailText.length === 0) {
                     alert("Please enter the Address");
                 }
}