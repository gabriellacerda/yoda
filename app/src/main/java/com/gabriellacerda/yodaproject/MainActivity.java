
package com.gabriellacerda.yodaproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer eoqSoundMP        = MediaPlayer.create(this, R.raw.eoq);
        final MediaPlayer soladoMalucoMP    = MediaPlayer.create(this, R.raw.soladomaluco);
        final MediaPlayer eNoisMalucoMP     = MediaPlayer.create(this, R.raw.enoismaluco);
        final MediaPlayer sehloiroMP        = MediaPlayer.create(this, R.raw.sehloiro);
        final MediaPlayer lagoAquiLagoAiMP  = MediaPlayer.create(this, R.raw.lagoaquilagoai);
        final MediaPlayer circoDeSoledMP    = MediaPlayer.create(this, R.raw.circodesoled);
        final MediaPlayer opaFionMP         = MediaPlayer.create(this, R.raw.opafion);
        final MediaPlayer hiiiiiiiMP        = MediaPlayer.create(this, R.raw.iihhrrl);
        final MediaPlayer praDeusVerMP      = MediaPlayer.create(this, R.raw.fezumapradeusver);
        final MediaPlayer trabsonMP         = MediaPlayer.create(this, R.raw.trabson);
        final MediaPlayer fonSoundMP        = MediaPlayer.create(this, R.raw.fon);
        final MediaPlayer queeeeeMP         = MediaPlayer.create(this, R.raw.queeeee);

        Button play_eoq             = (Button) this.findViewById(R.id.play_eoq);
        Button play_solado_maluco   = (Button) this.findViewById(R.id.play_solado_maluco);
        Button play_e_nois_maluco   = (Button) this.findViewById(R.id.play_e_nois_maluco);
        Button play_sehloiro        = (Button) this.findViewById(R.id.play_sehloiro);
        Button play_lagoaquilagoai  = (Button) this.findViewById(R.id.play_lagoaquilagoai);
        Button play_circo_de_soled  = (Button) this.findViewById(R.id.play_circo_de_soled);
        Button play_opa_fion        = (Button) this.findViewById(R.id.play_opa_fion);
        Button play_hiiiiiii        = (Button) this.findViewById(R.id.play_hiiiiiii);
        Button play_pra_deus_ver    = (Button) this.findViewById(R.id.play_pra_deus_ver);
        Button play_trabson         = (Button) this.findViewById(R.id.play_trabson);
        Button play_queeeee         = (Button) this.findViewById(R.id.play_queeeee);
        Button play_fon             = (Button) this.findViewById(R.id.play_fon);

        play_eoq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eoqSoundMP.start();
            }
        });

        play_solado_maluco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soladoMalucoMP.start();
            }
        });

        play_e_nois_maluco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eNoisMalucoMP.start();
            }
        });

        play_sehloiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sehloiroMP.start();
            }
        });

        play_lagoaquilagoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lagoAquiLagoAiMP.start();
            }
        });

        play_circo_de_soled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circoDeSoledMP.start();
            }
        });

        play_opa_fion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opaFionMP.start();
            }
        });

        play_hiiiiiii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hiiiiiiiMP.start();
            }
        });

        play_pra_deus_ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                praDeusVerMP.start();
            }
        });

        play_trabson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trabsonMP.start();
            }
        });

        play_fon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fonSoundMP.start();
            }
        });

        play_queeeee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queeeeeMP.start();
            }
        });
    }
}
