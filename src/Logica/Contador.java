/*
 * Clase Contador.java
 */
package Logica;

/**
 * Clase que permite implementar un contador
 * @author Estudiantes
 */
public class Contador {
    private int valor;
    /**
     * Metodo que retorna el valor del cronometro
     * @return : retorna el valor de "valor"
     */

    public Contador(int valor) {
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }
    /**
     * Metodo dque establece el valor del cronometro
     * @param valor: entero qie se setea en el atributo de la clase
     */

    public void setValor(int valor) {
        this.valor = valor;
    }
    public Contador(){
        this.valor = 0;
    }
    /**
     *Metodo que avanza el valor del cronometro
    */
    public void avanzar(){
        this.valor += 1;
    }
    /**
     * Metodo que retrocede el valor del cronometro
     */
    public void retroceder(){
        this.valor -= 1;
    }
    /**
     * Motodo que reinicia el valor del cronometro
     */
    public void borrar(){
        this.valor = 0;
    }
}

