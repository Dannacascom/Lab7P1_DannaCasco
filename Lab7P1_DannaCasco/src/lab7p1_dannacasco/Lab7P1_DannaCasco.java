/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_dannacasco;
import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Lab7P1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;menu(opcion);
       
    }
    
    public static void menu(int opcion){
     Scanner entrada = new Scanner(System.in);
     Scanner entrada2 = new Scanner(System.in);


        System.out.println("Bienvenido al lab7 :)");
        
        opcion=0;
        do{
        System.out.println("-----------------------------------");
        System.out.println("1.El calamar Pablo\n2.Torre de control\n3.SALIR");
        System.out.print("Ingrese una opción: ");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
        
        String nds1 = "Espana";
        String nds2 ="Alemania";
        String nds3 = "Costa Rica";
        String nds4 = "Japon";
        String nds5 = "Belgica";
        String nds6 = "Croacia";
        String nds7 = "Canada";
        String nds8 = "Marruecos";
        String opcion2="";
        
                System.out.println("-----------------------------------");
                System.out.println("Espana\nAlemania\nCosta Rica\nJapon\nBelgica\nCroacia\nCanada\nMarruecos");
                System.out.print("Ingrese nombre de la seleccion: ");
                opcion2 = entrada.nextLine();
                
               // if(opcion2==nds1||opcion2==nds2||opcion2==nds3||opcion2==nds4||opcion2==nds5||opcion2==nds6||opcion2==nds7||opcion2==nds8){

                Seleccion ns1 = new Seleccion ("Grupo E",opcion2,"Luis Enrique",26,"si","Primero");
                Seleccion ns2 = new Seleccion ("Grupo E",opcion2,"Hansi Flick",26,"si","Tercero");
                Seleccion ns3 = new Seleccion ("Grupo E",opcion2,"Luis Fernando Suarez",26,"No","Cuarto");
                Seleccion ns4 = new Seleccion ("Grupo E",opcion2,"Hajime Moriyasu",26,"No","Segundo");
                Seleccion ns5 = new Seleccion ("Grupo F",opcion2,"Roberto Martinez",26,"No","Primero");
                Seleccion ns6 = new Seleccion ("Grupo F",opcion2,"Zlatko Dalic",26,"No","Segundo");
                Seleccion ns7 = new Seleccion ("Grupo F",opcion2,"John Herdman",26,"No","Cuarto");
                Seleccion ns8 = new Seleccion ("Grupo F",opcion2,"Walid Regragui",26,"No","Tercero");

             switch(opcion2){
              
            case "Espana":
                System.out.println("-----------------------------------");
                System.out.println(opcion2 + " pertenece al grupo " + ns1.nombredg);
                System.out.println("Su director es " + ns1.direc);
                System.out.println("Tiene " + ns1.jugad + " convocados");
                System.out.println(ns1.jugadcon + " ha ganado el mundial");
                System.out.println("Esta en la " + ns1.posicion + " del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de " + opcion2+"--");
                break;

            case "Alemania":
                System.out.println("-----------------------------------");                
                System.out.println(opcion2 + " pertenece al grupo " + ns2.nombredg);
                System.out.println("Su director es " + ns2.direc);
                System.out.println("Tiene " + ns2.jugad + " convocados");
                System.out.println(ns1.jugadcon + " ha ganado el mundial");
                System.out.println("Esta en la " + ns2.posicion + " del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de " + opcion2);
                break;

            case "Costa Rica":
                System.out.println("-----------------------------------");                
                System.out.println(opcion2 + " pertenece al grupo " + ns3.nombredg);
                System.out.println("Su director es " + ns3.direc);
                System.out.println("Tiene " + ns3.jugad + " convocados");
                System.out.println(ns1.jugadcon + " ha ganado el mundial");
                System.out.println("Esta en la " + ns3.posicion + " del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de " + opcion2);
                break;

            case "Japon":
                System.out.println("-----------------------------------");                
                System.out.println(opcion2 + " pertenece al grupo " + ns1.nombredg);
                System.out.println("Su director es " + ns4.direc);
                System.out.println("Tiene " + ns4.jugad + " convocados");
                System.out.println(ns4.jugadcon + " ha ganado el mundial");
                System.out.println("Esta en la " + ns4.posicion + " del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de " + opcion2);
                break;

            case "Belgica":
                System.out.println("-----------------------------------");
                System.out.println(opcion2 + " pertenece al grupo " + ns5.nombredg);
                System.out.println("Su director es " + ns5.direc);
                System.out.println("Tiene " + ns5.jugad + " convocados");
                System.out.println(ns1.jugadcon + " ha ganado el mundial");
                System.out.println("Esta en la " + ns5.posicion + " del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de " + opcion2);
                break;

            case "Croacia":
                System.out.println("-----------------------------------");                
                System.out.println(opcion2 + " pertenece al grupo " + ns6.nombredg);
                System.out.println("Su director es " + ns1.direc);
                System.out.println("Tiene " + ns6.jugad + " convocados");
                System.out.println(ns6.jugadcon + " ha ganado el mundial");
                System.out.println("Esta en la " + ns6.posicion + " del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de " + opcion2);
                break;
                   

            case "Canada":
                System.out.println("-----------------------------------");                
                System.out.println(opcion2 + " pertenece al grupo " + ns7.nombredg);
                System.out.println("Su director es " + ns7.direc);
                System.out.println("Tiene " + ns7.jugad + " convocados");
                System.out.println(ns1.jugadcon + " ha ganado el mundial");
                System.out.println("Esta en la " + ns7.posicion + " del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de " + opcion2);
                break;
                
             case "Marruecos":
                System.out.println("-----------------------------------");                 
                System.out.println(opcion2+" pertenece al grupo " +ns8.nombredg);
                System.out.println("Su director es "+ns8.direc);
                System.out.println("Tiene "+ns8.jugad+" convocados");
                System.out.println(ns1.jugadcon+" ha ganado el mundial");
                System.out.println("Esta en la "+ns8.posicion+" del grupo");
                System.out.println("--Se ha creado exitosamenre la seleccion de "+opcion2);   
                 
             }      System.out.println("-----------------------------------");                                     
                    System.out.println(" Volviendo al menu principal...");
                    System.out.println("-----------------------------------"); 
               /* }else{
                    no me funciona la validacion :(
                    
                    System.out.println("Verifique la escritura del pais");
                    System.out.println("-----------------------------------");                                     
                    System.out.println(" Volviendo al menu principal...");
                    System.out.println("-----------------------------------");                 
*/
                
                    
                break;
                      
                
            case 2:
                
        System.out.println("-----------------------------------");
        System.out.println("--Bienvenido--");
                
        
        System.out.println("Ingrese modelo del avion 1: ");
        String modelo = entrada2.nextLine();
        System.out.println("Ingrese el codigo: ");
        String codigo = entrada2.nextLine();
        System.out.println("Ingrese anio: ");
        int anio = entrada.nextInt();
        System.out.println("Ingrese Capacidad: ");
        int capacidad = entrada.nextInt();
        System.out.println("Ingrese peso: ");
        int peso = entrada.nextInt(); 
        System.out.println("Ingrese nombre de la aerolinea: ");
        String aerolinea = entrada2.nextLine();
        System.out.println("--se ha agregado el avion exitosamente");        
        System.out.println("-----------------------------------");

        System.out.println("Ingrese modelo del avion 2: ");
        String modelo2 = entrada2.nextLine();
        System.out.println("Ingrese el codigo: ");
        String codigo2 = entrada2.nextLine();
        System.out.println("Ingrese anio: ");
        int anio2 = entrada.nextInt();
        System.out.println("Ingrese Capacidad: ");
        int capacidad2 = entrada.nextInt();
        System.out.println("Ingrese peso: ");
        int peso2 = entrada.nextInt(); 
        System.out.println("Ingrese nombre de la aerolinea: ");
        String aerolinea2 = entrada2.nextLine();
        System.out.println("--se ha agregado el avion exitosamente");        
        System.out.println("-----------------------------------");
        
        System.out.println("Ingrese modelo del avion 3: ");
        String modelo3 = entrada2.nextLine();
        System.out.println("Ingrese el codigo: ");
        String codigo3 = entrada2.nextLine();
        System.out.println("Ingrese anio: ");
        int anio3 = entrada.nextInt();
        System.out.println("Ingrese Capacidad: ");
        int capacidad3 = entrada.nextInt();
        System.out.println("Ingrese peso: ");
        int peso3 = entrada.nextInt(); 
        System.out.println("Ingrese nombre de la aerolinea: ");
        String aerolinea3 = entrada2.nextLine();
        System.out.println("--se ha agregado el avion exitosamente");        
        System.out.println("-----------------------------------");
        
        


                
        avion aviones = new avion(modelo,codigo,anio,capacidad,peso,aerolinea,modelo2,codigo2,anio2,capacidad2,peso2,aerolinea2,modelo3,codigo3,anio3,capacidad3,peso3,aerolinea3);
                
                
                System.out.println("Desea cambiar el estado de un avion ");
                System.out.println("Aviones disponibles:");
                System.out.println("1 "+aviones.modelo);
                System.out.println("2 "+aviones.modelo2);
                System.out.println("3 "+aviones.modelo3);
                System.out.println("Ingrese el numero del avion al que desea cambiar el estado: ");
                int numav=entrada.nextInt();
                System.out.println("--se ha elegido el "+numav);
                
                System.out.println("Estados disponibles: ");
                
                
              
                
                
                
                
                break;
                
            default:
                System.out.println("Que tenga buen día :)");
        
                
    }
        
            
    
}while(opcion<3||opcion>3);
    }
}


