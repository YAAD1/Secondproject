public class Yazdirma {
    private String creatHeading(String symbol){
        return symbol+"*********\n*";
    }
   private String creatSubtext(){
        return"*\n*********";
    }
    private String prepare(int number){
        String output="";
        output+=creatHeading("i");
        output+=String.format("%9d", number);
        output+=creatSubtext();
        return output;
    }
    private String prepare(float dnumber){
        String output="";
        output+=creatHeading("f");
        output+=String.format("%8.4f", dnumber);
        output+=creatSubtext();
        return output;
    }
    private String prepare(String text){
        String output="";
        output+=creatHeading("s");
        output+=String.format("%s",text);
        output+=creatSubtext();
        return output;
    }
    public void yazdir(int number){
        System.out.println(prepare(number));
    }
    public void yazdir(float dnumber){
        System.out.println(prepare(dnumber));
    }
    public void yazdir(String text){
        System.out.println(prepare(text));
    }
}
