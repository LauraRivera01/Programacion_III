package com.example.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tbhConversores = (TabHost)findViewById(R.id.tbhConversor);
        tbhConversores.setup();

        tbhConversores.addTab(tbhConversores.newTabSpec("Almacenamiento").setContent(R.id.tabAlmacenamiento).setIndicator("Almacenamiento", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Peso").setContent(R.id.tabPeso).setIndicator("Peso", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Longitud").setContent(R.id.tabLongitud).setIndicator("Longitud", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Volumen").setContent(R.id.tabVolumen).setIndicator("Volumen", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Datos").setContent(R.id.tabDatos).setIndicator("Datos", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Moneda").setContent(R.id.tabMoneda).setIndicator("Moneda", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Tiempo").setContent(R.id.tabTiempo).setIndicator("Tiempo", null));



    }

    //pesos

    final private double Miligramo = 0.001;
    final private double Gramo = 1;
    final private double Decagramo = 10;
    final private double Kilogramo = 1000;
    final private double onzas = 28.3495;
    final private double libras = 0.5;
    final private double toneladas = 1000000;

 //monedas

    final private double DolarEu = 0.87;
    final private double Euro = 1.18;
    final private double Yen = 0.01;
    final private double Libra = 1.31;
    final private double Dolar = 1;
    final private double Colon = 0.11;
    final private double Cordoba = 0.03;
    final private double Lempira = 0.04;
    final private double Quetzal = 0.13;
    final private double PesoMX = 21.99;




}