/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamen;

/**
 *
 * @author donbala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PROFE PILAS QUE LE PUSE VALORES DIFERENTES PORQUE ESTABA PROBANDO
       CuentaBancaria cta1=new CuentaAhorro();
		CuentaBancaria cta2=new CuentaAhorro();
		//CuentaAhorro ct=new CuentaBancaria();
		CuentaAhorro cta3=new CuentaAhorro();
		
		cta1.setNombre("cta1");
		cta2.setNombre("cta2");
		cta3.setNombre("cta3");
		
		cta1.setSaldo(10);
                cta1.deposito(300);
                imprimirSaldo(cta1);
		cta2.setSaldo(20);
                cta2.deposito(300);
                imprimirSaldo(cta2);
		cta3.setSaldo(30);
                cta3.deposito(150);
                imprimirSaldo(cta3);
              
                
                /*cta2.setInteresDeposito(0.01); Fallotaaaaa querer setear algo que ya tiene un metodo con retorno
               Esta linea de codigo vota error porque creamos un metodo getInteresDeposito y este retorn
                directamente valor de 0.01 - 0.02 entonces es error querer enviar el interes por medio del set   porque ya esta un metodo get creado(heredado)
		*/
		// valores a la clase cuentaAhorro
                
		CuentaCorriente cta4 =new CuentaCorriente();
		cta4.setNombre("cta4");
		cta4.setSaldo(10);
		cta4.deposito(100);
		imprimirSaldo(cta4);
                
                 // PRUEBAAAAAAA
                
		// valores a la clase cuentaAhorro
                
		CuentaCorriente cta5 =new CuentaCorriente();
		cta5.setNombre("cta4");
		cta5.setSaldo(10);
		cta5.deposito(1000);
		imprimirSaldo(cta5);
                
            
                
                //valores a la clase CuentaCorriente
                CuentaAhorro ctc1=new CuentaAhorro();
                ctc1.setNombre("Ctc1");
                ctc1.setSaldo(10);
                ctc1.deposito(200);
                imprimirSaldo(ctc1);
                
                // PRUEBAAAAAA
                
                //valores a la clase CuentaCorriente
                CuentaAhorro ctc2=new CuentaAhorro();
                ctc2.setNombre("Ctc2");
                ctc2.setSaldo(10);
                ctc2.deposito(600);
                imprimirSaldo(ctc2);
	}
	
	public static void imprimirSaldo(CuentaBancaria cta){
		System.out.println("Cuenta: " + cta.getNombre() + ", Saldo: " + cta.getSaldo());
	}
    }
    

