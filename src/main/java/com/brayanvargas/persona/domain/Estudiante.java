package com.brayanvargas.persona.domain;
import java.util.List;

public class Estudiante extends Persona{
   private List<String> materias;
   private List<Double> promedioNotas;

   public List<String> getMaterias() {
      return materias;
   }

   public void setMaterias(List<String> materias) {
      this.materias = materias;
   }

   public List<Double> getPromedioNotas() {
      return promedioNotas;
   }

   public void setPromedioNotas(List<Double> promedioNotas) {
      this.promedioNotas = promedioNotas;
   }
}
