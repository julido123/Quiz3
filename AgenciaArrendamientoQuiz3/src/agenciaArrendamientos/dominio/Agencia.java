package agenciaArrendamientos.dominio;

import java.util.List;

public  class Agencia {
    private String nombre;
    private List<Inmueble> inmuebles;
    private List<Inmueble> arrendados;

    public void agregarInmueble(Inmueble i){
        if(!i.isArrendado()){
            inmuebles.add(i);
        }else {
            System.out.println("El inmueble"+i+" ya está");
            arrendados.add(i);
        }
    }

    public boolean arrendar(Arrendable inmueble){
        if (inmueble != null){
             inmueble.arrendar();
            return true;
        }else {
            return false;
        }
    }

    public boolean devolver(Arrendable inmueble){
        if (inmueble != null){
            inmueble.devolver();
            return true;
        }else {
            return false;
        }
    }

    public boolean vender(Inmueble inmueble){
        if(!inmueble.isArrendado()){
            inmuebles.remove(inmueble);
            return true;
        }else {
            System.out.println("El inmueble"+inmueble+" está arrendado");
            return false;
        }
    }

    public /*List<Inmueble>*/void getArrendablesDisponibles(){
        System.out.println("Inmuebles arrendables: "+"\n");
        for (Inmueble inmueble:this.inmuebles) {
            System.out.println(inmueble);
        }
        System.out.println("");
    }

    public /*List<Inmueble>*/void getArrendados(){
        System.out.println("Inmuebles arrendados: "+"\n");
        for (Inmueble inmueble:this.arrendados) {
            System.out.println(inmueble);
        }
        System.out.println("");
    }


    public String getNombre() {
        return nombre;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public void setArrendados(List<Inmueble> arrendados) {
        this.arrendados = arrendados;
    }
}
