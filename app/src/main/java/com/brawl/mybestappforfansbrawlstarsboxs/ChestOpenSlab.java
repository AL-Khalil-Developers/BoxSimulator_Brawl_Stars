package com.brawl.mybestappforfansbrawlstarsboxs;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("ALL")
public class ChestOpenSlab extends AppCompatActivity {

    /* renamed from: ab */
    static Animation f3956ab;

    /* renamed from: u */
    static int f3957u;

    /* renamed from: A */
    RecyclerView f3958A;

    /* renamed from: B */
    RelativeLayout f3959B;

    /* renamed from: C */
    RelativeLayout f3960C;

    /* renamed from: D */
    AnimationDrawable f3961D;

    /* renamed from: E */
    ArrayList f3962E;

    /* renamed from: F */
    TextView f3963F;

    /* renamed from: G */
    Animation f3964G;

    /* renamed from: H */
    ImageView f3965H;

    /* renamed from: I */
    int f3966I;

    /* renamed from: J */
    TextView f3967J;

    /* renamed from: K */
    TextView f3968K;

    /* renamed from: L */
    ImageView f3969L;

    /* renamed from: M */
    ArrayList<Integer> f3970M;

    /* renamed from: N */
    ArrayList<Integer> f3971N;

    /* renamed from: O */
    ArrayList<String> f3972O;

    /* renamed from: P */
    RelativeLayout f3973P;

    /* renamed from: Q */
    ImageView f3974Q;

    /* renamed from: R */
    String f3975R;

    /* renamed from: S */
    Random f3976S;

    /* renamed from: T */
    TextView f3977T;

    /* renamed from: U */
    int f3978U = 1080;

    /* renamed from: V */
    int f3979V;

    /* renamed from: W */
    int f3980W;

    /* renamed from: X */
    int f3981X = 0;

    /* renamed from: Y */
    boolean f3982Y = true;

    /* renamed from: Z */
    boolean f3983Z = false;

    /* renamed from: aa */
    ImageView f3984aa;

    /* renamed from: ac */
    int f3985ac;

    /* renamed from: ad */
    boolean f3986ad = false;

    /* renamed from: ae */
    TextView f3987ae;

    /* renamed from: af */
    ArrayList<C1135f> f3988af;

    /* renamed from: ag */
    ArrayList<Integer> f3989ag;

    /* renamed from: ah */
    boolean f3990ah = true;

    /* renamed from: ai */
    boolean f3991ai = false;

    /* renamed from: aj */
    boolean f3992aj = false;

    /* renamed from: ak */
    ImageView f3993ak;

    /* renamed from: al */
    TextView f3994al;

    /* renamed from: am */
    MediaPlayer f3995am;

    /* renamed from: an */
    int f3996an;

    /* renamed from: j */
    CardView f3997j;

    /* renamed from: k */
    TextView f3998k;

    /* renamed from: l */
    TextView f3999l;

    /* renamed from: m */
    TextView f4000m;

    /* renamed from: n */
    Animation f4001n;

    /* renamed from: o */
    TextView f4002o;

    /* renamed from: p */
    ImageView f4003p;

    /* renamed from: q */
    Animation f4004q;

    /* renamed from: r */
    RelativeLayout f4005r;

    /* renamed from: s */
    int f4006s;

    /* renamed from: t */
    int f4007t;

    /* renamed from: v */
    ImageView f4008v;

    /* renamed from: w */
    boolean f4009w;

    /* renamed from: x */
    int f4010x = 0;

    /* renamed from: y */
    ArrayList<C1135f> f4011y;

    /* renamed from: z */
    String f4012z;

    /* renamed from: a */
    private void m3710a(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<C1135f> arrayList2 = new ArrayList<>();
        for (int i = 0; i < this.f3970M.size(); i++) {
            C1135f fVar = new C1135f(this.f3970M.get(i).intValue(), MainActivity.m3726c(String.valueOf(i)));
            if (this.f3972O.get(i).equals(str)) {
                arrayList2.add(fVar);
                arrayList.add(Integer.valueOf(i));
            }
        }
        m3711a(arrayList2, arrayList);
    }

    /* renamed from: a */
    private void m3711a(ArrayList<C1135f> arrayList, final ArrayList<Integer> arrayList2) {
        if (MainActivity.f4135Z.equals("free")) {
            this.f3979V = 9;
            this.f3981X = 7;
        }
        if (MainActivity.f4135Z.equals("normal")) {
            this.f3979V = 26;
            this.f3981X = 15;
        }
        if (MainActivity.f4135Z.equals("big")) {
            this.f3979V = 50;
            this.f3981X = 30;
        }
        if (MainActivity.f4135Z.equals("video")) {
            this.f3979V = 80;
            this.f3981X = 40;
        }
        if (MainActivity.f4135Z.equals("star")) {
            this.f3979V = 120;
            this.f3981X = 50;
        }
        try {
            this.f3985ac = this.f3976S.nextInt(arrayList2.size());
        } catch (Exception unused) {
            if (this.f3983Z) {
                finish();
            }
            this.f3986ad = true;
            TextView textView = this.f3998k;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3966I);
            textView.setText(sb.toString());
            mo3391f();
            this.f3998k.setVisibility(0);
            this.f3960C.setVisibility(4);
            this.f3959B.setVisibility(4);
            this.f3965H.setVisibility(4);
            this.f3967J.setVisibility(4);
            this.f3997j.setVisibility(4);
            this.f3969L.setVisibility(4);
            if (MainActivity.m3726c("language") == 0) {
                this.f3977T.setText("YOU GOT");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3977T.setText("Ти Отримав ");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3977T.setText("Ты Получил ");
            }
            this.f4003p.clearAnimation();
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < this.f4011y.size(); i2++) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300);
                scaleAnimation.setStartOffset((long) i);
                i += 150;
                arrayList3.add(scaleAnimation);
            }
            C1151l lVar = new C1151l(this.f4011y, this, arrayList3);
            this.f3984aa.setBackground(getResources().getDrawable(R.drawable.end_spin));
            this.f3973P.setBackground(getResources().getDrawable(R.drawable.end_back));
            this.f3974Q.setBackground(getResources().getDrawable(R.drawable.back_chest));
            this.f3974Q.setAlpha(0.5f);
            this.f4009w = true;
            if (!this.f3983Z) {
                this.f3958A.setAdapter(lVar);
                this.f3958A.setVisibility(0);
                this.f3983Z = true;
            }
        }
        if (!this.f3986ad) {
            int nextInt = this.f3976S.nextInt(this.f3979V) + 1;
            this.f3980W += nextInt;
            try {
                this.f3965H.setBackground(getResources().getDrawable(arrayList.get(this.f3985ac).f4562a));
            } catch (Exception unused2) {
                this.f3965H.setBackground(getResources().getDrawable(arrayList.get(this.f3985ac).f4562a));
            }
            this.f3987ae.setText(this.f3962E.get(arrayList2.get(this.f3985ac).intValue()).toString());
            this.f3967J.setText(String.valueOf(nextInt));
            arrayList.get(this.f3985ac).f4563b += nextInt;
            this.f3967J.setBackground(getResources().getDrawable(R.drawable.plus_stars));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(arrayList2.get(this.f3985ac));
            int c = MainActivity.m3726c(sb2.toString());
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500);
            this.f3969L.setBackground(null);
            this.f3961D.start();
            this.f3968K.startAnimation(this.f4001n);
            this.f4001n.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpenSlab.C09751 */

                public final void onAnimationEnd(Animation animation) {
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    ChestOpenSlab.this.f3968K.setVisibility(0);
                }
            });
            TextView textView2 = this.f3968K;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(arrayList2.get(this.f3985ac));
            sb3.append(MainActivity.m3726c(sb4.toString()));
            textView2.setText(sb3.toString());
            this.f3997j.setVisibility(4);
            if (c == 0) {
                this.f3968K.clearAnimation();
                this.f3968K.setVisibility(4);
                MainActivity.m3720a(1, "l" + arrayList2.get(this.f3985ac));
                this.f3977T.setVisibility(4);
                this.f3968K.setVisibility(4);
                this.f3974Q.setEnabled(false);
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.new_brawler_anim);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.particles_new_brawler);
                loadAnimation2.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpenSlab.C09762 */

                    public final void onAnimationEnd(Animation animation) {
                        ChestOpenSlab.this.f3974Q.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.scelets));
                        if (ChestOpenSlab.this.f3972O.get(((Integer) arrayList2.get(ChestOpenSlab.this.f3985ac)).intValue()).equals("f")) {
                            ChestOpenSlab.this.f4005r.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.free_fone));
                        }
                        if (ChestOpenSlab.this.f3972O.get(((Integer) arrayList2.get(ChestOpenSlab.this.f3985ac)).intValue()).equals("r")) {
                            ChestOpenSlab.this.f4005r.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.rare));
                        }
                        if (ChestOpenSlab.this.f3972O.get(((Integer) arrayList2.get(ChestOpenSlab.this.f3985ac)).intValue()).equals("s")) {
                            ChestOpenSlab.this.f4005r.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.superrare));
                        }
                        if (ChestOpenSlab.this.f3972O.get(((Integer) arrayList2.get(ChestOpenSlab.this.f3985ac)).intValue()).equals("e")) {
                            ChestOpenSlab.this.f4005r.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.epik));
                        }
                        if (ChestOpenSlab.this.f3972O.get(((Integer) arrayList2.get(ChestOpenSlab.this.f3985ac)).intValue()).equals("m")) {
                            ChestOpenSlab.this.f4005r.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.mifik));
                        }
                        if (ChestOpenSlab.this.f3972O.get(((Integer) arrayList2.get(ChestOpenSlab.this.f3985ac)).intValue()).equals("l")) {
                            ChestOpenSlab.this.f4005r.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.legendary));
                        }
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }
                });
                this.f4005r.setBackground(getResources().getDrawable(R.drawable.particles));
                this.f4005r.startAnimation(loadAnimation2);
                this.f3969L.startAnimation(loadAnimation);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpenSlab.C09773 */

                    public final void onAnimationEnd(Animation animation) {
                        ChestOpenSlab.this.f3974Q.setEnabled(true);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }
                });
                this.f3997j.setVisibility(4);
                this.f3969L.setBackground(getResources().getDrawable(this.f3971N.get(arrayList2.get(this.f3985ac).intValue()).intValue()));
                this.f3969L.animate().withLayer().rotationY((float) this.f3978U).setDuration(1500);
                TranslateAnimation translateAnimation = new TranslateAnimation(1000.0f, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(300);
                translateAnimation.setStartOffset(600);
                this.f3997j.setVisibility(0);
                this.f3997j.startAnimation(translateAnimation);
                this.f3978U += 1080;
                this.f3963F.setText(this.f3962E.get(arrayList2.get(this.f3985ac).intValue()).toString());
                MainActivity.m3722a(this.f3962E.get(arrayList2.get(this.f3985ac).intValue()).toString(), "skin_name");
                MainActivity.f4140aK.setVisibility(0);
                MainActivity.f4130S.setBackground(getResources().getDrawable(R.drawable.shop_new_item));
            }
            if (this.f4011y.contains(arrayList.get(this.f3985ac))) {
                this.f4011y.get(this.f3985ac).f4563b += arrayList.get(this.f3985ac).f4563b;
            } else {
                arrayList.get(this.f3985ac).f4563b = nextInt;
                this.f4011y.add(arrayList.get(this.f3985ac));
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(arrayList2.get(this.f3985ac));
            MainActivity.m3720a(c + nextInt, sb5.toString());
            this.f3988af.remove(arrayList.get(this.f3985ac));
            this.f3989ag.remove(arrayList2.get(this.f3985ac));
            alphaAnimation.setDuration(500);
        }
    }

    /* access modifiers changed from: package-private */
    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: e */
    public final void mo3390e() {
        if (this.f3990ah) {
            this.f3988af = new ArrayList<>();
            this.f3989ag = new ArrayList<>();
            if (!getPackageName().equals(this.f3975R)) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(67108864);
                startActivity(intent);
            }
            for (int i = 0; i < this.f3970M.size(); i++) {
                C1135f fVar = new C1135f(this.f3970M.get(i).intValue(), MainActivity.m3726c(String.valueOf(i)));
                if (fVar.f4563b != 0) {
                    this.f3988af.add(fVar);
                    this.f3989ag.add(Integer.valueOf(i));
                }
            }
        }
        this.f3990ah = false;
        int nextInt = new Random().nextInt(1000);
        if (MainActivity.f4135Z.equals("free") || MainActivity.f4135Z.equals("normal")) {
            if (nextInt < 950) {
                m3711a(this.f3988af, this.f3989ag);
            } else if (nextInt < 960) {
                m3710a("f");
            } else if (nextInt < 970) {
                m3710a("r");
            } else if (nextInt < 980) {
                m3710a("s");
            } else if (nextInt < 990) {
                m3710a("e");
            } else if (nextInt <= 1000) {
                m3710a("m");
            }
        } else if (nextInt < 950) {
            m3711a(this.f3988af, this.f3989ag);
        } else if (nextInt < 960) {
            m3710a("f");
        } else if (nextInt < 970) {
            m3710a("r");
        } else if (nextInt < 980) {
            m3710a("s");
        } else if (nextInt < 990) {
            m3710a("e");
        } else if (nextInt < 995) {
            m3710a("l");
        } else if (nextInt <= 1000) {
            m3710a("m");
        }
    }

    /* access modifiers changed from: package-private */
    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: f */
    public final void mo3391f() {
        if (this.f4007t != 0) {
            this.f3999l.setVisibility(0);
            TextView textView = this.f3999l;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4007t);
            textView.setText(sb.toString());
        } else {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3999l.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            this.f3999l.setLayoutParams(layoutParams);
        }
        if (this.f4006s != 0) {
            this.f4000m.setVisibility(0);
            TextView textView2 = this.f4000m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f4006s);
            textView2.setText(sb2.toString());
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4000m.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
            this.f4000m.setLayoutParams(layoutParams2);
        }
        if (this.f4006s == 0 && this.f4007t == 0) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f3998k.getLayoutParams();
            layoutParams3.rightMargin = 0;
            layoutParams3.leftMargin = 0;
            this.f3998k.setLayoutParams(layoutParams3);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        this.f3998k.startAnimation(scaleAnimation);
        this.f3999l.startAnimation(scaleAnimation);
        this.f4000m.startAnimation(scaleAnimation);
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_chest_open_slab);
        ChestOpen.f3842aj = true;
        this.f4010x = 0;
        this.f3996an = 0;
        MainActivity.m3730h();
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f3995am = MediaPlayer.create(getApplicationContext(), (int) R.raw.menu_click);
        this.f3965H = (ImageView) findViewById(R.id.card);
        this.f3997j = (CardView) findViewById(R.id.info_card);
        this.f3987ae = (TextView) findViewById(R.id.name);
        this.f4011y = new ArrayList<>();
        this.f4012z = "money";
        this.f3994al = (TextView) findViewById(R.id.coins_count);
        this.f3992aj = false;
        this.f3983Z = false;
        this.f3986ad = false;
        this.f3973P = (RelativeLayout) findViewById(R.id.back);
        this.f3990ah = true;
        this.f3993ak = (ImageView) findViewById(R.id.bonuses);
        this.f4009w = false;
        this.f3991ai = false;
        this.f4001n = AnimationUtils.loadAnimation(this, R.anim.show_and_hide_for_some_time);
        this.f4002o = (TextView) findViewById(R.id.congrat);
        if (MainActivity.m3726c("language") == 1) {
            this.f4002o.setText("ТИ ВІДКРИВ НОВОГО БІЙЦЯ, МИ ВІТАЄМО ТЕБЕ!");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4002o.setText("ТЫ ОТКРЫЛ НОВОГО БОЙЦА, МЫ ПОЗДРАВЛЯЕМ ТЕБЯ!");
        }
        //ToDo: layout manager....
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), 0, false);
        this.f4005r = (RelativeLayout) findViewById(R.id.casing);
        this.f3958A = (RecyclerView) findViewById(R.id.recycler);
        this.f4008v = (ImageView) findViewById(R.id.box_icons);
        this.f3958A.setLayoutManager(linearLayoutManager);
        this.f4003p = (ImageView) findViewById(R.id.smoke);
        this.f4004q = AnimationUtils.loadAnimation(this, R.anim.smoke_anim);
        this.f3964G = AnimationUtils.loadAnimation(this, R.anim.rotate);
        f3956ab = AnimationUtils.loadAnimation(this, R.anim.rotate2);
        this.f3959B = (RelativeLayout) findViewById(R.id.rel_color);
        this.f3962E = new ArrayList();
        this.f3963F = (TextView) findViewById(R.id.name_of_brawler);
        if (MainActivity.m3726c("firstbrawler") == 0) {
            MainActivity.m3720a(1, "firstbrawler");
            MainActivity.m3720a(1, "0");
            MainActivity.m3720a(1, "l0");
        }
        this.f3960C = (RelativeLayout) findViewById(R.id.card_lay);
        this.f3967J = (TextView) findViewById(R.id.text_count);
        this.f3969L = (ImageView) findViewById(R.id.new_brawler);
        this.f3974Q = (ImageView) findViewById(R.id.click);
        this.f3984aa = (ImageView) findViewById(R.id.rotate);
        this.f3972O = new ArrayList<>();
        this.f3968K = (TextView) findViewById(R.id.have);
        this.f3961D = (AnimationDrawable) this.f3968K.getBackground();
        this.f3961D.setOneShot(true);
        this.f3977T = (TextView) findViewById(R.id.tap);
        if (MainActivity.m3726c("language") == 0) {
            this.f3977T.setText("Tap! Tap! ");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3977T.setText("Натискай! ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3977T.setText("Нажимай! ");
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(10000);
        rotateAnimation.setRepeatCount(-1);
        this.f3984aa.setAnimation(rotateAnimation);
        this.f3982Y = true;
        this.f3998k = (TextView) findViewById(R.id.money_give);
        this.f3999l = (TextView) findViewById(R.id.gems_give);
        this.f4000m = (TextView) findViewById(R.id.ticket_give);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, ((double) (memoryInfo.totalMem / 1048576)) < 2000.0d ? R.anim.small_box : R.anim.box_drop);
        AnimationUtils.loadAnimation(this, R.anim.fone);
        this.f4008v.setBackground(getResources().getDrawable(R.drawable.box_icons));
        this.f4008v.setScaleX(1.7f);
        this.f4008v.setScaleY(1.7f);
        this.f3974Q.setImageResource(f3957u);
        this.f3974Q.setAlpha(1.0f);
        this.f4005r.setBackground(getResources().getDrawable(R.drawable.box_fone));
        this.f3974Q.startAnimation(loadAnimation);
        this.f3974Q.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpenSlab.C09784 */

            @SuppressLint({"ResourceType"})
            public final void onClick(View view) {
                int i;
                int i2;
                Resources resources;
                ImageView imageView;
                ChestOpenSlab.this.f4008v.setScaleX(1.0f);
                ChestOpenSlab.this.f4008v.setScaleY(1.0f);
                ChestOpenSlab chestOpenSlab = ChestOpenSlab.this;
                chestOpenSlab.f4010x = 0;
                chestOpenSlab.f3997j.setVisibility(4);
                MainActivity.f4146j = true;
                ChestOpenSlab.this.f3993ak.setVisibility(4);
                ChestOpenSlab.this.f3993ak.setImageResource(17170445);
                ChestOpenSlab.this.f3974Q.setImageResource(17170445);
                ChestOpenSlab.this.f4008v.setBackground(null);
                ChestOpenSlab.this.f3974Q.setBackground(null);
                ChestOpenSlab.this.f3969L.setBackground(null);
                ChestOpenSlab.this.f3994al.setText("");
                if (ChestOpenSlab.this.f4009w) {
                    ChestOpenSlab.this.f3984aa.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.end_spin));
                }
                ChestOpenSlab.this.f4005r.setBackground(null);
                ChestOpenSlab.this.f4008v.setBackground(null);
                ChestOpenSlab.this.f3968K.setVisibility(4);
                Drawable drawable = ChestOpenSlab.this.f3974Q.getDrawable();
                if (MainActivity.m3726c("language") == 0) {
                    ChestOpenSlab.this.f3977T.setText("Tap! Tap! ");
                }
                if (MainActivity.m3726c("language") == 1) {
                    ChestOpenSlab.this.f3977T.setText("Натискай! ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    ChestOpenSlab.this.f3977T.setText("Нажимай! ");
                }
                if (ChestOpenSlab.this.f3991ai) {
                    ChestOpenSlab.this.f3959B.setBackgroundColor(-1);
                    if (ChestOpenSlab.this.f3982Y) {
                        if (ChestOpenSlab.this.f3976S.nextInt(10) > 6) {
                            int nextInt = ChestOpenSlab.this.f3976S.nextInt(7);
                            ChestOpenSlab.this.f3965H.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.gems_box));
                            ChestOpenSlab.this.f3967J.setText(String.valueOf(nextInt));
                            MainActivity.m3720a(MainActivity.m3726c("gems") + nextInt, "gems");
                        }
                        ChestOpenSlab.this.mo3390e();
                        ChestOpenSlab.this.f4003p.startAnimation(ChestOpenSlab.this.f4004q);
                        ChestOpenSlab.this.f4004q.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpenSlab.C09784.C09791 */

                            public final void onAnimationEnd(Animation animation) {
                                ChestOpenSlab.this.f4003p.setVisibility(4);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                                if (ChestOpenSlab.this.f3992aj) {
                                    ChestOpenSlab.this.f4003p.setVisibility(4);
                                }
                            }
                        });
                        ChestOpenSlab.this.f3982Y = false;
                    } else if (ChestOpenSlab.this.f3979V - ChestOpenSlab.this.f3980W > 0) {
                        ChestOpenSlab.this.f4003p.startAnimation(ChestOpenSlab.this.f4004q);
                        ChestOpenSlab.this.f4004q.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpenSlab.C09784.C09802 */

                            public final void onAnimationEnd(Animation animation) {
                                ChestOpenSlab.this.f4003p.setVisibility(4);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                                if (ChestOpenSlab.this.f3992aj) {
                                    ChestOpenSlab.this.f4003p.setVisibility(4);
                                }
                            }
                        });
                        ChestOpenSlab.this.mo3390e();
                    } else {
                        if (ChestOpenSlab.this.f3983Z) {
                            ChestOpenSlab.this.finish();
                        }
                        if (!ChestOpenSlab.this.f3983Z) {
                            if (ChestOpenSlab.this.f3996an == 0) {
                                i = ChestOpenSlab.this.f3976S.nextInt(3);
                                ChestOpenSlab.this.f3996an = 1;
                            } else {
                                i = 1;
                            }
                            if (i == 1 || i == 2) {
                                ChestOpenSlab chestOpenSlab2 = ChestOpenSlab.this;
                                chestOpenSlab2.f3992aj = true;
                                TextView textView = chestOpenSlab2.f3998k;
                                StringBuilder sb = new StringBuilder();
                                sb.append(ChestOpenSlab.this.f3966I);
                                textView.setText(sb.toString());
                                ChestOpenSlab.this.mo3391f();
                                ChestOpenSlab.this.f3998k.setVisibility(0);
                                ChestOpenSlab.this.f3960C.setVisibility(4);
                                ChestOpenSlab.this.f3959B.setVisibility(4);
                                ChestOpenSlab.this.f3965H.setVisibility(4);
                                ChestOpenSlab.this.f3967J.setVisibility(4);
                                ChestOpenSlab.this.f3997j.setVisibility(4);
                                ChestOpenSlab.this.f3969L.setVisibility(4);
                                if (MainActivity.m3726c("language") == 0) {
                                    ChestOpenSlab.this.f3977T.setText("YOU GOT");
                                }
                                if (MainActivity.m3726c("language") == 1) {
                                    ChestOpenSlab.this.f3977T.setText("Ти Отримав ");
                                }
                                if (MainActivity.m3726c("language") == 2) {
                                    ChestOpenSlab.this.f3977T.setText("Ты Получил ");
                                }
                                ChestOpenSlab.this.f4003p.clearAnimation();
                                ArrayList arrayList = new ArrayList();
                                int i3 = 0;
                                for (int i4 = 0; i4 < ChestOpenSlab.this.f4011y.size(); i4++) {
                                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                                    scaleAnimation.setDuration(300);
                                    scaleAnimation.setStartOffset((long) i3);
                                    i3 += 150;
                                    arrayList.add(scaleAnimation);
                                }
                                C1151l lVar = new C1151l(ChestOpenSlab.this.f4011y, ChestOpenSlab.this, arrayList);
                                ChestOpenSlab.this.f3984aa.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.end_spin));
                                ChestOpenSlab.this.f3973P.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.end_back));
                                ChestOpenSlab.this.f3974Q.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.back_chest));
                                ChestOpenSlab.this.f3974Q.setAlpha(0.5f);
                                ChestOpenSlab chestOpenSlab3 = ChestOpenSlab.this;
                                chestOpenSlab3.f4009w = true;
                                if (!chestOpenSlab3.f3983Z) {
                                    ChestOpenSlab.this.f3958A.setAdapter(lVar);
                                    ChestOpenSlab.this.f3958A.setVisibility(0);
                                    ChestOpenSlab.this.f3983Z = true;
                                }
                            }
                            if (i == 0) {
                                if (ChestOpenSlab.this.f3976S.nextInt(2) == 0) {
                                    int nextInt2 = ChestOpenSlab.this.f3976S.nextInt(7) + 1;
                                    ChestOpenSlab.this.f3994al.setText("X".concat(String.valueOf(nextInt2)));
                                    ChestOpenSlab.this.f4007t = nextInt2;
                                    MainActivity.m3720a(MainActivity.m3726c("gems") + nextInt2, "gems");
                                    if (MainActivity.m3726c("language") == 0) {
                                        ChestOpenSlab.this.f3977T.setText("GEMS");
                                    }
                                    if (MainActivity.m3726c("language") == 1) {
                                        ChestOpenSlab.this.f3977T.setText("КРИСТАЛИ");
                                    }
                                    if (MainActivity.m3726c("language") == 2) {
                                        ChestOpenSlab.this.f3977T.setText("КРИСТАЛЛЫ");
                                    }
                                    ChestOpenSlab.this.f3993ak.setVisibility(0);
                                    ChestOpenSlab.this.f3993ak.setImageResource(R.drawable.gems_box);
                                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.05f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                                    scaleAnimation2.setFillAfter(true);
                                    scaleAnimation2.setDuration(500);
                                    ChestOpenSlab.this.f3993ak.startAnimation(scaleAnimation2);
                                    ChestOpenSlab.this.f4008v.clearAnimation();
                                    imageView = ChestOpenSlab.this.f4008v;
                                    resources = ChestOpenSlab.this.getResources();
                                    i2 = R.drawable.gems_fone;
                                } else {
                                    int nextInt3 = ChestOpenSlab.this.f3976S.nextInt(3) + 1;
                                    ChestOpenSlab.this.f3994al.setText("X".concat(String.valueOf(nextInt3)));
                                    ChestOpenSlab.this.f4006s = nextInt3;
                                    MainActivity.m3720a(MainActivity.m3726c("ticket") + nextInt3, "ticket");
                                    if (MainActivity.m3726c("language") == 0) {
                                        ChestOpenSlab.this.f3977T.setText("TICKETS");
                                    }
                                    if (MainActivity.m3726c("language") == 1) {
                                        ChestOpenSlab.this.f3977T.setText("КВИТКИ");
                                    }
                                    if (MainActivity.m3726c("language") == 2) {
                                        ChestOpenSlab.this.f3977T.setText("БИЛЕТЫ");
                                    }
                                    ChestOpenSlab.this.f3993ak.setVisibility(0);
                                    ChestOpenSlab.this.f3993ak.setImageResource(R.drawable.ticket_box);
                                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.05f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                                    scaleAnimation3.setFillAfter(true);
                                    scaleAnimation3.setDuration(500);
                                    ChestOpenSlab.this.f3993ak.startAnimation(scaleAnimation3);
                                    ChestOpenSlab.this.f4008v.clearAnimation();
                                    imageView = ChestOpenSlab.this.f4008v;
                                    resources = ChestOpenSlab.this.getResources();
                                    i2 = R.drawable.tickets_fone;
                                }
                                imageView.setBackground(resources.getDrawable(i2));
                                ChestOpenSlab.this.f4008v.setAlpha(1.0f);
                            }
                        }
                    }
                }
                if (drawable != ChestOpenSlab.this.getResources().getDrawable(ChestOpenSlab.f3957u)) {
                    ChestOpenSlab.this.f3974Q.setImageResource(0);
                    ChestOpenSlab.this.f3960C.startAnimation(ChestOpenSlab.f3956ab);
                    ChestOpenSlab.this.f3995am.start();
                    ChestOpenSlab.this.f3991ai = true;
                }
                if (ChestOpenSlab.this.f4012z.equals("")) {
                    ChestOpenSlab.this.f3993ak.setVisibility(4);
                    ChestOpenSlab.this.f3993ak.setBackground(null);
                }
                if (ChestOpenSlab.this.f4012z.equals("money")) {
                    ChestOpenSlab chestOpenSlab4 = ChestOpenSlab.this;
                    chestOpenSlab4.f4012z = "";
                    chestOpenSlab4.f3974Q.clearAnimation();
                    int nextInt4 = ChestOpenSlab.this.f3976S.nextInt(40) + 1;
                    ChestOpenSlab.this.f3994al.setText("X".concat(String.valueOf(nextInt4)));
                    MainActivity.m3720a(MainActivity.m3726c("money") + nextInt4, "money");
                    if (MainActivity.m3726c("language") == 0) {
                        ChestOpenSlab.this.f3977T.setText("COINS");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        ChestOpenSlab.this.f3977T.setText("МОНЕТИ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        ChestOpenSlab.this.f3977T.setText("МОНЕТЫ");
                    }
                    ChestOpenSlab.this.f3993ak.setVisibility(0);
                    ChestOpenSlab.this.f3993ak.setImageResource(R.drawable.money_box);
                    ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.05f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation4.setFillAfter(true);
                    scaleAnimation4.setDuration(500);
                    ChestOpenSlab.this.f3993ak.startAnimation(scaleAnimation4);
                    ChestOpenSlab.this.f4008v.clearAnimation();
                    ChestOpenSlab.this.f4008v.setBackground(ChestOpenSlab.this.getResources().getDrawable(R.drawable.coins_fone));
                    ChestOpenSlab.this.f4008v.setAlpha(1.0f);
                }
            }
        });
        this.f3970M = new ArrayList<>();
        this.f3980W = 0;
        this.f3976S = new Random();
        this.f3970M.add(Integer.valueOf((int) R.drawable.shelly_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.nita_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.colt_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.bull_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.jessie_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.brock_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.dinamike_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.emz_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.bo_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.bit_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.tick_i));
        this.f3972O.add("f");
        this.f3970M.add(Integer.valueOf((int) R.drawable.el_orimo_i));
        this.f3972O.add("r");
        this.f3970M.add(Integer.valueOf((int) R.drawable.barley_i));
        this.f3972O.add("r");
        this.f3970M.add(Integer.valueOf((int) R.drawable.poco_i));
        this.f3972O.add("r");
        this.f3970M.add(Integer.valueOf((int) R.drawable.rosa_i));
        this.f3972O.add("r");
        this.f3970M.add(Integer.valueOf((int) R.drawable.rico_i));
        this.f3972O.add("s");
        this.f3970M.add(Integer.valueOf((int) R.drawable.daryl_i));
        this.f3972O.add("s");
        this.f3970M.add(Integer.valueOf((int) R.drawable.panny_i));
        this.f3972O.add("s");
        this.f3970M.add(Integer.valueOf((int) R.drawable.carl_i));
        this.f3972O.add("s");
        this.f3970M.add(Integer.valueOf((int) R.drawable.jacky_i));
        this.f3972O.add("s");
        this.f3970M.add(Integer.valueOf((int) R.drawable.bibi_i));
        this.f3972O.add("e");
        this.f3970M.add(Integer.valueOf((int) R.drawable.bea_i));
        this.f3972O.add("e");
        this.f3970M.add(Integer.valueOf((int) R.drawable.frank_i));
        this.f3972O.add("e");
        this.f3970M.add(Integer.valueOf((int) R.drawable.pipre_i));
        this.f3972O.add("e");
        this.f3970M.add(Integer.valueOf((int) R.drawable.pam_i));
        this.f3972O.add("e");
        this.f3970M.add(Integer.valueOf((int) R.drawable.max_i));
        this.f3972O.add("m");
        this.f3970M.add(Integer.valueOf((int) R.drawable.mortis_i));
        this.f3972O.add("m");
        this.f3970M.add(Integer.valueOf((int) R.drawable.mr_p_i));
        this.f3972O.add("m");
        this.f3970M.add(Integer.valueOf((int) R.drawable.tara_i));
        this.f3972O.add("m");
        this.f3970M.add(Integer.valueOf((int) R.drawable.gene_i));
        this.f3972O.add("m");
        this.f3970M.add(Integer.valueOf((int) R.drawable.spike_i));
        this.f3972O.add("l");
        this.f3970M.add(Integer.valueOf((int) R.drawable.crow_i));
        this.f3972O.add("l");
        this.f3970M.add(Integer.valueOf((int) R.drawable.leon_i));
        this.f3972O.add("l");
        this.f3970M.add(Integer.valueOf((int) R.drawable.sandy_i));
        this.f3972O.add("l");
        this.f3971N = new ArrayList<>();
        this.f3971N.add(Integer.valueOf((int) R.drawable.shelly_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.nita_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.colt_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.bull_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.jessie_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.brock_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.dinamike_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.emz_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.bo_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.bit_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.tick_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.elprimo_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.barley_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.poco_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.rosa_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.riko_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.darryl_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.penny_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.carl_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.jacky_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.bibi_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.bea_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.frank_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.piper_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.pam_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.max_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.mortis_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.mr_p_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.tara_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.gene_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.spike_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.crow_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.leon_f));
        this.f3971N.add(Integer.valueOf((int) R.drawable.sandy_f));
        this.f3962E.add("Shelly");
        this.f3962E.add("Nita");
        this.f3962E.add("Colt");
        this.f3962E.add("Bull");
        this.f3962E.add("Jessie");
        this.f3962E.add("Brock");
        this.f3962E.add("Dinamike");
        this.f3962E.add("Emz");
        this.f3962E.add("Bo");
        this.f3975R = "com.yilap.brawlstarsopenchestyilapsecond";
        this.f3962E.add("8-Bit");
        this.f3962E.add("Tick");
        this.f3962E.add("El Primo");
        this.f3962E.add("Barley");
        this.f3962E.add("Poco");
        this.f3962E.add("Rosa");
        this.f3962E.add("Ricochet");
        this.f3962E.add("Daryl");
        this.f3962E.add("Penny");
        this.f3962E.add("Carl");
        this.f3962E.add("Jacky");
        this.f3962E.add("Bibi");
        this.f3962E.add("Bea");
        this.f3962E.add("Frank");
        this.f3962E.add("Piper");
        this.f3962E.add("Pam");
        this.f3962E.add("Max");
        this.f3962E.add("Mortis");
        this.f3962E.add("Mr P");
        this.f3962E.add("Tara");
        this.f3962E.add("Gene");
        this.f3962E.add("Spike");
        this.f3962E.add("Crow");
        this.f3962E.add("Leon");
        this.f3962E.add("Sandy");
        int nextInt = this.f3976S.nextInt(40);
        this.f3965H.setBackground(getResources().getDrawable(R.drawable.money_box));
        this.f3966I = nextInt;
        this.f3959B.setBackgroundColor(0);
        this.f3967J.setBackground(null);
        this.f3967J.setText(String.valueOf(nextInt));
    }

    @Override // androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onDestroy() {
        super.onDestroy();
        MainActivity.m3725b(this);
        Runtime.getRuntime().gc();
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
