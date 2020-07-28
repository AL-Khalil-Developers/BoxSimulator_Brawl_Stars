package com.brawl.mybestappforfansbrawlstarsboxs;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("ALL")
public class Info_about_you extends AppCompatActivity {

    /* renamed from: V */
    public static ImageView f4047V;

    /* renamed from: m */
    public static RelativeLayout f4048m;

    /* renamed from: A */
    TextView f4049A;

    /* renamed from: B */
    TextView f4050B;

    /* renamed from: C */
    TextView f4051C;

    /* renamed from: D */
    TextView f4052D;

    /* renamed from: E */
    TextView f4053E;

    /* renamed from: F */
    TextView f4054F;

    /* renamed from: G */
    TextView f4055G;

    /* renamed from: H */
    TextView f4056H;

    /* renamed from: I */
    TextView f4057I;

    /* renamed from: J */
    TextView f4058J;

    /* renamed from: K */
    TextView f4059K;

    /* renamed from: L */
    TextView f4060L;

    /* renamed from: M */
    TextView f4061M;

    /* renamed from: N */
    TextView f4062N;

    /* renamed from: O */
    TextView f4063O;

    /* renamed from: P */
    TextView f4064P;

    /* renamed from: Q */
    TextView f4065Q;

    /* renamed from: R */
    TextView f4066R;

    /* renamed from: S */
    TextView f4067S;

    /* renamed from: T */
    TextView f4068T;

    /* renamed from: U */
    TextView f4069U;

    /* renamed from: W */
    ImageView f4070W;

    /* renamed from: X */
    ImageView f4071X;

    /* renamed from: Y */
    Animation f4072Y;

    /* renamed from: Z */
    EditText f4073Z;

    /* renamed from: aa */
    int f4074aa;

    /* renamed from: ab */
    TextView f4075ab;

    /* renamed from: ac */
    Animation f4076ac;

    /* renamed from: j */
    RelativeLayout f4077j;

    /* renamed from: k */
    RelativeLayout f4078k;

    /* renamed from: l */
    RelativeLayout f4079l;

    /* renamed from: n */
    TextView f4080n;

    /* renamed from: o */
    TextView f4081o;

    /* renamed from: p */
    ImageView f4082p;

    /* renamed from: q */
    TextView f4083q;

    /* renamed from: r */
    TextView f4084r;

    /* renamed from: s */
    TextView f4085s;

    /* renamed from: t */
    TextView f4086t;

    /* renamed from: u */
    TextView f4087u;

    /* renamed from: v */
    TextView f4088v;

    /* renamed from: w */
    TextView f4089w;

    /* renamed from: x */
    TextView f4090x;

    /* renamed from: y */
    TextView f4091y;

    /* renamed from: z */
    TextView f4092z;

    /* renamed from: h */
    private void m3716h() {
        if (MainActivity.m3726c("fone") != 0) {
            boolean z = false;
            if (MainActivity.m3726c("fone") == R.drawable.green) {
                z = true;
            }
            if (MainActivity.m3726c("fone") == R.drawable.back_chest) {
                z = true;
            }
            if (MainActivity.m3726c("fone") == R.drawable.purple) {
                z = true;
            }
            if (MainActivity.m3726c("fone") == R.drawable.red) {
                z = true;
            }
            if (MainActivity.m3726c("fone") == R.drawable.orange) {
                z = true;
            }
            if (z) {
                try {
                    f4048m.setBackground(getResources().getDrawable(MainActivity.m3726c("fone")));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: e */
    public final void mo3390e() {
        this.f4061M.setText(this.f4085s.getText().toString());
        this.f4062N.setText(this.f4085s.getText().toString());
        this.f4063O.setText(this.f4085s.getText().toString());
        this.f4064P.setText(this.f4085s.getText().toString());
        this.f4065Q.setText(this.f4085s.getText().toString());
        this.f4066R.setText(this.f4085s.getText().toString());
        this.f4067S.setText(this.f4085s.getText().toString());
        this.f4068T.setText(this.f4085s.getText().toString());
        this.f4069U.setText(this.f4085s.getText().toString());
    }

    /* access modifiers changed from: package-private */
    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: f */
    public final void mo3391f() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.4f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(500);
        this.f4079l.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C09881 */

            public final void onAnimationEnd(Animation animation) {
                Info_about_you.this.f4079l.setVisibility(4);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f4077j.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300);
        alphaAnimation.setStartOffset(400);
        this.f4077j.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099112 */

            public final void onAnimationEnd(Animation animation) {
                Info_about_you.this.f4077j.setVisibility(4);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
    }


    /* JADX WARNING: Removed duplicated region for block: B:33:0x04a4  */
    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        TextView textView;
        String str;
        TextView textView2;
        String str2;
        TextView textView3;
        String str3;
        int i;
        int i2;
        int i3;
        super.onCreate(bundle);
        setContentView(R.layout.stat_and_sett);
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f4075ab = (TextView) findViewById(R.id.nick_color);
        if (MainActivity.m3726c("language") == 1) {
            this.f4075ab.setText("колір імені");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4075ab.setText("Цвет имени");
        }
        this.f4075ab.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100222 */

            public final void onClick(View view) {
                Info_about_you.this.f4079l.setVisibility(0);
                Info_about_you.this.f4079l.startAnimation(Info_about_you.this.f4076ac);
                Info_about_you.this.f4077j.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300);
                Info_about_you.this.f4077j.startAnimation(alphaAnimation);
                Info_about_you.this.f4078k.setVisibility(4);
            }
        });
        this.f4070W = (ImageView) findViewById(R.id.home);
        this.f4071X = (ImageView) findViewById(R.id.back);
        f4048m = (RelativeLayout) findViewById(R.id.back_lay);
        m3716h();
        this.f4080n = (TextView) findViewById(R.id.titles);
        this.f4081o = (TextView) findViewById(R.id.second_title);
        this.f4061M = (TextView) findViewById(R.id.white);
        this.f4062N = (TextView) findViewById(R.id.white_blue);
        this.f4063O = (TextView) findViewById(R.id.white_green);
        this.f4064P = (TextView) findViewById(R.id.orange);
        this.f4065Q = (TextView) findViewById(R.id.yellow);
        this.f4066R = (TextView) findViewById(R.id.pink);
        this.f4079l = (RelativeLayout) findViewById(R.id.lay_color);
        this.f4077j = (RelativeLayout) findViewById(R.id.change_nick);
        this.f4082p = (ImageView) findViewById(R.id.shester);
        this.f4083q = (TextView) findViewById(R.id.cancel);
        this.f4084r = (TextView) findViewById(R.id.save);
        this.f4073Z = (EditText) findViewById(R.id.nick_edittext);
        this.f4078k = (RelativeLayout) findViewById(R.id.inner_change);
        this.f4051C = (TextView) findViewById(R.id.title);
        this.f4052D = (TextView) findViewById(R.id.name_free);
        this.f4053E = (TextView) findViewById(R.id.name_normal);
        this.f4054F = (TextView) findViewById(R.id.name_mega);
        this.f4055G = (TextView) findViewById(R.id.name_all);
        this.f4056H = (TextView) findViewById(R.id.name_coins);
        this.f4057I = (TextView) findViewById(R.id.name_gems);
        this.f4058J = (TextView) findViewById(R.id.name_star);
        this.f4059K = (TextView) findViewById(R.id.name_tickets);
        this.f4060L = (TextView) findViewById(R.id.name_brawlers);
        this.f4067S = (TextView) findViewById(R.id.red);
        this.f4068T = (TextView) findViewById(R.id.purple);
        this.f4069U = (TextView) findViewById(R.id.salat);
        if (MainActivity.m3726c("language") == 1) {
            this.f4080n.setText("Зміна імені");
            this.f4081o.setText("Напиши своє ім’я");
            this.f4083q.setText("Скасувати");
            this.f4084r.setText("Зберегти");
            this.f4073Z.setHint("Нікнейм");
            this.f4051C.setText("ПРОФІЛЬ ");
            this.f4052D.setText("СКРИНІ");
            this.f4053E.setText("ВЕЛИКІ СКРИНІ");
            this.f4054F.setText("ГІГАНТСЬКІ СКРИНІ");
            this.f4055G.setText("ВСІ СКРИНІ");
            this.f4056H.setText("ЗІБРАНО МОНЕТ");
            this.f4057I.setText("ЗІБРАНО КРИСТАЛІВ");
            this.f4058J.setText("ЗІБРАНО ЗІРОК");
            this.f4059K.setText("ЗІБРАНО КВИТКІВ");
            this.f4060L.setText("ВІДКРИТО БІЙЦІВ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4080n.setText("Изменение имени");
            this.f4081o.setText("Напиши свое имя");
            this.f4083q.setText("Отменить");
            this.f4084r.setText("Сохранить");
            this.f4073Z.setHint("Никнейм");
            this.f4051C.setText("ПРОФИЛЬ ");
            this.f4052D.setText("ЯЩИК");
            this.f4053E.setText("БОЛЬШОЙ ЯЩИК");
            this.f4054F.setText("ГИГАНСТКИЙ ЯЩИК");
            this.f4055G.setText("ВСЕ ЯЩИКИ");
            this.f4056H.setText("ПОЛУЧЕНО МОНЕТ");
            this.f4057I.setText("ПОЛУЧЕНО КРИСТАЛЛОВ");
            this.f4058J.setText("ПОЛУЧЕНО ЗВЕЗД");
            this.f4059K.setText("ПОЛУЧЕНО БИЛЕТОВ");
            this.f4060L.setText("ОТКРЫТО БОЙЦОВ");
        }
        this.f4076ac = new ScaleAnimation(0.0f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f4076ac.setFillAfter(true);
        this.f4076ac.setDuration(500);
        this.f4061M.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100323 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4061M.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4061M.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4061M.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4062N.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100424 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4062N.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4062N.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4062N.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4063O.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100525 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4063O.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4063O.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4063O.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4064P.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100626 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4064P.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4064P.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4064P.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4065Q.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100727 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4065Q.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4065Q.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4065Q.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4066R.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100828 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4066R.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4066R.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4066R.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4067S.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C09992 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4067S.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4067S.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4067S.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4068T.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10093 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4068T.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4068T.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4068T.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4069U.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10104 */

            public final void onClick(View view) {
                Info_about_you.this.f4085s.setTextColor(Info_about_you.this.f4069U.getCurrentTextColor());
                MainActivity.f4129P.setTextColor(Info_about_you.this.f4069U.getCurrentTextColor());
                MainActivity.m3720a(Info_about_you.this.f4069U.getCurrentTextColor(), "color");
                Info_about_you.this.mo3391f();
            }
        });
        this.f4090x = (TextView) findViewById(R.id.collected_coins);
        this.f4091y = (TextView) findViewById(R.id.collected_gems);
        this.f4092z = (TextView) findViewById(R.id.collected_stars);
        this.f4049A = (TextView) findViewById(R.id.collected_tickets);
        this.f4050B = (TextView) findViewById(R.id.open_brawlers);
        this.f4072Y = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        this.f4071X.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10115 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(Info_about_you.this, (int) R.raw.menu_cancel).start();
                }
                Info_about_you.this.finish();
            }
        });
        this.f4070W.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10126 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(Info_about_you.this, (int) R.raw.menu_cancel).start();
                }
                Info_about_you.this.finish();
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        f4047V = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10137 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(Info_about_you.this, (int) R.raw.menu_click).start();
                }
                Info_about_you.this.startActivity(new Intent(Info_about_you.this, IconsSelector.class));
            }
        });
        if (MainActivity.m3726c("icon") != 0) {
            try {
                f4047V.setBackground(getResources().getDrawable(MainActivity.m3726c("icon")));
            } catch (Exception unused) {
            }
            this.f4085s = (TextView) findViewById(R.id.nick);
            this.f4086t = (TextView) findViewById(R.id.all_boxes);
            this.f4087u = (TextView) findViewById(R.id.free_case);
            this.f4088v = (TextView) findViewById(R.id.normal_case);
            this.f4089w = (TextView) findViewById(R.id.open_mega_box);
            if (Register.m3740a("free").equals("")) {
                textView = this.f4087u;
                str = Register.m3740a("free");
            } else {
                textView = this.f4087u;
                str = "0";
            }
            textView.setText(str);
            if (Register.m3740a("big").equals("")) {
                textView2 = this.f4088v;
                str2 = Register.m3740a("big");
            } else {
                textView2 = this.f4088v;
                str2 = "0";
            }
            textView2.setText(str2);
            if (Register.m3740a("mega").equals("")) {
                textView3 = this.f4089w;
                str3 = Register.m3740a("mega");
            } else {
                textView3 = this.f4089w;
                str3 = "0";
            }
            textView3.setText(str3);
            this.f4085s.setText(Register.m3740a("name"));
            mo3390e();
            final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.4f, 1, 0.5f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setDuration(500);
            scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10148 */

                public final void onAnimationEnd(Animation animation) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500);
                    Info_about_you.this.f4077j.startAnimation(alphaAnimation);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10148.C10151 */

                        public final void onAnimationEnd(Animation animation) {
                            Info_about_you.this.f4077j.setVisibility(4);
                        }

                        public final void onAnimationRepeat(Animation animation) {
                        }

                        public final void onAnimationStart(Animation animation) {
                        }
                    });
                    Info_about_you.this.f4085s.setEnabled(true);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            this.f4085s.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10169 */

                public final void onClick(View view) {
                    Info_about_you.this.f4077j.setVisibility(0);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300);
                    Info_about_you.this.f4077j.startAnimation(alphaAnimation);
                    Info_about_you.this.f4076ac.setStartOffset(300);
                    Info_about_you.this.f4078k.startAnimation(Info_about_you.this.f4076ac);
                    Info_about_you.this.f4085s.setEnabled(false);
                }
            });
            this.f4083q.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C098910 */

                public final void onClick(View view) {
                    Info_about_you.this.f4083q.startAnimation(Info_about_you.this.f4072Y);
                    Info_about_you.this.f4078k.startAnimation(scaleAnimation);
                }
            });
            this.f4084r.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099011 */

                public final void onClick(View view) {
                    Info_about_you.this.f4084r.startAnimation(Info_about_you.this.f4072Y);
                    if (!Info_about_you.this.f4073Z.getText().toString().equals("")) {
                        Register.m3741a(Info_about_you.this.f4073Z.getText().toString(), "name");
                        MainActivity.m3720a(1, "1");
                        Info_about_you.this.f4085s.setText(Info_about_you.this.f4073Z.getText().toString());
                        Info_about_you.this.mo3390e();
                        MainActivity.f4129P.setText(Info_about_you.this.f4073Z.getText().toString());
                        Info_about_you.this.f4078k.startAnimation(scaleAnimation);
                        return;
                    }
                    Toast.makeText(Info_about_you.this, "Write you nickname", 0).show();
                }
            });
            this.f4090x.setText(MainActivity.f4126M.getText().toString());
            this.f4091y.setText(MainActivity.f4127N.getText().toString());
            this.f4049A.setText(MainActivity.f4128O.getText().toString());
            int i4 = 0;
            int i5 = 0;
            for (i = 0; i < 33; i++) {
                if (MainActivity.m3726c(String.valueOf(i)) != 0) {
                    i5++;
                }
            }
            TextView textView4 = this.f4050B;
            textView4.setText(i5 + "/33");
            this.f4087u.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099213 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4087u.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4088v.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099314 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4088v.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4089w.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099415 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4089w.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4086t.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099516 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4086t.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4090x.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099617 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4090x.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4091y.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099718 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4091y.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4049A.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099819 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4049A.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4092z.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100020 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4092z.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            this.f4050B.setOnTouchListener(new View.OnTouchListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100121 */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    Info_about_you.this.f4050B.startAnimation(Info_about_you.this.f4072Y);
                    return false;
                }
            });
            i2 = Integer.parseInt(Register.m3740a("free"));
            i3 = Integer.parseInt(Register.m3740a("big"));
            i4 = Integer.parseInt(Register.m3740a("mega"));
            this.f4074aa = i2 + i3 + i4;
            TextView textView5 = this.f4086t;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4074aa);
            textView5.setText(sb.toString());
        }
        f4047V.setBackground(getResources().getDrawable(R.drawable.shelly_i));
        this.f4085s = (TextView) findViewById(R.id.nick);
        this.f4086t = (TextView) findViewById(R.id.all_boxes);
        this.f4087u = (TextView) findViewById(R.id.free_case);
        this.f4088v = (TextView) findViewById(R.id.normal_case);
        this.f4089w = (TextView) findViewById(R.id.open_mega_box);
        if (Register.m3740a("free").equals("")) {
        }
        //ToDo: check...
        /*textView.setText(str);
        if (Register.m3740a("big").equals("")) {
        }
        textView2.setText(str2);
        if (Register.m3740a("mega").equals("")) {
        }
        textView3.setText(str3);*/
        this.f4085s.setText(Register.m3740a("name"));
        mo3390e();
        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.4f, 1, 0.5f);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation2.setDuration(500);
        scaleAnimation2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10148 */

            public final void onAnimationEnd(Animation animation) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500);
                Info_about_you.this.f4077j.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10148.C10151 */

                    public final void onAnimationEnd(Animation animation) {
                        Info_about_you.this.f4077j.setVisibility(4);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }
                });
                Info_about_you.this.f4085s.setEnabled(true);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f4085s.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C10169 */

            public final void onClick(View view) {
                Info_about_you.this.f4077j.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300);
                Info_about_you.this.f4077j.startAnimation(alphaAnimation);
                Info_about_you.this.f4076ac.setStartOffset(300);
                Info_about_you.this.f4078k.startAnimation(Info_about_you.this.f4076ac);
                Info_about_you.this.f4085s.setEnabled(false);
            }
        });
        this.f4083q.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C098910 */

            public final void onClick(View view) {
                Info_about_you.this.f4083q.startAnimation(Info_about_you.this.f4072Y);
                Info_about_you.this.f4078k.startAnimation(scaleAnimation2);
            }
        });
        this.f4084r.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099011 */

            public final void onClick(View view) {
                Info_about_you.this.f4084r.startAnimation(Info_about_you.this.f4072Y);
                if (!Info_about_you.this.f4073Z.getText().toString().equals("")) {
                    Register.m3741a(Info_about_you.this.f4073Z.getText().toString(), "name");
                    MainActivity.m3720a(1, "1");
                    Info_about_you.this.f4085s.setText(Info_about_you.this.f4073Z.getText().toString());
                    Info_about_you.this.mo3390e();
                    MainActivity.f4129P.setText(Info_about_you.this.f4073Z.getText().toString());
                    Info_about_you.this.f4078k.startAnimation(scaleAnimation2);
                    return;
                }
                Toast.makeText(Info_about_you.this, "Write you nickname", 0).show();
            }
        });
        this.f4090x.setText(MainActivity.f4126M.getText().toString());
        this.f4091y.setText(MainActivity.f4127N.getText().toString());
        this.f4049A.setText(MainActivity.f4128O.getText().toString());
        int i42 = 0;
        int i52 = 0;
        /*while (i < 33) {
        }*/
        TextView textView42 = this.f4050B;
        textView42.setText(i52 + "/33");
        this.f4087u.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099213 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4087u.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4088v.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099314 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4088v.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4089w.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099415 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4089w.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4086t.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099516 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4086t.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4090x.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099617 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4090x.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4091y.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099718 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4091y.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4049A.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C099819 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4049A.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4092z.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100020 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4092z.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        this.f4050B.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Info_about_you.C100121 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                Info_about_you.this.f4050B.startAnimation(Info_about_you.this.f4072Y);
                return false;
            }
        });
        try {
            i2 = Integer.parseInt(Register.m3740a("free"));
        } catch (Exception unused2) {
            i2 = 0;
        }
        try {
            i3 = Integer.parseInt(Register.m3740a("big"));
        } catch (Exception unused3) {
            i3 = 0;
        }
        try {
            i42 = Integer.parseInt(Register.m3740a("mega"));
        } catch (Exception unused4) {
        }
        this.f4074aa = i2 + i3 + i42;
        TextView textView52 = this.f4086t;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4074aa);
        textView52.setText(sb2.toString());
    }

    @Override // androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onPostResume() {
        super.onPostResume();
        m3716h();
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
