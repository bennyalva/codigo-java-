package com.axity.proxy;

import com.axity.proxy.model.Cuenta;
import com.axity.proxy.proxy.CuentaProxy;
import com.axity.proxy.services.ICuenta;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta =new Cuenta(87654,"Juan Hernandez",1500);

        ICuenta cuentaProxy = new CuentaProxy();
                cuentaProxy.mostrarSaldo(cuenta);
                cuentaProxy.depositar(cuenta,500);
                cuentaProxy.retirar(cuenta,400);
                cuentaProxy.mostrarSaldo(cuenta);

    }
}
