package com.sanvalero.myshop.domain;

public class Producto {

    private String raza;
    private String nombre;
    private int edad;

    public Producto(String nuevoNombre) {
        nombre = nuevoNombre; // nombre del animal que este a la venta en la tienda
    }

// Método para obtener la edad del animal

    public int getEdad() {
        return edad;
    }
//Método para establecer la edad del animal

    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }
// Método para obtener el nombre del animal

    public String getNombre() {
        return nombre;
    }
    }



    class Ejemplo
    {
        public static void main(String[] args)
        {
            Producto Miproducto = new Producto("Luna");  // Creamos un animal cuyo nombre sea Luna

            Miproducto.setEdad(3);  // 3 años de edad para el animal

            System.out.println("El nombre del animal es:"+ Miproducto.getNombre()); //Nombre del animal por pantalla

            System.out.println("y tiene"+ Miproducto+ Miproducto.getEdad()+ "años"); // Edad por pantalla

        }
    }




