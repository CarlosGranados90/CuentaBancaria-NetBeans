package cuentabancaria;

public class CuentaAhorros extends Cuenta {
    
    private final boolean activa;
       
    public CuentaAhorros (float saldo) {
        
        super(saldo);
        //si el saldo es mayor o igual a 10.000, entonces estará activa
        activa = saldo > 10.000;
        
        //sobreescribir métodos de clase padre
        @Override
        public void consignar (float cantidad) {
            if (activa) {
            super.consignar(cantidad);
            }
        }
        
        @Override
        public void retirar (float cantidad) {
            if (activa) {
                super.retirar(cantidad);
            }
        }

    CuentaAhorros(float saldo_inicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    CuentaAhorros(float saldo_inicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
        //imprimir detalles de la cuenta de ahorros        
        //imprimir detalles de la cuenta de ahorros
        public void imprimir(){
            System.out.println("Saldo = $ " + saldo);
            System.out.println("Número de transacciones = " + (numero_consignaciones + numero_retiros));
        }
    }
}
    