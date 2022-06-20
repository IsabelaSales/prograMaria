 //se o campo nome estiver preenchido e o campo email estiver preenchido envie os dados
//senão
//peça ao usuario para preencher os campos nome e email

document.getElementById("butaoenviar").addEventListener("click", validaFormulario)

function validaFormulario(){
    if (document.getElementById("email").value != "" &&         
        document.getElementById("nome").value != "" &&     
        document.getElementById("contato").value != ""){
          alert("Dados enviados! Agradecemos.")
          }else{
        alert("Há um ou mais campos que não foram preenchidos, é necessario que todos os campos sejam preenchidos!")
        }
          }

//addEventListener é um ouvidor de evendtos e precisa das seguintes informações:
// De onde virá o entendo : Ao clicar no butao enviar
//Qual evendo ele dece ouvi?  o evenot de click 
//O que ele deve fazer quando o evento acontecer? Verificar os enventos
//veja como deve ser feito:
//dequemviraoevento.addEventListener("evento", oquedevefazer)
