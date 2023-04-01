public class Yazdirma {
    private String creatHeading(String symbol){
        return symbol+"*********\n*";
    }
   private String creatSubtext(){
        return"*\n*********";
    }
    public void yazdir(int sayi){
        System.out.printf(creatHeading("i"));
        var output=String.format("%9d", sayi);
        System.out.print(output);
        System.out.println(creatSubtext());
    }
    public void yazdir(float ondaliklisayi){
        System.out.printf(creatHeading("f"));
        var output=String.format("%8.4f",ondaliklisayi);
        System.out.print(output);
        System.out.println(creatSubtext());
    }
    public void yazdir(String metin){
        System.out.printf(creatHeading("s"));
        var output=String.format("%s",metin);
        System.out.print(output);
        System.out.println(creatSubtext());
    }
}
