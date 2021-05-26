package agenciaArrendamientos.dominio;

public class Apartamento extends Inmueble implements Arrendable{


    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public boolean arrendar() {
        setArrendado(true);
        return this.isArrendado();
    }

    @Override
    public boolean devolver() {
        setArrendado(false);
        return this.isArrendado();
    }
}
