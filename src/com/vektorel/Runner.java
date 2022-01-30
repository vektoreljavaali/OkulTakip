package com.vektorel;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> ogrenciler;
        // koleksiyonu initialize(başlatma)
        ogrenciler = new ArrayList<String>();
        // ArrayList in belli bir genişliği yoktur
        // ekleme yaptıkça hacmi genişler.
        // Ekleme
        ogrenciler.add("Öğrenci-1");
        ogrenciler.add("Öğrenci-2");
        ogrenciler.add("Öğrenci-3");
        ogrenciler.add("Öğrenci-4");
        // Silme - Option-1
        ogrenciler.remove("Öğrenci-2");
        // Silme - Option-2
        ogrenciler.remove(0);
        // Kayıtlı öğrenciyi görmek
        System.out.println(ogrenciler.get(0));

        ogrenciler.add(2, "Öğrenci-10");
    }
}
