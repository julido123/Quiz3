package agenciaArrendamientos.app;

import agenciaArrendamientos.dominio.Agencia;
import agenciaArrendamientos.dominio.Apartamento;
import agenciaArrendamientos.dominio.Casa;
import agenciaArrendamientos.dominio.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class AgenciaApp {
    public static void main(String[] args) {

        List<Inmueble> parsaArrendar=new ArrayList<>();
        List<Inmueble> arrendados=new ArrayList<>();
        Agencia agencia=new Agencia();
        Apartamento apartamento=new Apartamento("Calle15",15000,300,false);
        Casa casa=new Casa("calle3",50000,1000,false);
        Casa casa1=new Casa("calle3",50000,1000,true);
        Apartamento apartamento1=new Apartamento("Calle 25",20000,600,true);


        agencia.setInmuebles(parsaArrendar);
        agencia.setArrendados(arrendados);
        agencia.agregarInmueble(apartamento);
        agencia.agregarInmueble(casa);
        agencia.agregarInmueble(casa1);
        agencia.getArrendablesDisponibles();
        agencia.getArrendados();

    }
}
