package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.ActivityManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

@SuppressWarnings("ALL")
public class Shop extends AppCompatActivity implements RewardedVideoAdListener {

    /* renamed from: ac */
    public static boolean f4307ac;

    /* renamed from: ad */
    public static String f4308ad;

    /* renamed from: ae */
    public static int f4309ae;

    /* renamed from: l */
    static int f4310l;

    /* renamed from: A */
    TextView f4311A;

    /* renamed from: B */
    TextView f4312B;

    /* renamed from: C */
    TextView f4313C;

    /* renamed from: D */
    LinearLayout f4314D;

    /* renamed from: E */
    LinearLayout f4315E;

    /* renamed from: F */
    LinearLayout f4316F;

    /* renamed from: G */
    LinearLayout f4317G;

    /* renamed from: H */
    LinearLayout f4318H;

    /* renamed from: I */
    LinearLayout f4319I;

    /* renamed from: J */
    TextView f4320J;

    /* renamed from: K */
    TextView f4321K;

    /* renamed from: L */
    TextView f4322L;

    /* renamed from: M */
    ImageView f4323M;

    /* renamed from: N */
    ImageView f4324N;

    /* renamed from: O */
    ImageView f4325O;

    /* renamed from: P */
    ImageView f4326P;

    /* renamed from: Q */
    ImageView f4327Q;

    /* renamed from: R */
    ImageView f4328R;

    /* renamed from: S */
    RelativeLayout f4329S;

    /* renamed from: T */
    RelativeLayout f4330T;

    /* renamed from: U */
    RelativeLayout f4331U;

    /* renamed from: V */
    Animation f4332V;

    /* renamed from: W */
    ImageView f4333W;

    /* renamed from: X */
    ImageView f4334X;

    /* renamed from: Y */
    ImageView f4335Y;

    /* renamed from: Z */
    Button f4336Z;

    /* renamed from: aA */
    GifImageView f4337aA;

    /* renamed from: aB */
    ImageView f4338aB;

    /* renamed from: aC */
    TextView f4339aC;

    /* renamed from: aD */
    TextView f4340aD;

    /* renamed from: aE */
    TextView f4341aE;

    /* renamed from: aF */
    TextView f4342aF;

    /* renamed from: aG */
    LinearLayout f4343aG;

    /* renamed from: aH */
    ImageView f4344aH;

    /* renamed from: aI */
    ImageView f4345aI;

    /* renamed from: aJ */
    ImageView f4346aJ;

    /* renamed from: aK */
    ImageView f4347aK;

    /* renamed from: aL */
    ImageView f4348aL;

    /* renamed from: aM */
    ImageView f4349aM;

    /* renamed from: aN */
    RelativeLayout f4350aN;

    /* renamed from: aO */
    RelativeLayout f4351aO;

    /* renamed from: aP */
    RelativeLayout f4352aP;

    /* renamed from: aQ */
    RelativeLayout f4353aQ;

    /* renamed from: aR */
    RelativeLayout f4354aR;

    /* renamed from: aS */
    RelativeLayout f4355aS;

    /* renamed from: aT */
    ImageView f4356aT;

    /* renamed from: aU */
    ImageView f4357aU;

    /* renamed from: aV */
    ImageView f4358aV;

    /* renamed from: aW */
    ImageView f4359aW;

    /* renamed from: aX */
    ImageView f4360aX;

    /* renamed from: aY */
    ImageView f4361aY;

    /* renamed from: aZ */
    Animation f4362aZ;

    /* renamed from: aa */
    Button f4363aa;

    /* renamed from: ab */
    ArrayList<Integer> f4364ab;

    /* renamed from: af */
    ImageView f4365af;

    /* renamed from: ag */
    ArrayList<Integer> f4366ag;

    /* renamed from: ah */
    ArrayList<C1133d> f4367ah = new ArrayList<>();

    /* renamed from: ai */
    ArrayList<C1133d> f4368ai = new ArrayList<>();

    /* renamed from: aj */
    String f4369aj;

    /* renamed from: ak */
    TextView f4370ak;

    /* renamed from: al */
    TextView f4371al;

    /* renamed from: am */
    TextView f4372am;

    /* renamed from: an */
    TextView f4373an;

    /* renamed from: ao */
    Button f4374ao;

    /* renamed from: ap */
    Button f4375ap;

    /* renamed from: aq */
    Button f4376aq;

    /* renamed from: ar */
    Button f4377ar;

    /* renamed from: as */
    Button f4378as;

    /* renamed from: at */
    Button f4379at;

    /* renamed from: au */
    Button f4380au;

    /* renamed from: av */
    Button f4381av;

    /* renamed from: aw */
    Button f4382aw;

    /* renamed from: ax */
    Button f4383ax;

    /* renamed from: ay */
    Button f4384ay;

    /* renamed from: az */
    String f4385az = "";

    /* renamed from: ba */
    TextView f4386ba;

    /* renamed from: bb */
    HorizontalScrollView f4387bb;
    /* access modifiers changed from: private */

    /* renamed from: bc */
    public InterstitialAd f4388bc;

    /* renamed from: j */
    ImageButton f4389j;

    /* renamed from: k */
    ImageButton f4390k;

    /* renamed from: m */
    ArrayList<TextView> f4391m;

    /* renamed from: n */
    TextView f4392n;

    /* renamed from: o */
    TextView f4393o;

    /* renamed from: p */
    RelativeLayout f4394p;

    /* renamed from: q */
    ArrayList<Integer> f4395q;

    /* renamed from: r */
    ImageView f4396r;

    /* renamed from: s */
    ImageView f4397s;

    /* renamed from: t */
    ImageView f4398t;

    /* renamed from: u */
    ImageView f4399u;

    /* renamed from: v */
    ImageView f4400v;

    /* renamed from: w */
    ImageView f4401w;

    /* renamed from: x */
    TextView f4402x;

    /* renamed from: y */
    TextView f4403y;

    /* renamed from: z */
    TextView f4404z;

    /* renamed from: a */
    private static void m3743a(ImageView imageView, int i) {
        RequestCreator a = Picasso.get().load(i);
        //ToDO: f16987b
        //a.f16987b = true;
        a.centerCrop().into(imageView, null);
    }

    /* renamed from: a */
    private void m3744a(ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, ImageView imageView3) {
        int i;
        int parseInt = Integer.parseInt(imageView.getTag().toString());
        int i2 = 0;
        while (true) {
            if (i2 >= this.f4395q.size()) {
                i2 = 0;
                break;
            } else if (this.f4395q.get(i2).intValue() == parseInt) {
                break;
            } else {
                i2++;
            }
        }
        if (MainActivity.m3726c("l".concat(String.valueOf(i2))) < 7) {
            imageView.setAlpha(0.8f);
            i = R.drawable.locked_gadget;
        } else {
            imageView.setAlpha(1.0f);
            i = this.f4366ag.get(i2).intValue();
        }
        m3743a(imageView3, i);
        if (MainActivity.m3726c("gadget" + this.f4395q.indexOf(Integer.valueOf(Integer.parseInt(imageView.getTag().toString())))) == 0) {
            imageView2.setBackground(getResources().getDrawable(R.drawable.gadget_shop));
            linearLayout.setVisibility(0);
            textView.setVisibility(4);
        } else {
            imageView2.setBackground(getResources().getDrawable(R.drawable.gadget_shop_buy));
            linearLayout.setVisibility(4);
            textView.setVisibility(0);
        }
        if (MainActivity.m3726c("language") == 0) {
            textView.setText("PURCHASED");
        }
        if (MainActivity.m3726c("language") == 1) {
            textView.setText("КУПЛЕНО");
        }
        if (MainActivity.m3726c("language") == 2) {
            textView.setText("КУПЛЕНО");
        }
    }

    /* renamed from: a */
    static void m3745a(Shop shop, String str) {
        if (MainActivity.m3726c(str) == 0) {
            shop.f4388bc.loadAd(new AdRequest.Builder().build());
            if (shop.f4388bc.isLoaded()) {
                shop.f4388bc.show();
                MainActivity.m3720a(1, str);
                if (str.equals("mney")) {
                    int c = MainActivity.m3726c("money") + 50;
                    MainActivity.m3720a(c, "money");
                    shop.f4370ak.setText(String.valueOf(c));
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(shop.getApplicationContext(), (int) R.raw.coins).start();
                        return;
                    }
                    return;
                }
                int c2 = MainActivity.m3726c("gems") + 50;
                MainActivity.m3720a(c2, "gems");
                shop.f4371al.setText(String.valueOf(c2));
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(shop.getApplicationContext(), (int) R.raw.gems).start();
                    return;
                }
                return;
            }
            if (MainActivity.m3726c("language") == 0) {
                shop.mo3652a(shop.f4386ba, "TRY AGAIN");
            }
            if (MainActivity.m3726c("language") == 1) {
                shop.mo3652a(shop.f4386ba, "СПРОБУЙ ЗНОВУ");
            }
            if (MainActivity.m3726c("language") == 2) {
                shop.mo3652a(shop.f4386ba, "ПОВТОРИТЕ ПОПЫТКУ");
            }
            if (MainActivity.m3726c("sounds") == 0) {
                MediaPlayer.create(shop.getApplicationContext(), (int) R.raw.error).start();
                return;
            }
            return;
        }
        Toast.makeText(shop, "You already watch video", 0).show();
        if (MainActivity.m3726c("language") == 0) {
            shop.mo3652a(shop.f4386ba, "You already watch video");
        }
        if (MainActivity.m3726c("language") == 1) {
            shop.mo3652a(shop.f4386ba, "Ти вже дивися відео");
        }
        if (MainActivity.m3726c("language") == 2) {
            shop.mo3652a(shop.f4386ba, "Ты уже смотрел видео");
        }
        if (MainActivity.m3726c("sounds") == 0) {
            MediaPlayer.create(shop.getApplicationContext(), (int) R.raw.error).start();
        }
    }

    /* renamed from: b */
    private void m3746b(ImageView imageView, int i, ImageView imageView2) {
        try {
            if (MainActivity.m3726c("skin" + this.f4364ab.get(i)) != 0) {
                m3743a(imageView2, (int) R.drawable.done_fone);
                imageView.setVisibility(0);
                return;
            }
            imageView.setVisibility(4);
            m3743a(imageView2, (int) R.drawable.shin_background);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private void m3747i() {
        //ToDo: initialized...
        String str = null;
        TextView textView = null;
        for (int i = 0; i < this.f4391m.size(); i++) {
            if (i == 0) {
                if (MainActivity.m3726c("language") == 0) {
                    this.f4391m.get(i).setText("GADGETS");
                }
                if (MainActivity.m3726c("language") == 1) {
                    this.f4391m.get(i).setText("ГАДЖЕТИ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    textView = this.f4391m.get(i);
                    str = "гаджеты";
                }
            } else {
                if (MainActivity.m3726c("language") == 0) {
                    this.f4391m.get(i).setText("GADGET");
                }
                if (MainActivity.m3726c("language") == 1) {
                    this.f4391m.get(i).setText("ГАДЖЕТ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    textView = this.f4391m.get(i);
                    str = "ГАДЖЕТ";
                }
            }
            textView.setText(str);
        }
        if (MainActivity.m3726c("language") == 0) {
            this.f4392n.setText("Skins");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f4392n.setText("Скіни");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4392n.setText("Скины");
        }
    }

    /* renamed from: j */
    private void m3748j() {
        Integer num;
        ImageView imageView;
        if (MainActivity.m3726c("gadget_1") == 0) {
            m3743a(this.f4344aH, (int) R.drawable.shely);
            m3743a(this.f4345aI, (int) R.drawable.rosa);
            m3743a(this.f4346aJ, (int) R.drawable.jacky);
            m3743a(this.f4347aK, (int) R.drawable.pam);
            m3743a(this.f4348aL, (int) R.drawable.sprout);
            m3743a(this.f4349aM, (int) R.drawable.leon);
            this.f4344aH.setTag(Integer.valueOf((int) R.drawable.shely));
            this.f4345aI.setTag(Integer.valueOf((int) R.drawable.rosa));
            this.f4346aJ.setTag(Integer.valueOf((int) R.drawable.jacky));
            this.f4347aK.setTag(Integer.valueOf((int) R.drawable.pam));
            this.f4348aL.setTag(Integer.valueOf((int) R.drawable.sprout));
            imageView = this.f4349aM;
            num = Integer.valueOf((int) R.drawable.leon);
        } else {
            m3743a(this.f4344aH, MainActivity.m3726c("gadget_1"));
            m3743a(this.f4345aI, MainActivity.m3726c("gadget_2"));
            m3743a(this.f4346aJ, MainActivity.m3726c("gadget_3"));
            m3743a(this.f4347aK, MainActivity.m3726c("gadget_4"));
            m3743a(this.f4348aL, MainActivity.m3726c("gadget_5"));
            m3743a(this.f4349aM, MainActivity.m3726c("gadget_6"));
            this.f4344aH.setTag(Integer.valueOf(MainActivity.m3726c("gadget_1")));
            this.f4345aI.setTag(Integer.valueOf(MainActivity.m3726c("gadget_2")));
            this.f4346aJ.setTag(Integer.valueOf(MainActivity.m3726c("gadget_3")));
            this.f4347aK.setTag(Integer.valueOf(MainActivity.m3726c("gadget_4")));
            this.f4348aL.setTag(Integer.valueOf(MainActivity.m3726c("gadget_5")));
            imageView = this.f4349aM;
            num = Integer.valueOf(MainActivity.m3726c("gadget_6"));
        }
        imageView.setTag(num);
        m3744a(this.f4344aH, this.f4396r, this.f4402x, this.f4314D, this.f4356aT);
        m3744a(this.f4345aI, this.f4397s, this.f4403y, this.f4315E, this.f4357aU);
        m3744a(this.f4346aJ, this.f4398t, this.f4404z, this.f4316F, this.f4358aV);
        m3744a(this.f4347aK, this.f4399u, this.f4311A, this.f4317G, this.f4359aW);
        m3744a(this.f4348aL, this.f4400v, this.f4312B, this.f4318H, this.f4360aX);
        m3744a(this.f4349aM, this.f4401w, this.f4313C, this.f4319I, this.f4361aY);
    }

    /* renamed from: k */
    private void m3749k() {
        m3743a(this.f4323M, this.f4364ab.get(0).intValue());
        m3743a(this.f4324N, this.f4364ab.get(1).intValue());
        m3743a(this.f4325O, this.f4364ab.get(2).intValue());
    }

    /* renamed from: l */
    private void m3750l() {
        this.f4364ab = new ArrayList<>();
        this.f4336Z = (Button) findViewById(R.id.video_update);
        this.f4363aa = (Button) findViewById(R.id.gems_update);
        this.f4393o = (TextView) findViewById(R.id.shopupdate);
        if (MainActivity.m3726c("language") == 0) {
            this.f4393o.setText("UPDATE SHOP:");
            this.f4336Z.setText("VIDEO");
            this.f4363aa.setText("40 GEMS");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f4393o.setText("ОНОВИТИ МАГАЗИН:");
            this.f4336Z.setText("ВІДЕО");
            this.f4363aa.setText("40 ГЕМІВ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4393o.setText("ОБНОВИТЬ МАГАЗИН:");
            this.f4336Z.setText("ВИДЕО");
            this.f4363aa.setText("40 ГЕМОВ");
        }
        this.f4326P = (ImageView) findViewById(R.id.fone_first);
        this.f4327Q = (ImageView) findViewById(R.id.fone_second);
        this.f4328R = (ImageView) findViewById(R.id.fone_three);
        this.f4320J = (TextView) findViewById(R.id.firts_name);
        this.f4321K = (TextView) findViewById(R.id.second_name);
        this.f4322L = (TextView) findViewById(R.id.three_name);
        this.f4323M = (ImageView) findViewById(R.id.first_skin);
        this.f4324N = (ImageView) findViewById(R.id.second_skin);
        this.f4325O = (ImageView) findViewById(R.id.three_skin);
        this.f4329S = (RelativeLayout) findViewById(R.id.first_skin_lay);
        this.f4330T = (RelativeLayout) findViewById(R.id.second_skin_lay);
        this.f4331U = (RelativeLayout) findViewById(R.id.three_skin_lay);
        this.f4333W = (ImageView) findViewById(R.id.firts_done);
        this.f4334X = (ImageView) findViewById(R.id.decond_done);
        this.f4335Y = (ImageView) findViewById(R.id.three_done);
        this.f4332V = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        this.f4364ab = new ArrayList<>();
        this.f4365af = (ImageView) findViewById(R.id.new_icon);
        if (!MainActivity.m3724b("skin_name").equals("")) {
            int i = 0;
            while (true) {
                if (i >= this.f4367ah.size()) {
                    break;
                } else if (this.f4367ah.get(i).f4557a.equals(MainActivity.m3724b("skin_name"))) {
                    MainActivity.m3720a(this.f4367ah.get(i).f4558b.get(1).intValue(), "first_skin");
                    MainActivity.m3722a(MainActivity.m3724b("skin_name"), "first_skin_name");
                    break;
                } else {
                    i++;
                }
            }
            this.f4365af.setVisibility(0);
        } else {
            this.f4365af.setVisibility(4);
        }
        if (MainActivity.m3726c("first_skin") == 0) {
            this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin));
            this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin_second));
            this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin_three));
            this.f4320J.setText("Shelly");
            this.f4321K.setText("Shelly");
            this.f4322L.setText("Shelly");
        } else {
            this.f4364ab.add(Integer.valueOf(MainActivity.m3726c("first_skin")));
            this.f4364ab.add(Integer.valueOf(MainActivity.m3726c("second_skin")));
            this.f4364ab.add(Integer.valueOf(MainActivity.m3726c("three_skin")));
            MainActivity.m3728c(this.f4320J, "first_skin_name");
            MainActivity.m3728c(this.f4321K, "second_skin_name");
            MainActivity.m3728c(this.f4322L, "three_skin_name");
        }
        if (MainActivity.m3726c("first_skin") != 0 && MainActivity.m3726c("second_skin") == 0) {
            this.f4364ab = new ArrayList<>();
            this.f4364ab.add(Integer.valueOf(MainActivity.m3726c("first_skin")));
            this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin_second));
            this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin_three));
            MainActivity.m3728c(this.f4320J, "first_skin_name");
            this.f4321K.setText("Shelly");
            this.f4322L.setText("Shelly");
        }
        m3749k();
        if (!getPackageName().equals(this.f4369aj)) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(67108864);
            startActivity(intent);
        }
        if (f4307ac) {
            this.f4320J.setText(f4308ad);
            m3743a(this.f4323M, f4309ae);
            this.f4364ab.remove(0);
            this.f4364ab.add(0, Integer.valueOf(f4309ae));
        }
        this.f4329S.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C10731 */

            public final void onClick(View view) {
                Shop.this.f4365af.setVisibility(4);
                MainActivity.f4140aK.setVisibility(4);
                MainActivity.f4130S.setBackground(Shop.this.getResources().getDrawable(R.drawable.shop));
                Shop.this.f4329S.startAnimation(Shop.this.f4332V);
                Shop shop = Shop.this;
                shop.mo3650a(shop.f4333W, 0, Shop.this.f4326P);
                MainActivity.m3722a("", "skin_name");
            }
        });
        this.f4330T.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C107612 */

            public final void onClick(View view) {
                Shop.this.f4330T.startAnimation(Shop.this.f4332V);
                Shop shop = Shop.this;
                shop.mo3650a(shop.f4334X, 1, Shop.this.f4327Q);
            }
        });
        this.f4331U.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108823 */

            public final void onClick(View view) {
                Shop.this.f4331U.startAnimation(Shop.this.f4332V);
                Shop shop = Shop.this;
                shop.mo3650a(shop.f4335Y, 2, Shop.this.f4328R);
            }
        });
        m3746b(this.f4333W, 0, this.f4326P);
        m3746b(this.f4334X, 1, this.f4327Q);
        m3746b(this.f4335Y, 2, this.f4328R);
    }

    /*@Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: C_ *//*
    public final void mo3645C_() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: D_ *//*
    public final void mo3646D_() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: E_ *//*
    public final void mo3647E_() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: a *//*
    public final void mo3648a() {
    }

    @Override // androidx.p038f.p039a.C0666e, com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: a *//*
    public final void mo3517a(int i) {
    }*/

    /* renamed from: a */
    public final void mo3649a(int i, int i2) {
        int parseInt = Integer.parseInt(this.f4370ak.getText().toString()) - i;
        if (parseInt >= 0) {
            if (MainActivity.m3726c("sounds") == 0) {
                MediaPlayer.create(getApplicationContext(), (int) R.raw.gems).start();
            }
            this.f4370ak.setText(String.valueOf(parseInt));
            MainActivity.m3720a(MainActivity.m3726c("gems") + i2, "gems");
            MainActivity.m3720a(parseInt, "money");
            MainActivity.m3729d(this.f4371al, "gems");
        } else if (MainActivity.m3726c("sounds") == 0) {
            MediaPlayer.create(getApplicationContext(), (int) R.raw.error).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3650a(ImageView imageView, int i, ImageView imageView2) {
        int parseInt = Integer.parseInt(this.f4371al.getText().toString());
        if (imageView.getVisibility() == 4) {
            int i2 = parseInt - 80;
            if (i2 >= 0) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(this, (int) R.raw.menu_click).start();
                }
                MainActivity.m3720a(1, "skin" + this.f4364ab.get(i));
                MainActivity.m3720a(i2, "gems");
                m3743a(imageView2, (int) R.drawable.done_fone);
                imageView.setVisibility(0);
                this.f4371al.setText(String.valueOf(i2));
                return;
            }
            if (MainActivity.m3726c("sounds") == 0) {
                MediaPlayer.create(this, (int) R.raw.menu_cancel).start();
            }
            if (MainActivity.m3726c("language") == 0) {
                mo3652a(this.f4386ba, "You don’t have enough gems");
            }
            if (MainActivity.m3726c("language") == 1) {
                mo3652a(this.f4386ba, "Тобі не вистарчає кристалів");
            }
            if (MainActivity.m3726c("language") == 2) {
                mo3652a(this.f4386ba, "Тебе не хватает гемов");
                return;
            }
            return;
        }
        if (MainActivity.m3726c("sounds") == 0) {
            MediaPlayer.create(this, (int) R.raw.menu_cancel).start();
        }
        if (MainActivity.m3726c("language") == 0) {
            mo3652a(this.f4386ba, "You already buy it");
        }
        if (MainActivity.m3726c("language") == 1) {
            mo3652a(this.f4386ba, "Ти вже купив цей скін");
        }
        if (MainActivity.m3726c("language") == 2) {
            mo3652a(this.f4386ba, "Ты уже купил этот скин");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3651a(ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, RelativeLayout relativeLayout) {
        relativeLayout.startAnimation(this.f4332V);
        int parseInt = Integer.parseInt(imageView.getTag().toString());
        int i = 0;
        while (true) {
            if (i >= this.f4395q.size()) {
                i = 0;
                break;
            } else if (this.f4395q.get(i).intValue() == parseInt) {
                break;
            } else {
                i++;
            }
        }
        if (MainActivity.m3726c("l".concat(String.valueOf(i))) >= 7) {
            int parseInt2 = Integer.parseInt(this.f4370ak.getText().toString());
            if (MainActivity.m3726c("gadget" + this.f4395q.indexOf(Integer.valueOf(Integer.parseInt(imageView.getTag().toString())))) == 0) {
                int i2 = parseInt2 - 1000;
                if (i2 >= 0) {
                    MainActivity.m3720a(i2, "money");
                    this.f4370ak.setText(String.valueOf(i2));
                    MainActivity.m3720a(1, "gadget" + this.f4395q.indexOf(Integer.valueOf(Integer.parseInt(imageView.getTag().toString()))));
                    MainActivity.m3720a(1, "shop_gadget" + this.f4395q.get(i));
                    m3743a(imageView2, (int) R.drawable.gadget_shop_buy);
                    linearLayout.setVisibility(4);
                    textView.setVisibility(0);
                    if (MainActivity.m3726c("language") == 0) {
                        textView.setText("PURCHASED");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        textView.setText("КУПЛЕНО");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        textView.setText("КУПЛЕНО");
                        return;
                    }
                    return;
                }
                if (MainActivity.m3726c("language") == 0) {
                    mo3652a(this.f4386ba, "You don’t have enough money");
                }
                if (MainActivity.m3726c("language") == 1) {
                    mo3652a(this.f4386ba, "Тобі не вистарчає монет");
                }
                if (MainActivity.m3726c("language") == 2) {
                    mo3652a(this.f4386ba, "Тебе не хватает монет");
                    return;
                }
                return;
            }
            if (MainActivity.m3726c("language") == 0) {
                mo3652a(this.f4386ba, "You already buy this gadget");
            }
            if (MainActivity.m3726c("language") == 1) {
                mo3652a(this.f4386ba, "Ти вже купив цей гаджет");
            }
            if (MainActivity.m3726c("language") == 2) {
                mo3652a(this.f4386ba, "Ты уже купил этот гаджет");
                return;
            }
            return;
        }
        if (MainActivity.m3726c("language") == 0) {
            mo3652a(this.f4386ba, "Upgrade this brawler to 7 lvl");
        }
        if (MainActivity.m3726c("language") == 1) {
            mo3652a(this.f4386ba, "Покращи цього бійця до 7 рівня");
        }
        if (MainActivity.m3726c("language") == 2) {
            mo3652a(this.f4386ba, "Улучши этого бойца до 7 уровня");
        }
    }

    /* renamed from: a */
    public final void mo3652a(final TextView textView, String str) {
        textView.setVisibility(0);
        textView.setText(str);
        textView.startAnimation(this.f4362aZ);
        this.f4362aZ.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C10842 */

            public final void onAnimationEnd(Animation animation) {
                textView.setVisibility(4);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    /* renamed from: a */
    public final void onRewarded(RewardItem bVar) {
        int c;
        String str;
        if (this.f4385az.equals("m")) {
            c = MainActivity.m3726c("money") + 600;
            str = "money";
        } else {
            c = MainActivity.m3726c("gems") + 50;
            str = "gems";
        }
        MainActivity.m3720a(c, str);
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }

    /* renamed from: b */
    public final void mo3654b(int i, int i2) {
        int parseInt = Integer.parseInt(this.f4371al.getText().toString()) - i;
        if (parseInt >= 0) {
            if (MainActivity.m3726c("sounds") == 0) {
                MediaPlayer.create(getApplicationContext(), (int) R.raw.ticket).start();
            }
            this.f4371al.setText(String.valueOf(parseInt));
            MainActivity.m3720a(MainActivity.m3726c("ticket") + i2, "ticket");
            MainActivity.m3720a(parseInt, "gems");
            MainActivity.m3729d(this.f4372am, "ticket");
        } else if (MainActivity.m3726c("sounds") == 0) {
            MediaPlayer.create(getApplicationContext(), (int) R.raw.error).start();
        }
    }

   /* @Override // androidx.appcompat.app.AppCompatActivity, com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: e *//*
    public final void mo3390e() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: f *//*
    public final void mo3391f() {
    }*/

    /* renamed from: h */
    public final void mo3655h() {
        Random random = new Random();
        int nextInt = random.nextInt(this.f4395q.size());
        int nextInt2 = random.nextInt(this.f4395q.size());
        int nextInt3 = random.nextInt(this.f4395q.size());
        int nextInt4 = random.nextInt(this.f4395q.size());
        int nextInt5 = random.nextInt(this.f4395q.size());
        int nextInt6 = random.nextInt(this.f4395q.size());
        MainActivity.m3720a(this.f4395q.get(nextInt).intValue(), "gadget_1");
        MainActivity.m3720a(this.f4395q.get(nextInt2).intValue(), "gadget_2");
        MainActivity.m3720a(this.f4395q.get(nextInt3).intValue(), "gadget_3");
        MainActivity.m3720a(this.f4395q.get(nextInt4).intValue(), "gadget_4");
        MainActivity.m3720a(this.f4395q.get(nextInt5).intValue(), "gadget_5");
        MainActivity.m3720a(this.f4395q.get(nextInt6).intValue(), "gadget_6");
        m3748j();
        MainActivity.m3722a("", "skin_name");
        MainActivity.f4140aK.setVisibility(4);
        MainActivity.f4130S.setBackground(getResources().getDrawable(R.drawable.shop));
        this.f4365af.setVisibility(4);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            try {
                int nextInt7 = new Random().nextInt((this.f4368ai.size() - 0) + 1) + 0;
                arrayList.add(this.f4367ah.get(nextInt7));
                this.f4367ah.remove(this.f4367ah.get(nextInt7));
            } catch (Exception unused) {
                this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin));
                this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin_second));
                this.f4364ab.add(Integer.valueOf((int) R.drawable.shelly_skin_three));
                this.f4320J.setText("Shelly");
                this.f4321K.setText("Shelly");
                this.f4321K.setText("Shelly");
            }
        }
        this.f4364ab = new ArrayList<>();
        try {
            MainActivity.m3720a(((C1133d) arrayList.get(0)).f4558b.get(1).intValue(), "first_skin");
            MainActivity.m3720a(((C1133d) arrayList.get(1)).f4558b.get(1).intValue(), "second_skin");
            MainActivity.m3720a(((C1133d) arrayList.get(2)).f4558b.get(1).intValue(), "three_skin");
            MainActivity.m3722a(((C1133d) arrayList.get(0)).f4557a, "first_skin_name");
            MainActivity.m3722a(((C1133d) arrayList.get(1)).f4557a, "second_skin_name");
            MainActivity.m3722a(((C1133d) arrayList.get(2)).f4557a, "three_skin_name");
            this.f4364ab.add(Integer.valueOf(MainActivity.m3726c("first_skin")));
            this.f4364ab.add(Integer.valueOf(MainActivity.m3726c("second_skin")));
            this.f4364ab.add(Integer.valueOf(MainActivity.m3726c("three_skin")));
            MainActivity.m3728c(this.f4320J, "first_skin_name");
            MainActivity.m3728c(this.f4321K, "second_skin_name");
            MainActivity.m3728c(this.f4322L, "three_skin_name");
            m3749k();
        } catch (Exception unused2) {
        }
        m3746b(this.f4333W, 0, this.f4326P);
        m3746b(this.f4334X, 1, this.f4327Q);
        m3746b(this.f4335Y, 2, this.f4328R);
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_shop);
        this.f4362aZ = AnimationUtils.loadAnimation(this, R.anim.text);
        this.f4386ba = (TextView) findViewById(R.id.text_help);
        this.f4367ah = new ArrayList<>();
        this.f4368ai = new ArrayList<>();
        if (MainActivity.m3726c("language") == 0) {
            this.f4367ah.add(new C1133d("Shelly"));
            this.f4369aj = "com.brawl.mybestappforfansbrawlstarsboxs";
            this.f4367ah.add(new C1133d(R.drawable.nita_f, R.drawable.nita_skin, "Nita"));
            this.f4367ah.add(new C1133d(R.drawable.colt_f, R.drawable.colt_skin, "Colt"));
            this.f4367ah.add(new C1133d(R.drawable.bull_f, R.drawable.bull_skin, "Bull"));
            this.f4367ah.add(new C1133d(R.drawable.jessie_f, R.drawable.jessie_skin, "Jessie"));
            this.f4367ah.add(new C1133d(R.drawable.brock_f, R.drawable.brock_skin, "Brock"));
            this.f4367ah.add(new C1133d(R.drawable.dinamike_f, R.drawable.dinamike_skin, "Dinamike"));
            this.f4367ah.add(new C1133d(R.drawable.emz_f, R.drawable.emz_skin, "Emz"));
            this.f4367ah.add(new C1133d(R.drawable.bo_f, R.drawable.bo_skin, "Bo"));
            this.f4367ah.add(new C1133d(R.drawable.bit_f, R.drawable.bit_skin, "8 Bit"));
            this.f4367ah.add(new C1133d(R.drawable.tick_f, R.drawable.tick_f, "Tick"));
            this.f4367ah.add(new C1133d(R.drawable.elprimo_f, R.drawable.elprimo_skin, "El Primo"));
            this.f4367ah.add(new C1133d(R.drawable.barley_f, R.drawable.barley_skin, "Barley"));
            this.f4367ah.add(new C1133d(R.drawable.poco_f, R.drawable.poco_skin, "Poco"));
            this.f4367ah.add(new C1133d(R.drawable.rosa_f, R.drawable.rosa_f, "Rosa"));
            this.f4367ah.add(new C1133d(R.drawable.riko_f, R.drawable.ricko_skin, "Rico"));
            this.f4367ah.add(new C1133d(R.drawable.darryl_f, R.drawable.darryl_skin, "Darryl"));
            this.f4367ah.add(new C1133d(R.drawable.penny_f, R.drawable.penny_skin, "Penny"));
            this.f4367ah.add(new C1133d(R.drawable.carl_f, R.drawable.carl_skin, "Carl"));
            this.f4367ah.add(new C1133d(R.drawable.jacky_f, R.drawable.jacky_skin, "Jacky"));
            this.f4367ah.add(new C1133d(R.drawable.bibi_f, R.drawable.bibi_skin, "Bibi"));
            this.f4367ah.add(new C1133d(R.drawable.bea_f, R.drawable.bea_skin, "Bea"));
            this.f4367ah.add(new C1133d(R.drawable.frank_f, R.drawable.frank_skin, "Frank"));
            this.f4367ah.add(new C1133d(R.drawable.piper_f, R.drawable.piper_skin, "Piper"));
            this.f4367ah.add(new C1133d(R.drawable.pam_f, R.drawable.pam_skin, "Pam"));
            this.f4367ah.add(new C1133d(R.drawable.nani_f, R.drawable.nani_f, "Nani"));
            this.f4367ah.add(new C1133d(R.drawable.max_f, R.drawable.max_skin, "Max"));
            this.f4367ah.add(new C1133d(R.drawable.mortis_f, R.drawable.mortis_skin, "Mortis"));
            this.f4367ah.add(new C1133d(R.drawable.mr_p_f, R.drawable.mr_p_skin, "Mr P"));
            this.f4367ah.add(new C1133d(R.drawable.sprout_f, R.drawable.sprout_skin, "Spraut"));
            this.f4367ah.add(new C1133d(R.drawable.tara_f, R.drawable.tara_skin, "Tara"));
            this.f4367ah.add(new C1133d(R.drawable.gene_f, R.drawable.gene_skin, "Gene"));
            this.f4367ah.add(new C1133d(R.drawable.spike_f, R.drawable.spike_skin, "Spike"));
            this.f4367ah.add(new C1133d(R.drawable.crow_f, R.drawable.crow_skin, "Crow"));
            this.f4367ah.add(new C1133d(R.drawable.leon_f, R.drawable.leon_skin, "Leon"));
            this.f4367ah.add(new C1133d(R.drawable.sandy_f, R.drawable.sandy_skin, "Sandy"));
            this.f4367ah.add(new C1133d(R.drawable.gale_f, R.drawable.gale_skin, "Gale"));
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f4367ah.add(new C1133d("Шеллі"));
            this.f4369aj = "com.brawl.mybestappforfansbrawlstarsboxs";
            this.f4367ah.add(new C1133d(R.drawable.nita_f, R.drawable.nita_skin, "Ніта"));
            this.f4367ah.add(new C1133d(R.drawable.colt_f, R.drawable.colt_skin, "Кольт"));
            this.f4367ah.add(new C1133d(R.drawable.bull_f, R.drawable.bull_skin, "Булл"));
            this.f4367ah.add(new C1133d(R.drawable.jessie_f, R.drawable.jessie_skin, "Джессі"));
            this.f4367ah.add(new C1133d(R.drawable.brock_f, R.drawable.brock_skin, "Брок"));
            this.f4367ah.add(new C1133d(R.drawable.dinamike_f, R.drawable.dinamike_skin, "Дінамайк"));
            this.f4367ah.add(new C1133d(R.drawable.emz_f, R.drawable.emz_skin, "ЕМЗ"));
            this.f4367ah.add(new C1133d(R.drawable.bo_f, R.drawable.bo_skin, "Бо"));
            this.f4367ah.add(new C1133d(R.drawable.bit_f, R.drawable.bit_skin, "8-Біт"));
            this.f4367ah.add(new C1133d(R.drawable.tick_f, R.drawable.tick_f, "Тік"));
            this.f4367ah.add(new C1133d(R.drawable.elprimo_f, R.drawable.elprimo_skin, "Ель Прімо"));
            this.f4367ah.add(new C1133d(R.drawable.barley_f, R.drawable.barley_skin, "Барлі"));
            this.f4367ah.add(new C1133d(R.drawable.poco_f, R.drawable.poco_skin, "Поко"));
            this.f4367ah.add(new C1133d(R.drawable.rosa_f, R.drawable.rosa_f, "Роза"));
            this.f4367ah.add(new C1133d(R.drawable.riko_f, R.drawable.ricko_skin, "Ріко"));
            this.f4367ah.add(new C1133d(R.drawable.darryl_f, R.drawable.darryl_skin, "Дерріл"));
            this.f4367ah.add(new C1133d(R.drawable.penny_f, R.drawable.penny_skin, "Пенні"));
            this.f4367ah.add(new C1133d(R.drawable.carl_f, R.drawable.carl_skin, "Карл"));
            this.f4367ah.add(new C1133d(R.drawable.jacky_f, R.drawable.jacky_skin, "Джекі"));
            this.f4367ah.add(new C1133d(R.drawable.bibi_f, R.drawable.bibi_skin, "Бібі"));
            this.f4367ah.add(new C1133d(R.drawable.bea_f, R.drawable.bea_skin, "Беа"));
            this.f4367ah.add(new C1133d(R.drawable.frank_f, R.drawable.frank_skin, "Френк"));
            this.f4367ah.add(new C1133d(R.drawable.piper_f, R.drawable.piper_skin, "Пайпер"));
            this.f4367ah.add(new C1133d(R.drawable.pam_f, R.drawable.pam_skin, "Пем"));
            this.f4367ah.add(new C1133d(R.drawable.nani_f, R.drawable.nani_f, "Нані"));
            this.f4367ah.add(new C1133d(R.drawable.max_f, R.drawable.max_skin, "Макс"));
            this.f4367ah.add(new C1133d(R.drawable.mortis_f, R.drawable.mortis_skin, "Мортіс"));
            this.f4367ah.add(new C1133d(R.drawable.mr_p_f, R.drawable.mr_p_skin, "Містер П."));
            this.f4367ah.add(new C1133d(R.drawable.sprout_f, R.drawable.sprout_skin, "Спраут"));
            this.f4367ah.add(new C1133d(R.drawable.tara_f, R.drawable.tara_skin, "Тара"));
            this.f4367ah.add(new C1133d(R.drawable.gene_f, R.drawable.gene_skin, "Джин"));
            this.f4367ah.add(new C1133d(R.drawable.spike_f, R.drawable.spike_skin, "Спайк"));
            this.f4367ah.add(new C1133d(R.drawable.crow_f, R.drawable.crow_skin, "Ворон"));
            this.f4367ah.add(new C1133d(R.drawable.leon_f, R.drawable.leon_skin, "Леон"));
            this.f4367ah.add(new C1133d(R.drawable.sandy_f, R.drawable.sandy_skin, "Сенді"));
            this.f4367ah.add(new C1133d(R.drawable.gale_f, R.drawable.gale_skin, "Гейл"));
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4367ah.add(new C1133d("Шелли"));
            this.f4369aj = "com.brawl.mybestappforfansbrawlstarsboxs";
            this.f4367ah.add(new C1133d(R.drawable.nita_f, R.drawable.nita_skin, "Нита"));
            this.f4367ah.add(new C1133d(R.drawable.colt_f, R.drawable.colt_skin, "Кольт"));
            this.f4367ah.add(new C1133d(R.drawable.bull_f, R.drawable.bull_skin, "Булл"));
            this.f4367ah.add(new C1133d(R.drawable.jessie_f, R.drawable.jessie_skin, "Джесси"));
            this.f4367ah.add(new C1133d(R.drawable.brock_f, R.drawable.brock_skin, "Брок"));
            this.f4367ah.add(new C1133d(R.drawable.dinamike_f, R.drawable.dinamike_skin, "Динамайк"));
            this.f4367ah.add(new C1133d(R.drawable.emz_f, R.drawable.emz_skin, "ЭМЗ"));
            this.f4367ah.add(new C1133d(R.drawable.bo_f, R.drawable.bo_skin, "Бо"));
            this.f4367ah.add(new C1133d(R.drawable.bit_f, R.drawable.bit_skin, "8-Бит"));
            this.f4367ah.add(new C1133d(R.drawable.tick_f, R.drawable.tick_f, "Тик"));
            this.f4367ah.add(new C1133d(R.drawable.elprimo_f, R.drawable.elprimo_skin, "Эль Примо"));
            this.f4367ah.add(new C1133d(R.drawable.barley_f, R.drawable.barley_skin, "Барли"));
            this.f4367ah.add(new C1133d(R.drawable.poco_f, R.drawable.poco_skin, "Поко"));
            this.f4367ah.add(new C1133d(R.drawable.rosa_f, R.drawable.rosa_f, "Роза"));
            this.f4367ah.add(new C1133d(R.drawable.riko_f, R.drawable.ricko_skin, "Рико"));
            this.f4367ah.add(new C1133d(R.drawable.darryl_f, R.drawable.darryl_skin, "ДЭррил"));
            this.f4367ah.add(new C1133d(R.drawable.penny_f, R.drawable.penny_skin, "Пенни"));
            this.f4367ah.add(new C1133d(R.drawable.carl_f, R.drawable.carl_skin, "Карл"));
            this.f4367ah.add(new C1133d(R.drawable.jacky_f, R.drawable.jacky_skin, "Джеки"));
            this.f4367ah.add(new C1133d(R.drawable.bibi_f, R.drawable.bibi_skin, "БИБИ"));
            this.f4367ah.add(new C1133d(R.drawable.bea_f, R.drawable.bea_skin, "Беа"));
            this.f4367ah.add(new C1133d(R.drawable.frank_f, R.drawable.frank_skin, "ФрЭнк"));
            this.f4367ah.add(new C1133d(R.drawable.piper_f, R.drawable.piper_skin, "Пайпер"));
            this.f4367ah.add(new C1133d(R.drawable.pam_f, R.drawable.pam_skin, "ПЭМ"));
            this.f4367ah.add(new C1133d(R.drawable.nani_f, R.drawable.nani_f, "Нани"));
            this.f4367ah.add(new C1133d(R.drawable.max_f, R.drawable.max_skin, "Макс"));
            this.f4367ah.add(new C1133d(R.drawable.mortis_f, R.drawable.mortis_skin, "Мортис"));
            this.f4367ah.add(new C1133d(R.drawable.mr_p_f, R.drawable.mr_p_skin, "Мистер П."));
            this.f4367ah.add(new C1133d(R.drawable.sprout_f, R.drawable.sprout_skin, "Спраут"));
            this.f4367ah.add(new C1133d(R.drawable.tara_f, R.drawable.tara_skin, "Тара"));
            this.f4367ah.add(new C1133d(R.drawable.gene_f, R.drawable.gene_skin, "Джин"));
            this.f4367ah.add(new C1133d(R.drawable.spike_f, R.drawable.spike_skin, "Спайк"));
            this.f4367ah.add(new C1133d(R.drawable.crow_f, R.drawable.crow_skin, "Ворон"));
            this.f4367ah.add(new C1133d(R.drawable.leon_f, R.drawable.leon_skin, "Леон"));
            this.f4367ah.add(new C1133d(R.drawable.sandy_f, R.drawable.sandy_skin, "СЭнди"));
            this.f4367ah.add(new C1133d(R.drawable.gale_f, R.drawable.gale_skin, "Гэйл"));
        }
        m3750l();
        this.f4366ag = new ArrayList<>();
        this.f4366ag.add(Integer.valueOf((int) R.drawable.shelly_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.nita_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.colt_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.bull_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.jessie_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.brock_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.dinamike_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.emz_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.bo_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.bit_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.tick_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.el_primo_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.barley_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.poco_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.rosa_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.rico_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.darryl_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.penny_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.carl_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.jacky_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.bibi_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.bea_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.frank_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.piper_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.pam_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.nani_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.max_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.mortis_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.mr_p_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.sprout_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.tara_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.gene_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.spike_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.crow_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.leon_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.sandy_gadget));
        this.f4366ag.add(Integer.valueOf((int) R.drawable.gale_gadget));
        if (!MainActivity.f4145as) {
            this.f4344aH = (ImageView) findViewById(R.id.gadget_one);
            this.f4345aI = (ImageView) findViewById(R.id.gadget_two);
            this.f4346aJ = (ImageView) findViewById(R.id.gadget_three);
            this.f4347aK = (ImageView) findViewById(R.id.gadget_fourth);
            this.f4348aL = (ImageView) findViewById(R.id.gadget_five);
            this.f4349aM = (ImageView) findViewById(R.id.gadget_six);
            this.f4356aT = (ImageView) findViewById(R.id.gadget_icon1);
            this.f4357aU = (ImageView) findViewById(R.id.gadget_icon2);
            this.f4358aV = (ImageView) findViewById(R.id.gadget_icon3);
            this.f4359aW = (ImageView) findViewById(R.id.gadget_icon4);
            this.f4360aX = (ImageView) findViewById(R.id.gadget_icon5);
            this.f4361aY = (ImageView) findViewById(R.id.gadget_icon6);
            this.f4395q = new ArrayList<>();
            this.f4402x = (TextView) findViewById(R.id.buyed_one);
            this.f4403y = (TextView) findViewById(R.id.buyed_two);
            this.f4404z = (TextView) findViewById(R.id.buyed_three);
            this.f4311A = (TextView) findViewById(R.id.buyed_fourth);
            this.f4312B = (TextView) findViewById(R.id.buyed_five);
            this.f4313C = (TextView) findViewById(R.id.buyed_six);
            this.f4314D = (LinearLayout) findViewById(R.id.price_one);
            this.f4315E = (LinearLayout) findViewById(R.id.price_two);
            this.f4316F = (LinearLayout) findViewById(R.id.price_three);
            this.f4317G = (LinearLayout) findViewById(R.id.price_fourth);
            this.f4318H = (LinearLayout) findViewById(R.id.price_five);
            this.f4319I = (LinearLayout) findViewById(R.id.price_six);
            this.f4396r = (ImageView) findViewById(R.id.bar_gad_one);
            this.f4397s = (ImageView) findViewById(R.id.bar_gad_two);
            this.f4398t = (ImageView) findViewById(R.id.bar_gad_three);
            this.f4399u = (ImageView) findViewById(R.id.bar_gad_fourht);
            this.f4400v = (ImageView) findViewById(R.id.bar_gad_five);
            this.f4401w = (ImageView) findViewById(R.id.bar_gad_six);
            this.f4395q.add(Integer.valueOf((int) R.drawable.shely));
            this.f4395q.add(Integer.valueOf((int) R.drawable.nita));
            this.f4395q.add(Integer.valueOf((int) R.drawable.colt));
            this.f4395q.add(Integer.valueOf((int) R.drawable.bull));
            this.f4395q.add(Integer.valueOf((int) R.drawable.jesie));
            this.f4395q.add(Integer.valueOf((int) R.drawable.brock));
            this.f4395q.add(Integer.valueOf((int) R.drawable.dinamike));
            this.f4395q.add(Integer.valueOf((int) R.drawable.emz));
            this.f4395q.add(Integer.valueOf((int) R.drawable.bo));
            this.f4395q.add(Integer.valueOf((int) R.drawable.bit));
            this.f4395q.add(Integer.valueOf((int) R.drawable.tick));
            this.f4395q.add(Integer.valueOf((int) R.drawable.el_primo));
            this.f4395q.add(Integer.valueOf((int) R.drawable.barley));
            this.f4395q.add(Integer.valueOf((int) R.drawable.poco));
            this.f4395q.add(Integer.valueOf((int) R.drawable.rosa));
            this.f4395q.add(Integer.valueOf((int) R.drawable.ricoshet));
            this.f4395q.add(Integer.valueOf((int) R.drawable.daril));
            this.f4395q.add(Integer.valueOf((int) R.drawable.penny));
            this.f4395q.add(Integer.valueOf((int) R.drawable.carl));
            this.f4395q.add(Integer.valueOf((int) R.drawable.jacky));
            this.f4395q.add(Integer.valueOf((int) R.drawable.bibi));
            this.f4395q.add(Integer.valueOf((int) R.drawable.bea));
            this.f4395q.add(Integer.valueOf((int) R.drawable.frank));
            this.f4395q.add(Integer.valueOf((int) R.drawable.piper));
            this.f4395q.add(Integer.valueOf((int) R.drawable.pam));
            this.f4395q.add(Integer.valueOf((int) R.drawable.nani));
            this.f4395q.add(Integer.valueOf((int) R.drawable.max));
            this.f4395q.add(Integer.valueOf((int) R.drawable.mortis));
            this.f4395q.add(Integer.valueOf((int) R.drawable.mr_p));
            this.f4395q.add(Integer.valueOf((int) R.drawable.sprout));
            this.f4395q.add(Integer.valueOf((int) R.drawable.tara));
            this.f4395q.add(Integer.valueOf((int) R.drawable.gene));
            this.f4395q.add(Integer.valueOf((int) R.drawable.spike));
            this.f4395q.add(Integer.valueOf((int) R.drawable.crow));
            this.f4395q.add(Integer.valueOf((int) R.drawable.leon));
            this.f4395q.add(Integer.valueOf((int) R.drawable.sandy));
            this.f4395q.add(Integer.valueOf((int) R.drawable.gale));
            m3748j();
            if (f4310l != 0) {
                this.f4344aH.setBackground(getResources().getDrawable(f4310l));
                this.f4344aH.setTag(Integer.valueOf(f4310l));
            }
            this.f4350aN = (RelativeLayout) findViewById(R.id.gadget_lay_one);
            this.f4351aO = (RelativeLayout) findViewById(R.id.gadget_lay_two);
            this.f4352aP = (RelativeLayout) findViewById(R.id.gadget_lay_three);
            this.f4353aQ = (RelativeLayout) findViewById(R.id.gadget_lay_fourt);
            this.f4354aR = (RelativeLayout) findViewById(R.id.gadget_lay_five);
            this.f4355aS = (RelativeLayout) findViewById(R.id.gadget_lay_six);
            this.f4350aN.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C109126 */

                public final void onClick(View view) {
                    Shop.this.f4350aN.startAnimation(Shop.this.f4332V);
                }
            });
            this.f4351aO.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C109227 */

                public final void onClick(View view) {
                    Shop.this.f4351aO.startAnimation(Shop.this.f4332V);
                }
            });
            this.f4352aP.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C109328 */

                public final void onClick(View view) {
                    Shop.this.f4352aP.startAnimation(Shop.this.f4332V);
                }
            });
            this.f4353aQ.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C109429 */

                public final void onClick(View view) {
                    Shop.this.f4353aQ.startAnimation(Shop.this.f4332V);
                }
            });
            this.f4354aR.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C109630 */

                public final void onClick(View view) {
                    Shop.this.f4354aR.startAnimation(Shop.this.f4332V);
                }
            });
            this.f4355aS.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C109731 */

                public final void onClick(View view) {
                    Shop.this.f4355aS.startAnimation(Shop.this.f4332V);
                }
            });
        }
        this.f4391m = new ArrayList<>();
        this.f4392n = (TextView) findViewById(R.id.skinstitle);
        this.f4391m.add((TextView) findViewById(R.id.gadget_title));
        this.f4391m.add((TextView) findViewById(R.id.titleg1));
        this.f4391m.add((TextView) findViewById(R.id.titleg2));
        this.f4391m.add((TextView) findViewById(R.id.titleg3));
        this.f4391m.add((TextView) findViewById(R.id.titleg4));
        this.f4391m.add((TextView) findViewById(R.id.titleg5));
        this.f4391m.add((TextView) findViewById(R.id.titleg6));
        m3747i();
        this.f4394p = (RelativeLayout) findViewById(R.id.gadget_main_lay);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (((double) (memoryInfo.totalMem / 1048576)) <= 2500.0d) {
            this.f4394p = (RelativeLayout) findViewById(R.id.gadget_main_lay);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0, 0.0f);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            this.f4394p.setLayoutParams(layoutParams);
            this.f4394p.setVisibility(4);
        }
        if (!MainActivity.f4145as) {
            this.f4344aH.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C10953 */

                public final void onClick(View view) {
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(Shop.this, (int) R.raw.menu_click).start();
                    }
                    Shop shop = Shop.this;
                    shop.mo3651a(shop.f4344aH, Shop.this.f4396r, Shop.this.f4402x, Shop.this.f4314D, Shop.this.f4350aN);
                }
            });
            this.f4345aI.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C10984 */

                public final void onClick(View view) {
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(Shop.this, (int) R.raw.menu_click).start();
                    }
                    Shop shop = Shop.this;
                    shop.mo3651a(shop.f4345aI, Shop.this.f4397s, Shop.this.f4403y, Shop.this.f4315E, Shop.this.f4351aO);
                }
            });
            this.f4346aJ.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C10995 */

                public final void onClick(View view) {
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(Shop.this, (int) R.raw.menu_click).start();
                    }
                    Shop shop = Shop.this;
                    shop.mo3651a(shop.f4346aJ, Shop.this.f4398t, Shop.this.f4404z, Shop.this.f4316F, Shop.this.f4352aP);
                }
            });
            this.f4347aK.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C11006 */

                public final void onClick(View view) {
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(Shop.this, (int) R.raw.menu_click).start();
                    }
                    Shop shop = Shop.this;
                    shop.mo3651a(shop.f4347aK, Shop.this.f4399u, Shop.this.f4311A, Shop.this.f4317G, Shop.this.f4353aQ);
                }
            });
            this.f4348aL.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C11017 */

                public final void onClick(View view) {
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(Shop.this, (int) R.raw.menu_click).start();
                    }
                    Shop shop = Shop.this;
                    shop.mo3651a(shop.f4348aL, Shop.this.f4400v, Shop.this.f4312B, Shop.this.f4318H, Shop.this.f4354aR);
                }
            });
            this.f4349aM.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C11028 */

                public final void onClick(View view) {
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(Shop.this, (int) R.raw.menu_click).start();
                    }
                    Shop shop = Shop.this;
                    shop.mo3651a(shop.f4349aM, Shop.this.f4401w, Shop.this.f4313C, Shop.this.f4319I, Shop.this.f4355aS);
                }
            });
        }
        this.f4387bb = (HorizontalScrollView) findViewById(R.id.scrollView);
        this.f4336Z.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C11039 */

            public final void onClick(View view) {
                Shop.this.f4388bc.loadAd(new AdRequest.Builder().build());
                if (Shop.this.f4388bc.isLoaded()) {
                    Shop.this.f4388bc.show();
                    Shop.this.mo3655h();
                    return;
                }
                if (MainActivity.m3726c("language") == 0) {
                    Shop shop = Shop.this;
                    shop.mo3652a(shop.f4386ba, "TRY AGAIN");
                }
                if (MainActivity.m3726c("language") == 1) {
                    Shop shop2 = Shop.this;
                    shop2.mo3652a(shop2.f4386ba, "СПРОБУЙ ЗНОВУ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    Shop shop3 = Shop.this;
                    shop3.mo3652a(shop3.f4386ba, "ПОВТОРИТЕ ПОПЫТКУ");
                }
            }
        });
        this.f4363aa.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C107410 */

            public final void onClick(View view) {
                int c = MainActivity.m3726c("gems") - 40;
                if (c >= 0) {
                    Shop.this.mo3655h();
                    MainActivity.m3720a(c, "gems");
                    Shop.this.f4371al.setText(String.valueOf(c));
                    return;
                }
                if (MainActivity.m3726c("language") == 0) {
                    Shop shop = Shop.this;
                    shop.mo3652a(shop.f4386ba, "You don’t have enough gems");
                }
                if (MainActivity.m3726c("language") == 1) {
                    Shop shop2 = Shop.this;
                    shop2.mo3652a(shop2.f4386ba, "Тобі не вистарчає гемів");
                }
                if (MainActivity.m3726c("language") == 2) {
                    Shop shop3 = Shop.this;
                    shop3.mo3652a(shop3.f4386ba, "Тебе не хватает гемов");
                }
            }
        });
        this.f4337aA = (GifImageView) findViewById(R.id.fone_gif);
        this.f4338aB = (ImageView) findViewById(R.id.scells);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo2);
        if (((double) (memoryInfo2.totalMem / 1048576)) <= 2500.0d) {
            this.f4337aA.setVisibility(4);
            this.f4338aB.setVisibility(0);
        } else {
            this.f4337aA.setBackgroundResource(R.drawable.ideal_back_fourth);
        }
        this.f4339aC = (TextView) findViewById(R.id.title);
        this.f4343aG = (LinearLayout) findViewById(R.id.bonus_lang);
        this.f4340aD = (TextView) findViewById(R.id.video_text);
        this.f4341aE = (TextView) findViewById(R.id.gems_text);
        this.f4342aF = (TextView) findViewById(R.id.ticket_text);
        if (MainActivity.m3726c("language") == 1) {
            this.f4339aC.setText("Магазин ");
            if (!MainActivity.f4145as) {
                this.f4343aG.setBackground(getResources().getDrawable(R.drawable.bonus_three_top_ua));
            }
            this.f4340aD.setText("ДОДАТКОВІ\nБОНУСИ");
            this.f4340aD.setTextSize(12.0f);
            this.f4341aE.setText("КРИСТАЛИ");
            this.f4342aF.setText("КВИТКИ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4339aC.setText("Магазин ");
            if (!MainActivity.f4145as) {
                this.f4343aG.setBackground(getResources().getDrawable(R.drawable.bonus_three_top_ru));
            }
            this.f4340aD.setText("ДОПОЛНИТЕЛЬНЫЕ\nБОНУСЫ");
            this.f4340aD.setTextSize(10.0f);
            this.f4341aE.setText("КРИСТАЛЛЫ");
            this.f4342aF.setText("БИЛЕТЫ");
        }
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f4385az = "";
        this.f4373an = (TextView) findViewById(R.id.star);
        this.f4389j = (ImageButton) findViewById(R.id.back);
        this.f4390k = (ImageButton) findViewById(R.id.home);
        this.f4374ao = (Button) findViewById(R.id.gems_one);
        this.f4375ap = (Button) findViewById(R.id.gems_two);
        this.f4376aq = (Button) findViewById(R.id.gems_three);
        this.f4377ar = (Button) findViewById(R.id.gems_four);
        this.f4378as = (Button) findViewById(R.id.gems_five);
        this.f4379at = (Button) findViewById(R.id.gems_six);
        this.f4372am = (TextView) findViewById(R.id.ticket);
        TextView textView = this.f4372am;
        StringBuilder sb = new StringBuilder();
        sb.append(MainActivity.m3726c("ticket"));
        textView.setText(sb.toString());
        TextView textView2 = this.f4373an;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MainActivity.m3726c("star"));
        textView2.setText(sb2.toString());
        this.f4382aw = (Button) findViewById(R.id.ticket_one);
        this.f4383ax = (Button) findViewById(R.id.ticket_two);
        this.f4384ay = (Button) findViewById(R.id.ticket_three);
        this.f4382aw.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C107511 */

            public final void onClick(View view) {
                Shop.this.mo3654b(30, 6);
            }
        });
        this.f4383ax.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C107713 */

            public final void onClick(View view) {
                Shop.this.mo3654b(90, 20);
            }
        });
        this.f4384ay.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C107814 */

            public final void onClick(View view) {
                Shop.this.mo3654b(240, 60);
            }
        });
        this.f4374ao.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C107915 */

            public final void onClick(View view) {
                Shop.this.mo3649a(390, 30);
            }
        });
        this.f4375ap.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108016 */

            public final void onClick(View view) {
                Shop.this.mo3649a(990, 80);
            }
        });
        this.f4376aq.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108117 */

            public final void onClick(View view) {
                Shop.this.mo3649a(1990, 170);
            }
        });
        this.f4377ar.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108218 */

            public final void onClick(View view) {
                Shop.this.mo3649a(3990, 360);
            }
        });
        this.f4378as.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108319 */

            public final void onClick(View view) {
                Shop.this.mo3649a(9990, 950);
            }
        });
        this.f4379at.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108520 */

            public final void onClick(View view) {
                Shop.this.mo3649a(19990, 2000);
            }
        });
        this.f4380au = (Button) findViewById(R.id.advert_money);
        this.f4381av = (Button) findViewById(R.id.advert_gems);
        this.f4380au.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108621 */

            public final void onClick(View view) {
                Shop shop = Shop.this;
                shop.f4385az = "m";
                Shop.m3745a(shop, "mney");
            }
        });
        this.f4381av.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108722 */

            public final void onClick(View view) {
                Shop shop = Shop.this;
                shop.f4385az = "g";
                Shop.m3745a(shop, "gms");
            }
        });
        MobileAds.initialize(this, "ca-app-pub-5415344071963463~7794037101");
        this.f4388bc = new InterstitialAd(this);
        this.f4388bc.setAdUnitId("ca-app-pub-5415344071963463/8083673530");
        this.f4390k.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C108924 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(Shop.this, (int) R.raw.menu_cancel).start();
                }
                MainActivity.f4132W = true;
                Shop.this.finish();
            }
        });
        this.f4389j.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Shop.C109025 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(Shop.this, (int) R.raw.menu_cancel).start();
                }
                MainActivity.f4132W = true;
                Shop.this.finish();
            }
        });
        this.f4370ak = (TextView) findViewById(R.id.coins);
        this.f4371al = (TextView) findViewById(R.id.gems);
        MainActivity.m3729d(this.f4371al, "gems");
        MainActivity.m3729d(this.f4370ak, "money");
    }

    @Override // androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onDestroy() {
        super.onDestroy();
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
