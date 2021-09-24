package com.example.login.data

import com.example.login.model.SellosConmemorativos

    class Datasource {

        fun loadSellos(): List<SellosConmemorativos> {
            return listOf(
                SellosConmemorativos(1, "90 años de relaciones diplomáticas Argentina- Bulgaria",50, "https://wsec01.correoargentino.com.ar/sites/default/files/sello_argentina_bulgaria_web_0.png"),
                SellosConmemorativos(2, "Homenaje al Perito Francisco Pascasio Moreno-Juvenex 2019",70,"https://wsec01.correoargentino.com.ar/sites/default/files/entero-juvenex-2019-e-tienda.png"),
                SellosConmemorativos(3,"150 aniversario del diario La Nación",100, "https://wsec01.correoargentino.com.ar/sites/default/files/sello_150_la_nacion_8_nov_aval-02.jpg"),
                SellosConmemorativos(4,"Navidad 2019",120,"https://wsec01.correoargentino.com.ar/sites/default/files/sello_navidad_2019_e-tienda.png"),
                SellosConmemorativos(5,"Mancha y Gato",150,"https://wsec01.correoargentino.com.ar/sites/default/files/hb_myg_chica_ok-02.jpg"),
                SellosConmemorativos(6,"Mahatma Gandhi",60,"https://wsec01.correoargentino.com.ar/sites/default/files/gandhi.jpg"),
                SellosConmemorativos(7,"Filatelia- Argentina: Tango",80,"https://wsec01.correoargentino.com.ar/sites/default/files/sellos_tango.png"),
                SellosConmemorativos(8,"Carnet Buenos Aires 2 x 4",200, "https://wsec01.correoargentino.com.ar/sites/default/files/carnet_bs_as_2x4.png"),
                SellosConmemorativos(9,"Homenaje a Carlos Gardel",100,"https://wsec01.correoargentino.com.ar/sites/default/files/sello_gardel.png")
                                                )
        }
    }
