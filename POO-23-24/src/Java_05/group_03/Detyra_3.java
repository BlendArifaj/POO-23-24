package Java_05.group_03;

public class Detyra_3 {
    public static void main(String[] args){
        Bank teb = new Bank("Teb");
        Klient klient1 = new Klient(1, "Klienti 1", "Prishtine");
        Klient klient2 = new Klient(2, "Klienti 2", "Prishtine");

        teb.shtoKlientin(klient1);
        teb.shtoKlientin(klient2);

        LlogariaBankare lb1 = new LlogariaBankare(1, klient1, 100);
        LlogariaBankare lb2 = new LlogariaBankare(2, klient1, 100);
        LlogariaBankare lb3 = new LlogariaBankare(3, klient2, 100);

        klient1.shtoLlogarine(lb1);
        klient1.shtoLlogarine(lb2);
        klient2.shtoLlogarine(lb3);

        teb.printoTeDhenat();
    }
}

class Bank{
    String emri;
    Klient[] listaKlienteve;

    Bank(String emri) {
        this.emri = emri;
        this.listaKlienteve = new Klient[0];
    }

    void printoTeDhenat(){
        System.out.println("Emri: " + this.emri);
        System.out.println("Lista e klienteve: ");
        for(Klient klient : this.listaKlienteve){
//            System.out.println(klient.emri);
            klient.printoTeDhenat();
        }

    }
    void shtoKlientin(Klient klient){
        this.listaKlienteve = ArrayManagement.shtoKlientNeListe(this.listaKlienteve, klient);
    }
    void fshiKlientin(Klient klient){
        this.listaKlienteve = ArrayManagement.fshiKlientNgaLista(this.listaKlienteve, klient);
    }
}
class Klient{
    int id;
    String emri;
    String adresa;
    LlogariaBankare[] listaLlogariveBankare;

    public Klient(int id, String emri, String adresa) {
        this.id = id;
        this.emri = emri;
        this.adresa = adresa;
        this.listaLlogariveBankare = new LlogariaBankare[0];
    }
    void printoTeDhenat(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Adresa: " + this.adresa);
        for(LlogariaBankare lb : this.listaLlogariveBankare){
            lb.printoTeDhenat();
        }
    }
    void shtoLlogarine(LlogariaBankare llogariaBankareRe){
        this.listaLlogariveBankare = ArrayManagement.shtoLlogariBankareNeListe(
                this.listaLlogariveBankare, llogariaBankareRe
        );
    }
    float llogaritTotalin(){
        float sum = 0.0f; //0.0f == 0.0
        for(LlogariaBankare lb : this.listaLlogariveBankare){
            sum += lb.bilanci;
        }
        return sum;
    }
}
class LlogariaBankare{
    int id;
    Klient pronari;
    float bilanci;

    public LlogariaBankare(int id, Klient pronari, float bilanci) {
        this.id = id;
        this.pronari = pronari;
        this.bilanci = bilanci;
    }
    void printoTeDhenat(){
        System.out.println("Id: " + this.id);
        System.out.println("Bilanci: " + this.bilanci);
    }
}
class ArrayManagement{
    static Klient[] shtoKlientNeListe(Klient[] listaKlienteve, Klient klientIRi){
        Klient[] listaKlienteveRe = new Klient[listaKlienteve.length +1];
        for(int i = 0; i < listaKlienteve.length; i++){
            listaKlienteveRe[i] = listaKlienteve[i];
        }
        listaKlienteveRe[listaKlienteveRe.length - 1] = klientIRi;
        return listaKlienteveRe;
    }

    static LlogariaBankare[] shtoLlogariBankareNeListe(LlogariaBankare[] listaLlogariveBankare, LlogariaBankare llogaria){
        LlogariaBankare[] listaBankareERe = new LlogariaBankare[listaLlogariveBankare.length +1];
        for(int i = 0; i < listaLlogariveBankare.length; i++){
            listaBankareERe[i] = listaLlogariveBankare[i];
        }
        listaBankareERe[listaBankareERe.length - 1] = llogaria;
        return listaBankareERe;
    }

    static Klient[] fshiKlientNgaLista(Klient[] listaKlienteve, Klient klient){
        Klient[] listaKlienteveRe = new Klient[listaKlienteve.length - 1];
        int shift = 0;
        for(int i = 0; i < listaKlienteve.length; i++){
            if(listaKlienteve[i].id == klient.id){
                shift--;
                continue;
            }
            listaKlienteveRe[i + shift] = listaKlienteve[i];
        }
        return listaKlienteveRe;
    }
}