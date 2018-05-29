package org.mp.tema07;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class CuentaCorriente implements Serializable {

	private String numero;
    private String titular;
    private ArrayList<Movimiento> movimientos;

    public CuentaCorriente(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.movimientos = new ArrayList<Movimiento>();
    }

    public void ingresar(String concepto, double x) throws Exception {
        if (x <= 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        Movimiento m = new Movimiento();
        m.setConcepto(concepto);
        m.setImporte(x);
        this.movimientos.add(m);
    }

    public void retirar(String concepto, double x) throws Exception {
        if (x <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < x)
            throw new Exception("Saldo insuficiente");
        Movimiento m = new Movimiento();
        m.setConcepto(concepto);
        m.setImporte(-x);
        this.movimientos.add(m);
    }

    public double getSaldo() {
        double saldo = 0.0;
        for (Iterator iter = movimientos.iterator(); iter.hasNext();) {
            Movimiento m = (Movimiento) iter.next();
            saldo += m.getImporte();
        }
        return saldo;
    }

    public void listado() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy ");
        System.out.println("Listado Movimientos Cuenta: ");
        System.out.println();
        System.out.printf("%1$-15s%2$-15s","Titular","Numero Cuenta");
        System.out.println();
        System.out.printf("%1$-15s%2$-15s","-------","-------------");
        System.out.println();
        System.out.printf("%1$-15s%2$-15s",titular,numero);
        System.out.println();
        System.out.println();
        System.out.printf("%1$-15s%2$-25s%3$15s","Fecha","Concepto","Valor");
        System.out.println();
        System.out.printf("%1$-15s%2$-25s%3$15s","-----","--------","-----");
        System.out.println();

        for (Iterator iter = movimientos.iterator(); iter.hasNext();) {
            Movimiento m = (Movimiento) iter.next();
            System.out.printf("%1$-15s%2$-25s%3$15.2f",
            		formatter.format(m.getFecha())
            		,m.getConcepto(),m.getImporte());
            System.out.println();
        }
    }

    public void addMovimiento(Movimiento m) {
        movimientos.add(m);
    }
}

