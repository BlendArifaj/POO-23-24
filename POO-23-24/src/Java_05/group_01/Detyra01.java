package Java_05.group_01;

public class Detyra01 {
    public static void main(String[] args){
        Drejtimi kompjuterike = new Drejtimi(1, "Kompjuterike");
        StafiAkademik stafiAkademik1 = new StafiAkademik(
                1, "Filan Fisteku", "Prof.", kompjuterike
        );
        Fakulteti fiek = new Fakulteti(
                1, "FIEK"
        );
        fiek.shtoDrejtimTeRi(kompjuterike);
//        fiek.shtoStafinAkademik(stafiAkademik1);
        fiek.printoTeDhenat();
    }
}

class Fakulteti{
    int id;
    String emri;
    StafiAkademik[] stafiAkademik;
    Drejtimi[] drejtimet;
    Fakulteti(int id, String emri){
        this.id = id;
        this.emri = emri;
        this.stafiAkademik = new StafiAkademik[0];
        this.drejtimet = new Drejtimi[0];
    }
    void printoTeDhenat(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Stafi akademik: ");
        for(StafiAkademik sa: this.stafiAkademik){
            sa.shtypDetajet();
        }
        System.out.println("Drejtimet: ");
        for(Drejtimi d : this.drejtimet){
            d.shtypDetajet();
        }
    }

    void printoStafinAkademik(){
        System.out.println("Stafi akademik: ");
        for(StafiAkademik sa : this.stafiAkademik){
            System.out.println(sa.titulli + " " + sa.emri);
            System.out.println("Drejtimi: " + sa.drejtimi.emri);
        }
    }

    void shtoDrejtimTeRi(Drejtimi drejtimi){
        this.drejtimet = MenaxhimiVargut.shtoDrejtimTeRi(this.drejtimet, drejtimi);
    }

    void printoStafinAkademikSipasTitullit(String titulli){
        for(StafiAkademik sa : this.stafiAkademik){
            if(sa.titulli.equals(titulli)){
                System.out.println(sa.emri);
            }
        }
    }
}

class Drejtimi {
    int id;
    String emri;

    public Drejtimi(int id, String emri) {
        this.id = id;
        this.emri = emri;
    }

    void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
    }
}

class StafiAkademik{
    int id;
    String emri;
    String titulli;
    Drejtimi drejtimi;

    public StafiAkademik(int id, String emri, String titulli, Drejtimi drejtimi) {
        this.id = id;
        this.emri = emri;
        this.titulli = titulli;
        this.drejtimi = drejtimi;
    }

    void shtypDetajet(){
//        ...
    }
}

class MenaxhimiVargut{
    static Drejtimi[] shtoDrejtimTeRi(Drejtimi[] drejtimet, Drejtimi drejtimi){
        Drejtimi[] varguIRi = new Drejtimi[drejtimet.length + 1];
        System.arraycopy(drejtimet, 0, varguIRi, 0, drejtimet.length);
        varguIRi[varguIRi.length - 1] = drejtimi;
        return varguIRi;
    }
}









