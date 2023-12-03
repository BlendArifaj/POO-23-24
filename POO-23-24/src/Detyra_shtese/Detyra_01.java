package Detyra_shtese;
/*
Sigurimi i një detyre për studentët për menaxhimin e vargut në Java:

Titulli: Detyrë - Menaxhimi Objekt-Orientuar i Vargut në Java

Përshkrimi i Detyrës:

Qëllimi:
Qëllimi i kësaj detyre është të krijoni një program në Java që do të lejojë menaxhimin e një vargu përmes përdorimit të
koncepteve të orientimit të objekteve. Programi duhet të jetë në gjendje të shtojë elemente të reja në varg, duke rritur
madhësinë e vargut nëse ai është bosh dhe duke shtuar elementet nëse ka hapësirë të mjaftueshme.

Specifikimet e Detyrës:

1. Krijoni një klasë "MenaxhimiVargut" që do të përdoret për menaxhimin e vargut.
2. Klasa "MenaxhimiVargut" duhet të përmbajë një varg për të ruajtur elementet dhe një variabël për numrin aktual të
    elementeve në varg.
3. Implementoni një metodë që rrit madhësinë e vargut në dyfish nëse vargu është bosh.
4. Krijoni një metodë për shtimin e elementeve në varg. Nëse ka hapësirë të mjaftueshme në varg, shtoni elementin
    në varg; në të kundërt, rritni madhësinë e vargut dhe pastaj shtoni elementin.
5. Implementoni një metodë për të shfaqur vargun. Kjo metodë duhet të përdoret për testimin e funksionalitetit
    të shtimit të elementeve.

Implementimi:

- Fillimisht, krijoni një instancë të klases "MenaxhimiVargut" për të testuar funksionalitetin e programit.
- Përdorni metodën për shtimin e disa elementeve në varg dhe pastaj shfaqeni vargun për të verifikuar nëse
    funksionon saktësisht siç është specifikuar në detyrë.

Pasqyra e Punës:

- Krijimi i klases "MenaxhimiVargut" duke përfshirë metodat e nevojshme për shtimin e elementeve dhe rritjen e
    madhësisë së vargut.
- Verifikimi i funksionalitetit duke shtuar elemente në varg dhe duke kontrolluar nëse madhësia e vargut rritet
    në rastet e nevojshme.
- Sigurimi që programi të funksionojë sipas specifikimeve të dhëna në përshkrimin e detyrës dhe që të kthejë
    rezultatet e pritura.

Kjo detyrë synon të testojë aftësinë tuaj për të krijuar një program funksional në Java duke përdorur orientimin e
objekteve për menaxhimin e vargut. Fokusi duhet të jetë në sigurimin e funksionalitetit korrekt dhe në ndjekjen e
specifikimeve të dhëna në përshkrim. Pas përfundimit të implementimit, testoni programin për të siguruar që vepron
siç është specifikuar.
 */
public class Detyra_01 {
}

class MenaxhimiVargut {
    private int[] vargu;
    private int madhesia;

    public MenaxhimiVargut() {
        vargu = new int[1]; // Fillimisht krijohet një varg me madhësinë 1
        madhesia = 0; // Madhësia fillestare e vargut është 0 (vargu është bosh)
    }

    private void rritMadhesine() {
        int[] varguRi = new int[vargu.length * 2]; // Krijo varg të ri me madhësinë dyfish të vargut aktual

        // Kopjo elementet nga vargu aktual në vargun e ri
        for (int i = 0; i < madhesia; i++) {
            varguRi[i] = vargu[i];
        }

        vargu = varguRi; // Ndërro vargun aktual me vargun e ri
    }

    public void shtoElement(int element) {
        if (madhesia == vargu.length) {
            rritMadhesine(); // Rrit madhësinë e vargut nëse është i mbushur
        }

        vargu[madhesia] = element; // Shto elementin në pozitën e radhës në varg
        madhesia++; // Rrit numrin e elementeve në varg
    }

    // Metodë për të printuar elementet e vargut për testim
    public void printoVargun() {
        System.out.print("Vargu: ");
        for (int i = 0; i < madhesia; i++) {
            System.out.print(vargu[i] + " ");
        }
        System.out.println();
    }
}

