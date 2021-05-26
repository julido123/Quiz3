package agenciaArrendamientos.dominio;

public class Casa extends Inmueble implements  Arrendable{

    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
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
