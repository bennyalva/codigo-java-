package com.axity.proxy.impl;

import com.axity.proxy.model.Cuenta;
import com.axity.proxy.services.ICuenta;

public class CuentaAImpl implements ICuenta {
      double saldoActual;
    @Override
    public Cuenta retirar(Cuenta cuenta, double monto) {
         saldoActual = cuenta.getSaldoInicial() - monto;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public Cuenta depositar(Cuenta cuenta, double monto) {
         saldoActual = cuenta.getSaldoInicial() + monto;
         cuenta.setSaldoInicial(saldoActual);
         System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Saldo actual: "+cuenta.getSaldoInicial());

    }
}
