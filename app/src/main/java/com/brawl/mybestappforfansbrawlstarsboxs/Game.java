package com.brawl.mybestappforfansbrawlstarsboxs;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

@SuppressWarnings("ALL")
public class Game extends AppCompatActivity {

    /* renamed from: j */
    static RecyclerView f4020j;

    /* renamed from: k */
    static RecyclerView f4021k;

    /* renamed from: l */
    static ArrayList<Integer> f4022l;

    /* renamed from: m */
    static ArrayList<Integer> f4023m;

    /* renamed from: o */
    static ArrayList<C1153m> f4024o;

    /* renamed from: p */
    static RelativeLayout f4025p;

    /* renamed from: q */
    static RelativeLayout f4026q;

    /* renamed from: n */
    C1146j f4027n;

    /* renamed from: r */
    TextView f4028r;

    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: e */
    private static void m3714e() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        f4023m = arrayList;
        arrayList.add(Integer.valueOf((int) R.drawable.shelly_i));
        f4023m.add(Integer.valueOf((int) R.drawable.nita_i));
        f4023m.add(Integer.valueOf((int) R.drawable.colt_i));
        f4023m.add(Integer.valueOf((int) R.drawable.bull_i));
        f4023m.add(Integer.valueOf((int) R.drawable.jessie_i));
        f4023m.add(Integer.valueOf((int) R.drawable.brock_i));
        f4023m.add(Integer.valueOf((int) R.drawable.dinamike_i));
        f4023m.add(Integer.valueOf((int) R.drawable.emz_i));
        f4023m.add(Integer.valueOf((int) R.drawable.bo_i));
        f4023m.add(Integer.valueOf((int) R.drawable.bit_i));
        f4023m.add(Integer.valueOf((int) R.drawable.tick_i));
        f4023m.add(Integer.valueOf((int) R.drawable.el_orimo_i));
        f4023m.add(Integer.valueOf((int) R.drawable.barley_i));
        f4023m.add(Integer.valueOf((int) R.drawable.poco_i));
        f4023m.add(Integer.valueOf((int) R.drawable.rosa_i));
        f4023m.add(Integer.valueOf((int) R.drawable.rico_i));
        f4023m.add(Integer.valueOf((int) R.drawable.daryl_i));
        f4023m.add(Integer.valueOf((int) R.drawable.panny_i));
        f4023m.add(Integer.valueOf((int) R.drawable.carl_i));
        f4023m.add(Integer.valueOf((int) R.drawable.jacky_i));
        f4023m.add(Integer.valueOf((int) R.drawable.bibi_i));
        f4023m.add(Integer.valueOf((int) R.drawable.bea_i));
        f4023m.add(Integer.valueOf((int) R.drawable.frank_i));
        f4023m.add(Integer.valueOf((int) R.drawable.pipre_i));
        f4023m.add(Integer.valueOf((int) R.drawable.pam_i));
        f4023m.add(Integer.valueOf((int) R.drawable.nani_i));
        f4023m.add(Integer.valueOf((int) R.drawable.max_i));
        f4023m.add(Integer.valueOf((int) R.drawable.mortis_i));
        f4023m.add(Integer.valueOf((int) R.drawable.mr_p_i));
        f4023m.add(Integer.valueOf((int) R.drawable.sprout_i));
        f4023m.add(Integer.valueOf((int) R.drawable.tara_i));
        f4023m.add(Integer.valueOf((int) R.drawable.gene_i));
        f4023m.add(Integer.valueOf((int) R.drawable.spike_i));
        f4023m.add(Integer.valueOf((int) R.drawable.crow_i));
        f4023m.add(Integer.valueOf((int) R.drawable.leon_i));
        f4023m.add(Integer.valueOf((int) R.drawable.sandy_i));
        f4023m.add(Integer.valueOf((int) R.drawable.gale_i));
        for (int i = 0; i < f4023m.size(); i++) {
            if (!(MainActivity.m3726c(String.valueOf(i)) == 0 || MainActivity.m3726c("l".concat(String.valueOf(i))) == 0)) {
                f4022l.add(f4023m.get(i));
            }
        }
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_game);
        f4024o = new ArrayList<>();
        f4021k = (RecyclerView) findViewById(R.id.you_got_rec);
        f4026q = (RelativeLayout) findViewById(R.id.need_lay);
        f4025p = (RelativeLayout) findViewById(R.id.top_rel);
        this.f4028r = (TextView) findViewById(R.id.ok);
        this.f4028r.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Game.C09811 */

            public final void onClick(View view) {
                Game.this.finish();
            }
        });
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        f4020j = (RecyclerView) findViewById(R.id.recycler);
        f4022l = new ArrayList<>();
        this.f4027n = new C1146j(this);
        f4020j.setLayoutManager(new GridLayoutManager(getApplicationContext(), 5));
        f4020j.setAdapter(this.f4027n);
        m3714e();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            MainActivity.m3727c(this);
        } catch (Exception unused) {
        }
    }
}
