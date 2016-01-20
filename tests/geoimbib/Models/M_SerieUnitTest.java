package geoimbib.Models;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by quentin on 18/01/16.
 */
public class M_SerieUnitTest {
    @Test
    public void testCalculMoyenneSerie(){

        M_Mesure mesure1 = new M_Mesure(Calendar.getInstance(), 12.1);
        M_Mesure mesure2 = new M_Mesure(Calendar.getInstance(), 4.4);
        M_Mesure mesure3 = new M_Mesure(10.5);

        ArrayList<M_Mesure> listMesureCarotte1 = new ArrayList<M_Mesure>();
        listMesureCarotte1.add(mesure1);
        listMesureCarotte1.add(mesure2);
        listMesureCarotte1.add(mesure3);

        M_Carotte carotte1 = new M_Carotte("carotte1", 5, 10, 150,listMesureCarotte1);

        mesure1 = new M_Mesure(Calendar.getInstance(), 3);
        mesure2 = new M_Mesure(Calendar.getInstance(), 5);
        mesure3 = new M_Mesure(10);

        ArrayList<M_Mesure> listMesureCarotte2 = new ArrayList<M_Mesure>();
        listMesureCarotte2.add(mesure1);
        listMesureCarotte2.add(mesure2);
        listMesureCarotte2.add(mesure3);
        M_Carotte carotte2 = new M_Carotte("carotte2", 4.5, 7, 210,listMesureCarotte2);

        ArrayList<M_Carotte> listCarotte = new ArrayList<M_Carotte>();
        listCarotte.add(carotte1);
        listCarotte.add(carotte2);
        M_Serie serie = new M_Serie("SerieToTest", 3, listCarotte, Calendar.getInstance());
        assertEquals("La moyenne ne correspond pas à celle attendue",7.5, serie.calculMoyenneSerie());
    }


}