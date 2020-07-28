package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
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
/*import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;*/
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import java.util.ArrayList;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

@SuppressWarnings("ALL")
public class ShopSlab extends AppCompatActivity implements RewardedVideoAdListener {

    /* renamed from: S */
    public static boolean f4437S;

    /* renamed from: T */
    public static String f4438T;

    /* renamed from: U */
    public static int f4439U;

    /* renamed from: l */
    static int f4440l;

    /* renamed from: A */
    TextView f4441A;

    /* renamed from: B */
    TextView f4442B;

    /* renamed from: C */
    TextView f4443C;

    /* renamed from: D */
    LinearLayout f4444D;

    /* renamed from: E */
    LinearLayout f4445E;

    /* renamed from: F */
    LinearLayout f4446F;

    /* renamed from: G */
    LinearLayout f4447G;

    /* renamed from: H */
    LinearLayout f4448H;

    /* renamed from: I */
    LinearLayout f4449I;

    /* renamed from: J */
    TextView f4450J;

    /* renamed from: K */
    ImageView f4451K;

    /* renamed from: L */
    ImageView f4452L;

    /* renamed from: M */
    RelativeLayout f4453M;

    /* renamed from: N */
    Animation f4454N;

    /* renamed from: O */
    ImageView f4455O;

    /* renamed from: P */
    Button f4456P;

    /* renamed from: Q */
    Button f4457Q;

    /* renamed from: R */
    ArrayList<Integer> f4458R;

    /* renamed from: V */
    ImageView f4459V;

    /* renamed from: W */
    ArrayList<C1133d> f4460W = new ArrayList<>();

    /* renamed from: X */
    ArrayList<C1133d> f4461X = new ArrayList<>();

    /* renamed from: Y */
    TextView f4462Y;

    /* renamed from: Z */
    TextView f4463Z;

    /* renamed from: aA */
    RelativeLayout f4464aA;

    /* renamed from: aB */
    ImageView f4465aB;

    /* renamed from: aC */
    ImageView f4466aC;

    /* renamed from: aD */
    Animation f4467aD;

    /* renamed from: aE */
    TextView f4468aE;

    /* renamed from: aF */
    HorizontalScrollView f4469aF;
    /* access modifiers changed from: private */

    /* renamed from: aG */
    public InterstitialAd f4470aG;

    /* renamed from: aa */
    TextView f4471aa;

    /* renamed from: ab */
    TextView f4472ab;

    /* renamed from: ac */
    Button f4473ac;

    /* renamed from: ad */
    Button f4474ad;

    /* renamed from: ae */
    Button f4475ae;

    /* renamed from: af */
    Button f4476af;

    /* renamed from: ag */
    Button f4477ag;

    /* renamed from: ah */
    Button f4478ah;

    /* renamed from: ai */
    Button f4479ai;

    /* renamed from: aj */
    Button f4480aj;

    /* renamed from: ak */
    Button f4481ak;

    /* renamed from: al */
    Button f4482al;

    /* renamed from: am */
    Button f4483am;

    /* renamed from: an */
    Button f4484an;

    /* renamed from: ao */
    Button f4485ao;

    /* renamed from: ap */
    String f4486ap = "";

    /* renamed from: aq */
    GifImageView f4487aq;

    /* renamed from: ar */
    ImageView f4488ar;

    /* renamed from: as */
    TextView f4489as;

    /* renamed from: at */
    TextView f4490at;

    /* renamed from: au */
    TextView f4491au;

    /* renamed from: av */
    TextView f4492av;

    /* renamed from: aw */
    LinearLayout f4493aw;

    /* renamed from: ax */
    ImageView f4494ax;

    /* renamed from: ay */
    ImageView f4495ay;

    /* renamed from: az */
    RelativeLayout f4496az;

    /* renamed from: j */
    ImageButton f4497j;

    /* renamed from: k */
    ImageButton f4498k;

    /* renamed from: m */
    ArrayList<TextView> f4499m;

    /* renamed from: n */
    TextView f4500n;

    /* renamed from: o */
    TextView f4501o;

    /* renamed from: p */
    RelativeLayout f4502p;

    /* renamed from: q */
    ArrayList<Integer> f4503q;

    /* renamed from: r */
    ImageView f4504r;

    /* renamed from: s */
    ImageView f4505s;

    /* renamed from: t */
    ImageView f4506t;

    /* renamed from: u */
    ImageView f4507u;

    /* renamed from: v */
    ImageView f4508v;

    /* renamed from: w */
    ImageView f4509w;

    /* renamed from: x */
    TextView f4510x;

    /* renamed from: y */
    TextView f4511y;

    /* renamed from: z */
    TextView f4512z;

    /* renamed from: a */
    private void m3766a(ImageView imageView, ImageView imageView2) {
        try {
            if (MainActivity.m3726c("skin" + this.f4458R.get(0)) != 0) {
                imageView2.setBackground(getResources().getDrawable(R.drawable.done_fone));
                imageView.setVisibility(0);
                return;
            }
            imageView.setVisibility(4);
            imageView2.setBackground(getResources().getDrawable(R.drawable.shin_background));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m3767a(ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, ImageView imageView3) {
        int i;
        Resources resources;
        int parseInt = Integer.parseInt(imageView.getTag().toString());
        int i2 = 0;
        while (true) {
            if (i2 >= this.f4503q.size()) {
                i2 = 0;
                break;
            } else if (this.f4503q.get(i2).intValue() == parseInt) {
                break;
            } else {
                i2++;
            }
        }
        if (MainActivity.m3726c("l".concat(String.valueOf(i2))) < 7) {
            imageView.setAlpha(0.8f);
            resources = getResources();
            i = R.drawable.locked_gadget;
        } else {
            imageView.setAlpha(1.0f);
            resources = getResources();
            i = R.drawable.gadget;
        }
        imageView3.setBackground(resources.getDrawable(i));
        if (MainActivity.m3726c("gadget" + this.f4503q.indexOf(Integer.valueOf(Integer.parseInt(imageView.getTag().toString())))) == 0) {
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
    static void m3768a(ShopSlab shopSlab, String str) {
        TextView textView;
        String str2;
        MediaPlayer create;
        Context applicationContext;
        int i;
        if (MainActivity.m3726c(str) == 0) {
            shopSlab.f4470aG.loadAd(new AdRequest.Builder().build());
            if (shopSlab.f4470aG.isLoaded()) {
                shopSlab.f4470aG.show();
                MainActivity.m3720a(1, str);
                if (str.equals("mney")) {
                    int c = MainActivity.m3726c("money") + 50;
                    MainActivity.m3720a(c, "money");
                    shopSlab.f4462Y.setText(String.valueOf(c));
                    applicationContext = shopSlab.getApplicationContext();
                    i = R.raw.coins;
                } else {
                    int c2 = MainActivity.m3726c("gems") + 50;
                    MainActivity.m3720a(c2, "gems");
                    shopSlab.f4463Z.setText(String.valueOf(c2));
                    applicationContext = shopSlab.getApplicationContext();
                    i = R.raw.gems;
                }
                create = MediaPlayer.create(applicationContext, i);
            } else {
                if (MainActivity.m3726c("language") == 0) {
                    shopSlab.mo3692a(shopSlab.f4468aE, "TRY AGAIN");
                }
                if (MainActivity.m3726c("language") == 1) {
                    shopSlab.mo3692a(shopSlab.f4468aE, "СПРОБУЙ ЗНОВУ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    textView = shopSlab.f4468aE;
                    str2 = "ПОВТОРИТЕ ПОПЫТКУ";
                    shopSlab.mo3692a(textView, str2);
                }
                create = MediaPlayer.create(shopSlab.getApplicationContext(), (int) R.raw.error);
            }
        } else {
            Toast.makeText(shopSlab, "You already watch video", 0).show();
            if (MainActivity.m3726c("language") == 0) {
                shopSlab.mo3692a(shopSlab.f4468aE, "You already watch video");
            }
            if (MainActivity.m3726c("language") == 1) {
                shopSlab.mo3692a(shopSlab.f4468aE, "Ти вже дивися відео");
            }
            if (MainActivity.m3726c("language") == 2) {
                textView = shopSlab.f4468aE;
                str2 = "Ты уже смотрел видео";
                shopSlab.mo3692a(textView, str2);
            }
            create = MediaPlayer.create(shopSlab.getApplicationContext(), (int) R.raw.error);
        }
        create.start();
    }

    /* renamed from: i */
    private void m3769i() {
        //ToDo: initialized...
        String str = null;
        TextView textView = null;

        for (int i = 0; i < this.f4499m.size(); i++) {
            if (i == 0) {
                if (MainActivity.m3726c("language") == 0) {
                    this.f4499m.get(i).setText("GADGETS");
                }
                if (MainActivity.m3726c("language") == 1) {
                    this.f4499m.get(i).setText("ГАДЖЕТИ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    textView = this.f4499m.get(i);
                    str = "гаджеты";
                }
            } else {
                if (MainActivity.m3726c("language") == 0) {
                    this.f4499m.get(i).setText("GADGET");
                }
                if (MainActivity.m3726c("language") == 1) {
                    this.f4499m.get(i).setText("ГАДЖЕТ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    textView = this.f4499m.get(i);
                    str = "ГАДЖЕТ";
                }
            }
            textView.setText(str);
        }
        if (MainActivity.m3726c("language") == 0) {
            this.f4500n.setText("Skins");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f4500n.setText("Скіни");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4500n.setText("Скины");
        }
    }

    /* renamed from: j */
    private void m3770j() {
        Integer num;
        ImageView imageView;
        if (MainActivity.m3726c("gadget_1") == 0) {
            this.f4494ax.setBackground(getResources().getDrawable(R.drawable.shely));
            this.f4495ay.setBackground(getResources().getDrawable(R.drawable.rosa));
            this.f4494ax.setTag(Integer.valueOf((int) R.drawable.shely));
            imageView = this.f4495ay;
            num = Integer.valueOf((int) R.drawable.rosa);
        } else {
            this.f4494ax.setBackground(getResources().getDrawable(MainActivity.m3726c("gadget_1")));
            this.f4495ay.setBackground(getResources().getDrawable(MainActivity.m3726c("gadget_2")));
            this.f4494ax.setTag(Integer.valueOf(MainActivity.m3726c("gadget_1")));
            imageView = this.f4495ay;
            num = Integer.valueOf(MainActivity.m3726c("gadget_2"));
        }
        imageView.setTag(num);
        m3767a(this.f4494ax, this.f4504r, this.f4510x, this.f4444D, this.f4465aB);
        m3767a(this.f4495ay, this.f4505s, this.f4511y, this.f4445E, this.f4466aC);
    }

    /* renamed from: k */
    private void m3771k() {
        this.f4451K.setImageResource(this.f4458R.get(0).intValue());
    }

    /* renamed from: l */
    private void m3772l() {
        this.f4458R = new ArrayList<>();
        this.f4456P = (Button) findViewById(R.id.video_update);
        this.f4457Q = (Button) findViewById(R.id.gems_update);
        this.f4501o = (TextView) findViewById(R.id.shopupdate);
        if (MainActivity.m3726c("language") == 0) {
            this.f4501o.setText("UPDATE SHOP:");
            this.f4456P.setText("VIDEO");
            this.f4457Q.setText("40 GEMS");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f4501o.setText("ОНОВИТИ МАГАЗИН:");
            this.f4456P.setText("ВІДЕО");
            this.f4457Q.setText("40 ГЕМІВ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4501o.setText("ОБНОВИТЬ МАГАЗИН:");
            this.f4456P.setText("ВИДЕО");
            this.f4457Q.setText("40 ГЕМОВ");
        }
        this.f4452L = (ImageView) findViewById(R.id.fone_first);
        this.f4450J = (TextView) findViewById(R.id.firts_name);
        this.f4451K = (ImageView) findViewById(R.id.first_skin);
        this.f4453M = (RelativeLayout) findViewById(R.id.first_skin_lay);
        this.f4455O = (ImageView) findViewById(R.id.firts_done);
        this.f4454N = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        this.f4458R = new ArrayList<>();
        this.f4459V = (ImageView) findViewById(R.id.new_icon);
        if (!MainActivity.m3724b("skin_name").equals("")) {
            int i = 0;
            while (true) {
                if (i >= this.f4460W.size()) {
                    break;
                } else if (this.f4460W.get(i).f4557a.equals(MainActivity.m3724b("skin_name"))) {
                    MainActivity.m3720a(this.f4460W.get(i).f4558b.get(1).intValue(), "first_skin");
                    MainActivity.m3722a(MainActivity.m3724b("skin_name"), "first_skin_name");
                    break;
                } else {
                    i++;
                }
            }
            this.f4459V.setVisibility(0);
        } else {
            this.f4459V.setVisibility(4);
        }
        if (MainActivity.m3726c("first_skin") == 0) {
            this.f4458R.add(Integer.valueOf((int) R.drawable.shelly_skin));
            this.f4450J.setText("Shelly");
        } else {
            this.f4458R.add(Integer.valueOf(MainActivity.m3726c("first_skin")));
            MainActivity.m3728c(this.f4450J, "first_skin_name");
        }
        if (MainActivity.m3726c("first_skin") != 0 && MainActivity.m3726c("second_skin") == 0) {
            this.f4458R = new ArrayList<>();
            this.f4458R.add(Integer.valueOf(MainActivity.m3726c("first_skin")));
            MainActivity.m3728c(this.f4450J, "first_skin_name");
        }
        m3771k();
        if (f4437S) {
            this.f4450J.setText(f4438T);
            this.f4451K.setImageResource(f4439U);
            this.f4458R.remove(0);
            this.f4458R.add(0, Integer.valueOf(f4439U));
        }
        this.f4453M.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11041 */

            public final void onClick(View view) {
                //ToDo: Initialized...
                String str = null;
                TextView textView = null;
                ShopSlab.this.f4459V.setVisibility(4);
                MainActivity.f4140aK.setVisibility(4);
                MainActivity.f4130S.setBackground(ShopSlab.this.getResources().getDrawable(R.drawable.shop));
                ShopSlab.this.f4453M.startAnimation(ShopSlab.this.f4454N);
                ShopSlab shopSlab = ShopSlab.this;
                ImageView imageView = shopSlab.f4455O;
                ImageView imageView2 = ShopSlab.this.f4452L;
                int parseInt = Integer.parseInt(shopSlab.f4463Z.getText().toString());
                if (imageView.getVisibility() == 4) {
                    int i = parseInt - 80;
                    if (i >= 0) {
                        MainActivity.m3720a(1, "skin" + shopSlab.f4458R.get(0));
                        MainActivity.m3720a(i, "gems");
                        imageView2.setBackground(shopSlab.getResources().getDrawable(R.drawable.done_fone));
                        imageView.setVisibility(0);
                        shopSlab.f4463Z.setText(String.valueOf(i));
                    } else {
                        if (MainActivity.m3726c("language") == 0) {
                            shopSlab.mo3692a(shopSlab.f4468aE, "You don’t have enough gems");
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            shopSlab.mo3692a(shopSlab.f4468aE, "Тобі не вистарчає кристалів");
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            textView = shopSlab.f4468aE;
                            str = "Тебе не хватает гемов";
                        }
                    }
                    MainActivity.m3722a("", "skin_name");
                }
                if (MainActivity.m3726c("language") == 0) {
                    shopSlab.mo3692a(shopSlab.f4468aE, "You already buy it");
                }
                if (MainActivity.m3726c("language") == 1) {
                    shopSlab.mo3692a(shopSlab.f4468aE, "Ти вже купив цей скін");
                }
                if (MainActivity.m3726c("language") == 2) {
                    textView = shopSlab.f4468aE;
                    str = "Ты уже купил этот скин";
                }
                MainActivity.m3722a("", "skin_name");
                shopSlab.mo3692a(textView, str);
                MainActivity.m3722a("", "skin_name");
            }
        });
        m3766a(this.f4455O, this.f4452L);
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
    public final void mo3690a(int i, int i2) {
        int parseInt = Integer.parseInt(this.f4462Y.getText().toString()) - i;
        if (parseInt >= 0) {
            MediaPlayer.create(getApplicationContext(), (int) R.raw.gems).start();
            this.f4462Y.setText(String.valueOf(parseInt));
            MainActivity.m3720a(MainActivity.m3726c("gems") + i2, "gems");
            MainActivity.m3720a(parseInt, "money");
            MainActivity.m3729d(this.f4463Z, "gems");
            return;
        }
        MediaPlayer.create(getApplicationContext(), (int) R.raw.error).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3691a(ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, RelativeLayout relativeLayout) {
        relativeLayout.startAnimation(this.f4454N);
        int parseInt = Integer.parseInt(imageView.getTag().toString());
        int i = 0;
        while (true) {
            if (i >= this.f4503q.size()) {
                i = 0;
                break;
            } else if (this.f4503q.get(i).intValue() == parseInt) {
                break;
            } else {
                i++;
            }
        }
        if (MainActivity.m3726c("l".concat(String.valueOf(i))) >= 7) {
            int parseInt2 = Integer.parseInt(this.f4462Y.getText().toString());
            if (MainActivity.m3726c("gadget" + this.f4503q.indexOf(Integer.valueOf(Integer.parseInt(imageView.getTag().toString())))) == 0) {
                int i2 = parseInt2 - 1000;
                if (i2 >= 0) {
                    MainActivity.m3720a(i2, "money");
                    this.f4462Y.setText(String.valueOf(i2));
                    MainActivity.m3720a(1, "gadget" + this.f4503q.indexOf(Integer.valueOf(Integer.parseInt(imageView.getTag().toString()))));
                    MainActivity.m3720a(1, "shop_gadget" + this.f4503q.get(i));
                    imageView2.setBackground(getResources().getDrawable(R.drawable.gadget_shop_buy));
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
                    mo3692a(this.f4468aE, "You don’t have enough money");
                }
                if (MainActivity.m3726c("language") == 1) {
                    mo3692a(this.f4468aE, "Тобі не вистарчає монет");
                }
                if (MainActivity.m3726c("language") == 2) {
                    mo3692a(this.f4468aE, "Тебе не хватает монет");
                    return;
                }
                return;
            }
            if (MainActivity.m3726c("language") == 0) {
                mo3692a(this.f4468aE, "You already buy this gadget");
            }
            if (MainActivity.m3726c("language") == 1) {
                mo3692a(this.f4468aE, "Ти вже купив цей гаджет");
            }
            if (MainActivity.m3726c("language") == 2) {
                mo3692a(this.f4468aE, "Ты уже купил этот гаджет");
                return;
            }
            return;
        }
        if (MainActivity.m3726c("language") == 0) {
            mo3692a(this.f4468aE, "Upgrade this brawler to 7 lvl");
        }
        if (MainActivity.m3726c("language") == 1) {
            mo3692a(this.f4468aE, "Покращи цього бійця до 7 рівня");
        }
        if (MainActivity.m3726c("language") == 2) {
            mo3692a(this.f4468aE, "Улучши этого бойца до 7 уровня");
        }
    }

    /* renamed from: a */
    public final void mo3692a(final TextView textView, String str) {
        textView.setVisibility(0);
        textView.setText(str);
        textView.startAnimation(this.f4467aD);
        this.f4467aD.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111318 */

            public final void onAnimationEnd(Animation animation) {
                textView.setVisibility(4);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
    }
//ToDo: Rewarded Video ad ....
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
        if (this.f4486ap.equals("m")) {
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
    public final void mo3693b(int i, int i2) {
        int parseInt = Integer.parseInt(this.f4463Z.getText().toString()) - i;
        if (parseInt >= 0) {
            MediaPlayer.create(getApplicationContext(), (int) R.raw.ticket).start();
            this.f4463Z.setText(String.valueOf(parseInt));
            MainActivity.m3720a(MainActivity.m3726c("ticket") + i2, "ticket");
            MainActivity.m3720a(parseInt, "gems");
            MainActivity.m3729d(this.f4471aa, "ticket");
            return;
        }
        MediaPlayer.create(getApplicationContext(), (int) R.raw.error).start();
    }

    /* renamed from: c */
    public final void mo3694c(int i, int i2) {
        int parseInt = Integer.parseInt(this.f4471aa.getText().toString()) - i;
        if (parseInt >= 0) {
            MediaPlayer.create(getApplicationContext(), (int) R.raw.ticket).start();
            this.f4471aa.setText(String.valueOf(parseInt));
            MainActivity.m3720a(MainActivity.m3726c("star") + i2, "star");
            MainActivity.m3720a(parseInt, "ticket");
            MainActivity.m3729d(this.f4472ab, "star");
            return;
        }
        MediaPlayer.create(getApplicationContext(), (int) R.raw.error).start();
    }

    /*@Override // androidx.appcompat.app.AppCompatActivity, com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: e *//*
    public final void mo3390e() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.google.android.gms.ads.reward.RewardedVideoAdListener
    *//* renamed from: f *//*
    public final void mo3391f() {
    }*/

    /* renamed from: h */
    public final void mo3695h() {
        Random random = new Random();
        int nextInt = random.nextInt(this.f4503q.size());
        int nextInt2 = random.nextInt(this.f4503q.size());
        int nextInt3 = random.nextInt(this.f4503q.size());
        int nextInt4 = random.nextInt(this.f4503q.size());
        int nextInt5 = random.nextInt(this.f4503q.size());
        int nextInt6 = random.nextInt(this.f4503q.size());
        MainActivity.m3720a(this.f4503q.get(nextInt).intValue(), "gadget_1");
        MainActivity.m3720a(this.f4503q.get(nextInt2).intValue(), "gadget_2");
        MainActivity.m3720a(this.f4503q.get(nextInt3).intValue(), "gadget_3");
        MainActivity.m3720a(this.f4503q.get(nextInt4).intValue(), "gadget_4");
        MainActivity.m3720a(this.f4503q.get(nextInt5).intValue(), "gadget_5");
        MainActivity.m3720a(this.f4503q.get(nextInt6).intValue(), "gadget_6");
        m3770j();
        MainActivity.m3722a("", "skin_name");
        MainActivity.f4140aK.setVisibility(4);
        MainActivity.f4130S.setBackground(getResources().getDrawable(R.drawable.shop));
        this.f4459V.setVisibility(4);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            try {
                int nextInt7 = new Random().nextInt((this.f4461X.size() - 0) + 1) + 0;
                arrayList.add(this.f4460W.get(nextInt7));
                this.f4460W.remove(this.f4460W.get(nextInt7));
            } catch (Exception unused) {
                this.f4458R.add(Integer.valueOf((int) R.drawable.shelly_skin));
                this.f4450J.setText("Shelly");
            }
        }
        this.f4458R = new ArrayList<>();
        try {
            MainActivity.m3720a(((C1133d) arrayList.get(0)).f4558b.get(1).intValue(), "first_skin");
            MainActivity.m3722a(((C1133d) arrayList.get(0)).f4557a, "first_skin_name");
            this.f4458R.add(Integer.valueOf(MainActivity.m3726c("first_skin")));
            MainActivity.m3728c(this.f4450J, "first_skin_name");
            m3771k();
        } catch (Exception unused2) {
        }
        m3766a(this.f4455O, this.f4452L);
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_shop_slab);
        this.f4467aD = AnimationUtils.loadAnimation(this, R.anim.text);
        this.f4468aE = (TextView) findViewById(R.id.text_help);
        this.f4460W = new ArrayList<>();
        this.f4461X = new ArrayList<>();
        this.f4460W.add(new C1133d("Shelly"));
        this.f4460W.add(new C1133d(R.drawable.nita_f, R.drawable.nita_skin, "Nita"));
        this.f4460W.add(new C1133d(R.drawable.colt_f, R.drawable.colt_skin, "Colt"));
        this.f4460W.add(new C1133d(R.drawable.bull_f, R.drawable.bull_skin, "Bull"));
        this.f4460W.add(new C1133d(R.drawable.jessie_f, R.drawable.jessie_skin, "Jessie"));
        this.f4460W.add(new C1133d(R.drawable.brock_f, R.drawable.brock_skin, "Brock"));
        this.f4460W.add(new C1133d(R.drawable.dinamike_f, R.drawable.dinamike_skin, "Dinamike"));
        this.f4460W.add(new C1133d(R.drawable.emz_f, R.drawable.emz_skin, "Emz"));
        this.f4460W.add(new C1133d(R.drawable.bo_f, R.drawable.bo_skin, "Bo"));
        this.f4460W.add(new C1133d(R.drawable.bit_f, R.drawable.bit_skin, "8 Bit"));
        this.f4460W.add(new C1133d(R.drawable.tick_f, R.drawable.tick_f, "Tick"));
        this.f4460W.add(new C1133d(R.drawable.elprimo_f, R.drawable.elprimo_skin, "El Primo"));
        this.f4460W.add(new C1133d(R.drawable.barley_f, R.drawable.barley_skin, "Barley"));
        this.f4460W.add(new C1133d(R.drawable.poco_f, R.drawable.poco_skin, "Poco"));
        this.f4460W.add(new C1133d(R.drawable.rosa_f, R.drawable.rosa_f, "Rosa"));
        this.f4460W.add(new C1133d(R.drawable.riko_f, R.drawable.ricko_skin, "Rico"));
        this.f4460W.add(new C1133d(R.drawable.darryl_f, R.drawable.darryl_skin, "Darryl"));
        this.f4460W.add(new C1133d(R.drawable.penny_f, R.drawable.penny_skin, "Penny"));
        this.f4460W.add(new C1133d(R.drawable.carl_f, R.drawable.carl_skin, "Carl"));
        this.f4460W.add(new C1133d(R.drawable.jacky_f, R.drawable.jacky_f, "Jacky"));
        this.f4460W.add(new C1133d(R.drawable.bibi_f, R.drawable.bibi_skin, "Bibi"));
        this.f4460W.add(new C1133d(R.drawable.bea_f, R.drawable.bea_skin, "Bea"));
        this.f4460W.add(new C1133d(R.drawable.frank_f, R.drawable.frank_skin, "Frank"));
        this.f4460W.add(new C1133d(R.drawable.piper_f, R.drawable.piper_skin, "Piper"));
        this.f4460W.add(new C1133d(R.drawable.pam_f, R.drawable.pam_f, "Pam"));
        this.f4460W.add(new C1133d(R.drawable.max_f, R.drawable.max_skin, "Max"));
        this.f4460W.add(new C1133d(R.drawable.mortis_f, R.drawable.mortis_skin, "Mortis"));
        this.f4460W.add(new C1133d(R.drawable.mr_p_f, R.drawable.mr_p_skin, "Mr P"));
        this.f4460W.add(new C1133d(R.drawable.tara_f, R.drawable.tara_skin, "Tara"));
        this.f4460W.add(new C1133d(R.drawable.gene_f, R.drawable.gene_f, "Gene"));
        this.f4460W.add(new C1133d(R.drawable.spike_f, R.drawable.spike_skin, "Spike"));
        this.f4460W.add(new C1133d(R.drawable.crow_f, R.drawable.crow_skin, "Crow"));
        this.f4460W.add(new C1133d(R.drawable.leon_f, R.drawable.leon_skin, "Leon"));
        this.f4460W.add(new C1133d(R.drawable.sandy_f, R.drawable.sandy_skin, "Sandy"));
        m3772l();
        this.f4494ax = (ImageView) findViewById(R.id.gadget_one);
        this.f4495ay = (ImageView) findViewById(R.id.gadget_two);
        this.f4465aB = (ImageView) findViewById(R.id.gadget_icon1);
        this.f4466aC = (ImageView) findViewById(R.id.gadget_icon2);
        this.f4503q = new ArrayList<>();
        this.f4510x = (TextView) findViewById(R.id.buyed_one);
        this.f4511y = (TextView) findViewById(R.id.buyed_two);
        this.f4512z = (TextView) findViewById(R.id.buyed_three);
        this.f4441A = (TextView) findViewById(R.id.buyed_fourth);
        this.f4442B = (TextView) findViewById(R.id.buyed_five);
        this.f4443C = (TextView) findViewById(R.id.buyed_six);
        this.f4444D = (LinearLayout) findViewById(R.id.price_one);
        this.f4445E = (LinearLayout) findViewById(R.id.price_two);
        this.f4446F = (LinearLayout) findViewById(R.id.price_three);
        this.f4447G = (LinearLayout) findViewById(R.id.price_fourth);
        this.f4448H = (LinearLayout) findViewById(R.id.price_five);
        this.f4449I = (LinearLayout) findViewById(R.id.price_six);
        this.f4504r = (ImageView) findViewById(R.id.bar_gad_one);
        this.f4505s = (ImageView) findViewById(R.id.bar_gad_two);
        this.f4506t = (ImageView) findViewById(R.id.bar_gad_three);
        this.f4507u = (ImageView) findViewById(R.id.bar_gad_fourht);
        this.f4508v = (ImageView) findViewById(R.id.bar_gad_five);
        this.f4509w = (ImageView) findViewById(R.id.bar_gad_six);
        this.f4503q.add(Integer.valueOf((int) R.drawable.shely));
        this.f4503q.add(Integer.valueOf((int) R.drawable.nita));
        this.f4503q.add(Integer.valueOf((int) R.drawable.colt));
        this.f4503q.add(Integer.valueOf((int) R.drawable.bull));
        this.f4503q.add(Integer.valueOf((int) R.drawable.jesie));
        this.f4503q.add(Integer.valueOf((int) R.drawable.brock));
        this.f4503q.add(Integer.valueOf((int) R.drawable.dinamike));
        this.f4503q.add(Integer.valueOf((int) R.drawable.emz));
        this.f4503q.add(Integer.valueOf((int) R.drawable.bo));
        this.f4503q.add(Integer.valueOf((int) R.drawable.bit));
        this.f4503q.add(Integer.valueOf((int) R.drawable.tick));
        this.f4503q.add(Integer.valueOf((int) R.drawable.el_primo));
        this.f4503q.add(Integer.valueOf((int) R.drawable.barley));
        this.f4503q.add(Integer.valueOf((int) R.drawable.poco));
        this.f4503q.add(Integer.valueOf((int) R.drawable.rosa));
        this.f4503q.add(Integer.valueOf((int) R.drawable.ricoshet));
        this.f4503q.add(Integer.valueOf((int) R.drawable.daril));
        this.f4503q.add(Integer.valueOf((int) R.drawable.penny));
        this.f4503q.add(Integer.valueOf((int) R.drawable.carl));
        this.f4503q.add(Integer.valueOf((int) R.drawable.jacky));
        this.f4503q.add(Integer.valueOf((int) R.drawable.bibi));
        this.f4503q.add(Integer.valueOf((int) R.drawable.bea));
        this.f4503q.add(Integer.valueOf((int) R.drawable.frank));
        this.f4503q.add(Integer.valueOf((int) R.drawable.piper));
        this.f4503q.add(Integer.valueOf((int) R.drawable.pam));
        this.f4503q.add(Integer.valueOf((int) R.drawable.max));
        this.f4503q.add(Integer.valueOf((int) R.drawable.mortis));
        this.f4503q.add(Integer.valueOf((int) R.drawable.mr_p));
        this.f4503q.add(Integer.valueOf((int) R.drawable.tara));
        this.f4503q.add(Integer.valueOf((int) R.drawable.gene));
        this.f4503q.add(Integer.valueOf((int) R.drawable.spike));
        this.f4503q.add(Integer.valueOf((int) R.drawable.crow));
        this.f4503q.add(Integer.valueOf((int) R.drawable.leon));
        this.f4503q.add(Integer.valueOf((int) R.drawable.sandy));
        m3770j();
        if (f4440l != 0) {
            this.f4494ax.setBackground(getResources().getDrawable(f4440l));
            this.f4494ax.setTag(Integer.valueOf(f4440l));
        }
        this.f4496az = (RelativeLayout) findViewById(R.id.gadget_lay_one);
        this.f4464aA = (RelativeLayout) findViewById(R.id.gadget_lay_two);
        this.f4496az.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C110712 */

            public final void onClick(View view) {
                ShopSlab.this.f4496az.startAnimation(ShopSlab.this.f4454N);
            }
        });
        this.f4464aA.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111217 */

            public final void onClick(View view) {
                ShopSlab.this.f4464aA.startAnimation(ShopSlab.this.f4454N);
            }
        });
        this.f4499m = new ArrayList<>();
        this.f4500n = (TextView) findViewById(R.id.skin_title);
        this.f4499m.add((TextView) findViewById(R.id.gadget_title));
        this.f4499m.add((TextView) findViewById(R.id.titleg1));
        this.f4499m.add((TextView) findViewById(R.id.titleg2));
        m3769i();
        this.f4502p = (RelativeLayout) findViewById(R.id.gadget_main_lay);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (((double) (memoryInfo.totalMem / 1048576)) < 2500.0d) {
            this.f4502p.setVisibility(4);
        }
        this.f4494ax.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111419 */

            public final void onClick(View view) {
                ShopSlab shopSlab = ShopSlab.this;
                shopSlab.mo3691a(shopSlab.f4494ax, ShopSlab.this.f4504r, ShopSlab.this.f4510x, ShopSlab.this.f4444D, ShopSlab.this.f4496az);
            }
        });
        this.f4495ay.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111620 */

            public final void onClick(View view) {
                ShopSlab shopSlab = ShopSlab.this;
                shopSlab.mo3691a(shopSlab.f4495ay, ShopSlab.this.f4505s, ShopSlab.this.f4511y, ShopSlab.this.f4445E, ShopSlab.this.f4464aA);
            }
        });
        this.f4469aF = (HorizontalScrollView) findViewById(R.id.scrollView);
        this.f4456P.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111721 */

            public final void onClick(View view) {
                ShopSlab.this.f4470aG.loadAd(new AdRequest.Builder().build());
                if (ShopSlab.this.f4470aG.isLoaded()) {
                    ShopSlab.this.f4470aG.show();
                    ShopSlab.this.mo3695h();
                    return;
                }
                if (MainActivity.m3726c("language") == 0) {
                    ShopSlab shopSlab = ShopSlab.this;
                    shopSlab.mo3692a(shopSlab.f4468aE, "TRY AGAIN");
                }
                if (MainActivity.m3726c("language") == 1) {
                    ShopSlab shopSlab2 = ShopSlab.this;
                    shopSlab2.mo3692a(shopSlab2.f4468aE, "СПРОБУЙ ЗНОВУ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    ShopSlab shopSlab3 = ShopSlab.this;
                    shopSlab3.mo3692a(shopSlab3.f4468aE, "ПОВТОРИТЕ ПОПЫТКУ");
                }
            }
        });
        this.f4457Q.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111822 */

            public final void onClick(View view) {
                int c = MainActivity.m3726c("gems") - 40;
                if (c >= 0) {
                    ShopSlab.this.mo3695h();
                    MainActivity.m3720a(c, "gems");
                    ShopSlab.this.f4463Z.setText(String.valueOf(c));
                    return;
                }
                if (MainActivity.m3726c("language") == 0) {
                    ShopSlab shopSlab = ShopSlab.this;
                    shopSlab.mo3692a(shopSlab.f4468aE, "You don’t have enough gems");
                }
                if (MainActivity.m3726c("language") == 1) {
                    ShopSlab shopSlab2 = ShopSlab.this;
                    shopSlab2.mo3692a(shopSlab2.f4468aE, "Тобі не вистарчає гемів");
                }
                if (MainActivity.m3726c("language") == 2) {
                    ShopSlab shopSlab3 = ShopSlab.this;
                    shopSlab3.mo3692a(shopSlab3.f4468aE, "Тебе не хватает гемов");
                }
            }
        });
        this.f4487aq = (GifImageView) findViewById(R.id.fone_gif);
        this.f4488ar = (ImageView) findViewById(R.id.scells);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo2);
        if (((double) (memoryInfo2.totalMem / 1048576)) < 2000.0d) {
            this.f4487aq.setVisibility(4);
            this.f4488ar.setVisibility(0);
        }
        this.f4489as = (TextView) findViewById(R.id.title);
        this.f4493aw = (LinearLayout) findViewById(R.id.bonus_lang);
        this.f4490at = (TextView) findViewById(R.id.video_text);
        this.f4491au = (TextView) findViewById(R.id.gems_text);
        this.f4492av = (TextView) findViewById(R.id.ticket_text);
        if (MainActivity.m3726c("language") == 1) {
            this.f4489as.setText("Магазин ");
            this.f4493aw.setBackground(getResources().getDrawable(R.drawable.bonus_three_top_ua));
            this.f4490at.setText("ДОДАТКОВІ\nБОНУСИ");
            this.f4490at.setTextSize(12.0f);
            this.f4491au.setText("КРИСТАЛИ");
            this.f4492av.setText("КВИТКИ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4489as.setText("Магазин ");
            this.f4493aw.setBackground(getResources().getDrawable(R.drawable.bonus_three_top_ru));
            this.f4490at.setText("ДОПОЛНИТЕЛЬНЫЕ\nБОНУСЫ");
            this.f4490at.setTextSize(10.0f);
            this.f4491au.setText("КРИСТАЛЛЫ");
            this.f4492av.setText("БИЛЕТЫ");
        }
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f4486ap = "";
        this.f4473ac = (Button) findViewById(R.id.star_one);
        this.f4474ad = (Button) findViewById(R.id.star_two);
        this.f4473ac.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111923 */

            public final void onClick(View view) {
                ShopSlab.this.mo3694c(30, 6);
            }
        });
        this.f4474ad.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11152 */

            public final void onClick(View view) {
                ShopSlab.this.mo3694c(90, 20);
            }
        });
        this.f4472ab = (TextView) findViewById(R.id.star);
        this.f4497j = (ImageButton) findViewById(R.id.back);
        this.f4498k = (ImageButton) findViewById(R.id.home);
        this.f4475ae = (Button) findViewById(R.id.gems_one);
        this.f4476af = (Button) findViewById(R.id.gems_two);
        this.f4477ag = (Button) findViewById(R.id.gems_three);
        this.f4478ah = (Button) findViewById(R.id.gems_four);
        this.f4479ai = (Button) findViewById(R.id.gems_five);
        this.f4480aj = (Button) findViewById(R.id.gems_six);
        this.f4471aa = (TextView) findViewById(R.id.ticket);
        TextView textView = this.f4471aa;
        StringBuilder sb = new StringBuilder();
        sb.append(MainActivity.m3726c("ticket"));
        textView.setText(sb.toString());
        TextView textView2 = this.f4472ab;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MainActivity.m3726c("star"));
        textView2.setText(sb2.toString());
        this.f4483am = (Button) findViewById(R.id.ticket_one);
        this.f4484an = (Button) findViewById(R.id.ticket_two);
        this.f4485ao = (Button) findViewById(R.id.ticket_three);
        this.f4483am.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11203 */

            public final void onClick(View view) {
                ShopSlab.this.mo3693b(30, 6);
            }
        });
        this.f4484an.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11214 */

            public final void onClick(View view) {
                ShopSlab.this.mo3693b(90, 20);
            }
        });
        this.f4485ao.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11225 */

            public final void onClick(View view) {
                ShopSlab.this.mo3693b(240, 60);
            }
        });
        this.f4475ae.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11236 */

            public final void onClick(View view) {
                ShopSlab.this.mo3690a(390, 30);
            }
        });
        this.f4476af.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11247 */

            public final void onClick(View view) {
                ShopSlab.this.mo3690a(990, 80);
            }
        });
        this.f4477ag.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11258 */

            public final void onClick(View view) {
                ShopSlab.this.mo3690a(1990, 170);
            }
        });
        this.f4478ah.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C11269 */

            public final void onClick(View view) {
                ShopSlab.this.mo3690a(3990, 360);
            }
        });
        this.f4479ai.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C110510 */

            public final void onClick(View view) {
                ShopSlab.this.mo3690a(9990, 950);
            }
        });
        this.f4480aj.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C110611 */

            public final void onClick(View view) {
                ShopSlab.this.mo3690a(19990, 2000);
            }
        });
        this.f4481ak = (Button) findViewById(R.id.advert_money);
        this.f4482al = (Button) findViewById(R.id.advert_gems);
        this.f4481ak.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C110813 */

            public final void onClick(View view) {
                ShopSlab shopSlab = ShopSlab.this;
                shopSlab.f4486ap = "m";
                ShopSlab.m3768a(shopSlab, "mney");
            }
        });
        this.f4482al.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C110914 */

            public final void onClick(View view) {
                ShopSlab shopSlab = ShopSlab.this;
                shopSlab.f4486ap = "g";
                ShopSlab.m3768a(shopSlab, "gms");
            }
        });
        MobileAds.initialize(this, "ca-app-pub-5415344071963463~7794037101");
        this.f4470aG = new InterstitialAd(this);
        this.f4470aG.setAdUnitId("ca-app-pub-5415344071963463/8083673530");
        this.f4498k.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111015 */

            public final void onClick(View view) {
                MainActivity.f4132W = true;
                ShopSlab.this.finish();
            }
        });
        this.f4497j.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ShopSlab.C111116 */

            public final void onClick(View view) {
                MainActivity.f4132W = true;
                ShopSlab.this.finish();
            }
        });
        this.f4462Y = (TextView) findViewById(R.id.coins);
        this.f4463Z = (TextView) findViewById(R.id.gems);
        MainActivity.m3729d(this.f4463Z, "gems");
        MainActivity.m3729d(this.f4462Y, "money");
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
