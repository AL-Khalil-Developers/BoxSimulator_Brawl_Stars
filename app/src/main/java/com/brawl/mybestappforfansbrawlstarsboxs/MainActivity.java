package com.brawl.mybestappforfansbrawlstarsboxs;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.unity3d.ads.UnityAds;
//import com.google.android.gms.internal.ads.C1592af;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    /* renamed from: E */
    public static RelativeLayout f4124E = null;

    /* renamed from: I */
    static ImageView f4125I = null;

    /* renamed from: M */
    static TextView f4126M = null;

    /* renamed from: N */
    static TextView f4127N = null;

    /* renamed from: O */
    static TextView f4128O = null;

    /* renamed from: P */
    static TextView f4129P = null;

    /* renamed from: S */
    public static TextView f4130S = null;

    /* renamed from: V */
    static boolean f4131V = true;

    /* renamed from: W */
    static boolean f4132W = true;

    /* renamed from: X */
    public static int f4133X = 0;

    /* renamed from: Y */
    public static int f4134Y = 0;

    /* renamed from: Z */
    public static String f4135Z = "";

    /* renamed from: aB */
    static int f4136aB = 0;

    /* renamed from: aC */
    static int f4137aC = 0;

    /* renamed from: aD */
    static int f4138aD = 0;

    /* renamed from: aE */
    public static ScaleAnimation f4139aE = null;

    /* renamed from: aK */
    public static ImageView f4140aK = null;

    /* renamed from: aO */
    static SharedPreferences f4141aO = null;

    /* renamed from: aj */
    static TextView f4142aj = null;

    /* renamed from: an */
    static RelativeLayout f4143an = null;

    /* renamed from: ao */
    static Animation f4144ao = null;

    /* renamed from: as */
    public static boolean f4145as = false;

    /* renamed from: j */
    static boolean f4146j = true;

    /* renamed from: p */
    public static ImageView f4147p;

    /* renamed from: q */
    static ArrayList<Integer> f4148q;

    /* renamed from: r */
    static Animation f4149r;

    /* renamed from: t */
    static ImageView f4150t;

    /* renamed from: u */
    static ProgressBar f4151u;

    /* renamed from: v */
    public static ImageView f4152v;

    /* renamed from: w */
    public static ImageView f4153w;

    /* renamed from: x */
    public static ImageView f4154x;

    /* renamed from: y */
    public static ImageView f4155y;

    /* renamed from: A */
    ImageView f4156A;

    /* renamed from: B */
    ImageView f4157B;

    /* renamed from: C */
    ImageView f4158C;

    /* renamed from: D */
    ImageView f4159D;

    /* renamed from: F */
    TextView f4160F;

    /* renamed from: G */
    TextView f4161G;

    /* renamed from: H */
    TextView f4162H;

    /* renamed from: J */
    Button f4163J;

    /* renamed from: K */
    CardView f4164K;

    /* renamed from: L */
    Thread f4165L;

    /* renamed from: Q */
    LinearLayout f4166Q;

    /* renamed from: R */
    LinearLayout f4167R;

    /* renamed from: T */
    TextView f4168T;

    /* renamed from: U */
    TextView f4169U;

    /* renamed from: aA */
    TextView f4170aA;

    /* renamed from: aF */
    ScaleAnimation f4171aF;

    /* renamed from: aG */
    ScaleAnimation f4172aG;

    /* renamed from: aH */
    ScaleAnimation f4173aH;

    /* renamed from: aI */
    ScaleAnimation f4174aI;

    /* renamed from: aJ */
    int f4175aJ;

    /* renamed from: aL */
    TextView f4176aL;

    /* renamed from: aM */
    TextView f4177aM;

    /* renamed from: aN */
    final String f4178aN = "com.brawl.mybestappforfansbrawlstarsboxs";
    /* access modifiers changed from: private */

    /* renamed from: aP */
    public InterstitialAd f4179aP;
    /* access modifiers changed from: private */

    /* renamed from: aQ */
    public RewardedVideoAd f4180aQ;

    /* renamed from: aa */
    public int f4181aa;

    /* renamed from: ab */
    Animation f4182ab;

    /* renamed from: ac */
    Animation f4183ac;

    /* renamed from: ad */
    Animation f4184ad;

    /* renamed from: ae */
    TextView f4185ae;

    /* renamed from: af */
    RelativeLayout f4186af;

    /* renamed from: ag */
    ImageView f4187ag;

    /* renamed from: ah */
    boolean f4188ah;

    /* renamed from: ai */
    boolean f4189ai;

    /* renamed from: ak */
    GifImageView f4190ak;

    /* renamed from: al */
    GifImageView f4191al;

    /* renamed from: am */
    GifImageView f4192am;

    /* renamed from: ap */
    TextView f4193ap;

    /* renamed from: aq */
    ImageView f4194aq;

    /* renamed from: ar */
    int f4195ar;

    /* renamed from: at */
    ArrayList<Integer> f4196at;

    /* renamed from: au */
    ImageView f4197au;

    /* renamed from: av */
    Animation f4198av;

    /* renamed from: aw */
    Animation f4199aw;

    /* renamed from: ax */
    TextView f4200ax;

    /* renamed from: ay */
    TextView f4201ay;

    /* renamed from: az */
    TextView f4202az;

    /* renamed from: k */
    boolean f4203k;

    /* renamed from: l */
    boolean f4204l = true;

    /* renamed from: m */
    ImageView f4205m;

    /* renamed from: n */
    TextView f4206n;

    /* renamed from: o */
    TextView f4207o;

    /* renamed from: s */
    RelativeLayout f4208s;

    /* renamed from: z */
    TextView f4209z;

    /* renamed from: a */
    static void m3720a(int i, String str) {
        SharedPreferences.Editor edit = f4141aO.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: a */
    static void m3721a(Activity activity) {
        if (m3726c("bonus_image") != 0) {
            f4150t.setImageResource(m3726c("bonus_image"));
        } else {
            f4150t.setImageResource(R.drawable.money_box);
            m3720a((int) R.drawable.money_box, "bonus_image");
        }
        f4151u.setSecondaryProgress(m3726c("bonus_progress"));
        if (m3726c("bonus_progress") == 0) {
            f4151u.setSecondaryProgress(1);
        }
        if (m3726c("bonus_progress") == 100) {
            f4143an.setBackground(activity.getResources().getDrawable(R.drawable.redy_lvl_up));
            f4151u.setVisibility(4);
        }
    }

    /* renamed from: a */
    static void m3722a(String str, String str2) {
        SharedPreferences.Editor edit = f4141aO.edit();
        edit.putString(str2, str);
        edit.commit();
    }

    /* renamed from: b */
    static String m3724b(String str) {
        return f4141aO.getString(str, "");
    }

    /* renamed from: b */
    static void m3725b(Activity activity) {
        m3720a(m3726c("bonus_progress") + 10, "bonus_progress");
        m3721a(activity);
    }

    /* renamed from: c */
    static int m3726c(String str) {
        return f4141aO.getInt(str, 0);
    }

    /* renamed from: c */
    public static void m3727c(Activity activity) {
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
            activity.getWindow().getDecorView().setSystemUiVisibility(8);
        } else if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().getDecorView().setSystemUiVisibility(4098);
        }
    }

    /* renamed from: c */
    static void m3728c(TextView textView, String str) {
        textView.setText(String.valueOf(f4141aO.getString(str, "")));
    }

    /* renamed from: d */
    static void m3729d(TextView textView, String str) {
        textView.setText(String.valueOf(f4141aO.getInt(str, 0)));
    }

    /* renamed from: h */
    public static void m3730h() {
        f4136aB = m3726c("money");
        f4137aC = m3726c("gems");
        f4138aD = m3726c("ticket");
    }

    /* renamed from: i */
    public static void m3731i() {
        int i = 0;
        for (int i2 = 0; i2 < 33; i2++) {
            if (m3726c(String.valueOf(i2)) != 0) {
                try {
                    if (f4148q.get(m3726c("l".concat(String.valueOf(i2)))).intValue() <= m3726c(String.valueOf(i2))) {
                        i++;
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (i != 0) {
            f4142aj.setVisibility(0);
            f4142aj.setText(String.valueOf(i));
            return;
        }
        f4142aj.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo3563a(final TextView textView, String str) {
        textView.setVisibility(0);
        textView.setText(str);
        textView.startAnimation(this.f4184ad);
        this.f4184ad.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102012 */

            public final void onAnimationEnd(Animation animation) {
                textView.setVisibility(4);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3564a(String str) {
        if (!getPackageName().equals(str)) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(67108864);
            startActivity(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3565a(String str, final TextView textView) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, m3726c(str));
        ofInt.setDuration(500L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10171 */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                textView.setText(valueAnimator.getAnimatedValue().toString());
            }
        });
        ofInt.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3566b(TextView textView, String str) {
        mo3390e();
        this.f4160F.setBackground(getResources().getDrawable(R.drawable.language));
        this.f4161G.setBackground(getResources().getDrawable(R.drawable.language));
        this.f4162H.setBackground(getResources().getDrawable(R.drawable.language));
        textView.setBackground(getResources().getDrawable(R.drawable.lang_sellect));
        textView.startAnimation(f4149r);
        if (str.equals("eng")) {
            this.f4177aM.setText("This content is not affiliated, endorsed, sponsored or  specifically approved by Supercell and Supercell is not responsible for it. For more information, see the Supercell Fan Content Policy");
            this.f4176aL.setText("Fan Content Policy");
            this.f4193ap.setText("Sounds");
            m3720a(0, "language");
            this.f4160F.setText("Eng");
            this.f4161G.setText("UA");
            this.f4162H.setText("Rus");
            this.f4200ax.setText("Language");
            this.f4206n.setText("Change\nView ");
            this.f4207o.setText("Quit\n Game ");
            this.f4168T.setText("MINI-GAME");
            this.f4169U.setText("BRAWLERS");
            f4130S.setText("SHOP");
            this.f4209z.setText("ACHIVEMENTS");
            this.f4201ay.setText("Like The Game? ");
            this.f4202az.setText("Click Click! ");
            this.f4170aA.setText("LIKE GAME?\n CLICK!");
            this.f4156A.setImageResource(R.drawable.free_case_new1);
            f4152v.setImageResource(R.drawable.free_case_new1);
            this.f4159D.setImageResource(R.drawable.video_box);
            f4155y.setImageResource(R.drawable.video_box);
        }
        if (str.equals("ua")) {
            this.f4193ap.setText("Звуки");
            this.f4177aM.setText("Цей вміст не є афілійованим, схваленим, спонсорованим або спеціально затвердженим Supercell і Supercell не несе за нього відповідальність. Для отримання додаткової інформації дивіться політику фан контенту Supercell");
            this.f4176aL.setText("ПРАВИЛА ФАН КОНТЕНТУ");
            m3720a(1, "language");
            this.f4160F.setText("Англ");
            this.f4161G.setText("Укр");
            this.f4162H.setText("Рос");
            this.f4200ax.setText("Мова");
            this.f4206n.setText("Змінити\nВигляд ");
            this.f4170aA.setText("ПОДОБАЄТЬСЯ ГРА?\n НАТИСКАЙ!");
            this.f4207o.setText("Закрити\n Гру ");
            this.f4168T.setText("МІНІ ГРА");
            this.f4169U.setText("БІЙЦІ");
            f4130S.setText("МАГАЗИН");
            this.f4209z.setText("ДОСЯГНЕННЯ");
            this.f4201ay.setText("Подобається Гра? ");
            this.f4202az.setText("Натисни! ");
            this.f4156A.setImageResource(R.drawable.free_case_new_ua);
            f4152v.setImageResource(R.drawable.free_case_new_ua);
            this.f4159D.setImageResource(R.drawable.video_box_ua);
            f4155y.setImageResource(R.drawable.video_box_ua);
        }
        if (str.equals("rus")) {
            this.f4177aM.setText("Этот контент не является аффилированным, одобренным, спонсируемым или специально утвержденным Supercell, и Supercell не несет за него ответственности. Для получения дополнительной информации смотрите Политику Фан-Контента Supercell");
            this.f4176aL.setText("ПРАВИЛА ФАН-КОНТЕНТА");
            this.f4193ap.setText("Звуки");
            m3720a(2, "language");
            this.f4160F.setText("Англ");
            this.f4161G.setText("Укр");
            this.f4162H.setText("Рус");
            this.f4200ax.setText("Язык");
            this.f4170aA.setText("НРАВИТСЯ ИГРА?\n НАЖИМАЙ!");
            this.f4206n.setText("Изменить\nВид ");
            this.f4207o.setText("Закрыть\n Игру ");
            this.f4168T.setText("МИНИ-ИГРА");
            this.f4169U.setText("БОЙЦЫ");
            f4130S.setText("МАГАЗИН");
            this.f4209z.setText("ДОСТИЖЕНИЯ");
            this.f4201ay.setText("Нравится Игра? ");
            this.f4202az.setText("Нажимай Нажимай! ");
            this.f4156A.setImageResource(R.drawable.free_case_new_ru);
            f4152v.setImageResource(R.drawable.free_case_new_ru);
            this.f4159D.setImageResource(R.drawable.video_box_ru);
            f4155y.setImageResource(R.drawable.video_box_ru);
        }
        if (this.f4195ar == 0) {
            if (m3726c("language") == 0) {
                this.f4194aq.setBackground(getResources().getDrawable(R.drawable.on));
            }
            if (m3726c("language") == 2) {
                this.f4194aq.setBackground(getResources().getDrawable(R.drawable.on_ru));
            }
            if (m3726c("language") == 1) {
                this.f4194aq.setBackground(getResources().getDrawable(R.drawable.on_ua));
                return;
            }
            return;
        }
        if (m3726c("language") == 0) {
            this.f4194aq.setBackground(getResources().getDrawable(R.drawable.off));
        }
        if (m3726c("language") == 2) {
            this.f4194aq.setBackground(getResources().getDrawable(R.drawable.off_rus));
        }
        if (m3726c("language") == 1) {
            this.f4194aq.setBackground(getResources().getDrawable(R.drawable.off_ua));
        }
    }

    /* access modifiers changed from: package-private */
   // @Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: e */
    public final void mo3390e() {
        if (this.f4188ah) {
            this.f4186af.startAnimation(this.f4183ac);
            this.f4183ac.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103323 */

                public final void onAnimationEnd(Animation animation) {
                    MainActivity.this.f4186af.setVisibility(4);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            this.f4188ah = false;
            this.f4189ai = false;
        }
    }

    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: f */
    public final void mo3391f() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (((double) (memoryInfo.totalMem / 1048576)) <= 2500.0d) {
            this.f4205m.setVisibility(0);
            this.f4190ak.setVisibility(4);
            this.f4191al.setVisibility(4);
            this.f4197au.setVisibility(0);
            return;
        }
        this.f4190ak.setBackgroundResource(R.drawable.ideal_back_fourth);
        this.f4191al.setBackgroundResource(R.drawable.dinamiker);
    }

    /* renamed from: j */
    public final void mo3567j() {
        this.f4181aa++;
        if (this.f4181aa >= 3) {
            this.f4179aP.loadAd(new AdRequest.Builder().build());
            if (this.f4179aP.isLoaded()) {
                this.f4179aP.show();
                this.f4181aa = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0a12  */
    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        int i;
        Resources resources;
        TextView textView;
        //ToDo: initialized....
        int i2 = 0;
        Resources resources2 = null;
        ImageView imageView = null;

        boolean z;
        super.onCreate(bundle);

        UnityAds.initialize(MainActivity.this,UnityAdsConfig.UnityAdsAppID,UnityAdsConfig.TestModeON);

        setContentView(R.layout.activity_main);
        UnityAds.initialize(MainActivity.this,UnityAdsConfig.UnityAdsAppID,UnityAdsConfig.TestModeON);
        Handler adHandler = new Handler();
        adHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                UnityAdsConfig.loadUnityInterstitialAd();
            }
        },3000);



        getWindow().setFlags(1024, 1024);
        f4140aK = (ImageView) findViewById(R.id.new_icon);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (((double) (memoryInfo.totalMem / 1048576)) <= 2500.0d) {
            f4145as = true;
        } else {
            f4145as = false;
        }
        m3727c(this);
        this.f4176aL = (TextView) findViewById(R.id.policy);
        this.f4176aL.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104735 */

            public final void onClick(View view) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://supercell.com/en/fan-content-policy")));
            }
        });
        this.f4177aM = (TextView) findViewById(R.id.textpolicy);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.new_icon_anim);
        f4144ao = loadAnimation;
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104836 */

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        f4142aj = (TextView) findViewById(R.id.count_upgrade);
        this.f4170aA = (TextView) findViewById(R.id.like_game_second);
        this.f4200ax = (TextView) findViewById(R.id.language);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.75f, 1.0f, 0.75f, 1.0f, 1, 0.5f, 1, 0.5f);
        f4139aE = scaleAnimation;
        scaleAnimation.setDuration(500);
        this.f4193ap = (TextView) findViewById(R.id.sounds);
        this.f4194aq = (ImageView) findViewById(R.id.sound_switch);
        this.f4194aq.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104937 */

            public final void onClick(View view) {
                int i;
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f4195ar++;
                if (mainActivity.f4195ar == 2) {
                    mainActivity.f4195ar = 0;
                }
                if (mainActivity.f4195ar == 0) {
                    MainActivity.m3720a(0, "sounds");
                    if (MainActivity.m3726c("language") == 0) {
                        mainActivity.f4194aq.setBackground(mainActivity.getResources().getDrawable(R.drawable.on));
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        mainActivity.f4194aq.setBackground(mainActivity.getResources().getDrawable(R.drawable.on_ru));
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        mainActivity.f4194aq.setBackground(mainActivity.getResources().getDrawable(R.drawable.on_ua));
                    }
                    i = R.raw.menu_click;
                } else {
                    MainActivity.m3720a(1, "sounds");
                    if (MainActivity.m3726c("language") == 0) {
                        mainActivity.f4194aq.setBackground(mainActivity.getResources().getDrawable(R.drawable.off));
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        mainActivity.f4194aq.setBackground(mainActivity.getResources().getDrawable(R.drawable.off_rus));
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        mainActivity.f4194aq.setBackground(mainActivity.getResources().getDrawable(R.drawable.off_ua));
                    }
                    i = R.raw.menu_cancel;
                }
                MediaPlayer.create(mainActivity, i).start();
                mainActivity.mo3390e();
            }
        });
        this.f4160F = (TextView) findViewById(R.id.eng);
        this.f4161G = (TextView) findViewById(R.id.ua);
        this.f4162H = (TextView) findViewById(R.id.rus);
        this.f4201ay = (TextView) findViewById(R.id.te);
        this.f4202az = (TextView) findViewById(R.id.click_click);
        this.f4160F.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10292 */

            public final void onClick(View view) {
                MainActivity.this.mo3566b((TextView) view, "eng");
            }
        });
        this.f4161G.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10403 */

            public final void onClick(View view) {
                MainActivity.this.mo3566b((TextView) view, "ua");
            }
        });
        this.f4162H.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10504 */

            public final void onClick(View view) {
                MainActivity.this.mo3566b((TextView) view, "rus");
            }
        });
        this.f4208s = (RelativeLayout) findViewById(R.id.second_rate);
        ImageView imageView2 = (ImageView) findViewById(R.id.brawler_cur);
        f4147p = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10515 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                MainActivity.this.f4175aJ += 360;
                MainActivity.f4147p.animate().withLayer().rotationY((float) MainActivity.this.f4175aJ).setDuration(1000);
                MainActivity.f4147p.startAnimation(MainActivity.f4149r);
            }
        });
        this.f4166Q = (LinearLayout) findViewById(R.id.first_lay);
        this.f4167R = (LinearLayout) findViewById(R.id.second_lay);
        this.f4197au = (ImageView) findViewById(R.id.scells);
        this.f4205m = (ImageView) findViewById(R.id.finger);
        this.f4156A = (ImageView) findViewById(R.id.free_case2);
        this.f4157B = (ImageView) findViewById(R.id.normal_case2);
        this.f4158C = (ImageView) findViewById(R.id.big_case2);
        this.f4159D = (ImageView) findViewById(R.id.video_case2);
        this.f4198av = AnimationUtils.loadAnimation(this, R.anim.drop_menu);
        this.f4199aw = AnimationUtils.loadAnimation(this, R.anim.up_menu);
        this.f4190ak = (GifImageView) findViewById(R.id.fone_gif);
        this.f4190ak.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10526 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
            }
        });
        this.f4191al = (GifImageView) findViewById(R.id.din);
        this.f4192am = (GifImageView) findViewById(R.id.second_dinamiker);
        this.f4206n = (TextView) findViewById(R.id.sett_button);
        this.f4187ag = (ImageView) findViewById(R.id.settings);
        this.f4204l = true;
        mo3391f();
        this.f4185ae = (TextView) findViewById(R.id.text_help);
        this.f4206n.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10537 */

            public final void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f4189ai = false;
                mainActivity.mo3390e();
                if (!MainActivity.this.f4203k) {
                    MainActivity.this.f4167R.setVisibility(0);
                    MainActivity.this.f4192am.setBackgroundResource(R.drawable.dinamiker);
                    MainActivity.this.f4166Q.startAnimation(MainActivity.this.f4198av);
                    MainActivity.this.f4164K.startAnimation(MainActivity.this.f4198av);
                    MainActivity.this.f4167R.startAnimation(MainActivity.this.f4199aw);
                    MainActivity.f4147p.startAnimation(MainActivity.this.f4199aw);
                    MainActivity.this.f4208s.setVisibility(0);
                    MainActivity.this.f4208s.startAnimation(MainActivity.this.f4199aw);
                    MainActivity.this.f4198av.setAnimationListener(new Animation.AnimationListener() {
                        /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10537.C10541 */

                        public final void onAnimationEnd(Animation animation) {
                            MainActivity.this.f4166Q.setVisibility(4);
                            MainActivity.this.f4164K.setVisibility(4);
                        }

                        public final void onAnimationRepeat(Animation animation) {
                        }

                        public final void onAnimationStart(Animation animation) {
                        }
                    });
                    MainActivity.f4147p.setVisibility(0);
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.f4203k = true;
                    mainActivity2.f4204l = false;
                    MainActivity.m3720a(2, "view");
                }
                if (MainActivity.this.f4204l && MainActivity.this.f4203k) {
                    MainActivity.this.f4166Q.setVisibility(0);
                    MainActivity.this.f4164K.setVisibility(0);
                    MainActivity.this.f4167R.startAnimation(MainActivity.this.f4198av);
                    MainActivity.f4147p.startAnimation(MainActivity.this.f4198av);
                    MainActivity.this.f4166Q.startAnimation(MainActivity.this.f4199aw);
                    MainActivity.this.f4164K.startAnimation(MainActivity.this.f4199aw);
                    MainActivity.this.f4208s.startAnimation(MainActivity.this.f4198av);
                    MainActivity.this.f4198av.setAnimationListener(new Animation.AnimationListener() {
                        /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10537.C10552 */

                        public final void onAnimationEnd(Animation animation) {
                            MainActivity.this.f4167R.setVisibility(4);
                            MainActivity.f4147p.setVisibility(4);
                            MainActivity.this.f4208s.setVisibility(4);
                        }

                        public final void onAnimationRepeat(Animation animation) {
                        }

                        public final void onAnimationStart(Animation animation) {
                        }
                    });
                    MainActivity.this.f4203k = false;
                    MainActivity.m3720a(0, "view");
                }
                MainActivity.this.f4204l = true;
            }
        });
        f4149r = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        this.f4182ab = AnimationUtils.loadAnimation(this, R.anim.slide_anim);
        this.f4183ac = AnimationUtils.loadAnimation(this, R.anim.unslide);
        this.f4184ad = AnimationUtils.loadAnimation(this, R.anim.text);
        this.f4186af = (RelativeLayout) findViewById(R.id.sett_list);
        this.f4189ai = true;
        this.f4187ag.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10568 */

            public final void onClick(View view) {
                MainActivity.this.f4187ag.startAnimation(MainActivity.f4149r);
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f4189ai = true;
                if (mainActivity.f4189ai && MainActivity.this.f4188ah) {
                    MainActivity.this.f4186af.startAnimation(MainActivity.this.f4183ac);
                    MainActivity.this.f4183ac.setAnimationListener(new Animation.AnimationListener() {
                        /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10568.C10571 */

                        public final void onAnimationEnd(Animation animation) {
                            MainActivity.this.f4186af.setVisibility(4);
                        }

                        public final void onAnimationRepeat(Animation animation) {
                        }

                        public final void onAnimationStart(Animation animation) {
                        }
                    });
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.f4188ah = false;
                    mainActivity2.f4189ai = false;
                }
                if (MainActivity.this.f4189ai && !MainActivity.this.f4188ah) {
                    MainActivity.this.f4186af.setVisibility(0);
                    MainActivity.this.f4186af.startAnimation(MainActivity.this.f4182ab);
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.f4188ah = true;
                    mainActivity3.f4189ai = false;
                    mainActivity3.f4206n.startAnimation(MainActivity.f4139aE);
                    MainActivity.this.f4207o.startAnimation(MainActivity.this.f4171aF);
                    MainActivity.this.f4160F.startAnimation(MainActivity.this.f4172aG);
                    MainActivity.this.f4161G.startAnimation(MainActivity.this.f4173aH);
                    MainActivity.this.f4162H.startAnimation(MainActivity.this.f4174aI);
                }
            }
        });
        this.f4209z = (TextView) findViewById(R.id.achivements);
        f4124E = (RelativeLayout) findViewById(R.id.fone);
        this.f4209z.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C10589 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                MainActivity.this.startActivity(new Intent(MainActivity.this, Achivements.class));
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.menu_click).start();
                }
            }
        });
        this.f4163J = (Button) findViewById(R.id.icons);
        this.f4163J.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C101810 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity, Info_about_you.class));
            }
        });
        //this.f4180aQ = C1592af.m5101a().mo4727a(this);
        //ToDo: check for rewarded video ads...
        this.f4180aQ = MobileAds.getRewardedVideoAdInstance(this);
        final String packageName = getPackageName();
        this.f4164K = (CardView) findViewById(R.id.rete_card);
        this.f4164K.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C101911 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                try {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                } catch (ActivityNotFoundException unused) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                }
            }
        });
        this.f4208s.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102113 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                try {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                } catch (ActivityNotFoundException unused) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                }
            }
        });
        f4129P = (TextView) findViewById(R.id.nick);
        this.f4168T = (TextView) findViewById(R.id.play);
        /*C0923b.C0930b bVar = new C0923b.C0930b(4, 3);
        bVar.f3691a = "https://play.google.com/store/apps/details?id=com.brawl.mybestappforfansbrawlstarsboxs";
        C0923b.m3679a(this);
        C0923b.m3680a(bVar);
        C0923b.m3682b(this);*/
        this.f4168T.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102214 */

            public final void onClick(View view) {
                MainActivity.this.mo3391f();
                MainActivity.this.mo3390e();
                MainActivity.this.f4168T.startAnimation(MainActivity.f4149r);
                C1146j.f4604d = 3;
                MainActivity.this.startActivity(new Intent(MainActivity.this, MiniGameSelector.class));
            }
        });
        f4152v = (ImageView) findViewById(R.id.free_case);
        this.f4169U = (TextView) findViewById(R.id.brawlers);
        f4153w = (ImageView) findViewById(R.id.normal_case);
        f4154x = (ImageView) findViewById(R.id.big_case);
        f4155y = (ImageView) findViewById(R.id.video_case);
        f4152v.startAnimation(f4139aE);
        this.f4171aF = new ScaleAnimation(0.75f, 1.0f, 0.75f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f4171aF.setDuration(500);
        this.f4171aF.setStartOffset(200);
        f4155y.startAnimation(this.f4171aF);
        this.f4172aG = new ScaleAnimation(0.75f, 1.0f, 0.75f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f4172aG.setDuration(500);
        this.f4172aG.setStartOffset(400);
        f4153w.startAnimation(this.f4172aG);
        this.f4173aH = new ScaleAnimation(0.75f, 1.0f, 0.75f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f4173aH.setDuration(500);
        this.f4173aH.setStartOffset(600);
        f4154x.startAnimation(this.f4173aH);
        this.f4174aI = new ScaleAnimation(0.75f, 1.0f, 0.75f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f4174aI.setDuration(500);
        this.f4174aI.setStartOffset(800);
        f4125I = (ImageView) findViewById(R.id.icon);
        f4126M = (TextView) findViewById(R.id.coins);
        f4128O = (TextView) findViewById(R.id.ticket);
        TextView textView2 = (TextView) findViewById(R.id.gems);
        f4127N = textView2;
        textView2.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102315 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                MainActivity.this.f4179aP.loadAd(new AdRequest.Builder().build());
                if (MainActivity.this.f4179aP.isLoaded()) {
                    MainActivity.this.f4179aP.show();
                    int c = MainActivity.m3726c("gems") + 1;
                    MainActivity.m3720a(c, "gems");
                    MainActivity.f4127N.setText(String.valueOf(c));
                    return;
                }
                MainActivity.f4127N.startAnimation(MainActivity.f4149r);
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
                if (MainActivity.m3726c("language") == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                }
                if (MainActivity.m3726c("language") == 1) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                }
            }
        });
        f4126M.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102416 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                MainActivity.this.f4179aP.loadAd(new AdRequest.Builder().build());
                if (MainActivity.this.f4179aP.isLoaded()) {
                    MainActivity.this.f4179aP.show();
                    int c = MainActivity.m3726c("money") + 20;
                    MainActivity.m3720a(c, "money");
                    MainActivity.f4127N.setText(String.valueOf(c));
                    return;
                }
                MainActivity.f4126M.startAnimation(MainActivity.f4149r);
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
                if (MainActivity.m3726c("language") == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                }
                if (MainActivity.m3726c("language") == 1) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                }
            }
        });
        f4128O.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102517 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                MainActivity.this.f4179aP.loadAd(new AdRequest.Builder().build());
                if (MainActivity.this.f4179aP.isLoaded()) {
                    MainActivity.this.f4179aP.show();
                    int c = MainActivity.m3726c("ticket") + 1;
                    MainActivity.m3720a(c, "ticket");
                    MainActivity.f4127N.setText(String.valueOf(c));
                    return;
                }
                MainActivity.f4128O.startAnimation(MainActivity.f4149r);
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
                if (MainActivity.m3726c("language") == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                }
                if (MainActivity.m3726c("language") == 1) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                }
            }
        });
        this.f4207o = (TextView) findViewById(R.id.exit);
        this.f4207o.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102618 */

            public final void onClick(View view) {
                MainActivity.this.f4186af.startAnimation(MainActivity.this.f4183ac);
                MainActivity.this.f4183ac.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102618.C10271 */

                    public final void onAnimationEnd(Animation animation) {
                        MainActivity.this.f4186af.setVisibility(4);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }
                });
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f4188ah = false;
                mainActivity.f4189ai = false;
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(67108864);
                MainActivity.this.startActivity(intent);
            }
        });
        f4130S = (TextView) findViewById(R.id.shop);
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
        f4135Z = "";
        f4141aO = getPreferences(4);
        if (!m3724b("skin_name").equals("")) {
            f4140aK.setVisibility(0);
            textView = f4130S;
            resources = getResources();
            i = R.drawable.shop_new_item;
        } else {
            f4140aK.setVisibility(4);
            textView = f4130S;
            resources = getResources();
            i = R.drawable.shop;
        }
        textView.setBackground(resources.getDrawable(i));
        f4151u = (ProgressBar) findViewById(R.id.bonus_progress);
        f4150t = (ImageView) findViewById(R.id.bonus_image);
        f4143an = (RelativeLayout) findViewById(R.id.bonus_lay);
        m3721a((Activity) this);
        f4143an.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C102819 */

            public final void onClick(View view) {
                if (MainActivity.f4151u.getSecondaryProgress() == 100) {
                    MainActivity mainActivity = MainActivity.this;
                    MainActivity.f4151u.setVisibility(0);
                    MainActivity.f4143an.setBackground(mainActivity.getResources().getDrawable(R.drawable.lvl_up));
                    if (MainActivity.m3726c("bonus_image") == R.drawable.money_box) {
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(mainActivity, (int) R.raw.get_coins_01).start();
                        }
                        int c = MainActivity.m3726c("money") + 200;
                        MainActivity.m3720a(c, "money");
                        MainActivity.f4126M.setText(String.valueOf(c));
                        mainActivity.mo3565a("money", MainActivity.f4126M);
                    }
                    if (MainActivity.m3726c("bonus_image") == R.drawable.gems_box) {
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(mainActivity, (int) R.raw.emit_gems_01).start();
                        }
                        int c2 = MainActivity.m3726c("gems") + 30;
                        MainActivity.m3720a(c2, "gems");
                        MainActivity.f4127N.setText(String.valueOf(c2));
                        mainActivity.mo3565a("gems", MainActivity.f4127N);
                    }
                    if (MainActivity.m3726c("bonus_image") == R.drawable.ticket_box) {
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(mainActivity, (int) R.raw.emit_tickets_01).start();
                        }
                        int c3 = MainActivity.m3726c("ticket") + 20;
                        MainActivity.m3720a(c3, "ticket");
                        MainActivity.f4128O.setText(String.valueOf(c3));
                        mainActivity.mo3565a("ticket", MainActivity.f4128O);
                    }
                    if (MainActivity.m3726c("bonus_image") == R.drawable.big_box_icon) {
                        ChestOpen.f3843x = R.drawable.normal_box;
                        mainActivity.startActivity(new Intent(mainActivity, ChestOpen.class));
                        MainActivity.f4135Z = "normal";
                    }
                    if (MainActivity.m3726c("bonus_image") == R.drawable.mega_box_icon) {
                        ChestOpen.f3843x = R.drawable.mega_box;
                        mainActivity.startActivity(new Intent(mainActivity, ChestOpen.class));
                        MainActivity.f4135Z = "big";
                    }
                    int nextInt = new Random().nextInt(5);
                    if (nextInt == 0) {
                        MainActivity.m3720a((int) R.drawable.money_box, "bonus_image");
                        MainActivity.m3720a(0, "bonus_progress");
                    }
                    if (nextInt == 1) {
                        MainActivity.m3720a((int) R.drawable.gems_box, "bonus_image");
                        MainActivity.m3720a(0, "bonus_progress");
                    }
                    if (nextInt == 2) {
                        MainActivity.m3720a((int) R.drawable.ticket_box, "bonus_image");
                        MainActivity.m3720a(0, "bonus_progress");
                    }
                    if (nextInt == 3) {
                        MainActivity.m3720a((int) R.drawable.big_box_icon, "bonus_image");
                        MainActivity.m3720a(0, "bonus_progress");
                    }
                    if (nextInt == 4) {
                        MainActivity.m3720a((int) R.drawable.mega_box_icon, "bonus_image");
                        MainActivity.m3720a(0, "bonus_progress");
                    }
                    MainActivity.m3721a((Activity) mainActivity);
                } else if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
                MainActivity.f4143an.startAnimation(MainActivity.f4149r);
            }
        });
        this.f4196at = new ArrayList<>();
        this.f4196at.add(Integer.valueOf((int) R.drawable.shelly_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.nita_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.colt_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.bull_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.jessie_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.brock_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.dinamike_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.emz_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.bo_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.bit_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.tick_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.elprimo_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.barley_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.poco_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.rosa_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.riko_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.darryl_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.penny_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.carl_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.jacky_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.bibi_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.bea_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.frank_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.piper_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.pam_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.max_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.mortis_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.mr_p_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.sprout_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.tara_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.gene_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.spike_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.crow_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.leon_f));
        this.f4196at.add(Integer.valueOf((int) R.drawable.sandy_f));
        f4147p.setImageResource(m3726c("brawler"));
        if (m3726c("view") == 2) {
            this.f4167R.setVisibility(0);
            this.f4192am.setBackgroundResource(R.drawable.dinamiker);
            this.f4166Q.setVisibility(4);
            this.f4164K.setVisibility(4);
            this.f4208s.setVisibility(0);
            f4147p.setVisibility(0);
            this.f4203k = true;
        } else {
            this.f4167R.setVisibility(4);
            this.f4166Q.setVisibility(0);
            this.f4208s.setVisibility(4);
            this.f4164K.setVisibility(0);
            f4147p.setVisibility(4);
            this.f4203k = false;
        }
        TextView textView3 = f4129P;
        textView3.setText(Register.m3740a("name") + " ");
        if (m3726c("icon") != 0) {
            try {
                f4125I.setBackground(getResources().getDrawable(m3726c("icon")));
                mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
            } catch (Exception unused) {
            }
            if (m3726c("fone") != 0) {
                boolean z2 = m3726c("fone") == R.drawable.green;
                if (m3726c("fone") == R.drawable.brawlers) {
                    z2 = true;
                }
                if (m3726c("fone") == R.drawable.purple) {
                    z2 = true;
                }
                if (m3726c("fone") == R.drawable.red) {
                    z2 = true;
                }
                if (m3726c("fone") == R.drawable.orange) {
                    z2 = true;
                }
                if (z2) {
                    try {
                        f4124E.setBackground(getResources().getDrawable(m3726c("fone")));
                    } catch (Exception unused2) {
                    }
                }
            }
            this.f4169U.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103020 */

                public final void onClick(View view) {
                    MainActivity.this.mo3390e();
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.menu_click).start();
                    }
                    MainActivity.this.startActivity(new Intent(MainActivity.this, Brawlers.class));
                }
            });
            m3729d(f4127N, "gems");
            f4130S.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103121 */

                public final void onClick(View view) {
                    Intent intent;
                    if (MainActivity.f4145as) {
                        MainActivity.this.mo3390e();
                        MainActivity.f4132W = false;
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.menu_click).start();
                        }
                        intent = new Intent(MainActivity.this, Shop.class);
                    } else {
                        MainActivity.f4140aK.setVisibility(4);
                        MainActivity.f4130S.setBackground(MainActivity.this.getResources().getDrawable(R.drawable.shop));
                        Shop.f4307ac = false;
                        Shop.f4310l = 0;
                        MainActivity.this.mo3390e();
                        MainActivity.f4132W = false;
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.menu_click).start();
                        }
                        intent = new Intent(MainActivity.this, Shop.class);
                    }
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                }
            });
            f4152v.animate().withLayer().rotationY(1080.0f).setDuration(1500);
            f4152v.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103222 */

                public final void onClick(View view) {
                    MainActivity.this.mo3390e();
                    if (MainActivity.f4146j) {
                        int i = 0;
                        MainActivity.f4146j = false;
                        ChestOpen.f3843x = R.drawable.free_box;
                        MainActivity.this.mo3567j();
                        if (MainActivity.f4131V) {
                            try {
                                i = Integer.parseInt(Register.m3740a("free"));
                            } catch (Exception unused) {
                            }
                            Register.m3741a(String.valueOf(i + 1), "free");
                            MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                            MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                            MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                            MainActivity.f4135Z = "free";
                        }
                    }
                }
            });
            this.f4156A.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103424 */

                public final void onClick(View view) {
                    MainActivity.this.mo3390e();
                    if (MainActivity.f4146j) {
                        int i = 0;
                        MainActivity.f4146j = false;
                        ChestOpen.f3843x = R.drawable.free_box;
                        MainActivity.this.mo3567j();
                        if (MainActivity.f4131V) {
                            try {
                                i = Integer.parseInt(Register.m3740a("free"));
                            } catch (Exception unused) {
                            }
                            Register.m3741a(String.valueOf(i + 1), "free");
                            MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                            MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                            MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                            MainActivity.f4135Z = "free";
                        }
                    }
                }
            });
            f4153w.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103525 */

                public final void onClick(View view) {
                    int i;
                    MainActivity.this.mo3390e();
                    ChestOpen.f3843x = R.drawable.normal_box;
                    if (MainActivity.f4134Y - 200 >= 0) {
                        try {
                            i = Integer.parseInt(Register.m3740a("big"));
                        } catch (Exception unused) {
                            i = 0;
                        }
                        Register.m3741a(String.valueOf(i + 1), "big");
                        MainActivity.this.mo3567j();
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                        MainActivity.f4135Z = "normal";
                        MainActivity.m3720a(MainActivity.m3726c("money") - 200, "money");
                        return;
                    }
                    MainActivity.f4153w.startAnimation(MainActivity.f4149r);
                    if (MainActivity.m3726c("language") == 0) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH COINS");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ МОНЕТ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        MainActivity mainActivity3 = MainActivity.this;
                        mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО МОНЕТ");
                    }
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                    }
                }
            });
            this.f4157B.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103626 */

                public final void onClick(View view) {
                    int i;
                    MainActivity.this.mo3390e();
                    ChestOpen.f3843x = R.drawable.normal_box;
                    if (MainActivity.f4134Y - 200 >= 0) {
                        try {
                            i = Integer.parseInt(Register.m3740a("big"));
                        } catch (Exception unused) {
                            i = 0;
                        }
                        Register.m3741a(String.valueOf(i + 1), "big");
                        MainActivity.this.mo3567j();
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                        MainActivity.f4135Z = "normal";
                        MainActivity.m3720a(MainActivity.m3726c("money") - 200, "money");
                        return;
                    }
                    MainActivity.f4153w.startAnimation(MainActivity.f4149r);
                    if (MainActivity.m3726c("language") == 0) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH COINS");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ МОНЕТ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        MainActivity mainActivity3 = MainActivity.this;
                        mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО МОНЕТ");
                    }
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                    }
                }
            });
            f4154x.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103727 */

                public final void onClick(View view) {
                    int i;
                    MainActivity.this.mo3390e();
                    if (MainActivity.f4133X - 100 >= 0) {
                        ChestOpen.f3843x = R.drawable.mega_box;
                        try {
                            i = Integer.parseInt(Register.m3740a("mega"));
                        } catch (Exception unused) {
                            i = 0;
                        }
                        Register.m3741a(String.valueOf(i + 1), "mega");
                        MainActivity.this.mo3567j();
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                        MainActivity.f4135Z = "big";
                        MainActivity.m3720a(MainActivity.m3726c("gems") - 100, "gems");
                        return;
                    }
                    MainActivity.f4154x.startAnimation(MainActivity.f4149r);
                    if (MainActivity.m3726c("language") == 0) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH GEMS");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ КРИСТАЛІВ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        MainActivity mainActivity3 = MainActivity.this;
                        mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО КРИСТАЛЛОВ");
                    }
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                    }
                }
            });
            this.f4158C.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103828 */

                public final void onClick(View view) {
                    int i;
                    MainActivity.this.mo3390e();
                    if (MainActivity.f4133X - 100 >= 0) {
                        ChestOpen.f3843x = R.drawable.mega_box;
                        try {
                            i = Integer.parseInt(Register.m3740a("mega"));
                        } catch (Exception unused) {
                            i = 0;
                        }
                        Register.m3741a(String.valueOf(i + 1), "mega");
                        MainActivity.this.mo3567j();
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                        MainActivity.f4135Z = "big";
                        MainActivity.m3720a(MainActivity.m3726c("gems") - 100, "gems");
                        return;
                    }
                    MainActivity.f4154x.startAnimation(MainActivity.f4149r);
                    if (MainActivity.m3726c("language") == 0) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH GEMS");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ КРИСТАЛІВ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        MainActivity mainActivity3 = MainActivity.this;
                        mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО КРИСТАЛЛОВ");
                    }
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                    }
                }
            });
            f4155y.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103929 */

                public final void onClick(View view) {
                    Intent intent;
                    MainActivity.this.mo3390e();
                    ChestOpen.f3843x = R.drawable.mega_box;
                    if (UnityAds.isReady(UnityAdsConfig.UnityInterstitialAdPlacement)){
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        UnityAdsConfig.showUnityInterstitialAd(MainActivity.this);
                        intent = new Intent(MainActivity.this, ChestOpen.class);
                    }else {
                        MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                        }
                        if (MainActivity.m3726c("language") == 0) {
                            MainActivity mainActivity = MainActivity.this;
                            mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            MainActivity mainActivity2 = MainActivity.this;
                            mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            MainActivity mainActivity3 = MainActivity.this;
                            mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                            return;
                        }
                        return;
                    }
                   /* MainActivity.this.f4180aQ.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build());
                    if (MainActivity.this.f4180aQ.isLoaded()) {
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.f4180aQ.show();
                        intent = new Intent(MainActivity.this, ChestOpen.class);
                    } else {
                        MainActivity.this.f4179aP.loadAd(new AdRequest.Builder().build());
                        if (MainActivity.this.f4179aP.isLoaded()) {
                            MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                            MainActivity.this.f4179aP.show();
                            intent = new Intent(MainActivity.this, ChestOpen.class);
                        } else {
                            MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                            if (MainActivity.m3726c("sounds") == 0) {
                                MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                            }
                            if (MainActivity.m3726c("language") == 0) {
                                MainActivity mainActivity = MainActivity.this;
                                mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                            }
                            if (MainActivity.m3726c("language") == 1) {
                                MainActivity mainActivity2 = MainActivity.this;
                                mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                            }
                            if (MainActivity.m3726c("language") == 2) {
                                MainActivity mainActivity3 = MainActivity.this;
                                mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                                return;
                            }
                            return;
                        }
                    }*/
                    MainActivity.this.startActivity(intent);
                    MainActivity.f4135Z = "video";
                }
            });
            this.f4159D.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104130 */

                public final void onClick(View view) {
                    Intent intent;
                    MainActivity.this.mo3390e();
                    ChestOpen.f3843x = R.drawable.mega_box;

                    if (UnityAds.isReady(UnityAdsConfig.UnityInterstitialAdPlacement)){
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        UnityAds.show(MainActivity.this,UnityAdsConfig.UnityInterstitialAdPlacement);
                        intent = new Intent(MainActivity.this, ChestOpen.class);
                    }else{
                        MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                        }
                        if (MainActivity.m3726c("language") == 0) {
                            MainActivity mainActivity = MainActivity.this;
                            mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            MainActivity mainActivity2 = MainActivity.this;
                            mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            MainActivity mainActivity3 = MainActivity.this;
                            mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                            return;
                        }

                        UnityAds.load(UnityAdsConfig.UnityInterstitialAdPlacement);
                        return;
                    }
                   /* MainActivity.this.f4180aQ.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build());
                    if (MainActivity.this.f4180aQ.isLoaded()) {
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.f4180aQ.show();
                        intent = new Intent(MainActivity.this, ChestOpen.class);
                    } else {
                        MainActivity.this.f4179aP.loadAd(new AdRequest.Builder().build());
                        if (MainActivity.this.f4179aP.isLoaded()) {
                            MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                            MainActivity.this.f4179aP.show();
                            intent = new Intent(MainActivity.this, ChestOpen.class);
                        } else {
                            MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                            if (MainActivity.m3726c("sounds") == 0) {
                                MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                            }
                            if (MainActivity.m3726c("language") == 0) {
                                MainActivity mainActivity = MainActivity.this;
                                mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                            }
                            if (MainActivity.m3726c("language") == 1) {
                                MainActivity mainActivity2 = MainActivity.this;
                                mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                            }
                            if (MainActivity.m3726c("language") == 2) {
                                MainActivity mainActivity3 = MainActivity.this;
                                mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                                return;
                            }
                            return;
                        }
                    }*/
                    MainActivity.this.startActivity(intent);
                    MainActivity.f4135Z = "video";
                }
            });
            m3729d(f4126M, "money");
            m3729d(f4128O, "ticket");
            this.f4195ar = m3726c("sounds");
            String country = Locale.getDefault().getCountry();
            if (m3726c("first_opens") == 0) {
                if (country.equals("UA")) {
                    m3720a(1, "language");
                    z = false;
                } else {
                    z = true;
                }
                if (country.equals("RU")) {
                    m3720a(2, "language");
                    z = false;
                }
                if (z) {
                    m3720a(0, "language");
                }
                m3720a(1, "first_opens");
            }
            if (m3726c("language") == 0) {
                this.f4177aM.setText("This content is not affiliated, endorsed, sponsored or  specifically approved by Supercell and Supercell is not responsible for it. For more information, see the Supercell Fan Content Policy");
                this.f4176aL.setText("Fan Content Policy");
                this.f4193ap.setText("Sounds");
                this.f4160F.setText("Eng");
                this.f4161G.setText("UA");
                this.f4162H.setText("Rus");
                this.f4160F.setBackground(getResources().getDrawable(R.drawable.lang_sellect));
                this.f4200ax.setText("Language");
                this.f4206n.setText("Change\nView ");
                this.f4207o.setText("Quit\n Game ");
                this.f4168T.setText("MINI-GAME");
                this.f4169U.setText("BRAWLERS");
                f4130S.setText("SHOP");
                this.f4209z.setText("ACHIVEMENTS");
                this.f4201ay.setText("Like The Game? ");
                this.f4202az.setText("Click Click! ");
                this.f4156A.setImageResource(R.drawable.free_case_new1);
                f4152v.setImageResource(R.drawable.free_case_new1);
                this.f4159D.setImageResource(R.drawable.video_box);
                f4155y.setImageResource(R.drawable.video_box);
            }
            if (m3726c("language") == 1) {
                this.f4177aM.setText("Цей вміст не є афілійованим, схваленим, спонсорованим або спеціально затвердженим Supercell і Supercell не несе за нього відповідальність. Для отримання додаткової інформації дивіться політику фан контенту Supercell");
                this.f4176aL.setText("ПРАВИЛА ФАН КОНТЕНТУ");
                this.f4193ap.setText("Звуки");
                this.f4160F.setText("Англ");
                this.f4161G.setText("Укр");
                this.f4170aA.setText("ПОДОБАЄТЬСЯ ГРА?\n НАТИСКАЙ!");
                this.f4162H.setText("Рос");
                this.f4161G.setBackground(getResources().getDrawable(R.drawable.lang_sellect));
                this.f4200ax.setText("Мова");
                this.f4206n.setText("Змінити\nВигляд ");
                this.f4207o.setText("Закрити\n Гру ");
                this.f4168T.setText("МІНІ ГРА");
                this.f4169U.setText("БІЙЦІ");
                f4130S.setText("МАГАЗИН");
                this.f4209z.setText("ДОСЯГНЕННЯ");
                this.f4201ay.setText("Подобається Гра? ");
                this.f4202az.setText("Натисни! ");
                this.f4156A.setImageResource(R.drawable.free_case_new_ua);
                f4152v.setImageResource(R.drawable.free_case_new_ua);
                this.f4159D.setImageResource(R.drawable.video_box_ua);
                f4155y.setImageResource(R.drawable.video_box_ua);
            }
            if (m3726c("language") == 2) {
                this.f4177aM.setText("Этот контент не является аффилированным, одобренным, спонсируемым или специально утвержденным Supercell, и Supercell не несет за него ответственности. Для получения дополнительной информации смотрите Политику Фан-Контента Supercell");
                this.f4176aL.setText("ПРАВИЛА ФАН-КОНТЕНТА");
                this.f4193ap.setText("Звуки");
                this.f4160F.setText("Англ");
                this.f4161G.setText("Укр");
                this.f4162H.setText("Рус");
                this.f4162H.setBackground(getResources().getDrawable(R.drawable.lang_sellect));
                this.f4200ax.setText("Язык");
                this.f4206n.setText("Изменить\nВид ");
                this.f4207o.setText("Закрыть\n Игру ");
                this.f4168T.setText("МИНИ-ИГРА");
                this.f4170aA.setText("НРАВИТСЯ ИГРА?\n НАЖИМАЙ!");
                this.f4169U.setText("БОЙЦЫ");
                f4130S.setText("МАГАЗИН");
                this.f4209z.setText("ДОСТИЖЕНИЯ");
                this.f4201ay.setText("Нравится Игра? ");
                this.f4202az.setText("Нажимай Нажимай! ");
                this.f4156A.setImageResource(R.drawable.free_case_new_ru);
                f4152v.setImageResource(R.drawable.free_case_new_ru);
                this.f4159D.setImageResource(R.drawable.video_box_ru);
                f4155y.setImageResource(R.drawable.video_box_ru);
            }
            if (this.f4195ar != 0) {
                if (m3726c("language") == 0) {
                    this.f4194aq.setBackground(getResources().getDrawable(R.drawable.on));
                }
                if (m3726c("language") == 2) {
                    this.f4194aq.setBackground(getResources().getDrawable(R.drawable.on_ru));
                }
                if (m3726c("language") == 1) {
                    imageView = this.f4194aq;
                    resources2 = getResources();
                    i2 = R.drawable.on_ua;
                }
                this.f4165L = new Thread() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231 */

                    public final void run() {
                        while (!MainActivity.this.f4165L.isInterrupted()) {
                            try {
                                Thread.sleep(1000);
                                MainActivity.this.runOnUiThread(new Runnable() {
                                    /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231.C10431 */

                                    public final void run() {
                                        if (MainActivity.f4132W) {
                                            int c = MainActivity.m3726c("money");
                                            MainActivity.f4133X = MainActivity.m3726c("gems");
                                            MainActivity.f4134Y = MainActivity.m3726c("money");
                                            MainActivity.f4126M.setText(String.valueOf(c));
                                            MainActivity.m3720a(c, "money");
                                            MainActivity.m3729d(MainActivity.f4127N, "gems");
                                            MainActivity.m3729d(MainActivity.f4128O, "ticket");
                                            MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                                        }
                                    }
                                });
                            } catch (InterruptedException unused) {
                                return;
                            }
                        }
                    }
                };
                this.f4165L.start();
                ArrayList<Integer> arrayList = new ArrayList<>();
                f4148q = arrayList;
                arrayList.add(0);
                f4148q.add(20);
                f4148q.add(30);
                f4148q.add(50);
                f4148q.add(80);
                f4148q.add(130);
                f4148q.add(210);
                f4148q.add(340);
                f4148q.add(550);
                m3731i();
            }
            if (m3726c("language") == 0) {
                this.f4194aq.setBackground(getResources().getDrawable(R.drawable.off));
            }
            if (m3726c("language") == 2) {
                this.f4194aq.setBackground(getResources().getDrawable(R.drawable.off_rus));
            }
            if (m3726c("language") == 1) {
                imageView = this.f4194aq;
                resources2 = getResources();
                i2 = R.drawable.off_ua;
            }
            this.f4165L = new Thread() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231 */

                public final void run() {
                    while (!MainActivity.this.f4165L.isInterrupted()) {
                        try {
                            Thread.sleep(1000);
                            MainActivity.this.runOnUiThread(new Runnable() {
                                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231.C10431 */

                                public final void run() {
                                    if (MainActivity.f4132W) {
                                        int c = MainActivity.m3726c("money");
                                        MainActivity.f4133X = MainActivity.m3726c("gems");
                                        MainActivity.f4134Y = MainActivity.m3726c("money");
                                        MainActivity.f4126M.setText(String.valueOf(c));
                                        MainActivity.m3720a(c, "money");
                                        MainActivity.m3729d(MainActivity.f4127N, "gems");
                                        MainActivity.m3729d(MainActivity.f4128O, "ticket");
                                        MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                                    }
                                }
                            });
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            };
            this.f4165L.start();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            f4148q = arrayList2;
            arrayList2.add(0);
            f4148q.add(20);
            f4148q.add(30);
            f4148q.add(50);
            f4148q.add(80);
            f4148q.add(130);
            f4148q.add(210);
            f4148q.add(340);
            f4148q.add(550);
            m3731i();
            imageView.setBackground(resources2.getDrawable(i2));
            this.f4165L = new Thread() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231 */

                public final void run() {
                    while (!MainActivity.this.f4165L.isInterrupted()) {
                        try {
                            Thread.sleep(1000);
                            MainActivity.this.runOnUiThread(new Runnable() {
                                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231.C10431 */

                                public final void run() {
                                    if (MainActivity.f4132W) {
                                        int c = MainActivity.m3726c("money");
                                        MainActivity.f4133X = MainActivity.m3726c("gems");
                                        MainActivity.f4134Y = MainActivity.m3726c("money");
                                        MainActivity.f4126M.setText(String.valueOf(c));
                                        MainActivity.m3720a(c, "money");
                                        MainActivity.m3729d(MainActivity.f4127N, "gems");
                                        MainActivity.m3729d(MainActivity.f4128O, "ticket");
                                        MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                                    }
                                }
                            });
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            };
            this.f4165L.start();
            ArrayList<Integer> arrayList22 = new ArrayList<>();
            f4148q = arrayList22;
            arrayList22.add(0);
            f4148q.add(20);
            f4148q.add(30);
            f4148q.add(50);
            f4148q.add(80);
            f4148q.add(130);
            f4148q.add(210);
            f4148q.add(340);
            f4148q.add(550);
            m3731i();
        }
        f4125I.setBackground(getResources().getDrawable(R.drawable.shelly_i));
        if (m3726c("fone") != 0) {
        }
        this.f4169U.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103020 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.menu_click).start();
                }
                MainActivity.this.startActivity(new Intent(MainActivity.this, Brawlers.class));
            }
        });
        m3729d(f4127N, "gems");
        f4130S.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103121 */

            public final void onClick(View view) {
                Intent intent;
                if (MainActivity.f4145as) {
                    MainActivity.this.mo3390e();
                    MainActivity.f4132W = false;
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.menu_click).start();
                    }
                    intent = new Intent(MainActivity.this, Shop.class);
                } else {
                    MainActivity.f4140aK.setVisibility(4);
                    MainActivity.f4130S.setBackground(MainActivity.this.getResources().getDrawable(R.drawable.shop));
                    Shop.f4307ac = false;
                    Shop.f4310l = 0;
                    MainActivity.this.mo3390e();
                    MainActivity.f4132W = false;
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.menu_click).start();
                    }
                    intent = new Intent(MainActivity.this, Shop.class);
                }
                MainActivity.this.startActivity(intent);
                MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
            }
        });
        f4152v.animate().withLayer().rotationY(1080.0f).setDuration(1500);
        f4152v.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103222 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                if (MainActivity.f4146j) {
                    int i = 0;
                    MainActivity.f4146j = false;
                    ChestOpen.f3843x = R.drawable.free_box;
                    MainActivity.this.mo3567j();
                    if (MainActivity.f4131V) {
                        try {
                            i = Integer.parseInt(Register.m3740a("free"));
                        } catch (Exception unused) {
                        }
                        Register.m3741a(String.valueOf(i + 1), "free");
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                        MainActivity.f4135Z = "free";
                    }
                }
            }
        });
        this.f4156A.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103424 */

            public final void onClick(View view) {
                MainActivity.this.mo3390e();
                if (MainActivity.f4146j) {
                    int i = 0;
                    MainActivity.f4146j = false;
                    ChestOpen.f3843x = R.drawable.free_box;
                    MainActivity.this.mo3567j();
                    if (MainActivity.f4131V) {
                        try {
                            i = Integer.parseInt(Register.m3740a("free"));
                        } catch (Exception unused) {
                        }
                        Register.m3741a(String.valueOf(i + 1), "free");
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                        MainActivity.f4135Z = "free";
                    }
                }
            }
        });
        f4153w.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103525 */

            public final void onClick(View view) {
                int i;
                MainActivity.this.mo3390e();
                ChestOpen.f3843x = R.drawable.normal_box;
                if (MainActivity.f4134Y - 200 >= 0) {
                    try {
                        i = Integer.parseInt(Register.m3740a("big"));
                    } catch (Exception unused) {
                        i = 0;
                    }
                    Register.m3741a(String.valueOf(i + 1), "big");
                    MainActivity.this.mo3567j();
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                    MainActivity.f4135Z = "normal";
                    MainActivity.m3720a(MainActivity.m3726c("money") - 200, "money");
                    return;
                }
                MainActivity.f4153w.startAnimation(MainActivity.f4149r);
                if (MainActivity.m3726c("language") == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH COINS");
                }
                if (MainActivity.m3726c("language") == 1) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ МОНЕТ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО МОНЕТ");
                }
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
            }
        });
        this.f4157B.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103626 */

            public final void onClick(View view) {
                int i;
                MainActivity.this.mo3390e();
                ChestOpen.f3843x = R.drawable.normal_box;
                if (MainActivity.f4134Y - 200 >= 0) {
                    try {
                        i = Integer.parseInt(Register.m3740a("big"));
                    } catch (Exception unused) {
                        i = 0;
                    }
                    Register.m3741a(String.valueOf(i + 1), "big");
                    MainActivity.this.mo3567j();
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                    MainActivity.f4135Z = "normal";
                    MainActivity.m3720a(MainActivity.m3726c("money") - 200, "money");
                    return;
                }
                MainActivity.f4153w.startAnimation(MainActivity.f4149r);
                if (MainActivity.m3726c("language") == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH COINS");
                }
                if (MainActivity.m3726c("language") == 1) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ МОНЕТ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО МОНЕТ");
                }
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
            }
        });
        f4154x.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103727 */

            public final void onClick(View view) {
                int i;
                MainActivity.this.mo3390e();
                if (MainActivity.f4133X - 100 >= 0) {
                    ChestOpen.f3843x = R.drawable.mega_box;
                    try {
                        i = Integer.parseInt(Register.m3740a("mega"));
                    } catch (Exception unused) {
                        i = 0;
                    }
                    Register.m3741a(String.valueOf(i + 1), "mega");
                    MainActivity.this.mo3567j();
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                    MainActivity.f4135Z = "big";
                    MainActivity.m3720a(MainActivity.m3726c("gems") - 100, "gems");
                    return;
                }
                MainActivity.f4154x.startAnimation(MainActivity.f4149r);
                if (MainActivity.m3726c("language") == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH GEMS");
                }
                if (MainActivity.m3726c("language") == 1) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ КРИСТАЛІВ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО КРИСТАЛЛОВ");
                }
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
            }
        });
        this.f4158C.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103828 */

            public final void onClick(View view) {
                int i;
                MainActivity.this.mo3390e();
                if (MainActivity.f4133X - 100 >= 0) {
                    ChestOpen.f3843x = R.drawable.mega_box;
                    try {
                        i = Integer.parseInt(Register.m3740a("mega"));
                    } catch (Exception unused) {
                        i = 0;
                    }
                    Register.m3741a(String.valueOf(i + 1), "mega");
                    MainActivity.this.mo3567j();
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    MainActivity.this.startActivity(new Intent(MainActivity.this, ChestOpen.class));
                    MainActivity.f4135Z = "big";
                    MainActivity.m3720a(MainActivity.m3726c("gems") - 100, "gems");
                    return;
                }
                MainActivity.f4154x.startAnimation(MainActivity.f4149r);
                if (MainActivity.m3726c("language") == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mo3563a(mainActivity.f4185ae, "YOU DON’T HAVE ENOUGH GEMS");
                }
                if (MainActivity.m3726c("language") == 1) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.mo3563a(mainActivity2.f4185ae, "У ТЕБЕ НЕМАЄ СТІЛЬКИ КРИСТАЛІВ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.mo3563a(mainActivity3.f4185ae, "У ТЕБЯ НЕТ СТОЛЬКО КРИСТАЛЛОВ");
                }
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                }
            }
        });
        f4155y.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C103929 */

            public final void onClick(View view) {
                Intent intent;
                MainActivity.this.mo3390e();
                ChestOpen.f3843x = R.drawable.mega_box;
                if (UnityAds.isReady(UnityAdsConfig.UnityInterstitialAdPlacement)){
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    UnityAdsConfig.showUnityInterstitialAd(MainActivity.this);
                    intent = new Intent(MainActivity.this, ChestOpen.class);
                }else {
                    MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                    }
                    if (MainActivity.m3726c("language") == 0) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        MainActivity mainActivity3 = MainActivity.this;
                        mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                        return;
                    }
                    return;
                }
               /* MainActivity.this.f4180aQ.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build());
                if (MainActivity.this.f4180aQ.isLoaded()) {
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    MainActivity.this.f4180aQ.show();
                    intent = new Intent(MainActivity.this, ChestOpen.class);
                } else {
                    MainActivity.this.f4179aP.loadAd(new AdRequest.Builder().build());
                    if (MainActivity.this.f4179aP.isLoaded()) {
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.f4179aP.show();
                        intent = new Intent(MainActivity.this, ChestOpen.class);
                    } else {
                        MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                        }
                        if (MainActivity.m3726c("language") == 0) {
                            MainActivity mainActivity = MainActivity.this;
                            mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            MainActivity mainActivity2 = MainActivity.this;
                            mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            MainActivity mainActivity3 = MainActivity.this;
                            mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                            return;
                        }
                        return;
                    }
                }*/
                MainActivity.this.startActivity(intent);
                MainActivity.f4135Z = "video";
            }
        });
        this.f4159D.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104130 */

            public final void onClick(View view) {
                Intent intent;
                MainActivity.this.mo3390e();
                ChestOpen.f3843x = R.drawable.mega_box;
                if (UnityAds.isReady(UnityAdsConfig.UnityInterstitialAdPlacement)){
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    UnityAds.show(MainActivity.this,UnityAdsConfig.UnityInterstitialAdPlacement);
                    intent = new Intent(MainActivity.this, ChestOpen.class);
                }else {
                    MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                    if (MainActivity.m3726c("sounds") == 0) {
                        MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                    }
                    if (MainActivity.m3726c("language") == 0) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        MainActivity mainActivity3 = MainActivity.this;
                        mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                        return;
                    }
                    return;
                }
               /* MainActivity.this.f4180aQ.loadAd("ca-app-pub-3940256099942544/5224354917", new AdRequest.Builder().build());
                if (MainActivity.this.f4180aQ.isLoaded()) {
                    MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                    MainActivity.this.f4180aQ.show();
                    intent = new Intent(MainActivity.this, ChestOpen.class);
                } else {
                    MainActivity.this.f4179aP.loadAd(new AdRequest.Builder().build());
                    if (MainActivity.this.f4179aP.isLoaded()) {
                        MainActivity.m3720a(MainActivity.m3726c("chest") + 1, "chest");
                        MainActivity.this.f4179aP.show();
                        intent = new Intent(MainActivity.this, ChestOpen.class);
                    } else {
                        MainActivity.f4155y.startAnimation(MainActivity.f4149r);
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer.create(MainActivity.this.getApplicationContext(), (int) R.raw.error).start();
                        }
                        if (MainActivity.m3726c("language") == 0) {
                            MainActivity mainActivity = MainActivity.this;
                            mainActivity.mo3563a(mainActivity.f4185ae, "TRY AGAIN");
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            MainActivity mainActivity2 = MainActivity.this;
                            mainActivity2.mo3563a(mainActivity2.f4185ae, "СПРОБУЙ ЗНОВУ");
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            MainActivity mainActivity3 = MainActivity.this;
                            mainActivity3.mo3563a(mainActivity3.f4185ae, "ПОВТОРИТЕ ПОПЫТКУ");
                            return;
                        }
                        return;
                    }
                }*/
                MainActivity.this.startActivity(intent);
                MainActivity.f4135Z = "video";
            }
        });
        m3729d(f4126M, "money");
        m3729d(f4128O, "ticket");
        this.f4195ar = m3726c("sounds");
        String country2 = Locale.getDefault().getCountry();
        if (m3726c("first_opens") == 0) {
        }
        if (m3726c("language") == 0) {
        }
        if (m3726c("language") == 1) {
        }
        if (m3726c("language") == 2) {
        }
        if (this.f4195ar != 0) {
        }
//        imageView.setBackground(resources2.getDrawable(i2));
        this.f4165L = new Thread() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231 */

            public final void run() {
                while (!MainActivity.this.f4165L.isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                        MainActivity.this.runOnUiThread(new Runnable() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104231.C10431 */

                            public final void run() {
                                if (MainActivity.f4132W) {
                                    int c = MainActivity.m3726c("money");
                                    MainActivity.f4133X = MainActivity.m3726c("gems");
                                    MainActivity.f4134Y = MainActivity.m3726c("money");
                                    MainActivity.f4126M.setText(String.valueOf(c));
                                    MainActivity.m3720a(c, "money");
                                    MainActivity.m3729d(MainActivity.f4127N, "gems");
                                    MainActivity.m3729d(MainActivity.f4128O, "ticket");
                                    MainActivity.this.mo3564a("com.brawl.mybestappforfansbrawlstarsboxs");
                                }
                            }
                        });
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        };
        this.f4165L.start();
        ArrayList<Integer> arrayList222 = new ArrayList<>();
        f4148q = arrayList222;
        arrayList222.add(0);
        f4148q.add(20);
        f4148q.add(30);
        f4148q.add(50);
        f4148q.add(80);
        f4148q.add(130);
        f4148q.add(210);
        f4148q.add(340);
        f4148q.add(550);
        m3731i();
    }

    @Override // androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onPostResume() {
        super.onPostResume();
        if (!ChestOpen.f3842aj) {
            f4152v.startAnimation(f4139aE);
            f4155y.startAnimation(this.f4171aF);
            f4153w.startAnimation(this.f4172aG);
            f4154x.startAnimation(this.f4173aH);
        }
        ChestOpen.f3842aj = false;
        if (f4136aB != m3726c("money")) {
            ValueAnimator ofInt = ValueAnimator.ofInt(f4136aB, m3726c("money"));
            ofInt.setDuration(1000L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104432 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MainActivity.f4126M.setText(valueAnimator.getAnimatedValue().toString());
                }
            });
            ofInt.start();
        }
        if (f4137aC != m3726c("gems")) {
            ValueAnimator ofInt2 = ValueAnimator.ofInt(f4137aC, m3726c("gems"));
            ofInt2.setDuration(1000L);
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104533 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MainActivity.f4127N.setText(valueAnimator.getAnimatedValue().toString());
                }
            });
            ofInt2.start();
        }
        if (f4138aD != m3726c("ticket")) {
            ValueAnimator ofInt3 = ValueAnimator.ofInt(f4138aD, m3726c("ticket"));
            ofInt3.setDuration(1000L);
            ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.MainActivity.C104634 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MainActivity.f4128O.setText(valueAnimator.getAnimatedValue().toString());
                }
            });
            ofInt3.start();
        }
        try {
            m3727c(this);
        } catch (Exception unused) {
        }
        m3731i();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }


    @Override
    protected void onResume() {
        UnityAds.load(UnityAdsConfig.UnityInterstitialAdPlacement);
        super.onResume();
    }
}
