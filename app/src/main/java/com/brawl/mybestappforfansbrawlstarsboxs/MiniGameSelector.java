package com.brawl.mybestappforfansbrawlstarsboxs;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("ALL")
public class MiniGameSelector extends AppCompatActivity {

    /* renamed from: A */
    ArrayList<Integer> f4256A;

    /* renamed from: B */
    int f4257B;

    /* renamed from: C */
    Random f4258C;

    /* renamed from: j */
    ImageView f4259j;

    /* renamed from: k */
    ImageView f4260k;

    /* renamed from: l */
    ImageButton f4261l;

    /* renamed from: m */
    ImageButton f4262m;

    /* renamed from: n */
    TextView f4263n;

    /* renamed from: o */
    TextView f4264o;

    /* renamed from: p */
    Animation f4265p;

    /* renamed from: q */
    RelativeLayout f4266q;

    /* renamed from: r */
    RelativeLayout f4267r;

    /* renamed from: s */
    ImageView f4268s;

    /* renamed from: t */
    TextView f4269t;

    /* renamed from: u */
    Animation f4270u;

    /* renamed from: v */
    CountDownTimer f4271v;

    /* renamed from: w */
    TextView f4272w;

    /* renamed from: x */
    TextView f4273x;

    /* renamed from: y */
    int f4274y = 1080;

    /* renamed from: z */
    ScaleAnimation f4275z;
    private InterstitialAd f4179aP;
    private AbstractAdViewAdapter f4180aQ;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
        if (com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.m3726c("sounds") == 0) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0106, code lost:
        if (com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.m3726c("sounds") == 0) goto L_0x0108;
     */
    /* renamed from: a */
    public final void mo3625a(String str, ImageView imageView) {
        int parseInt = Integer.parseInt(this.f4263n.getText().toString());
        if (str.equals("g")) {
            if (parseInt - 10 >= 0) {
                C1146j.f4604d = 3;
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(getApplicationContext(), (int) R.raw.menu_click).start();
                }
                int i = parseInt - 10;
                this.f4263n.setText(String.valueOf(i));
                MainActivity.m3720a(i, "ticket");
                startActivity(new Intent(this, Game.class));
            } else {
                if (MainActivity.m3726c("language") == 0) {
                    Toast.makeText(this, "YOU DON’T HAVE 10 TICKETS", 1).show();
                }
                if (MainActivity.m3726c("language") == 1) {
                    Toast.makeText(this, "У ТЕБЕ НЕМАЄ 10 КВИТКІВ", 1).show();
                }
                if (MainActivity.m3726c("language") == 2) {
                    Toast.makeText(this, "У ТЕБЯ НЕТ 10 БИЛЕТОВ", 1).show();
                }
            }
            imageView.startAnimation(this.f4265p);
        }
        if (parseInt - 20 >= 0) {
            this.f4268s.startAnimation(this.f4275z);
            this.f4266q.setVisibility(0);
            this.f4267r.startAnimation(this.f4270u);
            if (MainActivity.m3726c("sounds") == 0) {
                MediaPlayer.create(getApplicationContext(), (int) R.raw.menu_click).start();
            }
            int i2 = parseInt - 20;
            this.f4263n.setText(String.valueOf(i2));
            MainActivity.m3720a(i2, "ticket");
        } else {
            if (MainActivity.m3726c("language") == 0) {
                Toast.makeText(this, "YOU DON’T HAVE 20 TICKETS", 1).show();
            }
            if (MainActivity.m3726c("language") == 1) {
                Toast.makeText(this, "У ТЕБЕ НЕМАЄ 20 КВИТКІВ", 1).show();
            }
            if (MainActivity.m3726c("language") == 2) {
                Toast.makeText(this, "У ТЕБЯ НЕТ 20 БИЛЕТОВ", 1).show();
            }
        }
        imageView.startAnimation(this.f4265p);
        MediaPlayer.create(getApplicationContext(), (int) R.raw.error).start();
        imageView.startAnimation(this.f4265p);
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mini_game_selector);
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);

        MobileAds.initialize(this, getResources().getString(R.string.admob_app_id));
        this.f4179aP = new InterstitialAd(this);
        this.f4179aP.setAdUnitId(getResources().getString(R.string.admob_interstitial_ad_unit_id));

        f4179aP.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                f4179aP.show();
            }
        });

        f4179aP.loadAd(new AdRequest.Builder().build());

        this.f4265p = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        this.f4261l = (ImageButton) findViewById(R.id.back);
        this.f4264o = (TextView) findViewById(R.id.title);
        this.f4269t = (TextView) findViewById(R.id.button);
        this.f4272w = (TextView) findViewById(R.id.drum_text);
        this.f4273x = (TextView) findViewById(R.id.guess_text);
        if (MainActivity.m3726c("language") == 0) {
            this.f4264o.setText("Mini Games");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f4264o.setText("Міні Ігри");
            this.f4272w.setText("Щасливий скін");
            this.f4273x.setText("Вгадай бійця");
            this.f4269t.setText("Забрати");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4264o.setText("Мини-Игры");
            this.f4272w.setText("счастливый скин");
            this.f4273x.setText("угадай бойца");
            this.f4269t.setText("Забрать");
        }
        this.f4262m = (ImageButton) findViewById(R.id.home);
        this.f4263n = (TextView) findViewById(R.id.ticket);
        MainActivity.m3729d(this.f4263n, "ticket");
        this.f4259j = (ImageView) findViewById(R.id.guess);
        this.f4260k = (ImageView) findViewById(R.id.drum);
        this.f4261l.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10591 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MiniGameSelector.this, (int) R.raw.menu_cancel).start();
                }
                MiniGameSelector.this.finish();
            }
        });
        this.f4262m.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10602 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MiniGameSelector.this, (int) R.raw.menu_cancel).start();
                }
                MiniGameSelector.this.finish();
            }
        });
        this.f4259j.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10613 */

            public final void onClick(View view) {
                MiniGameSelector miniGameSelector = MiniGameSelector.this;
                miniGameSelector.mo3625a("g", miniGameSelector.f4259j);
            }
        });
        this.f4260k.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10624 */

            public final void onClick(View view) {
                MiniGameSelector miniGameSelector = MiniGameSelector.this;
                miniGameSelector.mo3625a("d", miniGameSelector.f4260k);
            }
        });
        this.f4269t.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10635 */

            public final void onClick(View view) {
                MiniGameSelector.this.f4269t.setVisibility(4);
                MiniGameSelector.this.f4266q.setVisibility(4);
                MiniGameSelector.this.f4268s.setVisibility(4);
            }
        });
        this.f4270u = new ScaleAnimation(0.0f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f4270u.setFillAfter(true);
        this.f4270u.setDuration(500);
        this.f4275z = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f4275z.setDuration(400);
        this.f4275z.setStartOffset(500);
        this.f4275z.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10646 */

            public final void onAnimationEnd(Animation animation) {
                //ToDo: CountDownTimer is 100
                new CountDownTimer(100, 100) {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10646.C10651 */

                    public final void onFinish() {
                        MiniGameSelector.this.f4271v = new CountDownTimer(100, 100) {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.MiniGameSelector.C10646.C10651.C10661 */

                            public final void onFinish() {
                                MediaPlayer.create(MiniGameSelector.this.getApplicationContext(), (int) R.raw.gems).start();
                                MainActivity.m3720a(1, "skin" + MiniGameSelector.this.f4256A.get(MiniGameSelector.this.f4257B));
                                MiniGameSelector.this.f4269t.setVisibility(0);
                                MiniGameSelector.this.f4268s.animate().withLayer().rotationY((float) MiniGameSelector.this.f4274y).setDuration(1000);
                                MiniGameSelector.this.f4274y += 1080;
                            }

                            public final void onTick(long j) {
                                try {
                                    MiniGameSelector.this.f4258C = new Random();
                                    MiniGameSelector.this.f4257B = MiniGameSelector.this.f4258C.nextInt(MiniGameSelector.this.f4256A.size() - 1) + 0;
                                } catch (Exception unused) {
                                    MiniGameSelector.this.f4258C = new Random();
                                    MiniGameSelector.this.f4257B = MiniGameSelector.this.f4258C.nextInt(MiniGameSelector.this.f4256A.size() - 1) + 0;
                                }
                                MiniGameSelector.this.f4268s.setImageResource(MiniGameSelector.this.f4256A.get(MiniGameSelector.this.f4257B).intValue());
                            }
                        }.start();
                    }

                    public final void onTick(long j) {
                    }
                }.start();
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                MiniGameSelector.this.f4268s.setVisibility(0);
            }
        });
        this.f4266q = (RelativeLayout) findViewById(R.id.shaddow);
        this.f4267r = (RelativeLayout) findViewById(R.id.skin_lay);
        this.f4268s = (ImageView) findViewById(R.id.skin);
        this.f4256A = new ArrayList<>();
        this.f4256A.add(Integer.valueOf((int) R.drawable.shelly_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.nita_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.colt_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.bull_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.jessie_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.brock_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.dinamike_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.emz_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.bo_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.bit_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.elprimo_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.barley_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.poco_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.ricko_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.darryl_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.penny_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.carl_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.bibi_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.bea_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.frank_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.piper_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.pam_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.max_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.mortis_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.mr_p_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.tara_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.spike_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.crow_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.leon_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.sandy_skin));
        this.f4256A.add(Integer.valueOf((int) R.drawable.gale_skin));
    }
}
