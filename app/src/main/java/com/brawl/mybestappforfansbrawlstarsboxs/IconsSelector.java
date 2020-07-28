package com.brawl.mybestappforfansbrawlstarsboxs;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

@SuppressWarnings("ALL")
public class IconsSelector extends AppCompatActivity {

    /* renamed from: j */
    RecyclerView f4030j;

    /* renamed from: k */
    TextView f4031k;

    /* renamed from: l */
    TextView f4032l;

    /* renamed from: m */
    ImageButton f4033m;

    /* renamed from: n */
    ArrayList<Integer> f4034n;

    /* renamed from: o */
    CardView f4035o;

    /* renamed from: p */
    CardView f4036p;

    /* renamed from: q */
    CardView f4037q;

    /* renamed from: r */
    CardView f4038r;

    /* renamed from: s */
    CardView f4039s;

    /* renamed from: t */
    RelativeLayout f4040t;

    /* access modifiers changed from: package-private */
    //@Override // androidx.p038f.p039a.C0666e
    /* renamed from: a */
    public final void mo3517a(int i) {
        try {
            MainActivity.f4124E.setBackground(getResources().getDrawable(i));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_icons_selector);
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f4033m = (ImageButton) findViewById(R.id.back);
        this.f4034n = new ArrayList<>();
        this.f4032l = (TextView) findViewById(R.id.select);
        this.f4031k = (TextView) findViewById(R.id.background);
        if (MainActivity.m3726c("language") == 1) {
            this.f4032l.setText("ВИБЕРИ ІКОНКУ ");
            this.f4031k.setText("ОБЕРИ ФОН ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4032l.setText("ВЫБЕРИ ІКОНКУ ");
            this.f4031k.setText("ВЫБЕРИ ФОН ");
        }
        this.f4040t = (RelativeLayout) findViewById(R.id.backs);
        if (MainActivity.m3726c("fone") != 0) {
            this.f4040t.setBackground(getResources().getDrawable(MainActivity.m3726c("fone")));
        }
        this.f4035o = (CardView) findViewById(R.id.blue);
        this.f4036p = (CardView) findViewById(R.id.purple);
        this.f4037q = (CardView) findViewById(R.id.red);
        this.f4038r = (CardView) findViewById(R.id.green);
        this.f4039s = (CardView) findViewById(R.id.orange);
        this.f4039s.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.IconsSelector.C09821 */

            public final void onClick(View view) {
                MainActivity.m3720a((int) R.drawable.orange, "fone");
                IconsSelector.this.f4040t.setBackground(IconsSelector.this.getResources().getDrawable(R.drawable.orange));
                IconsSelector.this.f4035o.setBackgroundColor(-16777216);
                IconsSelector.this.f4036p.setBackgroundColor(-16777216);
                IconsSelector.this.f4037q.setBackgroundColor(-16777216);
                IconsSelector.this.f4038r.setBackgroundColor(-16777216);
                IconsSelector.this.f4039s.setBackgroundColor(-1);
                IconsSelector.this.mo3517a(R.drawable.orange);
            }
        });
        this.f4035o.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.IconsSelector.C09832 */

            public final void onClick(View view) {
                MainActivity.m3720a((int) R.drawable.back_chest, "fone");
                IconsSelector.this.f4040t.setBackground(IconsSelector.this.getResources().getDrawable(R.drawable.brawlers));
                IconsSelector.this.f4035o.setBackgroundColor(-1);
                IconsSelector.this.f4036p.setBackgroundColor(-16777216);
                IconsSelector.this.f4037q.setBackgroundColor(-16777216);
                IconsSelector.this.f4038r.setBackgroundColor(-16777216);
                IconsSelector.this.f4039s.setBackgroundColor(-16777216);
                IconsSelector.this.mo3517a(R.drawable.brawlers);
            }
        });
        this.f4036p.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.IconsSelector.C09843 */

            public final void onClick(View view) {
                MainActivity.m3720a((int) R.drawable.purple, "fone");
                IconsSelector.this.f4040t.setBackground(IconsSelector.this.getResources().getDrawable(R.drawable.purple));
                IconsSelector.this.f4035o.setBackgroundColor(-16777216);
                IconsSelector.this.f4039s.setBackgroundColor(-16777216);
                IconsSelector.this.f4036p.setBackgroundColor(-1);
                IconsSelector.this.f4037q.setBackgroundColor(-16777216);
                IconsSelector.this.f4038r.setBackgroundColor(-16777216);
                IconsSelector.this.mo3517a(R.drawable.purple);
            }
        });
        this.f4037q.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.IconsSelector.C09854 */

            public final void onClick(View view) {
                MainActivity.m3720a((int) R.drawable.red, "fone");
                IconsSelector.this.f4040t.setBackground(IconsSelector.this.getResources().getDrawable(R.drawable.red));
                IconsSelector.this.f4035o.setBackgroundColor(-16777216);
                IconsSelector.this.f4036p.setBackgroundColor(-16777216);
                IconsSelector.this.f4037q.setBackgroundColor(-1);
                IconsSelector.this.f4039s.setBackgroundColor(-16777216);
                IconsSelector.this.f4038r.setBackgroundColor(-16777216);
                IconsSelector.this.mo3517a(R.drawable.red);
            }
        });
        this.f4038r.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.IconsSelector.C09865 */

            public final void onClick(View view) {
                MainActivity.m3720a((int) R.drawable.green, "fone");
                IconsSelector.this.f4040t.setBackground(IconsSelector.this.getResources().getDrawable(R.drawable.green));
                IconsSelector.this.f4035o.setBackgroundColor(-16777216);
                IconsSelector.this.f4039s.setBackgroundColor(-16777216);
                IconsSelector.this.f4036p.setBackgroundColor(-16777216);
                IconsSelector.this.f4037q.setBackgroundColor(-16777216);
                IconsSelector.this.f4038r.setBackgroundColor(-1);
                IconsSelector.this.mo3517a(R.drawable.green);
            }
        });
        this.f4033m.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.IconsSelector.C09876 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(IconsSelector.this, (int) R.raw.menu_cancel).start();
                }
                IconsSelector.this.finish();
            }
        });
        this.f4030j = (RecyclerView) findViewById(R.id.recycler);
        this.f4034n.add(Integer.valueOf((int) R.drawable.shelly_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.nita_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.colt_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.bull_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.jessie_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.brock_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.dinamike_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.emz_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.bo_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.bit_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.tick_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.el_orimo_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.barley_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.poco_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.rosa_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.rico_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.daryl_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.panny_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.carl_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.jacky_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.bibi_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.bea_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.frank_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.pipre_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.pam_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.nani_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.max_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.mortis_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.mr_p_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.sprout_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.tara_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.gene_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.spike_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.crow_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.leon_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.sandy_i));
        this.f4034n.add(Integer.valueOf((int) R.drawable.gale_i));
        this.f4030j.setLayoutManager(new GridLayoutManager(getApplicationContext(),6));
        this.f4030j.setAdapter(new C1137h(this.f4034n, this));
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
