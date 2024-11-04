package Ejercicio15;

public class CambioRelaciones implements IRelaciones {
    private int valor;

    public CambioRelaciones(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean esMayor(Object b) {
        if (b instanceof CambioRelaciones) {
            CambioRelaciones otroCambio = (CambioRelaciones) b;
            return this.valor > otroCambio.valor;
        }
        return false;
    }

    @Override
    public boolean esMenor(Object b) {
        if (b instanceof CambioRelaciones) {
            CambioRelaciones otroCambio = (CambioRelaciones) b;
            return this.valor < otroCambio.valor;
        }
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        if (b instanceof CambioRelaciones) {
            CambioRelaciones otroCambio = (CambioRelaciones) b;
            return this.valor == otroCambio.valor;
        }
        return false;
    }
}