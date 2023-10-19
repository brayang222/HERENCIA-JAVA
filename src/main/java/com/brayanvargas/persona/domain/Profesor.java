package com.brayanvargas.persona.domain;

public class Profesor extends Persona{
   private String numEstudiantes;
   private String materiaAsignada;

   public String getNumEstudiantes() {
      return numEstudiantes;
   }

   public void setNumEstudiantes(String numEstudiantes) {
      this.numEstudiantes = numEstudiantes;
   }

   public String getMateriaAsignada() {
      return materiaAsignada;
   }

   public void setMateriaAsignada(String materiaAsignada) {
      this.materiaAsignada = materiaAsignada;
   }
}
