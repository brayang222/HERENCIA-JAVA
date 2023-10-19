package com.brayanvargas.dispositivo.domain;

public class Celular {
   private String marca;
   private long serial;
   private String modelo;
   private String color;
   private short ram;
   private short rom;

   public void encender() {
      System.out.println("Encendiendo...");
   }

   public void apagar(){
      System.out.println("Apagando...");
   }

   public String getMarca() {
      return marca;
   }

   public long getSerial() {
      return serial;
   }

   public String getModelo() {
      return modelo;
   }

   public String getColor() {
      return color;
   }

   public short getRam() {
      return ram;
   }

   public short getRom() {
      return rom;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void setRam(short ram) {
      this.ram = ram;
   }

   public void setRom(short rom) {
      this.rom = rom;
   }
}
