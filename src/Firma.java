public class Firma {
    private Pracownik[] pracownicy;
    private int index=0;

    Firma(int wielkoscFirmy){
        pracownicy = new Pracownik[wielkoscFirmy];
    }

    void add(Pracownik pracownik){
        pracownicy[index] = pracownik;
        index++;
    }
}
