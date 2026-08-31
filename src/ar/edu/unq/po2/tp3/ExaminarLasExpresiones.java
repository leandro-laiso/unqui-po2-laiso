package ar.edu.unq.po2.tp3;



public class ExaminarLasExpresiones {

    /* 4. Examinar las expresiones

    Dado el siguiente código:
    String a = "abc";
    String s = a;
    String t;

    Indique que valores retornan las siguientes expresiones o, si dan error, por qué se producen:
    ● s.length();
        -> 3
    ● t.length();
        -> Error, variable no inicializada
    ● 1 + a;
        -> "1abc"
    ● a.toUpperCase();
        -> "ABC"
    ● "Libertad".indexOf("r");
        -> 4
    ● "Universidad".lastIndexOf('i');
        -> 7
    ● "Quilmes".substring(2,4);
        -> "ilm" (Mal, da "il")
    ● (a.length() + a).startsWith("a");
        -> false
    ● s == a;
        -> true
    ● a.substring(1,3).equals("bc")
        -> true
    */

    public void main(String[] args) {
        String a = "abc";
        String s = a;
        String t;
        System.out.println(s.length());
        //System.out.println(t.length()); da error
        System.out.println(1+a);
        System.out.println(a.toUpperCase());
        System.out.println("Libertad".indexOf("r"));
        System.out.println("Universidad".lastIndexOf('i'));
        System.out.println("Quilmes".substring(2,4));
        System.out.println((a.length() + a).startsWith("a"));
        System.out.println(s == a);
        System.out.println(a.substring(1,3).equals("bc"));

    }
}
