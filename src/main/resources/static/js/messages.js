console.log("Connecting...")
connect()

$(document).ready(function () {
    const textinput = $("#textinput")
    $("#sendMessageBtn").on("click", function () {
        if (textinput.val() === '') return
        console.log('aaa')
        sendMessage(textinput.val())
        textinput.val('')
    })
});

