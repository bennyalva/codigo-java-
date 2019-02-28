package com.axity.proxy.proxy;

import com.axity.proxy.impl.CuentaAImpl;
import com.axity.proxy.model.Cuenta;
import com.axity.proxy.services.ICuenta;

public class CuentaProxy implements ICuenta {
    private CuentaAImpl cuentaReal;
    @Override
    public Cuenta retirar(Cuenta cuenta, double monto) {
        if (cuentaReal == null){
            cuentaReal = new CuentaAImpl();
        }
        return cuentaReal.retirar(cuenta,monto);
    }

    @Override
    public Cuenta depositar(Cuenta cuenta, double monto) {
        if (cuentaReal == null){
         cuentaReal = new CuentaAImpl();
         return cuentaReal.depositar(cuenta,monto);
        }else {
            return cuentaReal.depositar(cuenta,monto);
        }

    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        if (cuentaReal == null){
            cuentaReal =new CuentaAImpl();
            cuentaReal.mostrarSaldo(cuenta);
        }else {
            cuentaReal.mostrarSaldo(cuenta);
        }

    }
}
