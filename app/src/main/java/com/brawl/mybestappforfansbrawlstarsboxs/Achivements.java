package com.brawl.mybestappforfansbrawlstarsboxs;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Achivements extends AppCompatActivity {

    /* renamed from: o */
    public static TextView f3700o;

    /* renamed from: p */
    public static TextView f3701p;

    /* renamed from: q */
    static Animation f3702q;

    /* renamed from: r */
    public static ArrayList<String> f3703r;

    /* renamed from: j */
    TextView f3704j;

    /* renamed from: k */
    ImageView f3705k;

    /* renamed from: l */
    ImageView f3706l;

    /* renamed from: m */
    RecyclerView f3707m;

    /* renamed from: n */
    ArrayList<C1127a> f3708n;

    /* renamed from: s */
    C1128b f3709s;

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_achivements);
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f3708n = new ArrayList<>();
        f3702q = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        if (MainActivity.m3726c("language") == 0) {
            this.f3708n.add(new C1127a("UNLOCK ALL STARTING BRAWLERS", 250, 25));
            this.f3708n.add(new C1127a("UNLOCK ALL RARE BRAWLERS", 350, 35));
            this.f3708n.add(new C1127a("UNLOCK ALL SUPER RARE BRAWLERS", 400, 40));
            this.f3708n.add(new C1127a("UNLOCK ALL EPIK BRAWLERS", 600, 60));
            this.f3708n.add(new C1127a("UNLOCK ALL MYTHIC BRAWLERS", 800, 80));
            this.f3708n.add(new C1127a("UNLOCK ALL LEGENDARY BRAWLERS", 1000, 150));
            this.f3708n.add(new C1127a("UNLOCK ALL BRAWLERS", 10000, 1500));
            this.f3708n.add(new C1127a("OPEN 100 BOXES", 10000, 100));
            this.f3708n.add(new C1127a("OPEN 100 BIG BOXES", 1000, 300));
            this.f3708n.add(new C1127a("OPEN 100 MEGA BOXES", 5000, 500));
            this.f3708n.add(new C1127a("COLLECT 1000 GEMS", 10000, 2000));
            this.f3708n.add(new C1127a("COLLECT 10000 COINS", 20000, 450));
            this.f3708n.add(new C1127a("COLLECT 100 TICKETS", 1000, 250));
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3708n.add(new C1127a("ВІДКРИЙ УСІХ ПОЧАТКОВИХ БІЙЦІВ", 250, 25));
            this.f3708n.add(new C1127a("ВІДКРИЙ УСІХ РІДКІСНИХ БІЙЦІВ", 350, 35));
            this.f3708n.add(new C1127a("ВІДКРИЙ УСІХ ДУЖЕ РІДКІСНИХ БІЙЦІВ", 400, 40));
            this.f3708n.add(new C1127a("ВІДКРИЙ УСІХ ЕПІЧНИХ БІЙЦІВ", 600, 60));
            this.f3708n.add(new C1127a("ВІДКРИЙ УСІХ МІФІЧНИХ БІЙЦІВ", 800, 80));
            this.f3708n.add(new C1127a("ВІДКРИЙ УСІХ ЛЕГЕНДАРНИХ БІЙЦІВ", 1000, 150));
            this.f3708n.add(new C1127a("ВІДКРИЙ УСІХ БІЙЦІВ", 10000, 1500));
            this.f3708n.add(new C1127a("ВІДКРИЙ 100 ЗВИЧАЙНИХ КОРОБОК", 10000, 100));
            this.f3708n.add(new C1127a("ВІДКРИЙ 100 ВЕЛИКИХ КОРОБОК", 1000, 300));
            this.f3708n.add(new C1127a("ВІДКРИЙ 100 ВЕЛЕТЕНСЬКИХ КОРОБОК", 5000, 500));
            this.f3708n.add(new C1127a("НАЗБИРАЙ 1000 КРИСТАЛІВ", 10000, 2000));
            this.f3708n.add(new C1127a("НАЗБИРАЙ 10000 МОНЕТ", 20000, 450));
            this.f3708n.add(new C1127a("НАЗБИРАЙ 100 КВИТКІВ", 1000, 250));
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3708n.add(new C1127a("ОТКРОЙ ВСЕХ НАЧАЛЬНЫХ БОЙЦОВ", 250, 25));
            this.f3708n.add(new C1127a("ОТКРОЙ ВСЕХ РЕДКИХ БОЙЦОВ", 350, 35));
            this.f3708n.add(new C1127a("ОТКРОЙ ВСЕХ СВЕРХРЕДКИХ БОЙЦОВ", 400, 40));
            this.f3708n.add(new C1127a("ОТКРОЙ ВСЕХ ЭПИЧЕСКИХ БОЙЦОВ", 600, 60));
            this.f3708n.add(new C1127a("ОТКРОЙ ВСЕХ МИФИЧЕСКИХ БОЙЦОВ", 800, 80));
            this.f3708n.add(new C1127a("ОТКРОЙ ВСЕХ ЛЕГЕНДАРНЫХ БОЙЦОВ", 1000, 150));
            this.f3708n.add(new C1127a("ОТКРОЙ ВСЕХ БОЙЦОВ", 10000, 1500));
            this.f3708n.add(new C1127a("ОТКРОЙ 100 КОРОБОК", 10000, 100));
            this.f3708n.add(new C1127a("ОТКРОЙ 100 БОЛЬШИХ КОРОБОК", 1000, 300));
            this.f3708n.add(new C1127a("ОТКРОЙ 100 МЕГА КОРОБОК", 5000, 500));
            this.f3708n.add(new C1127a("СОБЕРИ 1000 КРИСТАЛОВ", 10000, 2000));
            this.f3708n.add(new C1127a("СОБЕРИ 10000 МОНЕТ", 20000, 450));
            this.f3708n.add(new C1127a("СОБЕРИ 100 БИЛЕТОВ", 1000, 250));
        }
        this.f3704j = (TextView) findViewById(R.id.title);
        this.f3705k = (ImageView) findViewById(R.id.back);
        this.f3706l = (ImageView) findViewById(R.id.home);
        this.f3707m = (RecyclerView) findViewById(R.id.ach_recycler);
        this.f3709s = new C1128b(this, this.f3708n);
        if (MainActivity.m3726c("language") == 1) {
            this.f3704j.setText("ДОСЯГНЕННЯ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3704j.setText("ДОСТИЖЕНИЯ");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        f3703r = arrayList;
        arrayList.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("f");
        f3703r.add("r");
        f3703r.add("r");
        f3703r.add("r");
        f3703r.add("r");
        f3703r.add("s");
        f3703r.add("s");
        f3703r.add("s");
        f3703r.add("s");
        f3703r.add("e");
        f3703r.add("e");
        f3703r.add("e");
        f3703r.add("e");
        f3703r.add("e");
        f3703r.add("m");
        f3703r.add("m");
        f3703r.add("m");
        f3703r.add("m");
        f3703r.add("m");
        f3703r.add("l");
        f3703r.add("l");
        f3703r.add("l");
        f3703r.add("l");
        f3700o = (TextView) findViewById(R.id.coins);
        f3701p = (TextView) findViewById(R.id.gems);
        TextView textView = f3700o;
        StringBuilder sb = new StringBuilder();
        sb.append(MainActivity.m3726c("money"));
        textView.setText(sb.toString());
        TextView textView2 = f3701p;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MainActivity.m3726c("gems"));
        textView2.setText(sb2.toString());
        this.f3705k.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Achivements.C09311 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(Achivements.this.getApplicationContext(), (int) R.raw.menu_cancel).start();
                }
                Achivements.this.finish();
            }
        });
        this.f3706l.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Achivements.C09322 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(Achivements.this.getApplicationContext(), (int) R.raw.menu_cancel).start();
                }
                Achivements.this.finish();
            }
        });
        this.f3707m.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        this.f3707m.setAdapter(this.f3709s);
    }
}
