package com.kevin.literatura.helpers;

public interface IConvertirDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
