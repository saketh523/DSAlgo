package com.company.randomcode;

public class LearnStrings {
    public static void main(String[] args) {
        String s = new String("Saketh");
        StringBuffer sb = new StringBuffer("Saketh");
        int k = 0;

        //  immutability and mutability
        s.concat("Reddy");
        sb.append("Reddy");
        System.out.println(s);
        System.out.println(sb);

      while(k<62){System.out.print('-'); k++; }
        System.out.println();
        k =0;

        // == and .equals

        String s1  = new String("Ketan");
        String s2  = new String("Ketan");

          System.out.println(s1==s2);
          System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("Vinay");
        StringBuffer sb2 = new StringBuffer("Vinay");

          System.out.println(sb1==sb2);
          System.out.println(sb1.equals(sb2));

        while(k<62){System.out.print('-'); k++; }
        System.out.println();
        k = 0;

        // Heap and StringConstantPool in String

        String season = new String("spring");
        season.concat("fall");
        String weather = season.concat("winter");
        weather.concat("summer");
        System.out.println(season);
        System.out.println(weather);

        while(k<62){System.out.print('-'); k++; }
        System.out.println();
        k = 0;

        String a = new String("You cannot change Me");
        String b = new String("You cannot change Me");
        System.out.println(a==b);

        String c = "You cannot change Me";
        System.out.println(a==c);

        String d = "You cannot change Me";
        System.out.println(c==d);

        String e = "You cannot " + "change Me";
        System.out.println(d==e);

        String f = "You cannot ";
        String g = f + "change Me";
        System.out.println(d==g);

        final String h = "You cannot ";
        String i = h + "change Me";
        System.out.println(d==i);

        while(k<62){System.out.print('-'); k++; }
        System.out.println();
        k = 0;

        // constructors of String class

        String a1 = new String();
        System.out.println("a1: " + a1);

        String a2 = new String("string literal");
        System.out.println("a2: " + a2);

        StringBuffer asb1 = new StringBuffer("String Buffer");
        String a3 = new String(asb1);
        System.out.println("a3: " + a3);

        StringBuilder asbu1 = new StringBuilder("String Builder");
        String a4 = new String(asbu1);
        System.out.println("a4: " + a4);

        char[] ch = {'j', 'a','v','a'};
        String a5 = new String(ch);
        System.out.println("a5: " + a5);

        byte[] byteArray = {97,98,99,100};
        String a6 = new String(byteArray);
        System.out.println("a6: "+ a6);

        while(k<62){System.out.print('-'); k++; }
        System.out.println();
        k = 0;

        // important methods of string class

        String j = new String("durga");
        System.out.println(j.charAt(2));
        System.out.println(j.equals("DURGA"));
        System.out.println(j.equalsIgnoreCase("DURGA"));
        System.out.println(j.concat("Hello"));

        String l = "";
        System.out.println(l.isEmpty());
        System.out.println(j.length());

        String m = "ababab";
        System.out.println(m.replace('a','b'));

        String n = "abcdefg";
        System.out.println(n.substring(2));
        System.out.println(n.substring(2,7));
        System.out.println(n.substring(2,5));

        String o = "Engineering";
        System.out.println(o.indexOf('e'));
        System.out.println(o.indexOf('z'));
        System.out.println(o.lastIndexOf('e'));
        System.out.println(o.toUpperCase());
        System.out.println(o.toLowerCase());
        String p = "   Hello  ";
        System.out.println(p);
        System.out.println(p.trim());

        while(k<62){System.out.print('-'); k++; }
        System.out.println();

        String q = " ";
        q.trim();
        System.out.println(q.equals("") + " " + q.isEmpty());

    }
}
