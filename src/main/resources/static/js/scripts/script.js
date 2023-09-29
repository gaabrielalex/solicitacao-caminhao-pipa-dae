
function onSearch() {
    const input = document.querySelector("input[type='search']");
    const valor = input.value;
    const form = document.querySelector("form");

    switch (valor.toString().toLowerCase().trim()) {
        
        case "h2": {
            form.action = "http://localhost:9010/h2-console";
            form.target = "_blank";
            break;
        }
        case "": {
            return false;
        }
        default:{
            alert("Não foi encontrado o recurso");
            return false;
        }
    }
    form.submit();

    // Limpa os atributos que foram modificados
    form.action = "";
    form.target = "";
    return true;
  }
  
  document.querySelector("form").addEventListener("submit", onSearch);