package org.example;

import clases.Cliente;
import clases.Empanada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner objetolector = new Scanner(System.in);
        Empanada empanada = new Empanada("Mixtic","CarneDesmechada",3000,5000);
        Cliente cliente = new Cliente();

        int i = 100;

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));


        while(i != 5){
            System.out.println("***Bienvenido***");
            System.out.println("Digite una opcion");
            System.out.println("1. Agregar Empanadas");
            System.out.println("2. Ver Empanadas");
            System.out.println("3. Editar Precio Empanadas");
            System.out.println("5. Salir");
            int opcion = objetolector.nextInt();

            if(opcion == 1){
                System.out.println("ingrese su saldo");
                cliente.setSaldoDisponible(objetolector.nextInt());

                if(cliente.getSaldoDisponible() > 3000){
                    System.out.println("Ingrese su nombre:");
                    cliente.setNombre(objetolector.next());
                    System.out.println("Ingrese su documento:");
                    cliente.setDocumento(objetolector.next());
                    System.out.println("Ingrese su telefono:");
                    cliente.setTelefono(objetolector.next());
                    System.out.println("ingrese el medio de pago:");
                    cliente.setMedioPago(objetolector.next());

                    if(cliente.getNombre() == cliente.getNombre() ){
                        System.out.println(empanada.getNombre());
                        System.out.println("El ingrediente es de :"+empanada.getTipodeempanada());
                        System.out.println("El precio es de: "+empanada.getPreciodeventa());
                        System.out.println("Agregar Cantidad: ");
                        empanada.setCantidad((objetolector.nextInt()));
                        int total = empanada.fabricarEmpanada();
                        if(total > cliente.getSaldoDisponible()){
                            System.out.println("el precio total es de: "+ total);
                            System.out.println("No le alcanza, su saldo es de:" + cliente.getSaldoDisponible());
                            System.out.println("Agrega una Cantidad Menor de Empanadas:");
                            empanada.setCantidad((objetolector.nextInt()));
                            total = empanada.fabricarEmpanada();
                            System.out.println("El total a pagar es de: " + total);
                            System.out.println("Su medio de pago es: "+ cliente.getMedioPago());
                            cliente.setSaldoDisponible(cliente.getSaldoDisponible()-total);
                            System.out.println("Gracias por tu compra!!!");
                            System.out.println("Su saldo disponible es de :" + cliente.getSaldoDisponible());
                        }else {
                            System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
                            System.out.println("El total a pagar es de: " + total);
                            System.out.println("Su medio de pago es: "+ cliente.getMedioPago());
                            cliente.setSaldoDisponible(cliente.getSaldoDisponible()-total);
                            System.out.println("Gracias por tu compra!!!");
                            System.out.println("Su saldo disponible es de :" + cliente.getSaldoDisponible());
                            System.out.println("Enter para regresar al menu");
                        }

                    }
                }else {
                    System.out.println("No tienes dinero");
                    break;
                }
            }else if (opcion  == 2){
                System.out.println("***Datos de empanada");
                System.out.println("EL NOMBRE ES: "+empanada.getNombre());
                System.out.println("EL TIPO DE EMPANADA: "+empanada.getTipodeempanada());
                System.out.println("PRECIO DE VENTA: "+empanada.getPreciodeventa());
                System.out.println("CANTIDAD EMPANADAS: "+empanada.getCantidad());
                System.out.println("TOTAL COMPRA: "+empanada.fabricarEmpanada());

            }else if(opcion == 3){

            }else if(opcion ==5){

            }else{
                          break;
            }
        }
    }
}