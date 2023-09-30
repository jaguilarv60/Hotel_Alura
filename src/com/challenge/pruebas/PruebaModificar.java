package com.challenge.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.challenge.factory.ConnectionFactory;

public class PruebaModificar {

	public static void main(String[] args) throws SQLException {
	
		Connection con = new ConnectionFactory().recuperaConexion();
		Statement statement = con.createStatement();
		statement.execute("UPDATE HUESPED SET NOMBRE = 'Sergio', APELLIDO = 'Perez', FECHA_NACIMIENTO = '1996-09-14', NACIONALIDAD = 'Mexicana', TELEFONO = '2222222222'"
				+ " WHERE ID = 1");
		statement.execute("UPDATE RESERVA SET FECHA_ENTRADA = '2023-09-12', FECHA_SALIDA = '2023-09-16', VALOR = 800.00, FORMA_PAGO = 'Tarjeta de Débito',"
				+ " HUESPED_ID = 1 WHERE ID = 1");
		
		System.out.println(statement.getUpdateCount());
	}
}
