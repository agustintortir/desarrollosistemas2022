function operacion(numero1, operador, numero2) {
    let resultado = null;

    if (numero1 % 1 != 0) {
        return null;
    }
    else if (numero2 % 1 != 0) {
        return null;
    } else {
        if (operador == "+") {
            resultado = numero1 + numero2;
        }
        else if (operador == "-") {
            resultado = numero1 - numero2;
        }
        else if (operador == "*") {
            resultado = numero1 * numero2;
        }
        else if (operador == "/") {
            resultado = numero1 / numero2;
        }

        return resultado;
    }
}

const numero1Str = prompt("Numero 1?");
const operador = prompt("Operador?");
const numero2Str = prompt("Numero 2?");

const numero1 = Number(numero1Str);
const numero2 = Number(numero2Str);

if (
    numero1Str.trim() == "" || numero2Str.trim() == "" ||
    Number.isNaN(Number(numero1Str)) || Number.isNaN(Number(numero2Str)) ||
    numero1 % 1 != 0 || numero2 % 1 != 0
) {
    alert("Uno de los números es invalido");
}
else {
    alert(operacion(numero1, operador, numero2));
}
