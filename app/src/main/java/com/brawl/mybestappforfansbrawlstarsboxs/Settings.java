package com.brawl.mybestappforfansbrawlstarsboxs;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("ALL")
public class Settings extends AppCompatActivity {

    /* renamed from: j */
    ImageView f4296j;

    /* renamed from: k */
    boolean f4297k = true;

    /* renamed from: l */
    boolean f4298l;

    /* renamed from: m */
    ImageButton f4299m;

    /* renamed from: n */
    ImageButton f4300n;

    /* renamed from: o */
    ImageView f4301o;

    /* renamed from: p */
    Animation f4302p;

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        getWindow().setFlags(1024, 1024);
        this.f4302p = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        MainActivity.m3727c(this);
        this.f4299m = (ImageButton) findViewById(R.id.back);
        this.f4300n = (ImageButton) findViewById(R.id.home);
        this.f4301o = (ImageView) findViewById(R.id.info);
        this.f4301o.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Settings.C10691 */

            public final void onClick(View view) {
                Settings.this.f4301o.startAnimation(Settings.this.f4302p);
            }
        });
        this.f4299m.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Settings.C10702 */

            public final void onClick(View view) {
                Settings.this.finish();
            }
        });
        this.f4300n.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Settings.C10713 */

            public final void onClick(View view) {
                Settings.this.finish();
            }
        });
        this.f4298l = true;
        this.f4297k = true;
        this.f4296j.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Settings.C10724 */

            public final void onClick(View view) {
                Settings settings = Settings.this;
                settings.f4298l = true;
                settings.f4296j.startAnimation(Settings.this.f4302p);
                if (Settings.this.f4298l && Settings.this.f4297k) {
                    Settings settings2 = Settings.this;
                    settings2.f4297k = false;
                    settings2.f4298l = false;
                }
                if (Settings.this.f4298l && !Settings.this.f4297k) {
                    Settings settings3 = Settings.this;
                    settings3.f4297k = true;
                    settings3.f4298l = false;
                }
            }
        });
    }
}
