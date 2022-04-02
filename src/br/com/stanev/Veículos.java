package br.com.stanev;

import java.util.Scanner;

public class Veículos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[][] carros = new String[10][5];
  
        int i = 0;
        int j = 0;
        
        boolean continua = true;
        
        String marca;
        String modelo;
        String cor;
        String placa;
        String valorDiaria;
        
        System.out.println("FIFTY CARS");
        
        while(continua) {
        	
        	if (i<10) { 
        		System.out.println("Insira a marca do veículo");
        		marca = sc.next();
        		sc.nextLine();
        		carros[i][0] = marca;

        		System.out.println("Insira o modelo do veículo");
        		modelo = sc.next();
        		sc.nextLine();
        		carros[i][1] = modelo;

        		System.out.println("Insira a cor do veículo");
        		cor = sc.next();
        		sc.nextLine();
        		carros[i][2] = cor;

        		System.out.println("Insira a placa do veículo");
        		placa = sc.next();
        		sc.nextLine();
        		carros[i][3] = placa;

        		System.out.println("Insira o valor da diária");
        		valorDiaria = sc.next();
        		carros[i][4] = valorDiaria;

        		i++;
        	}

        	System.out.println();
        	System.out.println("CONFIRA NOSSOS MODELOS CADASTRADOS");
        	
        	j = 0;
        	while (j<10) {
        		if (carros[j][0] == null) {
        			break;
        		}
        		System.out.println("Modelo " + (j+1));
        		System.out.println("Marca: " + carros[j][0]);
        		System.out.println("Modelo: " + carros[j][1]);
        		System.out.println("Cor: " + carros[j][2]);
        		System.out.println("Placa: " + carros[j][3]);
        		System.out.println("Valor da diária: " + carros[j][4]);
        		System.out.println();
        		
        		j++;
        	}
        	
        	System.out.println("Deseja continuar (S ou N)?");
        	if(sc.next().toUpperCase().equals("N")) {
        		continua = false;
        	}
        	
        }
            sc.close();
         	
        }

}
