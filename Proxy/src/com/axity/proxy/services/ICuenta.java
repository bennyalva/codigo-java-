package com.axity.proxy.services;

import com.axity.proxy.model.Cuenta;

public interface ICuenta {
    public Cuenta  retirar(Cuenta cuenta, double monto);
    public Cuenta depositar(Cuenta cuenta, double monto);
    public void mostrarSaldo(Cuenta cuenta);
}
