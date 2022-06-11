import java.util.*;

public class Main {
    public static void main(String[] args) {


//        City деген класс тузунуз. (code, name, ...)
//        Эгерде code так сан болсо TreeSetke салыныз.
//                Аларды чонунан кичинесине караган тартипте чыгарыныз.


                Set<City>sets=new HashSet<>();
               sets.add(new City(12,"Bishkek"));
               sets.add(new City(25,"Osh"));
               sets.add(new City(32,"Batken"));
               sets.add(new City(46,"Jalal abad"));
               sets.add(new City(55,"Naaryn"));
               sets.add(new City(67,"Talas"));
               sets.add(new City(77,"Issyk kyl"));


        Set<City> sets1 = new TreeSet<>(sets);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
        for (City set:sets1) {
            if (set.getCod()%2==1) {
                sets1.add(set);
                System.out.println(set);

            }

        }


        }





    }
