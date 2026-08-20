import java.util.Scanner;
public class automovilismo_deportivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] pilotos = new String[10];
        String[] vehiculos = new String[10];
        String[] equipos = new String[10];
        String[] competencias = new String[10];
        String[] circuitos = new String[10];
        String[] categorias = new String[10];
        int[] vueltas = new int[10];
        String[] tiempos = new String[10];
        int[] posiciones = new int[10];
        int[] puntos = new int[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------------//
        //--|menu_principal_de_automovilismo_deportivo|--//
        //-----------------------------------------------//
        do {
            System.out.println("menu principal de automovilismo deportivo");
            System.out.println("1) Registrar competencia");
            System.out.println("2) Editar competencia");
            System.out.println("3) Listar competencias");
            System.out.println("4) Buscar competencia");
            System.out.println("5) Eliminar competencia");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //---------------------------//
                //--|registrar_competencia|--//
                //---------------------------//
                case 1:
                    if (total >= pilotos.length) {
                        System.out.println("No hay espacio para registrar mas competencias.");
                        break;
                    }
                    System.out.println("registro de competencia");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("nombre del piloto: ");
                    pilotos[total] = entrada.nextLine();
                    System.out.print("vehiculo: ");
                    vehiculos[total] = entrada.nextLine();
                    System.out.print("equipo: ");
                    equipos[total] = entrada.nextLine();
                    System.out.print("competencia: ");
                    competencias[total] = entrada.nextLine();
                    System.out.print("circuito: ");
                    circuitos[total] = entrada.nextLine();
                    System.out.print("categoria: ");
                    categorias[total] = entrada.nextLine();
                    System.out.print("cantidad de vueltas: ");
                    vueltas[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("tiempo total: ");
                    tiempos[total] = entrada.nextLine();
                    System.out.print("posicion final: ");
                    posiciones[total] = entrada.nextInt();
                    System.out.print("puntos obtenidos: ");
                    puntos[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("estado: ");
                    estados[total] = entrada.nextLine();
                    total++;
                    System.out.println("Competencia registrada correctamente.");
                    break;
                //------------------------//
                //--|editar_competencia|--//
                //------------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen competencias registradas.");
                        break;
                    }
                    System.out.println("datos de las competencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Piloto: " + pilotos[i] + " | Vehiculo: " + vehiculos[i] + " | Equipo: " + equipos[i] + " | Competencia: " + competencias[i] + " | Circuito: " + circuitos[i] + " | Categoria: " + categorias[i] + " | Vueltas: " + vueltas[i] + " | Tiempo: " + tiempos[i] + " | Posicion: " + posiciones[i] + " | Puntos: " + puntos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la competencia a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar competencia");
                        System.out.print("nuevo piloto: ");
                        pilotos[posicion] = entrada.nextLine();
                        System.out.print("nuevo vehiculo: ");
                        vehiculos[posicion] = entrada.nextLine();
                        System.out.print("nuevo equipo: ");
                        equipos[posicion] = entrada.nextLine();
                        System.out.print("nueva competencia: ");
                        competencias[posicion] = entrada.nextLine();
                        System.out.print("nuevo circuito: ");
                        circuitos[posicion] = entrada.nextLine();
                        System.out.print("nueva categoria: ");
                        categorias[posicion] = entrada.nextLine();
                        System.out.print("nuevas vueltas: ");
                        vueltas[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("nuevo tiempo total: ");
                        tiempos[posicion] = entrada.nextLine();
                        System.out.print("nueva posicion final: ");
                        posiciones[posicion] = entrada.nextInt();
                        System.out.print("nuevos puntos: ");
                        puntos[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Competencia actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|listar_competencias|--//
                //-------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen competencias registradas.");
                    } else {
                        System.out.println("lista de competencias");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Piloto: " + pilotos[i] + " | Vehiculo: " + vehiculos[i] + " | Equipo: " + equipos[i] + " | Competencia: " + competencias[i] + " | Circuito: " + circuitos[i] + " | Categoria: " + categorias[i] + " | Vueltas: " + vueltas[i] + " | Tiempo: " + tiempos[i] + " | Posicion: " + posiciones[i] + " | Puntos: " + puntos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //------------------------//
                //--|buscar_competencia|--//
                //------------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen competencias registradas.");
                        break;
                    }
                    System.out.println("busqueda de competencia");
                    System.out.print("Ingrese el ID de la competencia a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("competencia encontrada");
                        System.out.println("ID: " + idBusqueda + " | Piloto: " + pilotos[posicion] + " | Vehiculo: " + vehiculos[posicion] + " | Equipo: " + equipos[posicion] + " | Competencia: " + competencias[posicion] + " | Circuito: " + circuitos[posicion] + " | Categoria: " + categorias[posicion] + " | Vueltas: " + vueltas[posicion] + " | Tiempo: " + tiempos[posicion] + " | Posicion: " + posiciones[posicion] + " | Puntos: " + puntos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------------//
                //--|eliminar_competencia|--//
                //--------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen competencias registradas.");
                        break;
                    }
                    System.out.println("datos de las competencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Piloto: " + pilotos[i] + " | Vehiculo: " + vehiculos[i] + " | Equipo: " + equipos[i] + " | Competencia: " + competencias[i] + " | Circuito: " + circuitos[i] + " | Categoria: " + categorias[i] + " | Vueltas: " + vueltas[i] + " | Tiempo: " + tiempos[i] + " | Posicion: " + posiciones[i] + " | Puntos: " + puntos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la competencia a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            pilotos[i] = pilotos[i + 1];
                            vehiculos[i] = vehiculos[i + 1];
                            equipos[i] = equipos[i + 1];
                            competencias[i] = competencias[i + 1];
                            circuitos[i] = circuitos[i + 1];
                            categorias[i] = categorias[i + 1];
                            vueltas[i] = vueltas[i + 1];
                            tiempos[i] = tiempos[i + 1];
                            posiciones[i] = posiciones[i + 1];
                            puntos[i] = puntos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Competencia eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen competencias registradas.");
                        break;
                    }
                    int totalVueltas = 0;
                    int totalPuntos = 0;
                    int mejorPosicion = posiciones[0];
                    String pilotoMejorPosicion = pilotos[0];
                    int programadas = 0;
                    int enCurso = 0;
                    int finalizadas = 0;
                    int canceladas = 0;
                    for (int i = 0; i < total; i++) {
                        totalVueltas += vueltas[i];
                        totalPuntos += puntos[i];
                        if (posiciones[i] < mejorPosicion) {
                            mejorPosicion = posiciones[i];
                            pilotoMejorPosicion = pilotos[i];
                        }
                        if (estados[i].equalsIgnoreCase("Programada")) {
                            programadas++;
                        } else if (estados[i].equalsIgnoreCase("En curso")) {
                            enCurso++;
                        } else if (estados[i].equalsIgnoreCase("Finalizada")) {
                            finalizadas++;
                        } else if (estados[i].equalsIgnoreCase("Cancelada")) {
                            canceladas++;
                        }
                    }
                    String pilotoMayor = pilotos[0];
                    int cantidadPilotoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadPiloto = 0;
                        for (int j = 0; j < total; j++) {
                            if (pilotos[i].equalsIgnoreCase(pilotos[j])) {
                                cantidadPiloto++;
                            }
                        }
                        if (cantidadPiloto > cantidadPilotoMayor) {
                            cantidadPilotoMayor = cantidadPiloto;
                            pilotoMayor = pilotos[i];
                        }
                    }
                    String pilotoMasPuntos = pilotos[0];
                    int mayorPuntos = puntos[0];
                    for (int i = 1; i < total; i++) {
                        if (puntos[i] > mayorPuntos) {
                            mayorPuntos = puntos[i];
                            pilotoMasPuntos = pilotos[i];
                        }
                    }
                    String equipoMayor = equipos[0];
                    int cantidadEquipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEquipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (equipos[i].equalsIgnoreCase(equipos[j])) {
                                cantidadEquipo++;
                            }
                        }
                        if (cantidadEquipo > cantidadEquipoMayor) {
                            cantidadEquipoMayor = cantidadEquipo;
                            equipoMayor = equipos[i];
                        }
                    }
                    String vehiculoMayor = vehiculos[0];
                    int cantidadVehiculoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadVehiculo = 0;
                        for (int j = 0; j < total; j++) {
                            if (vehiculos[i].equalsIgnoreCase(vehiculos[j])) {
                                cantidadVehiculo++;
                            }
                        }
                        if (cantidadVehiculo > cantidadVehiculoMayor) {
                            cantidadVehiculoMayor = cantidadVehiculo;
                            vehiculoMayor = vehiculos[i];
                        }
                    }
                    String circuitoMayor = circuitos[0];
                    int cantidadCircuitoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCircuito = 0;
                        for (int j = 0; j < total; j++) {
                            if (circuitos[i].equalsIgnoreCase(circuitos[j])) {
                                cantidadCircuito++;
                            }
                        }
                        if (cantidadCircuito > cantidadCircuitoMayor) {
                            cantidadCircuitoMayor = cantidadCircuito;
                            circuitoMayor = circuitos[i];
                        }
                    }
                    String categoriaMayor = categorias[0];
                    int cantidadCategoriaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCategoria = 0;
                        for (int j = 0; j < total; j++) {
                            if (categorias[i].equalsIgnoreCase(categorias[j])) {
                                cantidadCategoria++;
                            }
                        }
                        if (cantidadCategoria > cantidadCategoriaMayor) {
                            cantidadCategoriaMayor = cantidadCategoria;
                            categoriaMayor = categorias[i];
                        }
                    }
                    double promedioPuntos = (double) totalPuntos / total;
                    System.out.println("resumen de automovilismo deportivo");
                    System.out.println("Competencias registradas: " + total);
                    System.out.println("Piloto con mas participaciones: " + pilotoMayor);
                    System.out.println("Piloto con mas puntos: " + pilotoMasPuntos);
                    System.out.println("Equipo mas utilizado: " + equipoMayor);
                    System.out.println("Vehiculo mas utilizado: " + vehiculoMayor);
                    System.out.println("Circuito mas utilizado: " + circuitoMayor);
                    System.out.println("Categoria mas frecuente: " + categoriaMayor);
                    System.out.println("Piloto con mejor posicion: " + pilotoMejorPosicion);
                    System.out.println("Mejor posicion obtenida: " + mejorPosicion);
                    System.out.println("Total de vueltas: " + totalVueltas);
                    System.out.println("Total de puntos: " + totalPuntos);
                    System.out.println("Promedio de puntos: " + promedioPuntos);
                    System.out.println("Competencias programadas: " + programadas);
                    System.out.println("Competencias en curso: " + enCurso);
                    System.out.println("Competencias finalizadas: " + finalizadas);
                    System.out.println("Competencias canceladas: " + canceladas);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Automovilismo Deportivo.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}