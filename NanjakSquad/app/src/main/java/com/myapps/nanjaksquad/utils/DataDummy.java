package com.myapps.nanjaksquad.utils;

import com.myapps.nanjaksquad.R;
import com.myapps.nanjaksquad.data.GunungEntity;

import java.util.ArrayList;

public class DataDummy {
    public static ArrayList<GunungEntity> generateGunungData(){
        ArrayList<GunungEntity> gunung = new ArrayList<>();

        gunung.add(new GunungEntity("Puncak Jaya",
                R.drawable.puncak_jaya_wijaya,
                "4.884 mdpl",
                "Provinsi Papua",
                "Puncak Jaya yang dikenal juga dengan nama Cartenz Pyramid " +
                        "adalah bagian dari pegunungan Sudirman di Papua dan merupakan puncak tertinggi di Indonesia. " +
                        "Menjadi salah satu dari tujuh puncak dunia, di puncak gunung tertinggi di Indonesia ini kamu juga " +
                        "bisa menemukan satu-satunya gletser tropika di Indonesia."));

        gunung.add(new GunungEntity("Gunung Kerinci",
                R.drawable.gunung_kerinci,
                "3.805 mdpl",
                "Provinsi Jambi",
                "Di deretan kedua gunung paling tinggi di Indonesia terdapat Gunung Kerinci " +
                        "yang berada di Provinsi Jambi. Merupakan salah satu gunung berapi aktif, " +
                        "gunung tertinggi di pulau Sumatera ini jadi salah satu destinasi pendakian favorit, " +
                        "khususnya pendaki yang telah berpengalaman."));

        gunung.add(new GunungEntity("Gunung Rinjani",
                R.drawable.gunung_rinjani,
                "3.762 mdpl",
                "Lombok, Nusa Tenggara Barat",
                "Gunung tertinggi di Indonesia selanjutnya berada di gugusan kepulauan Nusa Tenggara, " +
                        "tepatnya di pulau Lombok. Selain menantang, pendakian Gunung Rinjani menawarkan panorama alam yang sangat menakjubkan," +
                        "menjadikannya salah satu destinasi pendakian populer dan favorit."));

        gunung.add(new GunungEntity("Gunung Semeru",
                R.drawable.gunung_semeru,
                "3.676 mdpl",
                "Provinsi Jawa Timur",
                "Menjadi gunung tertinggi di pulau Jawa, Gunung Semeru merupakan salah satu gunung paling tinggi yang ada di Indonesia. " +
                        "Gunung berapi kerucut ini sangat populer, terutama ketika menjadi latar belakang cerita pada film \"5 cm\" " +
                        "yang menceritakan tentang perjalanan pendakian sekelompok sahabat untuk men capai puncak Mahameru."));

        gunung.add(new GunungEntity("Gunung Sanggar",
                R.drawable.gunung_sanggar,
                "3.564 mdpl",
                "Lombok, Nusa Tenggara Barat",
                "Gunung tertinggi di Indonesia selanjutnya juga berada di Lombok. " +
                        "Meskipun tidak sepopuler Gunung Rinjani, Gunung Sanggar memiliki ketinggian mencapai 3.564 mdpl, " +
                        "menjadikannya salah satu dari lima gunung tertinggi di Indonesia. Soal pemandangan alam, " +
                        "Gunung Sanggar menawarkan keindahan yang tak kalah indah dari gunung-gunung lainnya yang ada di kawasan kepulauan Nusa Tenggara."));

        gunung.add(new GunungEntity("Gunung Latimojong",
                R.drawable.gunung_latimojong,
                "3.478 mdpl",
                "Kabupatern Enrekang, Sulawesi Selatan ",
                "Berada di tengah-tengah Sulawesi Selatan, Gunung Latimojong adalah gunung tertinggi di Indonesia selanjutnya. " +
                        "Gunung tertinggi di Sulawesi ini memiliki puncak tertinggi bernama Bulu Rante Mario. " +
                        "Tertarik mendaki salah satu gunung paling tinggi di Indonesia ini? " +
                        "Untuk bisa mencapai ke kaki gunung ini kamu harus menempuh jarak tempuh sekitar 10 jam dari pusat kota Makassar."));

        gunung.add(new GunungEntity("Gunung Slamet",
                R.drawable.gunung_slamet,
                "3.428 mdpl",
                "Provinsi Jawa Tengah",
                "Gunung Slamet adalah gunung berapi kerucut yang berada di Jawa Tengah, " +
                        "tepatnya berada di antara Kabupaten Brebes, Kabupaten Banyumas, Kabupaten Purbalinhgga, Kabupaten Tegal, " +
                        "dan jga Kabupaten Pemalang. \n" +
                        "Salah satu gunung tertinggi di Indonesia ini merupakan gunung paling tinggi di pulau Jawa kedua setelah Gunung Semeru. " +
                        "Jalur pendakian gunung ini dikenal sebagai salah satu medan pendakian yang sulit."));

        gunung.add(new GunungEntity("Gunung Sumbing",
                R.drawable.gunung_sumbing,
                "3.371 mdpl",
                "Provinsi Jawa Tengah",
                "Gunung paling tinggi di Indonesia selanjutnya adalah Gunung Sumbing yang juga merupakan destinasi pendakian yang cukup populer. " +
                        "Terdapat tiga jalur pendakian untuk mencapai puncak dari salah satu gunung paling tinggi yang ada di Indonesia ini yakni jalur cepit parakan, " +
                        "jalur bogowongso, dan juga jalur desa garung."));

        gunung.add(new GunungEntity("Gunung Raung",
                R.drawable.gunung_raung,
                "3.344 mdpl",
                "Provinsi Jawa Timur",
                "Gunung tertinggi di Indonesia lainnya masih berada di daratan pulau Jawa, " +
                        "tepatnya di Jawa Timur melintasi Bondowoso, Jember, dan juga Banyuwangi. Terdapat empat puncak di Gunung Raung yakni Puncak Bendera, " +
                        "Puncak 17, Puncak Tusuk Gigi, dan Puncak Sejati yang merupakan puncak tertinggi gunung ini."));

        gunung.add(new GunungEntity("Gunung Lawu",
                R.drawable.gunung_lawu,
                "3.265 mdpl",
                "Provinsi Jawa Tengah",
                "Masih berada di Jawa, Gunung Lawu adalah salah satu gunung tertinggi di Indonesia " +
                        "yang berlokasi di perbatasan antara Magetan, Jawa Timur dan Karanganyar, Jawa Tengah. " +
                        "Populer sebagai salah satu tujuan pendakian, gunung ini memiliki tiga buah pujncah tertinggi yang disakralkan oleh masyarakat setempat."));

        return gunung;
    }
}