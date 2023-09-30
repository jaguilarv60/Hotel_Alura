package com.challenge.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.challenge.factory.ConnectionFactory;

public class PruebaGuardar {

	public static void main(String[] args) throws SQLException {
		
		Connection con = new ConnectionFactory().recuperaConexion();
		Statement statement = con.createStatement();
		statement.execute("INSERT INTO HUESPED(nombre, apellido, fecha_nacimiento, nacionalidad, telefono)"
				+ " VALUES ('Sergio', 'Perez', '1996-09-15', 'Mexicana', '2222222222')");
		statement.execute("INSERT INTO RESERVA(fecha_entrada, fecha_salida, valor, forma_pago, huesped_id)"
				+ " VALUES ('2023-09-15', '2023-09-20', 200.00, 'Dinero en Efectivo', 1)");
		
		System.out.println(statement.getUpdateCount());
	}
}
