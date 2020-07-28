package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import android.app.ActivityManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import pl.droidsonroids.gif.GifImageView;

@SuppressWarnings("ALL")
public class Brawlers extends AppCompatActivity {

    /* renamed from: B */
    static C1141i f3819B;

    /* renamed from: j */
    static ArrayList<Integer> f3820j;

    /* renamed from: k */
    static ArrayList<C1135f> f3821k;

    /* renamed from: m */
    static Animation f3822m;

    /* renamed from: n */
    static Animation f3823n;

    /* renamed from: o */
    static ArrayList<Integer> f3824o;

    /* renamed from: p */
    static TextView f3825p;

    /* renamed from: q */
    static int f3826q;

    /* renamed from: r */
    static RecyclerView f3827r;

    /* renamed from: u */
    static ArrayList<C1135f> f3828u;

    /* renamed from: v */
    static ArrayList<C1135f> f3829v;

    /* renamed from: z */
    public static Activity f3830z;

    /* renamed from: A */
    int f3831A;

    /* renamed from: l */
    ImageButton f3832l;

    /* renamed from: s */
    ImageButton f3833s;

    /* renamed from: t */
    TextView f3834t;

    /* renamed from: w */
    TextView f3835w;

    /* renamed from: x */
    GifImageView f3836x;

    /* renamed from: y */
    ImageView f3837y;

   // @Override // androidx.p038f.p039a.C0666e
    public static ArrayList m3694a(int i) {
        f3828u = new ArrayList<>();
        f3829v = new ArrayList<>();
        for (int i2 = 0; i2 < f3821k.size(); i2++) {
            (f3821k.get(i2).f4563b != 0 ? f3828u : f3829v).add(f3821k.get(i2));
        }
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            arrayList.addAll(f3828u);
            arrayList.addAll(f3829v);
        }
        if (i == 1) {
            Collections.reverse(f3828u);
            Collections.reverse(f3829v);
            arrayList.addAll(f3828u);
            arrayList.addAll(f3829v);
        }
        if (i == 2) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < f3828u.size(); i3++) {
                int i4 = f3828u.get(i3).f4563b;
                ArrayList<Integer> arrayList3 = f3824o;
                if (i4 >= arrayList3.get(MainActivity.m3726c("l" + f3828u.get(i3).f4564c)).intValue()) {
                    arrayList2.add(f3828u.get(i3));
                    f3828u.remove(i3);
                }
            }
            arrayList2.addAll(f3828u);
            arrayList.addAll(arrayList2);
            arrayList.addAll(f3829v);
        }
        return arrayList;
    }

    /* renamed from: h */
    static void m3695h() {
        f3820j.add(Integer.valueOf((int) R.drawable.shely));
        f3820j.add(Integer.valueOf((int) R.drawable.nita));
        f3820j.add(Integer.valueOf((int) R.drawable.colt));
        f3820j.add(Integer.valueOf((int) R.drawable.bull));
        f3820j.add(Integer.valueOf((int) R.drawable.jesie));
        f3820j.add(Integer.valueOf((int) R.drawable.brock));
        f3820j.add(Integer.valueOf((int) R.drawable.dinamike));
        f3820j.add(Integer.valueOf((int) R.drawable.emz));
        f3820j.add(Integer.valueOf((int) R.drawable.bo));
        f3820j.add(Integer.valueOf((int) R.drawable.bit));
        f3820j.add(Integer.valueOf((int) R.drawable.tick));
        f3820j.add(Integer.valueOf((int) R.drawable.el_primo));
        f3820j.add(Integer.valueOf((int) R.drawable.barley));
        f3820j.add(Integer.valueOf((int) R.drawable.poco));
        f3820j.add(Integer.valueOf((int) R.drawable.rosa));
        f3820j.add(Integer.valueOf((int) R.drawable.ricoshet));
        f3820j.add(Integer.valueOf((int) R.drawable.daril));
        f3820j.add(Integer.valueOf((int) R.drawable.penny));
        f3820j.add(Integer.valueOf((int) R.drawable.carl));
        f3820j.add(Integer.valueOf((int) R.drawable.jacky));
        f3820j.add(Integer.valueOf((int) R.drawable.bibi));
        f3820j.add(Integer.valueOf((int) R.drawable.bea));
        f3820j.add(Integer.valueOf((int) R.drawable.frank));
        f3820j.add(Integer.valueOf((int) R.drawable.piper));
        f3820j.add(Integer.valueOf((int) R.drawable.pam));
        f3820j.add(Integer.valueOf((int) R.drawable.nani));
        f3820j.add(Integer.valueOf((int) R.drawable.max));
        f3820j.add(Integer.valueOf((int) R.drawable.mortis));
        f3820j.add(Integer.valueOf((int) R.drawable.mr_p));
        f3820j.add(Integer.valueOf((int) R.drawable.sprout));
        f3820j.add(Integer.valueOf((int) R.drawable.tara));
        f3820j.add(Integer.valueOf((int) R.drawable.gene));
        f3820j.add(Integer.valueOf((int) R.drawable.spike));
        f3820j.add(Integer.valueOf((int) R.drawable.crow));
        f3820j.add(Integer.valueOf((int) R.drawable.leon));
        f3820j.add(Integer.valueOf((int) R.drawable.sandy));
        f3820j.add(Integer.valueOf((int) R.drawable.gale));
    }

    /* access modifiers changed from: package-private */
    //@Override // androidx.appcompat.app.AppCompatActivity
    public final void mo3390e() {
        if (this.f3831A == 0) {
            if (MainActivity.m3726c("language") == 0) {
                this.f3835w.setText("Classic");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3835w.setText("Стандартно");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3835w.setText("Стандартно");
            }
        }
        if (this.f3831A == 1) {
            if (MainActivity.m3726c("language") == 0) {
                this.f3835w.setText("Rarity");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3835w.setText("Рідкість");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3835w.setText("Редкость");
            }
        }
        if (this.f3831A == 2) {
            if (MainActivity.m3726c("language") == 0) {
                this.f3835w.setText("Can Upgrade");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3835w.setText("Покращити");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3835w.setText("Улучшить");
            }
        }
    }

    /* access modifiers changed from: package-private */
   // @Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: f */
    public final void mo3391f() {
        if (MainActivity.m3726c("sounds") == 0) {
            MediaPlayer.create(this, (int) R.raw.menu_cancel).start();
        }
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_brawlers);
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        f3830z = this;
        this.f3834t = (TextView) findViewById(R.id.brawlers);
        if (MainActivity.m3726c("language") == 0) {
            this.f3834t.setText("Brawlers ");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3834t.setText("Бійці ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3834t.setText("Бойцы ");
        }
        this.f3835w = (TextView) findViewById(R.id.sort_button);
        this.f3831A = MainActivity.m3726c("sort");
        this.f3835w.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Brawlers.C09551 */

            public final void onClick(View view) {
                Brawlers brawlers;
                MediaPlayer.create(Brawlers.this, (int) R.raw.menu_click).start();
                if (Brawlers.this.f3831A == 2) {
                    brawlers = Brawlers.this;
                    brawlers.f3831A = 0;
                } else {
                    Brawlers.this.f3831A++;
                    brawlers = Brawlers.this;
                }
                MainActivity.m3720a(brawlers.f3831A, "sort");
                Brawlers brawlers2 = Brawlers.this;
                Brawlers.f3820j = new ArrayList<>();
                Brawlers.f3821k = new ArrayList<>();
                RecyclerView recyclerView = Brawlers.f3827r;
                Activity activity = Brawlers.f3830z;
                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
                Brawlers.m3695h();
                for (int i = 0; i < Brawlers.f3820j.size(); i++) {
                    C1135f fVar = new C1135f(Brawlers.f3820j.get(i).intValue(), MainActivity.m3726c(String.valueOf(i)));
                    fVar.f4564c = i;
                    Brawlers.f3821k.add(fVar);
                }
                Brawlers.f3819B = new C1141i(Brawlers.m3694a(brawlers2.f3831A), Brawlers.f3830z);
                Brawlers.f3827r.setAdapter(Brawlers.f3819B);
                try {
                    MainActivity.m3727c(Brawlers.f3830z);
                } catch (Exception unused) {
                }
                Brawlers.this.mo3390e();
                Brawlers.this.f3835w.startAnimation(Brawlers.f3822m);
            }
        });
        mo3390e();
        this.f3836x = (GifImageView) findViewById(R.id.fone_gif);
        this.f3837y = (ImageView) findViewById(R.id.scells);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (((double) (memoryInfo.totalMem / 1048576)) < 2000.0d) {
            this.f3836x.setVisibility(4);
            this.f3837y.setVisibility(0);
        }
        f3820j = new ArrayList<>();
        f3821k = new ArrayList<>();
        f3824o = new ArrayList<>();
        f3826q = 0;
        f3824o.add(0);
        f3824o.add(20);
        f3824o.add(30);
        f3825p = (TextView) findViewById(R.id.counts);
        f3824o.add(50);
        f3824o.add(80);
        f3824o.add(130);
        f3824o.add(210);
        f3824o.add(340);
        f3824o.add(550);
        f3824o.add(800);
        f3822m = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        f3823n = AnimationUtils.loadAnimation(this, R.anim.jump);
        this.f3832l = (ImageButton) findViewById(R.id.home);
        this.f3832l.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Brawlers.C09562 */

            public final void onClick(View view) {
                Brawlers.this.mo3391f();
                Brawlers.this.finish();
            }
        });
        f3827r = (RecyclerView) findViewById(R.id.recycler);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 3);
        //ToDo: Prefetch count
        int pre = ((LinearLayoutManager) gridLayoutManager).getInitialPrefetchItemCount();
        pre = 6;
        f3827r.getRecycledViewPool().clear();
        f3827r.setLayoutManager(gridLayoutManager);
        this.f3833s = (ImageButton) findViewById(R.id.back);
        this.f3833s.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Brawlers.C09573 */

            public final void onClick(View view) {
                Brawlers.this.mo3391f();
                Brawlers.this.finish();
            }
        });
        m3695h();
        for (int i = 0; i < f3820j.size(); i++) {
            C1135f fVar = new C1135f(f3820j.get(i).intValue(), MainActivity.m3726c(String.valueOf(i)));
            fVar.f4564c = i;
            f3821k.add(fVar);
        }
        f3819B = new C1141i(m3694a(this.f3831A), this);
        f3827r.setAdapter(f3819B);
        for (int i2 = 0; i2 < f3821k.size(); i2++) {
            if (f3821k.get(i2).f4563b != 0) {
                f3826q++;
            }
        }
        f3825p.setText(f3826q + "/" + f3821k.size() + " ");
    }

    @Override // androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onDestroy() {
        super.onDestroy();
        MainActivity.m3731i();
        Runtime.getRuntime().gc();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }
}
