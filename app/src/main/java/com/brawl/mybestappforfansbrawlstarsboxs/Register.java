package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;
import pl.droidsonroids.gif.GifImageView;

@SuppressWarnings("ALL")
public class Register extends AppCompatActivity {

    /* renamed from: o */
    static SharedPreferences f4284o;

    /* renamed from: j */
    EditText f4285j;

    /* renamed from: k */
    TextView f4286k;

    /* renamed from: l */
    TextView f4287l;

    /* renamed from: m */
    TextView f4288m;

    /* renamed from: n */
    TextView f4289n;

    /* renamed from: p */
    GifImageView f4290p;

    /* renamed from: q */
    Animation f4291q;

    /* renamed from: r */
    MediaPlayer f4292r;

    /* renamed from: s */
    ImageView f4293s;

    /* renamed from: a */
    static String m3740a(String str) {
        try {
            return f4284o.getString(str, "");
        } catch (Exception unused) {
            return "Nickname";
        }
    }

    /* renamed from: a */
    static void m3741a(String str, String str2) {
        SharedPreferences.Editor edit = f4284o.edit();
        edit.putString(str2, str);
        edit.commit();
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_register);
        MainActivity.f4141aO = getPreferences(4);
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f4287l = (TextView) findViewById(R.id.congrat);
        this.f4290p = (GifImageView) findViewById(R.id.fone_gif);
        this.f4293s = (ImageView) findViewById(R.id.scells);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (((double) (memoryInfo.totalMem / 1048576)) <= 2500.0d) {
            this.f4290p.setVisibility(4);
            this.f4293s.setVisibility(0);
        } else {
            this.f4290p.setBackgroundResource(R.drawable.ideal_back_fourth);
        }
        f4284o = getPreferences(4);
        this.f4285j = (EditText) findViewById(R.id.nick);
        this.f4286k = (TextView) findViewById(R.id.ok);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4289n = (TextView) findViewById(R.id.textpolicy);
        this.f4288m = (TextView) findViewById(R.id.policy);
        this.f4288m.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Register.C10671 */

            public final void onClick(View view) {
                Register.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://supercell.com/en/fan-content-policy")));
            }
        });
        String country = Locale.getDefault().getCountry();
        if (country.equals("UA")) {
            this.f4289n.setText("Цей вміст не є афілійованим, схваленим, спонсорованим або спеціально затвердженим Supercell і Supercell не несе за нього відповідальність. Для отримання додаткової інформації дивіться політику фан контенту Supercell: www.supercell.com/fan-content-policy");
            this.f4288m.setText("ПРАВИЛА ФАН КОНТЕНТУ");
            this.f4285j.setHint("Ім’я");
            textView.setText("Введи Свій Нікнейм");
            this.f4287l.setText(" Ласкаво просимо ");
            this.f4286k.setText("Зберегти");
        }
        if (country.equals("RU")) {
            this.f4289n.setText("Этот контент не является аффилированным, одобренным, спонсируемым или специально утвержденным Supercell, и Supercell не несет за него ответственности. Для получения дополнительной информации смотрите Политику Фан-Контента Supercell: www.supercell.com/fan-content-policy");
            this.f4288m.setText("ПРАВИЛА ФАН-КОНТЕНТА");
            textView.setText("Введи Свой Никнейм");
            this.f4285j.setHint("ИМЯ");
            this.f4287l.setText(" Добро пожаловать ");
            this.f4286k.setText("Сохранить");
        }
        if (!m3740a("name").equals("")) {
            startActivity(new Intent(this, MainActivity.class));
        } else {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setDuration(1000);
            ((RelativeLayout) findViewById(R.id.inner_change)).startAnimation(scaleAnimation);
        }
        this.f4286k.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.Register.C10682 */

            public final void onClick(View view) {
                try {
                    Register.this.f4291q = AnimationUtils.loadAnimation(Register.this, R.anim.pow_up);
                    Register.this.f4286k.startAnimation(Register.this.f4291q);
                    if (!Register.this.f4285j.getText().toString().equals("")) {
                        Register.this.f4292r = MediaPlayer.create(Register.this, (int) R.raw.menu_click);
                        Register.this.f4292r.start();
                        Register.m3741a(Register.this.f4285j.getText().toString(), "name");
                        MainActivity.m3720a(1, "1");
                        Register.this.startActivity(new Intent(Register.this, MainActivity.class));
                        Register.this.finish();
                        return;
                    }
                    Register.this.f4292r = MediaPlayer.create(Register.this, (int) R.raw.menu_cancel);
                    Register.this.f4292r.start();
                    Toast.makeText(Register.this, "Write you nickname", 0).show();
                } catch (Exception unused) {
                    Register.this.startActivity(new Intent(Register.this, MainActivity.class));
                }
            }
        });
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
