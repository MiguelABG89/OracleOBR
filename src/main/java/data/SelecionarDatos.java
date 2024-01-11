package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelecionarDatos {
    public static void notasMediasAlumnos(){
        try(Connection miCon = Conexion.conectar()) {
            System.out.println("ok");
            String consulta = "select A.ALUM.NOMBRE, A.MEDIA() from ALUMNOS2 A";
            Statement stmt = miCon.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
//            Alumno alumnoAux;
            while (rs.next()){
                String alumRs = rs.getString("ALUM.NOMBRE");
                Float alumMedia = rs.getFloat("A.MEDIA()");
                System.out.println(alumRs + ": NOTA MEDIA: "+ alumMedia);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
