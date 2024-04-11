package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Empleados {
	private String nombre;
	private int edad;
	private int codigo;
	private String email;
}
