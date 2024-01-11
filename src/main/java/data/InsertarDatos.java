package data;

import org.hibernate.boot.model.relational.Database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {
    public static void insertar(){
        try(Connection miCon = Conexion.conectar()){
            System.out.println("ok");
            String consulta = "INSERT INTO ALUMNOS2 (ALUM) VALUES(\n" +
                    "PERSONA(2,'Maria Perez',DIRECCION ('C/Mayor 12',\n" +
                    "'Utebo',50180),'18/12/1999'))\n";
            Statement stmt = miCon.createStatement();
            int registros = stmt.executeUpdate(consulta);
            System.out.println("Registros cambiados: " + registros);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
