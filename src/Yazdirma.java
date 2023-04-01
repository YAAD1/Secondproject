public class Yazdirma {
    private void baslikYazdir(String symbol){
        System.out.println(symbol+"*********");
        System.out.print("*");
    }
   private void altmetinyazdir(){
        System.out.println("*\n*********");
    }
    public void yazdir(int sayi){
        baslikYazdir("i");
        System.out.printf("%9d", sayi);
        altmetinyazdir();
    }
    public void yazdir(float ondaliklisayi){
        baslikYazdir("f");
        System.out.printf("%8.4f", ondaliklisayi);
        altmetinyazdir();
    }
    public void yazdir(String metin){
        baslikYazdir("S");
        System.out.printf("%s",metin);
        altmetinyazdir();
    }
}
