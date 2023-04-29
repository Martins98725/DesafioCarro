package DesafioCarro;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Carro {
    Scanner scanner = new Scanner(System.in);
    private String marca;
    private String modelo;
    private int ano;
    private double combustivel;
    private double km;
    private String placa;
    public void status() {
        System.out.printf("Marca: %s%n", this.getMarca());
        System.out.printf("Modelo: %s%n", this.getModelo());
        System.out.printf("Ano: %d%n", this.getAno());
        System.out.printf("Combustível em litros: %.2f%n ", this.getCombustivel());
        System.out.printf("Quilometragem: %s%n", this.getKm());
        System.out.printf("A placa: %s%n", this.getPlaca());
    }
    public void adcionarCarro() {
        Pattern patternInt = Pattern.compile("[0-9]{4}");
        Pattern patternPlaca = Pattern.compile("[a-zA-Z0-9]{7}");
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Ano: ");
        String ano = scanner.nextLine();
        while (!patternInt.matcher(ano).matches()) {
            System.out.println("Ano inválido");
            System.out.print("Digite um ano válido: ");
            ano = scanner.nextLine();
        }
        System.out.println("Combustível: ");
        double combustivel = scanner.nextDouble();
        System.out.println("Quantos km tem? ");
        double kmI = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        while (!patternPlaca.matcher(placa).matches()){
            System.out.println("Placa inválida");
            System.out.println("Digite novamente:");
            placa = scanner.nextLine();
        }
        setMarca(marca);
        setModelo(modelo);
        setAno(Integer.parseInt(ano));
        setCombustivel(combustivel);
        setPlaca(placa);
        setKm(kmI);
        status();
        System.out.println("Carro adcionada com sucesso!!!");
    }
    public void removerCarros() {
        System.out.println("Carro removido");
    }
    public void sair(double km) {
        if (combustivel <= 0) {
            System.out.println("Sem cobustivel. Impossivel sair");
        } else {
            double litros = getCombustivel();
            setCombustivel(getCombustivel() - (km / 0.5) / litros);
            setKm(getKm() + km);
            System.out.printf("Foi rodado: %.1f no carro %s  consumiu: %.1f%n", km, this.getModelo(), combustivel);
        }
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setAno(int ano) {

        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    public double getCombustivel() {
        return combustivel;
    }
    public void setKm(double km) {
        this.km = km;
    }
    public double getKm() {
        return km;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }
}