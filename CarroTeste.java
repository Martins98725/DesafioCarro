package DesafioCarro;
import java.util.ArrayList;
import java.util.Scanner;
public class CarroTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        boolean rodando = true;
        while (rodando) {
            System.out.println("[1] Adicionar mais carro ");
            System.out.println("[2] Mostrar carro");
            System.out.println("[3] Remover carros");
            System.out.println("[4] Dar um role");
            System.out.println("[5] Listar todos os carros");
            System.out.println("[6] Sair");
            System.out.println("Digite sua opção: ");
            String opcode = scanner.nextLine();
            Carro c1 = new Carro();
            switch (opcode) {
                case "1": {
                    c1.adcionarCarro();
                    carros.add(c1);
                    break;
                }
                case "2": {
                    System.out.println("=============Mostrar Carros==============");
                    int a = carros.size();
                    for (int i = 0; i < a; i++) {
                        Carro utemp = carros.get(i);
                        System.out.println("[" + i + "]" + utemp.getModelo());
                    }
                    if (carros.size() == 0){
                        System.out.println("Não tem carros na sua garagem ");
                    }
                    else {
                        System.out.println("Qual carro você quer ver? ");
                        int referencia = scanner.nextInt();
                        if (referencia >= a){
                            System.out.println("Carro não existe");
                        }
                        else {
                            c1 = carros.get(referencia);
                            c1.status();
                        }
                    }
                    break;
                }
                case "3": {
                    System.out.println("Qual carro você que remover? ");
                    int a = carros.size();
                    for (int i = 0; i < a; i++) {
                        Carro utemp = carros.get(i);
                        System.out.println("[" + i + "]" + utemp.getModelo());
                        System.out.println("\tPlaca: " + utemp.getPlaca());

                    }
                    if (carros.size() == 0){
                        System.out.println("Não tem carros na sua garagem ");
                    }
                    else {
                        System.out.println("Digite um valor de referência");
                        int referencia = scanner.nextInt();
                        if (referencia >= a ){
                            System.out.println("Carro não existe");
                        }
                        else {
                            c1 = carros.get(referencia);
                            c1.status();
                            carros.remove(c1);
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("Com qual carro você quer sair? ");
                    int a = carros.size();
                    for (int i = 0; i < a; i++) {
                        Carro utemp = carros.get(i);
                        System.out.println("[" + i + "]" + utemp.getModelo());
                    }
                    if (carros.size() == 0){
                        System.out.println("Não tem carros na sua garagem ");
                    }
                    else {
                        System.out.println("Selecione um carro: ");
                        int referencia = scanner.nextInt();
                        if (referencia >= a){
                            System.out.println("Carro não existe");
                        }
                        else {
                            System.out.println("Quer andar quantos quilometros? ");
                            double kmF = scanner.nextDouble();
                            c1 = carros.get(referencia);
                            c1.sair(kmF);
                            c1.status();
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("======Carros cadastrados======");
                    for (int i = 0; i < carros.size(); i++) {
                        Carro temp = carros.get(i);
                        System.out.println("Carro: " + i);
                        System.out.println("\tCarro da marca: " + temp.getMarca());
                        System.out.println("\tModelo: " + temp.getModelo());
                        System.out.println("\tAno: " + temp.getAno());
                        System.out.println("\tCumbustível: " + temp.getCombustivel());
                        System.out.println("\tPlaca: " + temp.getPlaca());
                    }
                    if (carros.size() == 0){
                        System.out.println("Não tem carros na sua garagem");
                    }
                    break;
                }
                case "6": {
                    System.out.println("Adeus, meu caro Pigmeu");
                    rodando = false;
                    break;
                }
            }
        }
        scanner.close();
    }
}