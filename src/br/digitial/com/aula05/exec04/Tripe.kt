package br.digitial.com.aula05.exec04

class Tripe(var dobrado: Boolean, var alturaMaxima: Double, var alturaMinima: Double, var alturaAtual: Double) {
    fun definirAltura(novaAltura: Double) {
        this.alturaAtual = novaAltura;
    }

    fun dobrar() {
        this.dobrado = true;
    }

    fun desdobrar() {
        this.dobrado = false;
    }

    fun guardar() {
        this.dobrar();
        this.definirAltura(this.alturaMinima);
    }

    fun prontoParaGuardar(): Boolean {
        return this.dobrado && this.alturaMinima == this.alturaAtual;
    }

    fun usar() {
        this.desdobrar();
        this.definirAltura(this.alturaMaxima / 2);
    }

    fun prontoParaUsar(): Boolean {
        return !(this.dobrado && this.alturaAtual >= this.alturaMaxima / 2);
    }

}

