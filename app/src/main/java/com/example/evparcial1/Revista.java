package com.example.evparcial1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Revista {


    private String año;
    private String mes;
    private String url;
    private String imagen;
    private static final String URL_BASE_IMAGENES = "https://uteq.edu.ec/assets/images/newspapers/";

    // El constructor debe usar los keys correctos del JSON
    public Revista(JSONObject a) throws JSONException {
        // Mapea el campo "anio" del JSON a la variable "año"
        año = a.getString("anio");
        // Mapea el campo "mes" del JSON a la variable "mes"
        mes = a.getString("mes");
        // Mapea el campo "urlpw" del JSON a la variable "url" (el PDF)
        url = a.getString("urlpw");
        // Mapea el campo "urlportada" del JSON a la variable "imagen"
        imagen = a.getString("urlportada");
    }

    // El resto de la clase está bien...
    public static ArrayList<Revista> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Revista> revistas = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            revistas.add(new Revista(datos.getJSONObject(i)));
        }
        return revistas;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagen() {
        return imagen;
    }


}
