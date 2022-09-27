package com.Ep1.ZegarraHuamalies.Alumno;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumno {
    String id;
    String nombre;
    String apellido;
    String dni;
    String curso;
}
