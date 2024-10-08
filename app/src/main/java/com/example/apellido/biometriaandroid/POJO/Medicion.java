package com.example.apellido.biometriaandroid.POJO;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @brief Clase que representa una medición de gas.
 *
 * Esta clase contiene información sobre una medición de gas, incluyendo la medida, el lugar, el tipo de gas y la hora de la medición.
 */
public class Medicion {
    private double medida; ///< La medida del gas.
    private String lugar; ///< El lugar de la medición.
    private String tipo_gas; ///< El tipo de gas medido.
    private final String hora; ///< La hora de la medición.

    /**
     * @brief Constructor para la clase Medicion.
     *
     * @param medida La medida del gas.
     * @param lugar El lugar de la medición.
     * @param tipo_gas El tipo de gas medido.
     */
    public Medicion(double medida, String lugar, String tipo_gas) {
        this.medida = medida;
        this.lugar = lugar;
        this.tipo_gas = tipo_gas;

        // Formateando la hora a String con el formato deseado
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        this.hora = sdf.format(new Date()); // Asignar la hora actual en el formato correcto
    }

    /**
     * @brief Getter para la medida.
     *
     * @return La medida del gas.
     */
    public double getMedida() {
        return medida;
    }

    /**
     * @brief Getter para el lugar.
     *
     * @return El lugar de la medición.
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @brief Getter para el tipo de gas.
     *
     * @return El tipo de gas medido.
     */
    public String getTipo_gas() {
        return tipo_gas;
    }

    /**
     * @brief Getter para la hora.
     *
     * @return La hora de la medición.
     */
    public String getHora() {
        return hora;
    }

    /**
     * @brief Setter para la medida.
     *
     * @param medida La nueva medida del gas.
     */
    public void setMedida(double medida) {
        this.medida = medida;
    }

    /**
     * @brief Setter para el lugar.
     *
     * @param lugar El nuevo lugar de la medición.
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @brief Setter para el tipo de gas.
     *
     * @param tipo_gas El nuevo tipo de gas medido.
     */
    public void setTipo_gas(String tipo_gas) {
        this.tipo_gas = tipo_gas;
    }

    /**
     * @brief Método para convertir el objeto a JSON con el orden deseado.
     *
     * @return El objeto en formato JSON como cadena.
     */
    public String toJson() {
        JsonObject jsonObject = new JsonObject();

        // Añadiendo los campos en el orden deseado
        jsonObject.addProperty("medida", medida);
        jsonObject.addProperty("lugar", lugar);
        jsonObject.addProperty("tipo_gas", tipo_gas);
        jsonObject.addProperty("hora", hora);

        return jsonObject.toString(); // Retorna el JSON como cadena
    }

    /**
     * @brief Método toString para mostrar el objeto en formato cadena.
     *
     * @return El objeto en formato cadena.
     */
    @NonNull
    @Override
    public String toString() {
        return "Medicion{" +
                "medida=" + medida +
                ", lugar='" + lugar + '\'' +
                ", tipoGas='" + tipo_gas + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}