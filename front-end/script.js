const fomulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Iusername = document.querySelector(".username");
const Isenha = document.querySelector(".senha");
const Itel = document.querySelector(".tel");

function cadastrar () {

    fetch("http://localhost:8080/usuarios",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                nome: Inome.value,
                email: Iemail.value,
                username: Iusername.value,
                senha: Isenha.value,
                telefone: Itel.value,
            })
        })
        .then(function (res) { console.log(res) })
        .catch(function (res) { console.log(res) })
};

function limpar() {
    Inome.value = "";
    Iemail.value = "";
    Iusername.value = "";
    Isenha.value = "";
    Itel.value = "";
};



fomulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    limpar();
});