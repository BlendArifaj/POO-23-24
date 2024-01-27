package Java_12.group_02;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MenaxhoProgramin {
    Scanner sc;
    
    public MenaxhoProgramin(){
        this.sc = new Scanner(System.in);
    }
    private void shtypMenu(){
        System.out.println("Menu-ja e programit tone:");
        System.out.println("Shtyp 'a' per te shtuar klient te ri");
//        ...
    }
    private void shtoKlientNeListe(){
        System.out.println("Shtyp emrin");
        String emri = sc.next();
//        ...
    }
    void start(){
        while(true){
            this.shtypMenu();
            // Lexo komanden:
            char c = sc.next().charAt(0);
            switch (c){
                case 'a':
                    this.shtoKlientNeListe();
                    break;
                //...
                default:
                    //...
            }
        }
    }
}


abstract class Banka implements TransferimiParave{
    abstract void hapLogarine(Llogaria llogaria);

    abstract void transferoParate(Transferi transferi) throws InsufficientFundsException;

    private  ArrayList<Llogaria> llogariteBankare = new ArrayList<Llogaria>();
    private  ArrayList<Transferi> transfretBankare = new ArrayList<Transferi>();


    public void  kerkoTransferin(Transferi transferi){
        System.out.println(  this.transfretBankare.get(0).id);
    }
    
    public void addLlogariaBankare(Llogaria llogaria){
        this.llogariteBankare.add(llogaria);
    }

    public void addTransferBankare(Transferi transferi) throws InsufficientFundsException {
        this.transfretBankare.add(transferi);
        transferi.ekzekutoTransferi();
    }
}

class Llogaria{
    int id;
    String perdoruesi;
    double shuma;

    public Llogaria(int id, String perdoruesi, double shuma) {
        this.id = id;
        this.perdoruesi = perdoruesi;
        this.shuma = shuma;
    }

    public void deposit(float amount) throws InsufficientFundsException {
        if(amount < 0){
            throw new InsufficientFundsException("Deposit failed! Amount: " + amount);
        }
        this.shuma +=amount;
        System.out.println("Deposit Successfully");
    }

    public void tranfero(double amount) throws  InsufficientFundsException{
        if(this.shuma < amount){
            throw new InsufficientFundsException("Transferi failed! Amount: " + amount);
        }
        this.shuma -= amount;
        System.out.println("Transferi Successfully");
    }

}

class Transferi{
    int id;
    final String fileName = "transferi.txt";
    String tipi;

    Llogaria derguesi;
    Llogaria pranuesi;

    double shuma;

    public Transferi(int id,String tipi, Llogaria derguesi, Llogaria pranuesi, double shuma) {
        this.id = id;
        this.tipi = tipi;
        this.derguesi = derguesi;
        this.pranuesi = pranuesi;
        this.shuma = shuma;
    }

    public void ekzekutoTransferi() throws InsufficientFundsException {
        this.derguesi.tranfero(shuma);
        this.ruajTransferinNeFile(this.fileName);
    }
    public void ruajTransferinNeFile(String fileName){
        try {
            FileWriter writer = new FileWriter(fileName,true);
            writer.write(this.tipi+ "-" + this.derguesi.perdoruesi +"-" + this.pranuesi.perdoruesi + "-" + this.shuma);
            writer.close();
        } catch (IOException e) {
            System.out.println("Deshtoj ruajtja!");
        }
    }

    static void lexoMeScanner(String fileName, String perdoruesi){
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if(scanner.nextLine().split("-")[1].equals(perdoruesi)){
                    System.out.println(scanner.nextLine());
                }
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("File not found");
//            throw new RuntimeException(e);
        }
    }

}
class BankaKomerciale extends Banka{
    public BankaKomerciale(Llogaria llogariteBankare) {
        hapLogarine(llogariteBankare);
    }

    @Override
    void hapLogarine(Llogaria llogaria) {
        this.addLlogariaBankare(llogaria);

    }

    @Override
    void transferoParate(Transferi transferi) throws InsufficientFundsException {
        this.addTransferBankare(transferi);
    }
}

class BankaSheterore extends Banka{
    @Override
    void hapLogarine(Llogaria llogaria) {
        System.out.println("Nuk mund te krijoni llogari ne banken shteterore");
    }

    @Override
    void transferoParate(Transferi transferi) throws InsufficientFundsException {
        this.addTransferBankare(transferi);
    }
}

interface TransferimiParave{}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}


