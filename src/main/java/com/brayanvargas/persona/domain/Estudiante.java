package com.brayanvargas.persona.domain;

public class Estudiante extends Persona{
   private String materias;
   private double promedioNotas;

   public String getMaterias() {
      return materias;
   }

   public void setMaterias(String materias) {
      this.materias = materias;
   }

   public double getPromedioNotas() {
      return promedioNotas;
   }

   public void setPromedioNotas(double promedioNotas) {
      this.promedioNotas = promedioNotas;
   }
}
