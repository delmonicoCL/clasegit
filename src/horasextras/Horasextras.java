/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horasextras;

import java.util.Scanner;

/**
 *
 * @author cep
 */
public class Horasextras {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	int horas,valorhora,pagar,horaslegales,pagoextra,pagolegal,horaextra,pagoextraextra,uno;
		Scanner sc= new Scanner(System.in);
		horaslegales= 40;
		System.out.println("CUANTAS HORAS TRABAJASTE:");
		horas= sc.nextInt();
		System.out.println("VALOR X HORA");
		valorhora= sc.nextInt();
		
		if (40>=horas){
                        System.out.println("............................");
			System.out.println("SIN HORA EXTRAS ");
			pagolegal=(horas*valorhora);
			System.out.println("TUS PAGO LEGAL "+pagolegal+" ");
                        System.out.println("............................");
		}
		
                if (41<=horas && 48>=horas ){
			System.out.println("................... ");
			horaextra=(horas-40);
                        pagolegal=(horas-horaextra)*valorhora;
			pagoextra=((horaextra*valorhora)*2);
			System.out.println("TU PAGO LEGAL "+pagolegal+" ");
                        System.out.println("TU PAGO HORAS EXTRA  "+pagoextra+" ");
			pagar= (pagolegal+pagoextra);
			System.out.println("............................");
                        System.out.println("TU PAGO TOTAL ES de "+pagar+" Euros.");
                        System.out.println("............................");
			 }
		 if(horas>=49) {	 
			System.out.println("............................");
						pagolegal=(40*valorhora);
                        pagoextra=((8*valorhora)*2);
						uno=(horas-48);
                        pagoextraextra=((uno*valorhora)*3);                 
						pagar=(pagolegal+pagoextra+pagoextraextra);	
			System.out.println("TU PAGO LEGAL "+pagolegal+" ");
                        System.out.println("TU PAGO HORAS EXTRA  "+pagoextra+" ");
			System.out.println("TU PAGO HORAS SUPER EXTRA EXTRA "+pagoextraextra+" ");	
                        System.out.println("............................");
                        System.out.println("TU PAGO TOTAL ES "+pagar+" Euros.");
                        System.out.println("............................");
                   }
                 }
}



