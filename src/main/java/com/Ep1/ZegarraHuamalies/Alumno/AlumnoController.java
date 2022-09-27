package com.Ep1.ZegarraHuamalies.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/alumno")

public class AlumnoController {

        @GetMapping
        @RequestMapping("/getAll")

        public List<Alumno> getAllAlumno (){
            Alumno alumno = new Alumno("A01","Alonso","Zegarra","70650788","Integracion de aplicaciones");
            Alumno alumno1 = new Alumno("A02","Elias","Ibarra","95847623","Gestion de Proyectos");
            Alumno alumno2 = new Alumno("A03","Jael","Danielli","72548631","Soluciones CLOUD");
            Alumno alumno3 = new Alumno("A04","Aaron","Lucero","35468792","Desarrollo de aplicaciones 2");
            return List.of(alumno,alumno1,alumno2,alumno3);
        }
}
