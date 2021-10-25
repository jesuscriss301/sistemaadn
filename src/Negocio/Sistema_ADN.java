/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author sus nombres
 */
public class Sistema_ADN {

    private char[] secuencia_individuo1;
    private char[] secuencia_individuo2;

    public Sistema_ADN() {
    }

    public Sistema_ADN(String adn1, String adn2) {
    }

    /**
     * Obtiene la subsecuencia más grande de ADN
     *
     * @return una cadena con la subsecuencia, o null si no existe la
     * subsecuencia
     */
    public String getSubsecuencia() {

        return ":)";
    }

    
    /**
     * Obtiene el grado del parentesco
     * @return un float que representa el grado de parentesco
     */
    public float gradoParentesco() {
        return 0F;
    }
    
    /**
     * Evalúa si tienen o no parentesco los dos inviduos
     * @return true si tienen parentesco o false en caso contrario
     */
    public boolean tieneParentesco()
    {
        return false;
    }

    public char[] getSecuencia_individuo1() {
        return secuencia_individuo1;
    }

    public char[] getSecuencia_individuo2() {
        return secuencia_individuo2;
    }

    
    
    
}
