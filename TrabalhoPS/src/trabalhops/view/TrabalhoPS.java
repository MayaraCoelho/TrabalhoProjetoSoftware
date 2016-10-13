/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhops.view;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mayaracoelho
 */
public class TrabalhoPS {

    

    public static void main(String[] args) throws IOException {
        Integer option = 0;
        while(option!=5){
            printMenu();
            
            Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
            
            try {
                    option = scanner.nextInt();
            } catch (InputMismatchException e) {
                    System.err.println("Opção inválida!");
            }
            
            String sentence;

				switch (option) {
					case 1:
						System.out.print("Favor digitar dados do produto. \n");
                                                System.out.print("Código: \n");
                                                System.out.print("Nome: \n");
                                                System.out.print("Descrição: \n");
						break;
					case 2:
						
						break;
                                        case 3:
                                                
						break;
					case 4:
						
						break;
					case 5:
						break;
					default:
						System.err.println("Opção inválida!");
				}
            
        }
    }
    
    private static void printMenu() {
        System.out.print("\nFavor escolher opção desejada: \n");
        System.out.print("    1 - Adicionar Produto.\n");
        System.out.print("    2 - Ver um Produto.\n");
        System.out.print("    3 - Listar Produtos.\n");
        System.out.print("    4 - Buscar produto por Codigo.\n");
        System.out.print("    5 - Sair.\n\n");
    }

}
