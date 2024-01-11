package data;

import libs.Leer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class FunVarCiudad {
    public static void funcionCiudad(){
        String nombreAlum = Leer.pedirCadena("Introduce el nombre del alumno: ");
        String nombreCiud;
        try (Connection miCon = Conexion.conectar()){
            CallableStatement cs = miCon.prepareCall("{? = call FUN_VAR_CIUDAD(?)}");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2,nombreAlum);
            cs.execute();
            nombreCiud=cs.getString(1);
            System.out.println(nombreCiud);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
