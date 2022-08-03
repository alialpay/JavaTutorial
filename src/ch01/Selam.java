package ch01;

public class Selam {
    String world = "millet";

    public String selamSoyle(String kime)  {
        String cumle;
        if(kime!= "")
            cumle= "selam " + kime + " :)";
        else
            cumle= "selam " + world + " :)";
        return cumle;
    }

}
