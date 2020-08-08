package com.brawl.mybestappforfansbrawlstarsboxs;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

@SuppressWarnings("ALL")
public class ChestOpen extends AppCompatActivity {

    /* renamed from: ae */
    static Animation f3841ae;

    /* renamed from: aj */
    public static boolean f3842aj;

    /* renamed from: x */
    static int f3843x;

    /* renamed from: A */
    int f3844A = 0;

    /* renamed from: B */
    ArrayList<C1135f> f3845B;

    /* renamed from: C */
    String f3846C;

    /* renamed from: D */
    RecyclerView f3847D;

    /* renamed from: E */
    RelativeLayout f3848E;

    /* renamed from: F */
    RelativeLayout f3849F;

    /* renamed from: G */
    AnimationDrawable f3850G;

    /* renamed from: H */
    ArrayList<String> f3851H;

    /* renamed from: I */
    TextView f3852I;

    /* renamed from: J */
    Animation f3853J;

    /* renamed from: K */
    ImageView f3854K;

    /* renamed from: L */
    int f3855L;

    /* renamed from: M */
    TextView f3856M;

    /* renamed from: N */
    TextView f3857N;

    /* renamed from: O */
    ImageView f3858O;

    /* renamed from: P */
    ArrayList<Integer> f3859P;

    /* renamed from: Q */
    ArrayList<Integer> f3860Q;

    /* renamed from: R */
    ArrayList<String> f3861R;

    /* renamed from: S */
    RelativeLayout f3862S;

    /* renamed from: T */
    ImageView f3863T;

    /* renamed from: U */
    String f3864U;

    /* renamed from: V */
    Random f3865V;

    /* renamed from: W */
    TextView f3866W;

    /* renamed from: X */
    int f3867X = 2160;

    /* renamed from: Y */
    int f3868Y;

    /* renamed from: Z */
    int f3869Z;

    /* renamed from: aA */
    RelativeLayout f3870aA;

    /* renamed from: aB */
    int f3871aB = 0;

    /* renamed from: aC */
    RelativeLayout f3872aC;

    /* renamed from: aD */
    ImageView f3873aD;

    /* renamed from: aE */
    ImageView f3874aE;

    /* renamed from: aF */
    RelativeLayout f3875aF;

    /* renamed from: aG */
    RelativeLayout f3876aG;

    /* renamed from: aH */
    LinearLayout f3877aH;

    /* renamed from: aI */
    ImageView f3878aI;

    /* renamed from: aJ */
    ImageView f3879aJ;

    /* renamed from: aK */
    TextView f3880aK;

    /* renamed from: aL */
    TextView f3881aL;

    /* renamed from: aM */
    TextView f3882aM;

    /* renamed from: aN */
    TextView f3883aN;

    /* renamed from: aO */
    ArrayList<String> f3884aO;

    /* renamed from: aP */
    ArrayList<String> f3885aP;

    /* renamed from: aQ */
    int f3886aQ;

    /* renamed from: aR */
    ArrayList<String> f3887aR;

    /* renamed from: aS */
    ArrayList<String> f3888aS;

    /* renamed from: aT */
    ArrayList<Integer> f3889aT;

    /* renamed from: aU */
    ArrayList<Integer> f3890aU;

    /* renamed from: aV */
    int f3891aV;

    /* renamed from: aW */
    ArrayList<Integer> f3892aW;

    /* renamed from: aX */
    MediaPlayer f3893aX;

    /* renamed from: aa */
    int f3894aa = 0;

    /* renamed from: ab */
    boolean f3895ab = true;

    /* renamed from: ac */
    boolean f3896ac = false;

    /* renamed from: ad */
    ImageView f3897ad;

    /* renamed from: af */
    int f3898af;

    /* renamed from: ag */
    boolean f3899ag = false;

    /* renamed from: ah */
    TextView f3900ah;

    /* renamed from: ai */
    ScaleAnimation f3901ai;

    /* renamed from: ak */
    RelativeLayout f3902ak;

    /* renamed from: al */
    ImageView f3903al;

    /* renamed from: am */
    double f3904am;

    /* renamed from: an */
    ArrayList<C1135f> f3905an;

    /* renamed from: ao */
    ArrayList<Integer> f3906ao;

    /* renamed from: ap */
    boolean f3907ap = true;

    /* renamed from: aq */
    boolean f3908aq = false;

    /* renamed from: ar */
    boolean f3909ar = false;

    /* renamed from: as */
    ImageView f3910as;

    /* renamed from: at */
    TextView f3911at;

    /* renamed from: au */
    MediaPlayer f3912au;

    /* renamed from: av */
    int f3913av;

    /* renamed from: aw */
    ArrayList<ImageView> f3914aw;

    /* renamed from: ax */
    Animation f3915ax;

    /* renamed from: ay */
    Animation f3916ay;

    /* renamed from: az */
    Animation f3917az;

    /* renamed from: j */
    GifImageView f3918j;

    /* renamed from: k */
    ArrayList<String> f3919k;

    /* renamed from: l */
    LinearLayout f3920l;

    /* renamed from: m */
    TextView f3921m;

    /* renamed from: n */
    TextView f3922n;

    /* renamed from: o */
    TextView f3923o;

    /* renamed from: p */
    Animation f3924p;

    /* renamed from: q */
    TextView f3925q;

    /* renamed from: r */
    ImageView f3926r;

    /* renamed from: s */
    Animation f3927s;

    /* renamed from: t */
    RelativeLayout f3928t;

    /* renamed from: u */
    TextView f3929u;

    /* renamed from: v */
    int f3930v;

    /* renamed from: w */
    int f3931w;

    /* renamed from: y */
    ImageView f3932y;

    /* renamed from: z */
    boolean f3933z;

    @SuppressLint({"ResourceType"})
    /* renamed from: a */
    private void m3698a(ArrayList<C1135f> arrayList, final ArrayList<Integer> arrayList2) {
        if (MainActivity.f4135Z.equals("free")) {
            this.f3868Y = 9;
            this.f3894aa = 7;
        }
        if (MainActivity.f4135Z.equals("normal")) {
            this.f3868Y = 26;
            this.f3894aa = 15;
        }
        if (MainActivity.f4135Z.equals("big")) {
            this.f3868Y = 50;
            this.f3894aa = 30;
        }
        if (MainActivity.f4135Z.equals("video")) {
            this.f3868Y = 80;
            this.f3894aa = 40;
        }
        if (MainActivity.f4135Z.equals("star")) {
            this.f3868Y = 120;
            this.f3894aa = 50;
        }
        try {
            this.f3898af = this.f3865V.nextInt(arrayList2.size());
        } catch (Exception unused) {
            if (this.f3896ac) {
                finish();
            }
            this.f3899ag = true;
            TextView textView = this.f3921m;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3855L);
            textView.setText(sb.toString());
            mo3391f();
            this.f3921m.setVisibility(0);
            this.f3849F.setVisibility(4);
            this.f3848E.setVisibility(4);
            this.f3854K.setVisibility(4);
            this.f3856M.setVisibility(4);
            this.f3920l.setVisibility(4);
            this.f3858O.setVisibility(4);
            if (MainActivity.m3726c("language") == 0) {
                this.f3866W.setText("YOU GOT");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3866W.setText("Ти Отримав ");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3866W.setText("Ты Получил ");
            }
            this.f3926r.clearAnimation();
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < this.f3845B.size(); i2++) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300);
                scaleAnimation.setStartOffset((long) i);
                i += 150;
                arrayList3.add(scaleAnimation);
            }
            C1151l lVar = new C1151l(this.f3845B, this, arrayList3);
            mo3446a(this.f3897ad, R.drawable.end_spin);
            this.f3862S.setBackgroundColor(getResources().getColor(R.color.back_color));
            this.f3863T.setBackground(getResources().getDrawable(R.drawable.back_chest));
            this.f3863T.setAlpha(0.5f);
            this.f3933z = true;
            if (!this.f3896ac) {
                this.f3847D.setAdapter(lVar);
                this.f3847D.setVisibility(0);
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(this, (int) R.raw.recycler).start();
                }
                this.f3896ac = true;
            }
        }
        if (!this.f3899ag) {
            int nextInt = this.f3865V.nextInt(this.f3868Y) + 1;
            this.f3869Z += nextInt;
            try {
                mo3446a(this.f3854K, arrayList.get(this.f3898af).f4562a);
            } catch (Exception unused2) {
                mo3446a(this.f3854K, arrayList.get(this.f3898af).f4562a);
            }
            this.f3900ah.setText(this.f3851H.get(arrayList2.get(this.f3898af).intValue()).toString());
            this.f3856M.setText(String.valueOf(nextInt));
            arrayList.get(this.f3898af).f4563b += nextInt;
            this.f3856M.setBackground(getResources().getDrawable(R.drawable.plus_stars));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(arrayList2.get(this.f3898af));
            int c = MainActivity.m3726c(sb2.toString());
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500);
            this.f3858O.setImageResource(0);
            this.f3850G.start();
            this.f3857N.startAnimation(this.f3924p);
            this.f3924p.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09581 */

                public final void onAnimationEnd(Animation animation) {
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    ChestOpen.this.f3857N.setVisibility(0);
                }
            });
            TextView textView2 = this.f3857N;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(arrayList2.get(this.f3898af));
            sb3.append(MainActivity.m3726c(sb4.toString()));
            textView2.setText(sb3.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(arrayList2.get(this.f3898af));
            int c2 = MainActivity.m3726c(sb5.toString());
            final TextView textView3 = this.f3857N;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, c2);
            ofInt.setDuration(500L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09749 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    textView3.setText(valueAnimator.getAnimatedValue().toString());
                }
            });
            ofInt.start();
            this.f3920l.setVisibility(4);
            if (c == 0) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(getApplicationContext(), (int) R.raw.new_brawler_spin).start();
                }
                this.f3919k = new ArrayList<>();
                if (MainActivity.m3726c("language") == 0) {
                    this.f3919k.add("Shelly's spread-fire shotgun blasts the other team with buckshot. Her Super destroys cover and keeps her opponents at a distance!");
                    this.f3919k.add("Nita strikes her enemies with a thunderous shockwave. Her Super summons a massive bear to fight by her side!");
                    this.f3919k.add("Colt fires an accurate burst of bullets from his dual revolvers. His Super shreds cover and extends the bullet barrage!");
                    this.f3919k.add("Bull deals massive damage up close with his shotgun. For his Super move, he charges through barriers and knocks back enemies!");
                    this.f3919k.add("Jessie's Shock Rifle shoots energy orbs that bounce between enemies. Her Super deploys a cute but deadly gun turret!");
                    this.f3919k.add("Brock fires a long-range, explosive rocket at enemies. His Super is a ballistic rocket barrage that destroys cover!");
                    this.f3919k.add("Dynamike lobs two explosive sticks of dynamite. His Super attack is a whole barrel full of dynamite that blows up cover!");
                    this.f3919k.add("Emz attacks with blasts of hair spray that deal damage over time, and slows down opponents with her Super");
                    this.f3919k.add("Bo fires three explosive arrows toward his targets. His Super ability places a trio of hidden, explosive mines on the ground!");
                    this.f3919k.add("8-Bit lumbers along like an arcade cabinet on legs. He shoots Blaster Beams and his Super boosts friendlies' damage!");
                    this.f3919k.add("Tick is a metal ball of barely controlled excitement and energy - explosive energy! ");
                    this.f3919k.add("El Primo throws a flurry of punches at his enemies. His Super is a leaping elbow drop that deals damage to all caught underneath!");
                    this.f3919k.add("Barley attacks by lobbing bottles at enemies, doing splash damage. His Super is a huge barrage of burning bottles!");
                    this.f3919k.add("Poco fires damaging sound waves at enemies. His Super can heal both Poco himself and his teammates!");
                    this.f3919k.add("This boxing botanist will plant her feet and go toe to toe! Her Super gives her tough, vegan protective gear");
                    this.f3919k.add("Rico fires a burst of bullets that bounce off walls. His Super burst is a long barrage of bouncy bullets that pierce targets!");
                    this.f3919k.add("Darryl has a powerful double-shotgun attack. His Super move is a reckless roll inside his bouncy barrel!");
                    this.f3919k.add("Penny shoots bags of coins, damaging the target and anyone standing behind. Her Super is a mortar-style cannon turret!");
                    this.f3919k.add("Carl throws his Pickaxe like a boomerang. His Super is a crazy cart spin that clobbers anyone around him");
                    this.f3919k.add("Jacky works her Jackhammer to shake up the ground and nearby enemies");
                    this.f3919k.add("Batter up! Bibi's got a sweet swing that can knock back enemies when her Home Run bar is charged. Her Super is a bouncing ball of gum that deals damage");
                    this.f3919k.add("Bea loves bugs and hugs. She shoots her mechanical drones at range, and her Super sends forth an angry army of swarming bees!");
                    this.f3919k.add("Frank swings his hammer at enemies, sending a shockwave. His Super is an especially powerful blow that stuns enemies!");
                    this.f3919k.add("Piper's sniper shots do more damage the farther they travel. Her Super drops grenades at her feet, while Piper herself leaps away!");
                    this.f3919k.add("Pam shoots from the hip, peppering targets with shrapnel. Her Super is a healing turret that restores her and teammates' health!");
                    this.f3919k.add("Nani loves her friends and looks over them with a watchful lens. She handles threats with angled shots, and her Super allows Nani to commandeer her pal Peep, who goes out with a bang!");
                    this.f3919k.add("Max goes fast! Her attack is a fast-firing blaster. Her Super speeds up her and allies!");
                    this.f3919k.add("Mortis dashes forward with each swing of his shovel. As his Super attack, he sends a cloud of bats to damage enemies and heal himself!");
                    this.f3919k.add("Mr. P is a disgruntled luggage handler who angrily hurls suitcases at opponents. His Super calls robo-porters to help him.");
                    this.f3919k.add("The spout was created to sow life and love with the help of galloping bombs. Its Super creates a plant barrier");
                    this.f3919k.add("Tara's triple tarot card attack pierces through enemies. Her Super is a black hole that sucks in all nearby enemies, causing damage!");
                    this.f3919k.add("Gene uses his magic lamp to shoot a splitting projectile. His super is a magical hand that grabs and pulls enemies close!");
                    this.f3919k.add("Spike throws cactus grenades that send needles flying, and a show-stopping Super: a field of cactus spines that slows down and damages enemies!");
                    this.f3919k.add("Crow fires a trio of poisoned daggers. As a Super move he leaps, firing daggers both on jump and on landing!");
                    this.f3919k.add("Leon shoots a quick salvo of blades at his target. His Super trick is a smoke bomb that makes him invisible for a little while!");
                    this.f3919k.add("Sandy is a sleep-deprived Brawler with powerful control over sand: casting sharp pebbles at enemies, and summoning a sandstorm to hide teammates!");
                    this.f3919k.add("Gale is a tireless handyman who gets no rest. He blasts foes with a wide shot of wind and snow and his Super pushes them back with a huge gust of wind.");
                }
                if (MainActivity.m3726c("language") == 2) {
                    this.f3919k.add("Шелли отличный воин, стреляющий со своего дробовика сразу по 3 целям. Имеет отличный супер удар, достаточно здоровья, скорости и дальности стрельбы");
                    this.f3919k.add("Нита в Brawl Stars это маленькая повелительница медведей, способная быстро разносить врагов");
                    this.f3919k.add("Больше всего усилий у вас уйдет на то что попасть вообще в кого-то, так как радиус попадания у данного персонажа всего 1 клетка, то есть вам надо точно попадать во врагов");
                    this.f3919k.add("Булл в Brawl Stars – это просто огромная банка здоровья с большим уроном");
                    this.f3919k.add("Джесси – настоящий воин на арене сражения, не смотря на свои “хрупкие” габариты. Вооружена шоковой винтовкой, которая выстреливает энергосферой, отскакивающей от врага к врагу");
                    this.f3919k.add("Брок – отличный боец дальнего боя, который наносит колоссальный урон своими ракетами, осталось только попасть");
                    this.f3919k.add("Если вы хотите прятаться за укрытием и закидывать динамитом всех вокруг, выбирайте Диномайка");
                    this.f3919k.add("Эмз атакует, разбрызгивая лак для волос, облака которого наносят урон с течением времени");
                    this.f3919k.add("Бо выпускает три взрывные стрелы. Его Супер — установка трёх секретных взрывных ловушек");
                    this.f3919k.add("8-БИТ похож на ходячий игровой автомат. Он стреляет лучами из бластера, а его Супер усиливает урон товарищей по команде");
                    this.f3919k.add("Взрывной характер и неуёмная энергия в металлической оболочке");
                    this.f3919k.add("Эль Примо обрушивает на врагов град ударов. Его Супер, удар локтем в прыжке, наносит урон всем, кто оказался рядом!");
                    this.f3919k.add("Барли - официант заведения, метающий бутылки с зажигательной смесью. Его атака - это бросок бутылки с кислотой, а при помощи Супера он обрушивает на врагов шквал огненных бутылок.");
                    this.f3919k.add("Поко атакует врагов разрушительной звуковой волной. Его Супер исцеляет его самого и его товарищей по команде!");
                    this.f3919k.add("Эта боксёрша-ботаник крепко стоит на ногах и не боится ближнего боя! Супер оплетает её прочной и стопроцентно веганской бронёй.");
                    this.f3919k.add("Выпущенные Рико пули могут отскакивать от стен. Его Супер преодолевает большую дистанцию и насквозь прошивает цель!");
                    this.f3919k.add("Атака из пары дробовиков Дэррила невероятно мощна. Его Супер — усиленная бочка, в которой он катится вперёд, отскакивая от стен по пути!");
                    this.f3919k.add("Пенни стреляет мешочками с монетами. Они наносят урон цели и любому, кто находится за ней. Её Супер — бронебашня-мортира");
                    this.f3919k.add("Карл бросает свою кирку, как бумеранг. Его Супер атака - это сумасшедшее вращение вагонетки, которая сбивает всех вокруг него.");
                    this.f3919k.add("Джеки работает своим отбойным молотком, чтобы встряхнуть землю и ближайших врагов");
                    this.f3919k.add("На поле! Когда шкала хоум-рана заряжена полностью, удар Биби отбрасывает бойцов назад. Её Супер - упругий шарик из жвачки, прошивающий врагов насквозь");
                    this.f3919k.add("Беа нравятся букашки и обнимашки. Она атакует с расстояния дронами, а её Супер вызывает армию разъяренных пчел!");
                    this.f3919k.add("Удар Фрэнка порождает взрывную волну. Его неимоверно мощный Супер оглушает противников!");
                    this.f3919k.add("Снайперские выстрелы Пайпер наносят больше урона на большой дистанции. Её Супер — четыре гранаты, бросив которые, она сбегает!");
                    this.f3919k.add("Выстрелы Пэм усыпают все вокруг шрапнелью. Её супер — лечебная турель, восстанавливающая здоровье ей и её товарищам по команде!");
                    this.f3919k.add("Нани обожает своих друзей и всегда заботится о них. Она стреляет световыми сферами в нескольких направлениях и управляет своим роботом Пипом с помощью Супера!");
                    this.f3919k.add("Макс невероятно быстра! Она стреляет из скорострельного бластера, а её Супер ускоряет её саму и товарищей по команде!");
                    this.f3919k.add("Мортис прыгает вперёд с каждым взмахом своей лопаты. Его Супер призывает стаю летучих мышей, наносящих урон врагам и исцеляющих его самого!");
                    this.f3919k.add("Мистер П. – сердитый грузчик, который кидает во врагов чемоданы. Его Супер призывает ему на помощь роботов-носильщиков.");
                    this.f3919k.add("Спраут был создан, чтобы сеять жизнь и любовь с помощью скачущих зернобомб. Его Супер создаёт преграду из растений");
                    this.f3919k.add("Три карты таро Тары насквозь пронзают врагов. Её супер — чёрная дыра, которая затягивает оказавшихся поблизости врагов, нанося им урон!");
                    this.f3919k.add("Джин выпускает из своей волшебной лампы разделяющиеся снаряды. Его супер — волшебная рука, которая хватает и притягивает к нему врагов!");
                    this.f3919k.add("Спайк бросает кактусные гранаты, осыпающие всё вокруг иголками. Его ошеломительный Супер создаёт поле с шипами, замедляющее врагов и наносящее им урон!");
                    this.f3919k.add("Ворон бросает три отравленных кинжала. Его Супер — стремительный прыжок, начиная и заканчивая который, Ворон разбрасывает по сторонам кинжалы!");
                    this.f3919k.add("Леон поражает цель роем метательных клинков. Его супер - дымовая бомба, делающая его невидимым на некоторое время!");
                    this.f3919k.add("Сэнди - это боец с хроническим недосыпом, способный управлять стихией земли: забрасывает врага колючим гравием и прячет товарищей за песчаной завесой.");
                    this.f3919k.add("Гэйл - неутомимый мастер на все руки! Он атакует врагов ветром со снегом, а его Супер отбрасывает их назад мощным порывом ветра!");
                }
                if (MainActivity.m3726c("language") == 1) {
                    this.f3919k.add("Шеллі хоробрий воїн, що стріляє зі свого дробовика відразу по 3 цілям. Має відмінний супер удар, досить здоров'я, швидкості і дальності стрільби");
                    this.f3919k.add("Ніта в Brawl Stars це маленька володарка ведмедів, здатна швидко розносити ворогів");
                    this.f3919k.add("Найбільше зусиль у вас піде на те щоб потрапити взагалі в когось, так як радіус попадання у даного персонажа всього 1 клітинка, тобто вам треба точно потрапляти у ворогів");
                    this.f3919k.add("Булл в Brawl Stars - це просто величезна банка здоров'я з сильним ударом");
                    this.f3919k.add("Джессі - справжній воїн на арені бою, не дивлячись на свої \"крихкі\" габарити. Озброєна шоковою гвинтівкою, яка вистрілює енерго сферою, яка відскакує від ворога до ворога");
                    this.f3919k.add("Брок - відмінний воїн далекого бою, який завдає колосальної шкоди своїми ракетами, залишилося тільки потрапити");
                    this.f3919k.add("Якщо ви хочете ховатися за укриттям і закидати динамітом всіх навколо, вибирайте Діномайка");
                    this.f3919k.add("ЕМЗ атакує, розбризкуючи лак для волосся, хмари якого завдають шкоди з плином часу");
                    this.f3919k.add("Бо випускає три вибухові стріли. Його Супер - установка трьох секретних вибухових пасток");
                    this.f3919k.add("8-БІТ схожий на ходячий ігровий автомат. Він стріляє променями з бластера, а його Супер підсилює шкоду товаришів по команді");
                    this.f3919k.add("Вибуховою характер і невгамовна енергія в металевій оболонці");
                    this.f3919k.add("Ель Прімо обрушує на ворогів град ударів. Його Супер, удар ліктем в стрибку, завдає шкоди всім, хто опинився поруч!");
                    this.f3919k.add("Барлі - офіціант закладу, який кидає пляшки із запальною сумішшю. Його атака - це кидок пляшки з кислотою, а за допомогою Супера він обрушує на ворогів шквал вогняних пляшок.");
                    this.f3919k.add("Поко атакує ворогів руйнівною звуковою хвилею. Його Супер зцілює його самого і його товаришів по команді!");
                    this.f3919k.add("Ця боксерка-ботанік міцно стоїть на ногах і не боїться ближнього бою! Супер обплітає її міцною і стовідсотково веганською бронею.");
                    this.f3919k.add("Випущені Ріко кулі можуть відскакувати від стін. Його Супер долає велику дистанцію і наскрізь прошиває ціль!");
                    this.f3919k.add("Атака з пари дробовиків Дерріла неймовірно потужна. Його Супер - посилена бочка, в якій він котиться вперед, відскакуючи від стін на шляху!");
                    this.f3919k.add("Пенні стріляє мішечками з монетами. Вони завдають шкоди цілі і будь-кому, хто перебуває за нею. Її Супер - броневежа-мортира");
                    this.f3919k.add("Карл кидає свою кирку, як бумеранг. Його Супер атака - це божевільне обертання вагонетки, яка збиває всіх навколо нього.");
                    this.f3919k.add("Джекі працює своїм відбійним молотком, похитуючи землю та ворогів, що знаходяться поблизу");
                    this.f3919k.add("На полі! Коли шкала хоум-рана повністю заряджено, удар Бібі відкидає бійців назад. Її Супер - пружна кулька з жуйки, яка прошиває ворогів наскрізь");
                    this.f3919k.add("Беа подобаються комашки і обнімашкі. Вона атакує з відстані дронами, а її Супер викликає армію розлючених бджіл!");
                    this.f3919k.add("Удар Френка породжує вибухову хвилю. Його неймовірно потужний Супер блокує супротивників!");
                    this.f3919k.add("Снайперські постріли Пайпер завдають більше шкоди на великій дистанції. Її Супер - чотири гранати, кинувши які, вона тікає!");
                    this.f3919k.add("Постріли Пем засипають все навколо шрапнеллю. Її супер - лікувальна турель, відновлює здоров'я їй і її товаришам по команді!");
                    this.f3919k.add("Нані обожнює своїх друзів і завжди піклується про них. Вона стріляє світловими сферами в декількох напрямках і керує своїм роботом Піпом за допомогою Супера!");
                    this.f3919k.add("Макс неймовірно швидка! Вона стріляє з швидкострільного бластера, а її Супер прискорює її саму і товаришів по команді!");
                    this.f3919k.add("Мортис стрибає вперед з кожним помахом своєї лопати. Його Супер викликає зграю кажанів, що завдають шкоди ворогам і зціляють його самого!");
                    this.f3919k.add("Містер П. - сердитий вантажник, який кидає на ворогів валізи. Його Супер закликає йому на допомогу роботів-носіїв.");
                    this.f3919k.add("Спраут був створений, щоб сіяти життя і любов за допомогою зернобомб. Його Супер створює перешкоду з рослин");
                    this.f3919k.add("Три карти таро Тари наскрізь пронизують ворогів. Її супер - чорна діра, яка затягує опинилися поблизу ворогів, завдаючи їм шкоди!");
                    this.f3919k.add("Джин випускає зі своєї чарівної лампи снаряди, які розділяються. Його супер - чарівна рука, яка захоплює і притягує до нього ворогів!");
                    this.f3919k.add("Спайк кидає гранати з кактусів, які обсипають все навколо голками. Його приголомшливий Супер створює поле з шипами, що сповільнює ворогів і завдає їм шкоди!");
                    this.f3919k.add("Ворон кидає три отруєних кинджала. Його Супер - стрімкий стрибок, починаючи і закінчуючи який, Ворон розкидає по сторонам кинджали!");
                    this.f3919k.add("Леон вражає ціль роєм метальних клинків. Його супер - димова бомба, що робить його невидимим на деякий час!");
                    this.f3919k.add("Сенді - це боєць з хронічним недосипом, здатний управляти стихією землі: закидає ворога колючим гравієм і ховає товаришів за піщаної завісою.");
                    this.f3919k.add("Гейл - невтомний майстер на всі руки! Він атакує ворогів вітром зі снігом, а його Супер відкидає їх назад могутнім поривом вітру!");
                }
                this.f3857N.clearAnimation();
                this.f3857N.setVisibility(4);
                MainActivity.m3720a(1, "l" + arrayList2.get(this.f3898af));
                this.f3866W.setVisibility(4);
                this.f3857N.setVisibility(4);
                this.f3863T.setEnabled(false);
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.new_brawler_anim);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.particles_new_brawler);
                this.f3918j.setVisibility(0);
                loadAnimation2.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09717 */

                    public final void onAnimationEnd(Animation animation) {
                        ChestOpen.this.f3918j.setVisibility(4);
                        if (ChestOpen.this.f3861R.get(((Integer) arrayList2.get(ChestOpen.this.f3898af)).intValue()).equals("f")) {
                            ChestOpen.this.f3928t.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.free_fone));
                            ChestOpen.this.f3929u.setTextColor(ChestOpen.this.getResources().getColor(R.color.new_free));
                            ChestOpen.this.mo3448b("f");
                        }
                        if (ChestOpen.this.f3861R.get(((Integer) arrayList2.get(ChestOpen.this.f3898af)).intValue()).equals("r")) {
                            ChestOpen.this.f3928t.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.rare));
                            ChestOpen.this.f3929u.setTextColor(ChestOpen.this.getResources().getColor(R.color.new_rare));
                            ChestOpen.this.mo3448b("r");
                        }
                        if (ChestOpen.this.f3861R.get(((Integer) arrayList2.get(ChestOpen.this.f3898af)).intValue()).equals("s")) {
                            ChestOpen.this.f3928t.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.superrare));
                            ChestOpen.this.f3929u.setTextColor(ChestOpen.this.getResources().getColor(R.color.new_super_rare));
                            ChestOpen.this.mo3448b("s");
                        }
                        if (ChestOpen.this.f3861R.get(((Integer) arrayList2.get(ChestOpen.this.f3898af)).intValue()).equals("e")) {
                            ChestOpen.this.f3928t.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.epik));
                            ChestOpen.this.f3929u.setTextColor(ChestOpen.this.getResources().getColor(R.color.new_epik));
                            ChestOpen.this.mo3448b("e");
                        }
                        if (ChestOpen.this.f3861R.get(((Integer) arrayList2.get(ChestOpen.this.f3898af)).intValue()).equals("m")) {
                            ChestOpen.this.f3928t.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.mifik));
                            ChestOpen.this.f3929u.setTextColor(ChestOpen.this.getResources().getColor(R.color.new_mifik));
                            ChestOpen.this.mo3448b("m");
                        }
                        if (ChestOpen.this.f3861R.get(((Integer) arrayList2.get(ChestOpen.this.f3898af)).intValue()).equals("l")) {
                            ChestOpen.this.f3928t.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.legendary));
                            ChestOpen.this.f3929u.setTextColor(ChestOpen.this.getResources().getColor(R.color.new_legendary));
                            ChestOpen.this.mo3448b("l");
                        }
                        if (ChestOpen.this.f3861R.get(((Integer) arrayList2.get(ChestOpen.this.f3898af)).intValue()).equals("h")) {
                            ChestOpen.this.f3928t.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.hromatic));
                            ChestOpen.this.f3929u.setTextColor(ChestOpen.this.getResources().getColor(R.color.new_chromatic));
                            ChestOpen.this.mo3448b("h");
                        }
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }
                });
                this.f3928t.setBackground(getResources().getDrawable(R.drawable.particles));
                this.f3928t.startAnimation(loadAnimation2);
                this.f3918j.setBackgroundResource(R.drawable.fone_particles);
                this.f3902ak.startAnimation(loadAnimation);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09728 */

                    public final void onAnimationEnd(Animation animation) {
                        ChestOpen.this.f3863T.setEnabled(true);
                        ChestOpen.this.f3902ak.setVisibility(0);
                        ChestOpen.this.f3903al.setVisibility(0);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(500);
                        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09728.C09731 */

                            public final void onAnimationEnd(Animation animation) {
                                ChestOpen.this.f3903al.setVisibility(0);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }
                        });
                        ChestOpen.this.f3903al.startAnimation(scaleAnimation);
                        if (MainActivity.m3726c("sounds") == 0) {
                            ChestOpen chestOpen = ChestOpen.this;
                            int intValue = ((Integer) arrayList2.get(chestOpen.f3898af)).intValue();
                            chestOpen.f3892aW = new ArrayList<>();
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.shelly));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.nita));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.colt));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.bull));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.jessie));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.brock));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.dinamoke));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.emz));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.bo));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.bit));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.tick));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.elprimo));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.barley));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.poco));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.rosa));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.ricko));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.darryl));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.penny));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.carl));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.jaky));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.bibi));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.bea));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.frank));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.piper));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.pam));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.nani));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.max));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.mortis));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.mrp));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.sprout));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.tara));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.gene));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.gene));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.crow));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.leon));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.sandy));
                            chestOpen.f3892aW.add(Integer.valueOf((int) R.raw.gale));
                            if (intValue != 32) {
                                chestOpen.f3893aX = MediaPlayer.create(chestOpen, chestOpen.f3892aW.get(intValue).intValue());
                            }
                            if (intValue != 31) {
                                chestOpen.f3893aX.start();
                            }
                        }
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }
                });
                this.f3920l.setVisibility(4);
                this.f3858O.setImageResource(this.f3860Q.get(arrayList2.get(this.f3898af).intValue()).intValue());
                this.f3858O.animate().withLayer().rotationY((float) this.f3867X).setDuration(2200);
                TranslateAnimation translateAnimation = new TranslateAnimation(1200.0f, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(300);
                translateAnimation.setStartOffset(2000);
                this.f3920l.setVisibility(0);
                this.f3920l.startAnimation(translateAnimation);
                this.f3867X += 1080;
                this.f3925q.setText(this.f3919k.get(arrayList2.get(this.f3898af).intValue()));
                this.f3852I.setText(this.f3851H.get(arrayList2.get(this.f3898af).intValue()).toString());
                MainActivity.m3722a(this.f3851H.get(arrayList2.get(this.f3898af).intValue()).toString(), "skin_name");
                MainActivity.f4140aK.setVisibility(0);
                MainActivity.f4130S.setBackground(getResources().getDrawable(R.drawable.shop_new_item));
            }
            if (this.f3845B.contains(arrayList.get(this.f3898af))) {
                this.f3845B.get(this.f3898af).f4563b += arrayList.get(this.f3898af).f4563b;
            } else {
                arrayList.get(this.f3898af).f4563b = nextInt;
                this.f3845B.add(arrayList.get(this.f3898af));
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(arrayList2.get(this.f3898af));
            MainActivity.m3720a(c + nextInt, sb6.toString());
            this.f3905an.remove(arrayList.get(this.f3898af));
            this.f3906ao.remove(arrayList2.get(this.f3898af));
            alphaAnimation.setDuration(500);
        }
    }

    /* renamed from: c */
    private void m3699c(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<C1135f> arrayList2 = new ArrayList<>();
        for (int i = 0; i < this.f3859P.size(); i++) {
            C1135f fVar = new C1135f(this.f3859P.get(i).intValue(), MainActivity.m3726c(String.valueOf(i)));
            if (this.f3861R.get(i).equals(str)) {
                arrayList2.add(fVar);
                arrayList.add(Integer.valueOf(i));
            }
        }
        m3698a(arrayList2, arrayList);
    }

    /* renamed from: i */
    private boolean m3700i() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        this.f3904am = (double) (memoryInfo.totalMem / 1048576);
        return this.f3904am < 2500.0d;
    }

    /* renamed from: j */
    private void m3701j() {
        this.f3884aO = new ArrayList<>();
        this.f3885aP = new ArrayList<>();
        if (MainActivity.m3726c("language") == 0) {
            this.f3884aO.add("Shell Shock");
            this.f3884aO.add("Bear With Me");
            this.f3884aO.add("Slick Boots");
            this.f3884aO.add("Berserker");
            this.f3884aO.add("Energize");
            this.f3884aO.add("Incendiary");
            this.f3884aO.add("Dyna-Jump");
            this.f3884aO.add("Bad Karma");
            this.f3884aO.add("Circling Eagle");
            this.f3884aO.add("Boosted Booster");
            this.f3884aO.add("Well Oiled");
            this.f3884aO.add("El Fuego");
            this.f3884aO.add("Medical Use");
            this.f3884aO.add("Da Capo!");
            this.f3884aO.add("Plant Life");
            this.f3884aO.add("Super Bouncy");
            this.f3884aO.add("Steel Hoops");
            this.f3884aO.add("Last Blast");
            this.f3884aO.add("Power Throw");
            this.f3884aO.add("Counter Crush");
            this.f3884aO.add("Home Run");
            this.f3884aO.add("Insta Beeload");
            this.f3884aO.add("Power Grab");
            this.f3884aO.add("Ambush");
            this.f3884aO.add("Mama's Hug");
            this.f3884aO.add("Autofocus");
            this.f3884aO.add("Super Charged");
            this.f3884aO.add("Creepy Harvest");
            this.f3884aO.add("Handle With Care");
            this.f3884aO.add("Overgrowth");
            this.f3884aO.add("Black Portal");
            this.f3884aO.add("Magic Puffs");
            this.f3884aO.add("Fertilize");
            this.f3884aO.add("Extra Toxic");
            this.f3884aO.add("Smoke Trails");
            this.f3884aO.add("Rude Sands");
            this.f3884aO.add("Blustery Blow");
            this.f3885aP.add("Shelly's Super shells slow down enemies for 3.0 seconds!");
            this.f3885aP.add("Nita recovers 500 health whenever her bear hits an enemy. When Nita deals damage, her bear regains 500 health.");
            this.f3885aP.add("Colt's movement speed is increased by 10%.");
            this.f3885aP.add("When Bull falls below 40% health, his reload speed doubles!");
            this.f3885aP.add("Jessie can repair her gun turret for 800 of its missing health by zapping it with her attack");
            this.f3885aP.add("The impact of Brock's attack sets the ground on fire. Enemies in the area take 600 damage per second! Lasts for 2 seconds.");
            this.f3885aP.add("Dynamike can ride the blast wave of his explosives to jump over obstacles!");
            this.f3885aP.add("Enemies that stay within the cloud of Emz's toxic hair spray suffer increasing damage, 20% per hit.");
            this.f3885aP.add("Bo spots enemies hidden in bushes from 150% longer distance than normally.");
            this.f3885aP.add("Increases the Damage Booster's radius by 50%.");
            this.f3885aP.add("When Tick takes no damage and doesn't attack, he starts recovering health 2.0 seconds faster than normal.");
            this.f3885aP.add("Enemies caught in El Primo's Super will burn for 1200 damage over 4 seconds.");
            this.f3885aP.add("Barley regains 400 health from each attack.");
            this.f3885aP.add("When Poco's attack hits friendly Brawlers they now heal for 700 health.");
            this.f3885aP.add("Rosa recovers 200 health per second when inside a bush.");
            this.f3885aP.add("Rico's bullets, from attack and Super alike, get supercharged by their first bounce and deal +100 damage!");
            this.f3885aP.add("Darryl's Super reinforces his barrel, reducing all damage he takes by 90% for 0.9 seconds.");
            this.f3885aP.add("When Penny's Cannon is destroyed, it shoots out one last barrage of 4 bombs targeting nearby enemies, each dealing 1680 damage.");
            this.f3885aP.add("Carl throws his Pickaxe with 13% more speed, allowing it to travel faster and return faster.");
            this.f3885aP.add("When receiving damage, Jacky returns the favor by converting 15% of the damage into a Groundbreaker counterattack.");
            this.f3885aP.add("Bibi's movement speed is increased by 12% when her Home Run bar is fully charged.");
            this.f3885aP.add("Instantly supercharge Bea's Big Sting one time if she misses a supercharged shot.");
            this.f3885aP.add("Frank steals the power of a Brawler he defeats, increasing his damage by 50% for 12 seconds!");
            this.f3885aP.add("Piper's attack deals +800 extra damage (at max range) when she's hidden in a bush.");
            this.f3885aP.add("Whenever Pam hits enemies with Scrapstorm, she heals herself and nearby friendly Brawlers for 40 health.");
            this.f3885aP.add("Peep deals up to 2500 extra damage based on his travel distance.");
            this.f3885aP.add("Max now charges her Super while moving.");
            this.f3885aP.add("Mortis reaps the life essence of Brawler he defeats, restoring 1800 of his health.");
            this.f3885aP.add("Mr. P's overstuffed suitcases bounce and burst even if they don't hit a target or obstacle.");
            this.f3885aP.add("Seed Bombs that don't make contact with enemies will explode with a larger explosion radius.");
            this.f3885aP.add("Tara's Super cracks open a dimensional portal! A shadowy version of Tara appears and attacks her enemies.");
            this.f3885aP.add("Gene heals all friendly Brawlers around him for 400 health per second.");
            this.f3885aP.add("After using Super, Spike regenerates 800 health per second by staying in its area of effect.");
            this.f3885aP.add("Crow's poison saps the strength of enemies, who deal 20% less damage while poisoned.");
            this.f3885aP.add("When Leon uses his Super, he gains a 24% boost to his movement speed for the duration of his invisibility.");
            this.f3885aP.add("Sandstorm now also damages enemies for 100 damage per second.");
            this.f3885aP.add("Gale's Super now stuns enemies that are pushed against obstacles from his Super.");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3884aO.add("контузія");
            this.f3884aO.add("Ведмежа послуга");
            this.f3884aO.add("Магнум");
            this.f3884aO.add("Берсерк");
            this.f3884aO.add("підзарядка");
            this.f3884aO.add("Підпалювач");
            this.f3884aO.add("Дінаприжок");
            this.f3884aO.add("погана карма");
            this.f3884aO.add("літаючий орел");
            this.f3884aO.add("посилений Підсилювач");
            this.f3884aO.add("Як по маслу");
            this.f3884aO.add("Ель Фуего");
            this.f3884aO.add("ліки");
            this.f3884aO.add("Так-Капо");
            this.f3884aO.add("Відпочинок на природі");
            this.f3884aO.add("Суперпружина");
            this.f3884aO.add("сталеві обручі");
            this.f3884aO.add("прощальний залп");
            this.f3884aO.add("посилений кидок");
            this.f3884aO.add("Контродробілка");
            this.f3884aO.add("Хоум-ран");
            this.f3884aO.add("миттєва перезарядка");
            this.f3884aO.add("викрадення сили");
            this.f3884aO.add("засада");
            this.f3884aO.add("Мамина турбота");
            this.f3884aO.add("Автофокус");
            this.f3884aO.add("Суперзарядка");
            this.f3884aO.add("страшні жнива");
            this.f3884aO.add("Не кантувати");
            this.f3884aO.add("Посилений ріст");
            this.f3884aO.add("Чорний портал");
            this.f3884aO.add("чарівний туман");
            this.f3884aO.add("кручена подача");
            this.f3884aO.add("Смертельна отрута");
            this.f3884aO.add("слід диму");
            this.f3884aO.add("шкідливий пісок");
            this.f3884aO.add("Бешеный порыв");
            this.f3885aP.add("Супер Шеллі контузить і уповільнює ворогів на 3 с.");
            this.f3885aP.add("Ніта відновлює 500 очок здоров'я, коли її ведмідь завдає шкоди ворогу. Коли Ніта завдає шкоди, її ведмідь відновлює 500 очок здоров'я.");
            this.f3885aP.add("Кольт рухається на 10% швидше, ніж звичайно.");
            this.f3885aP.add("Коли здоров'я Булла стає менше 40%, його швидкість перезарядки збільшується вдвічі!");
            this.f3885aP.add("Скраппі стріляє енергосферами, які відскакують від одного ворога до іншого. Після відскоку сфера пролітає 51% своєї звичайної дистанції.");
            this.f3885aP.add("Після атаки Брока земля продовжує горіти. Ті хто перебувають в вогні вороги отримують 600 очок шкоди в секунду! Ефект триває 2 секунди.");
            this.f3885aP.add("Дінамайк може перенестися через перешкоду, осідлавши вибухову хвилю!");
            this.f3885aP.add("Втрати, що отримується ворогами в хмарах отруйного лаку ЕМЗ, зростає на 20% з кожним ударом.");
            this.f3885aP.add("Бо бачить ворогів, що ховаються в кущах, з відстані на 150% більше, ніж звичайно.");
            this.f3885aP.add("Радіус дії підсилювача збільшується на 50%");
            this.f3885aP.add("Якщо Тік не втрачає здоров'я і не атакує сам, він починає відновлювати здоров'я на 2,0 сек. раніше.");
            this.f3885aP.add("Вороги, зачеплені супером Ель Прімо, отримують 1200 очок шкоди від вогню протягом 4 секунд.");
            this.f3885aP.add("Барли відновлює 400 очок здоров'я з кожною атакою.");
            this.f3885aP.add("Якщо товариші по команді потрапляють в радіус дії атаки Поко, вони відновлюють 700 очок здоров'я.");
            this.f3885aP.add("Перебуваючи в кущах, Роза відновлює собі 200 очок здоров'я в секунду.");
            this.f3885aP.add("При атаці або використанні Супера кулі Ріко набирають енергію після першого відскоку і наносять 100 очок додаткової шкоди!");
            this.f3885aP.add("Супер Дерріла підсилює його бочку і зменшує всю шкоду на 90% протягом 0,9 с.");
            this.f3885aP.add("При знищенні гармата Пенні дає залп з 4 бомб по ворогам, які перебувають поблизу. Кожна бомба завдає 1680 очок шкоди.");
            this.f3885aP.add("Карл кидає свою кирку на 13% сильніше звичайного, так що вона летить і повертатися швидше.");
            this.f3885aP.add("При отриманні шкоди Джекі перетворює 15% утрати в контратаку за допомогою ямобура.");
            this.f3885aP.add("Коли шкала Хоум-ран заряджена повністю, Бібі рухається на 12% швидше.");
            this.f3885aP.add("Беа один раз миттєво заряджає основну атаку, якщо промахується під час суперзара.");
            this.f3885aP.add("Френк забирає силу ураженого ворога, додаючи собі 50% сили на 12 секунд!");
            this.f3885aP.add("Атаки Пайпер наносять 800 очок додаткового шкоди на максимальній дистанції, коли вона ховається в кущах.");
            this.f3885aP.add("Кожен раз завдаючи шкоди Бурею осколків, Пем відновлює 40 очок здоров'я собі і найближчим союзникам.");
            this.f3885aP.add("Залежно від пройденої дистанції Піп може нанести на 2500 шкоди більше.");
            this.f3885aP.add("Макс заряджає Супер в русі.");
            this.f3885aP.add("Мортис збирає життєву енергію повалених ним ворогів, що відновлює 1400 очок його здоров'я.");
            this.f3885aP.add("Набиті битком валізи Містера П. відскакують і вибухають, навіть якщо не потрапили в ціль або перешкода");
            this.f3885aP.add("Зернобомби, що не потрапили до ворогів, вибухають, охоплюючи більший радіус.");
            this.f3885aP.add("Супер Тари відкриває просторовий портал, з якого з'являється готовий до бою з ворогами її тіньової клон.");
            this.f3885aP.add("Джин лікує всіх союзників поблизу, відновлюючи їм 400 очок здоров'я в секунду");
            this.f3885aP.add("Голки від кактусної гранати летять по кривій, що збільшує шанс потрапляння в ціль");
            this.f3885aP.add("Яд Ворона послаблює ворогів. Поки діє отрута, вони завдають на 20% менше шкоди.");
            this.f3885aP.add("Активувавши Супер, Леон рухається на 24% швидше, поки діє його невидимість");
            this.f3885aP.add("Піщана буря завдає ворогам 100 очок шкоди в секунду.");
            this.f3885aP.add("Супер тепер приголомшує ворогів при відштовхуванні до перешкод");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3884aO.add("Контузия");
            this.f3884aO.add("Медвежья услуга");
            this.f3884aO.add("Магнум");
            this.f3884aO.add("Берсерк");
            this.f3884aO.add("Подзарядка");
            this.f3884aO.add("Поджигатель");
            this.f3884aO.add("Динапрыжок");
            this.f3884aO.add("Плохая карма");
            this.f3884aO.add("Парящий орёл");
            this.f3884aO.add("Усиленный Усилитель");
            this.f3884aO.add("Как по маслу");
            this.f3884aO.add("Эль Фуэго");
            this.f3884aO.add("Лекарство");
            this.f3884aO.add("Да-Капо!");
            this.f3884aO.add("Отдых на природе");
            this.f3884aO.add("Суперотскок");
            this.f3884aO.add("Стальные обручи");
            this.f3884aO.add("Прощальный залп");
            this.f3884aO.add("Усиленный бросок");
            this.f3884aO.add("Контродробилка");
            this.f3884aO.add("Хоум-ран");
            this.f3884aO.add("Мгновенная перезарядка");
            this.f3884aO.add("Похищение силы");
            this.f3884aO.add("Засада");
            this.f3884aO.add("Мамина забота");
            this.f3884aO.add("Автофокус");
            this.f3884aO.add("Суперзарядка");
            this.f3884aO.add("Жуткая жатва");
            this.f3884aO.add("Не кантовать");
            this.f3884aO.add("Сверхрост");
            this.f3884aO.add("Чёрный портал");
            this.f3884aO.add("Волшебный туман");
            this.f3884aO.add("Крученая подача");
            this.f3884aO.add("Смертельный яд");
            this.f3884aO.add("След дыма");
            this.f3884aO.add("Вредный песок");
            this.f3884aO.add("Бешеный порыв");
            this.f3885aP.add("Супер Шелли контузит и замедляет врагов на 3 с.");
            this.f3885aP.add("Нита восстанавливает 500 очков здоровья, когда её медведь наносит урон врагу. Когда Нита наносит урон, её медведь восстанавливает 500 очков здоровья.");
            this.f3885aP.add("Кольт движется на 10% быстрее обычного.");
            this.f3885aP.add("Когда здоровье Булла становится меньше 40%, его скорость перезарядки увеличивается вдвое!");
            this.f3885aP.add("Скраппи стреляет энергосферами, которые отскакивают от одного врага к другому. После отскока сфера пролетает 51% своей обычной дистанции.");
            this.f3885aP.add("После атаки Брока земля продолжает гореть. Находящиеся в огне враги получают 600 очков урона в секунду! Эффект длится 2 секунды.");
            this.f3885aP.add("Динамайк может перенестись через препятствие, оседлав взрывную волну!");
            this.f3885aP.add("Урон, получаемый врагами в облаках ядовитого лака Эмз, возрастает на 20% с каждым ударом.");
            this.f3885aP.add("Бо видит врагов, прячущихся в кустах, с расстояния на 150% больше обычного.");
            this.f3885aP.add("Радиус действия усилителя урона увеличивается на 50%");
            this.f3885aP.add("Если Тик не теряет здоровье и не атакует сам, он начинает восстанавливать здоровье на 2,0 сек. раньше.");
            this.f3885aP.add("Враги, задетые Супером Эль Примо, получают 1200 очков урона от огня в течении 4 секунд.");
            this.f3885aP.add("Барли восстанавливает 400 очков здоровья с каждой атакой.");
            this.f3885aP.add("Если товарищи по команде попадают в радиус действия атаки Поко, они восстанавливают 700 очков здоровья.");
            this.f3885aP.add("Находясь в кустах, Роза восстанавливает себе 200 очков здоровья в секунду.");
            this.f3885aP.add("При атаке или использования Супера пули Рико набирают энергию после первого отскока и наносят 100 очков дополнительного урона!");
            this.f3885aP.add("Супер Дэррила усиливает его бочку и уменьшает весь наносимый ему урон на 90% на 0,9 с.");
            this.f3885aP.add("При уничтожении пушка Пенни даёт залп из 4 бомб по врагам, находящимся поблизости. Каждая бомба наносит 1680 очков урона.");
            this.f3885aP.add("Карл бросает свою кирку на 13% сильнее обычного, так что она летит и возвращаться быстрее.");
            this.f3885aP.add("При получении урона Джеки превращает 15% урона в контратаку с помощью ямобура.");
            this.f3885aP.add("Когда шкала Хоум-ран заряжена полностью, Биби двигается на 12% быстрее.");
            this.f3885aP.add("Беа один раз мгновенно заряжает основную атаку, если промахивается во время суперзаряженной атаки.");
            this.f3885aP.add("Фрэнк забирает силу пораженного врага, добавляя к своему урону 50% на 12 секунд!");
            this.f3885aP.add("Атаки Пайпер наносят 800 очков дополнительного урона на максимальной дистанции, когда она прячется в кустах. ");
            this.f3885aP.add("Каждый раз нанося урон Бурей лома, Пэм восстанавливает 40 очков здоровья себе и ближайшим союзникам.");
            this.f3885aP.add("В зависимости от пройденной дистанции Пип может нанести на 2500 ед.урона больше.");
            this.f3885aP.add("Макс заряжает Супер в движении.");
            this.f3885aP.add("Мортис собирает жизненную энергию поверженных им врагов, что восстанавливает 1400 очков его здоровья.");
            this.f3885aP.add("Набитые битком чемоданы Мистера П. отскакивают и взрываются, даже если не попали в цель или препятствие");
            this.f3885aP.add("Зернобомбы, не попавшие во врагов, взрываются, охватывая больший радиус.");
            this.f3885aP.add("Супер Тары открывает пространственный портал, из которого появляется готовый к сражению с врагами её теневой клон.");
            this.f3885aP.add("Джин лечит всех союзников поблизости, восстанавливая им 400 очков здоровья в секунду");
            this.f3885aP.add("Иголки от кактусной гранаты летят по кривой, что увеличивает шанс попадания в цель");
            this.f3885aP.add("Яд Ворона ослабляет врагов. Пока действует яд, они наносят на 20% меньше урона.");
            this.f3885aP.add("Активировав Супер, Леон движется на 24% быстрее, пока действует его невидимость");
            this.f3885aP.add("Песчаная буря также наносит врагам 100 очков урона в секунду.");
            this.f3885aP.add("Супер теперь оглушает врагов при отталкивании к препятствиям");
        }
        this.f3889aT = new ArrayList<>();
        this.f3890aU = new ArrayList<>();
        for (int i = 0; i < this.f3859P.size(); i++) {
            if (MainActivity.m3726c("l".concat(String.valueOf(i))) >= 9 && MainActivity.m3726c("starpower".concat(String.valueOf(i))) == 0) {
                this.f3889aT.add(this.f3859P.get(i));
                this.f3890aU.add(Integer.valueOf(i));
            }
        }
        if (this.f3889aT.size() != 0) {
            m3702k();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf((int) R.drawable.shelly_star));
            arrayList.add(Integer.valueOf((int) R.drawable.nita_star));
            arrayList.add(Integer.valueOf((int) R.drawable.colt_star));
            arrayList.add(Integer.valueOf((int) R.drawable.bull_star));
            arrayList.add(Integer.valueOf((int) R.drawable.jessie_star));
            arrayList.add(Integer.valueOf((int) R.drawable.brock_star));
            arrayList.add(Integer.valueOf((int) R.drawable.dinamike_star));
            arrayList.add(Integer.valueOf((int) R.drawable.emz_star));
            arrayList.add(Integer.valueOf((int) R.drawable.bo_star));
            arrayList.add(Integer.valueOf((int) R.drawable.bit_star));
            arrayList.add(Integer.valueOf((int) R.drawable.tick_star));
            arrayList.add(Integer.valueOf((int) R.drawable.el_primo_star));
            arrayList.add(Integer.valueOf((int) R.drawable.barley_star));
            arrayList.add(Integer.valueOf((int) R.drawable.poco_star));
            arrayList.add(Integer.valueOf((int) R.drawable.rosa_star));
            arrayList.add(Integer.valueOf((int) R.drawable.rico_star));
            arrayList.add(Integer.valueOf((int) R.drawable.darryl_star));
            arrayList.add(Integer.valueOf((int) R.drawable.penny_star));
            arrayList.add(Integer.valueOf((int) R.drawable.carl_star));
            arrayList.add(Integer.valueOf((int) R.drawable.jacky_star));
            arrayList.add(Integer.valueOf((int) R.drawable.bibi_star));
            arrayList.add(Integer.valueOf((int) R.drawable.bea_star));
            arrayList.add(Integer.valueOf((int) R.drawable.frank_star));
            arrayList.add(Integer.valueOf((int) R.drawable.piper_star));
            arrayList.add(Integer.valueOf((int) R.drawable.pam_star));
            arrayList.add(Integer.valueOf((int) R.drawable.nani_star));
            arrayList.add(Integer.valueOf((int) R.drawable.max_star));
            arrayList.add(Integer.valueOf((int) R.drawable.mortis_star));
            arrayList.add(Integer.valueOf((int) R.drawable.mr_p_star));
            arrayList.add(Integer.valueOf((int) R.drawable.sprout_star));
            arrayList.add(Integer.valueOf((int) R.drawable.tara_star));
            arrayList.add(Integer.valueOf((int) R.drawable.gene_star));
            arrayList.add(Integer.valueOf((int) R.drawable.spike_star));
            arrayList.add(Integer.valueOf((int) R.drawable.crow_star));
            arrayList.add(Integer.valueOf((int) R.drawable.leon_star));
            arrayList.add(Integer.valueOf((int) R.drawable.sandy_star));
            arrayList.add(Integer.valueOf((int) R.drawable.gale_star));
            this.f3886aQ = this.f3865V.nextInt(this.f3889aT.size());
            this.f3875aF.setVisibility(0);
            this.f3878aI.setBackground(getResources().getDrawable(((Integer) arrayList.get(this.f3890aU.get(this.f3886aQ).intValue())).intValue()));
            this.f3932y.setBackground(getResources().getDrawable(R.drawable.power_star_back));
            MainActivity.m3720a(1, "starpower" + this.f3890aU.get(this.f3886aQ));
            this.f3866W.setText("");
            this.f3863T.setEnabled(false);
            this.f3878aI.startAnimation(AnimationUtils.loadAnimation(this, R.anim.gadget_icon_anim));
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.vidvod_lay);
            final Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.gadget_lay_anim);
            if (MainActivity.m3726c("sounds") == 0) {
                MediaPlayer.create(this, (int) R.raw.gadget_and_star).start();
            }
            loadAnimation2.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C095910 */

                public final void onAnimationEnd(Animation animation) {
                    ChestOpen.this.f3863T.setEnabled(true);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C096011 */

                public final void onAnimationEnd(Animation animation) {
                    ChestOpen.this.f3879aJ.setBackground(ChestOpen.this.getResources().getDrawable(ChestOpen.this.f3889aT.get(ChestOpen.this.f3886aQ).intValue()));
                    ChestOpen.this.f3883aN.setText(ChestOpen.this.f3851H.get(ChestOpen.this.f3890aU.get(ChestOpen.this.f3886aQ).intValue()));
                    ChestOpen.this.f3882aM.setText(ChestOpen.this.f3884aO.get(ChestOpen.this.f3890aU.get(ChestOpen.this.f3886aQ).intValue()));
                    ChestOpen.this.f3881aL.setText(ChestOpen.this.f3885aP.get(ChestOpen.this.f3890aU.get(ChestOpen.this.f3886aQ).intValue()));
                    ChestOpen.this.f3876aG.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.info_about));
                    if (MainActivity.m3726c("language") == 0) {
                        ChestOpen.this.f3880aK.setText("Gadget");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        ChestOpen.this.f3880aK.setText("Гаджет");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        ChestOpen.this.f3880aK.setText("Гаджет");
                    }
                    ChestOpen.this.f3877aH.startAnimation(loadAnimation2);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            this.f3877aH.startAnimation(loadAnimation);
            return;
        }
        mo3390e();
    }

    /* renamed from: k */
    private void m3702k() {
        this.f3887aR = new ArrayList<>();
        this.f3888aS = new ArrayList<>();
        if (MainActivity.m3726c("language") == 0) {
            this.f3888aS.add("Shelly dashes ahead, skipping a few unnecessary steps!");
            this.f3888aS.add("Nita commands her bear to slam the ground, stunning all enemies within its reach.");
            this.f3888aS.add("Colt instantly recharges 2 ammo.");
            this.f3888aS.add("Bull instantly rejuvenates himself for 1,500 health.");
            this.f3888aS.add("Jessie triggers a shockwave from her turret, slowing down all enemies within it's area of effect.");
            this.f3888aS.add("Brock blasts the ground below him and propels himself into the air. The explosion deals 500 damage to nearby enemies.");
            this.f3888aS.add(" Dynamike spins furiously and throws multiple sticks of dynamite around himself. Each dynamite deals 700 damage to enemies.");
            this.f3888aS.add("EMZ pushes back all enemies around her while also dealing 500 damage.");
            this.f3888aS.add("Bo drops a totem that recharges his and any allies' Supers within the area of effect.");
            this.f3888aS.add("8-Bit instantly teleports to his Damage Booster, which is then destroyed.");
            this.f3888aS.add("Tick makes a quick dash, leaving a single mine on the ground.");
            this.f3888aS.add("El Primo grabs the closest enemy within his reach and flips them like a pancake over his broad shoulders.");
            this.f3888aS.add("Barley drops a sticky concoction that leaves a puddle, slowing down all enemies that make contact with it.");
            this.f3888aS.add("Poco and all nearby allies heal 500 health per second for 5.0 seconds.");
            this.f3888aS.add("Rosa fertilizes the ground around her and bushes instantly grow to provide great cover.");
            this.f3888aS.add("Rico blasts waves of bouncy bullets in all directions.");
            this.f3888aS.add("Darryl spin around and sprays a barrage of shots in all directions.");
            this.f3888aS.add("Penny blows up her cannon! The explosion destroys walls and deals 1,500 damage to nearby enemies.");
            this.f3888aS.add("Carl drops a trail of hot rocks behind his cart! The rocks deal 300 damage per second to enemies who step on them.");
            this.f3888aS.add("Jacky gets a burst of energy and moves 38% faster for 3.0 seconds.");
            this.f3888aS.add("Bibi heals 600 health per second for 4.0 seconds.");
            this.f3888aS.add("Bea drops a beehive with a splash of stick honey around it. The honey slows down enemies that step in it.");
            this.f3888aS.add("Frank clears any disabling effect on himself and momentarily becomes immune to stuns, slows and knockbacks.");
            this.f3888aS.add("Piper fires 4 quick shots at the closest enemy. Each shot deals 400 damage.");
            this.f3888aS.add("Pam triggers her turret to emit a pulse that heals allies inside the turret's range, including herself, for 1,200 health.");
            this.f3888aS.add("Nani detonates Peep and teleports to his last location.");
            this.f3888aS.add("Max dashes forward, and becomes immune to all damage from enemies while dashing.");
            this.f3888aS.add("Mortis spins his shovel, hitting all enemies around himself for 1,300 damage.");
            this.f3888aS.add("Mr. P buffs his current porter by increasing its damage by 150 and health by 1,000.");
            this.f3888aS.add("Sprout consumes a bush to restore 2000 health.");
            this.f3888aS.add("Tara and her allies are able to see all enemies, even inside bushes, for 5.0 seconds.");
            this.f3888aS.add("All enemies close to Gene are instantly pushed back. Gene also restores 1,000 health.");
            this.f3888aS.add("Spike shoots 3 waves of needles in all directions, dealing 520 damage per hit.");
            this.f3888aS.add("Crow gets a shield for 60% of incoming damage for 3.0 seconds.");
            this.f3888aS.add("Leon creates an illusion to confuse his enemies.");
            this.f3888aS.add("Sandy falls asleep for 2.0 seconds and his health is fully restored.");
            this.f3888aS.add("Gale drops a bounce pad underfoot, launching friend and foe alike into the air.");
            this.f3887aR.add("Fast Forward");
            this.f3887aR.add("Bear Paws");
            this.f3887aR.add("Speedloader");
            this.f3887aR.add("T-Bone Injector");
            this.f3887aR.add("Spark Plug");
            this.f3887aR.add("Rocket Laces");
            this.f3887aR.add("Fidget Spinner");
            this.f3887aR.add("Friendzoner");
            this.f3887aR.add("Super Totem");
            this.f3887aR.add("Cheat Cartridge");
            this.f3887aR.add("Backup Mine");
            this.f3887aR.add("Suplex Supplement");
            this.f3887aR.add("Sticky Syrup Mixer");
            this.f3887aR.add("Tuning Fork");
            this.f3887aR.add("Grow Light");
            this.f3887aR.add("Multiball Launcher");
            this.f3887aR.add("Recolling Rotator");
            this.f3887aR.add("Pocket Detonator");
            this.f3887aR.add("Heat Ejector");
            this.f3887aR.add("Pneumatic Booster");
            this.f3887aR.add("Vitamin Booster");
            this.f3887aR.add("Honey Molasses");
            this.f3887aR.add("Active Noise Cancelling");
            this.f3887aR.add("Auto Aimer");
            this.f3887aR.add("Pulse Modulator");
            this.f3887aR.add("Warp Blast");
            this.f3887aR.add("Phase Shifter");
            this.f3887aR.add("Combo Spinner");
            this.f3887aR.add("Service Bell");
            this.f3887aR.add("Garden Mulcher");
            this.f3887aR.add("Psychic Enhancer");
            this.f3887aR.add("Lamp Blowout");
            this.f3887aR.add("Popping Pincushion");
            this.f3887aR.add("Defense Booster");
            this.f3887aR.add("Clone Projector");
            this.f3887aR.add("Sleep Simulator");
            this.f3887aR.add("Spring Ejector");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3888aS.add("Шеллі робить кидок вперед, проходячи більшу, ніж зазвичай, відстань.");
            this.f3888aS.add("Ніта наказує своєму ведмедю нанести удар по землі, який приглушає всіх ворогів в радіусі дії.");
            this.f3888aS.add("Кольт відразу заряджає 2 шкали атаки");
            this.f3888aS.add("Булл миттєво відновлює 1500 одиниць здоров'я.");
            this.f3888aS.add("Турель Джессі породжує ударну хвилю, що сповільнює всіх ворогів, які перебувають в зоні її дії.");
            this.f3888aS.add("Брок підриває землю під собою і злітає вгору. Вибух завдає 500 од. шкоди ворогам, що знаходяться поблизу.");
            this.f3888aS.add("Дінамайк шалено обертається, розкидаючи навколо себе динаміт. Кожна динамітна шашка завдає ворогам 700 од. шкоди.");
            this.f3888aS.add("ЕМЗ відкидує назад всіх ворогів навколо себе, наносячи їм 500 од. шкоди.");
            this.f3888aS.add("Бо залишає на полі бою тотем, який відновлює супер Бо і його союзників в радіусі дії.");
            this.f3888aS.add("8-БІТ миттєво переміщується до підсилювача, який після цього вибухає.");
            this.f3888aS.add("Тік робить швидкий кидок, залишаючи за собою одну міну.");
            this.f3888aS.add("Ель Прімо лапає найближчого ворога і кидає його через плече, немов пір'їнку.");
            this.f3888aS.add("Барли розбиває пляшку з липкою сумішшю, залишаючи калюжу, яка уповільнює всіх ворогів, що наступають в неї.");
            this.f3888aS.add("Поко і всі союзники поруч з ним відновлюють 500 очок здоров'я в секунду протягом 5,0 с. Всього можуть відновити 2500 од. здоров'я");
            this.f3888aS.add("Роза удобрює навколо себе землю, де відразу ж виростають кущі, які є відмінним прикриттям.");
            this.f3888aS.add("Ріко стріляє чергами пружних куль в усі сторони.");
            this.f3888aS.add("Дерріл починає крутитися, стріляючи шквальним вогнем у всіх напрямках.");
            this.f3888aS.add("Пенні підриває свою гармату, руйнуючи стіни і завдаючи 1500 од. шкоди ворогам, що знаходяться поблизу.");
            this.f3888aS.add("Карл залишає за своєю вагонеткою шлейф гарячих каменів, що завдають 300 од. шкоди в секунду ворогам, що наступають на них.");
            this.f3888aS.add("Джекі отримує заряд енергії і рухається на 30% швидше вподовж 3.0 с.");
            this.f3888aS.add("Бібі відновлює 600 очок здоров'я в секунду протягом 4,0 с.");
            this.f3888aS.add("Беа залишає на полі бою вулик, з якого випливає калюжа липкого меду. Вороги, які настали в калюжу, сповільнюються!");
            this.f3888aS.add("Френк перериває будь-які діючі на нього негативні ефекти і стає несприйнятливим до оглушення, уповільнення і відкидання назад на 1,5 сек.");
            this.f3888aS.add("Пайпер випускає низку пострілів (4) в Найближим ворога. Кожен постріл завдає 400 од. шкоди. Всього 1600 шкоди.");
            this.f3888aS.add("Пем ставить лікувальну турель, яка дає залп, який відновлює 1200 очок здоров'я турелі, Пем і союзників в радіусі дії турелі.");
            this.f3888aS.add("Макс кидається вперед. Під час кидка вона несприйнятлива до будь-якої шкоди.");
            this.f3888aS.add("Нані підриває Піпа і переміщується на його місце.");
            this.f3888aS.add("Мортис робить помах лопатою, завдаючи всім ворогам поблизу 1300 од. шкоди.");
            this.f3888aS.add("Містер П. підсилює свого носія, підвищуючи його силу на 150 од., А його здоров'я - на 1000 очок.");
            this.f3888aS.add("Спраут з'їдає кущ, відновлюючи себі 2000 очок здоров'я.");
            this.f3888aS.add("Протягом 5.0 с. (Або раніше, якщо протягом цього часу Тара використовує атаку) Тара та її союзники можуть бачити всіх ворогів, навіть ховаються в кущах і які знаходяться в зоні невидимості.");
            this.f3888aS.add("Всіх ворогів, підібравшись близько до Джина, відкидає назад. Джин також відновлює 700 очок здоров'я.");
            this.f3888aS.add("Спайк випускає на всі боки черги голок (3), наносячи 520 од. шкоди при кожному попаданні.");
            this.f3888aS.add("Ворон отримує щит, що знижує шкоди на 60% протягом 3 с.");
            this.f3888aS.add("Леон створює свого двійника, збиваючи ворогів з пантелику.");
            this.f3888aS.add("Сенді засинає на 2,0 с. і повністю відновлює здоров'я.");
            this.f3888aS.add("Гейл кидає під ноги пружину, яка відправляє в повітря як друзів, так і ворогів.");
            this.f3887aR.add("Перемотка");
            this.f3887aR.add("Ведмежі лапи");
            this.f3887aR.add("Пристрій для перезарядки");
            this.f3887aR.add("Сочный стейк");
            this.f3887aR.add("Свічка запалювання");
            this.f3887aR.add("Реактивні кросівки");
            this.f3887aR.add("Спінер");
            this.f3887aR.add("Френдзона");
            this.f3887aR.add("Супертотем");
            this.f3887aR.add("Чіт-картридж");
            this.f3887aR.add("Запасна міна");
            this.f3887aR.add("протеїновий коктейль");
            this.f3887aR.add("липкий сироп");
            this.f3887aR.add("Камертон");
            this.f3887aR.add("фітолампа");
            this.f3887aR.add("Праща ");
            this.f3887aR.add("поворотний пристрій");
            this.f3887aR.add("кишеньковий детонатор");
            this.f3887aR.add("клапан скидання");
            this.f3887aR.add("пневмопідсилювач");
            this.f3887aR.add("Вітамінка");
            this.f3887aR.add("Медова патока");
            this.f3887aR.add("шумоподавлювач");
            this.f3887aR.add("автоматичний приціл");
            this.f3887aR.add("імпульсний модулятор");
            this.f3887aR.add("вибухове тяжіння");
            this.f3887aR.add("фазорегулятор");
            this.f3887aR.add("Комбо-спінер");
            this.f3887aR.add("Дзвінок");
            this.f3887aR.add("подрібнювач компосту");
            this.f3887aR.add("Кришталева куля");
            this.f3887aR.add("розбита лампа");
            this.f3887aR.add("Голка");
            this.f3887aR.add("Підсилювач захисту");
            this.f3887aR.add("Генератор клонів");
            this.f3887aR.add("снодійне");
            this.f3887aR.add("Пружина");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3888aS.add("Шелли делает бросок вперёд, преодалевая большее, чем обычно, расстояние.");
            this.f3888aS.add("Нита приказывает своему медведю нанести удар по земле, оглушая всех врагов в радиусе действия.");
            this.f3888aS.add("Кольт сразу заряжает 2 шкалы атаки.");
            this.f3888aS.add("Булл мгновенно восстанавливает 1500 очков здоровья.");
            this.f3888aS.add("Турель Джесси порождает ударную волну, замедляющую всех врагов, находящихся в зоне её действия.");
            this.f3888aS.add("Брок взрывает землю под собой и взмывает ввысь. Взрыв наносит 500 ед. урона врагам, находящимся поблизости.");
            this.f3888aS.add("Динамайк бешено вращается, разбрасывая вокруг себя динамит. Каждая динамитная шашка наносит врагам 700 ед. урона.");
            this.f3888aS.add("Эмз отрабасывает назад всех врагов вокруг себя, нанося им 500 ед. урона.");
            this.f3888aS.add("Бо оставляет на поле боя тотем, который восстанавливает Суперы Бо и его союзников в радиусе действия.");
            this.f3888aS.add("8-БИТ мгновенно телепортируется к усилителю урона, который после этого взрывается.");
            this.f3888aS.add("Тик делает быстрый бросок, оставляя за собой одну мину.");
            this.f3888aS.add("Эль Примо хватает ближайшего врага и бросает его через плечо, словно перышко.");
            this.f3888aS.add("Барли разбивает бутылку с липкой смесью, оставляя лужу, которая замедляет всех врагов, наступающих в неё.");
            this.f3888aS.add("Поко и все союзники рядом с ним восстанавливают 500 очков здоровья в секунду в течение 5,0 с. Всего могут восстановить 2500 здоровья.");
            this.f3888aS.add("Роза удобряет вокруг себя землю, где сразу же вырастают кусты, служащие отличным прикрытием.");
            this.f3888aS.add("Рико стреляет очередями пружинящих пуль во все стороны.");
            this.f3888aS.add("Дэррил начинает крутиться, стреляя шквальным огнём во всех направлениях.");
            this.f3888aS.add("Пенни взрывает свою пушку, разрушая стены и нанося 1500 ед. урона врагам, находящимся поблизости.");
            this.f3888aS.add("Карл оставляет за своей вагонеткой шлейф горячих камней, наносящих 300 ед. урона в секунду врагам, наступающих на них.");
            this.f3888aS.add("Джеки получает заряд энергии и двигается на 30% быстрее в течении 3.0 с.");
            this.f3888aS.add("Биби восстанавливает 600 очков здоровья в секунду в течении 4,0 с.");
            this.f3888aS.add("Беа оставляет на поле боя улей, из которого вытекает лужа липкого мёда. Враги, наступившие в лужу, замедляются!");
            this.f3888aS.add("Фрэнк прерывает любые действующие на него негативные эффекты и становится невосприимчивым к оглушению, замедлению и отбрасыванию назад на 1,5 сек.");
            this.f3888aS.add("Пайпер выпускает череду выстрелов (4) в ближаешего врага. Каждый выстрел наносит 400 ед. урона. Всего 1600 урона.");
            this.f3888aS.add("Пэм ставит лечебную турель, которая дает залп, восстанавливающий 1200 очков здоровья турели, Пэм и союзников в радиусе действия турели.");
            this.f3888aS.add("Нани взрывает Пипа и телепортируется на его место.");
            this.f3888aS.add("Макс бросается вперёд. Во время броска она невосприимчива к любому урону.");
            this.f3888aS.add("Мортис делает взмах лопатой, нанося всем врагам поблизости 1300 ед. урона.");
            this.f3888aS.add("Мистер П. усиливает своего носильщика, повышая наносимый им урон на 150 ед., а его здоровье - на 1000 очков.");
            this.f3888aS.add("Спраут съедает куст, восстанавливая себе 2000 очков здоровья.");
            this.f3888aS.add("В течение 5.0 с.(или раньше, если в течении этого времени Тара использует атаку) Тара и ее союзники могут видеть всех врагов, даже прячущихся в кустах и которые находятся в невидимости.");
            this.f3888aS.add("Всех врагов, подобравшись близко к Джину, отбрасывает назад. Джин также восстанавливает 700 очков здоровья.");
            this.f3888aS.add("Спайк выпускает во все стороны очереди иголок (3), нанося 520 ед. урона при каждом попадании.");
            this.f3888aS.add("Ворон получает щит, снижающий урон на 60% в течении 3 с.");
            this.f3888aS.add("Леон создаёт своего двойника, сбивая врагов с толку.");
            this.f3888aS.add("Сэнди засыпает на 2,0 с. и полностью восстанавливает здоровье.");
            this.f3888aS.add("Гэйл бросает под ноги пружину, которая отправляет в воздух как друзей, так и врагов.");
            this.f3887aR.add("Перемотка");
            this.f3887aR.add("Медвежьи лапы");
            this.f3887aR.add("Устройство для перезарядки");
            this.f3887aR.add("Сочный стейк");
            this.f3887aR.add("Свеча зажигания");
            this.f3887aR.add("Реактивные кроссовки");
            this.f3887aR.add("Спиннер");
            this.f3887aR.add("Френдзона");
            this.f3887aR.add("Супертотем");
            this.f3887aR.add("Чит-картридж");
            this.f3887aR.add("Запасная мина");
            this.f3887aR.add("Протеиновый коктейль");
            this.f3887aR.add("Липкий сироп");
            this.f3887aR.add("Камертон");
            this.f3887aR.add("Фитолампа");
            this.f3887aR.add("Праща");
            this.f3887aR.add("Поворотное устройство");
            this.f3887aR.add("Карманный детонатор");
            this.f3887aR.add("Клапан сброса");
            this.f3887aR.add("Пневмоусилитель");
            this.f3887aR.add("Витаминка");
            this.f3887aR.add("Медовая патока");
            this.f3887aR.add("Шумоподавитель");
            this.f3887aR.add("Автоматический прицел");
            this.f3887aR.add("Импульсный модулятор");
            this.f3887aR.add("Взрывное притяжение");
            this.f3887aR.add("Фазорегулятор");
            this.f3887aR.add("Комбо-спиннер");
            this.f3887aR.add("Звонок");
            this.f3887aR.add("Измельчитель компоста");
            this.f3887aR.add("Хрустальный шар");
            this.f3887aR.add("Разбитая лампа");
            this.f3887aR.add("Игольница");
            this.f3887aR.add("Усилитель защиты");
            this.f3887aR.add("Генератор клонов");
            this.f3887aR.add("Снотворное");
            this.f3887aR.add("Пружиномёт");
        }
    }

    /* renamed from: l */
    private void m3703l() {
        this.f3889aT = new ArrayList<>();
        this.f3890aU = new ArrayList<>();
        for (int i = 0; i < this.f3859P.size(); i++) {
            if (MainActivity.m3726c("l".concat(String.valueOf(i))) >= 7 && MainActivity.m3726c("gadget".concat(String.valueOf(i))) == 0) {
                this.f3889aT.add(this.f3859P.get(i));
                this.f3890aU.add(Integer.valueOf(i));
            }
        }
        if (this.f3889aT.size() != 0) {
            m3702k();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf((int) R.drawable.shelly_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.nita_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.colt_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.bull_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.jessie_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.brock_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.dinamike_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.emz_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.bo_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.bit_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.tick_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.el_primo_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.barley_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.poco_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.rosa_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.rico_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.darryl_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.penny_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.carl_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.jacky_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.bibi_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.bea_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.frank_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.piper_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.pam_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.nani_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.max_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.mortis_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.mr_p_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.sprout_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.tara_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.gene_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.spike_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.crow_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.leon_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.sandy_gadget));
            arrayList.add(Integer.valueOf((int) R.drawable.gale_gadget));
            this.f3891aV = this.f3865V.nextInt(this.f3889aT.size());
            this.f3875aF.setVisibility(0);
            this.f3878aI.setBackground(getResources().getDrawable(((Integer) arrayList.get(this.f3890aU.get(this.f3891aV).intValue())).intValue()));
            this.f3932y.setBackground(getResources().getDrawable(R.drawable.gadget_background));
            MainActivity.m3720a(1, "gadget" + this.f3890aU.get(this.f3891aV));
            this.f3866W.setText("");
            this.f3863T.setEnabled(false);
            this.f3878aI.startAnimation(AnimationUtils.loadAnimation(this, R.anim.gadget_icon_anim));
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.vidvod_lay);
            final Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.gadget_lay_anim);
            if (MainActivity.m3726c("sounds") == 0) {
                MediaPlayer.create(this, (int) R.raw.gadget_and_star).start();
            }
            loadAnimation2.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C096112 */

                public final void onAnimationEnd(Animation animation) {
                    ChestOpen.this.f3863T.setEnabled(true);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C096213 */

                public final void onAnimationEnd(Animation animation) {
                    ChestOpen.this.f3879aJ.setBackground(ChestOpen.this.getResources().getDrawable(ChestOpen.this.f3889aT.get(ChestOpen.this.f3891aV).intValue()));
                    ChestOpen.this.f3883aN.setText(ChestOpen.this.f3851H.get(ChestOpen.this.f3890aU.get(ChestOpen.this.f3891aV).intValue()));
                    ChestOpen.this.f3882aM.setText(ChestOpen.this.f3887aR.get(ChestOpen.this.f3890aU.get(ChestOpen.this.f3891aV).intValue()));
                    ChestOpen.this.f3881aL.setText(ChestOpen.this.f3888aS.get(ChestOpen.this.f3890aU.get(ChestOpen.this.f3891aV).intValue()));
                    ChestOpen.this.f3876aG.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.info_about));
                    if (MainActivity.m3726c("language") == 0) {
                        ChestOpen.this.f3880aK.setText("Gadget");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        ChestOpen.this.f3880aK.setText("Гаджет");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        ChestOpen.this.f3880aK.setText("Гаджет");
                    }
                    ChestOpen.this.f3877aH.startAnimation(loadAnimation2);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            this.f3877aH.startAnimation(loadAnimation);
            return;
        }
        mo3390e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3446a(ImageView imageView, int i) {
        if (this.f3904am <= 3500.0d) {
            RequestCreator a = Picasso.get().load(i);
            //ToDo: picasso issue..
           // a.deferred = true;
            a.centerCrop().into(imageView, null);
            return;
        }
        imageView.setBackground(getResources().getDrawable(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3447a(String str) {
        if (!getPackageName().equals(str)) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(67108864);
            startActivity(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3448b(String str) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3861R.size(); i3++) {
            if (this.f3861R.get(i3).equals(str)) {
                i++;
                if (MainActivity.m3726c("l".concat(String.valueOf(i3))) != 0) {
                    i2++;
                }
            }
        }
        if (str.equals("f")) {
            if (MainActivity.m3726c("language") == 0) {
                TextView textView = this.f3929u;
                textView.setText(i2 + "/" + i + " Trophy road brawlers");
            }
            if (MainActivity.m3726c("language") == 1) {
                TextView textView2 = this.f3929u;
                textView2.setText(i2 + "/" + i + " Трофейних бійців");
            }
            if (MainActivity.m3726c("language") == 2) {
                TextView textView3 = this.f3929u;
                textView3.setText(i2 + "/" + i + " Трофейных бойцов");
            }
        }
        if (str.equals("r")) {
            if (MainActivity.m3726c("language") == 0) {
                TextView textView4 = this.f3929u;
                textView4.setText(i2 + "/" + i + " Rare brawlers");
            }
            if (MainActivity.m3726c("language") == 1) {
                TextView textView5 = this.f3929u;
                textView5.setText(i2 + "/" + i + " Рідкісних бійців");
            }
            if (MainActivity.m3726c("language") == 2) {
                TextView textView6 = this.f3929u;
                textView6.setText(i2 + "/" + i + " Редких бойцов");
            }
        }
        if (str.equals("s")) {
            if (MainActivity.m3726c("language") == 0) {
                TextView textView7 = this.f3929u;
                textView7.setText(i2 + "/" + i + " Super Rare brawlers");
            }
            if (MainActivity.m3726c("language") == 1) {
                TextView textView8 = this.f3929u;
                textView8.setText(i2 + "/" + i + " Дуже Рідкісних бійців");
            }
            if (MainActivity.m3726c("language") == 2) {
                TextView textView9 = this.f3929u;
                textView9.setText(i2 + "/" + i + " Очень Редких бойцов");
            }
        }
        if (str.equals("e")) {
            if (MainActivity.m3726c("language") == 0) {
                TextView textView10 = this.f3929u;
                textView10.setText(i2 + "/" + i + " Epik brawlers");
            }
            if (MainActivity.m3726c("language") == 1) {
                TextView textView11 = this.f3929u;
                textView11.setText(i2 + "/" + i + " Епічних бійців");
            }
            if (MainActivity.m3726c("language") == 2) {
                TextView textView12 = this.f3929u;
                textView12.setText(i2 + "/" + i + " эпических бойцов");
            }
        }
        if (str.equals("m")) {
            if (MainActivity.m3726c("language") == 0) {
                TextView textView13 = this.f3929u;
                textView13.setText(i2 + "/" + i + " Mythic brawlers");
            }
            if (MainActivity.m3726c("language") == 1) {
                TextView textView14 = this.f3929u;
                textView14.setText(i2 + "/" + i + " Міфічних бійців");
            }
            if (MainActivity.m3726c("language") == 2) {
                TextView textView15 = this.f3929u;
                textView15.setText(i2 + "/" + i + " Мифических бойцов");
            }
        }
        if (str.equals("l")) {
            if (MainActivity.m3726c("language") == 0) {
                TextView textView16 = this.f3929u;
                textView16.setText(i2 + "/" + i + " Legendary brawlers");
            }
            if (MainActivity.m3726c("language") == 1) {
                TextView textView17 = this.f3929u;
                textView17.setText(i2 + "/" + i + " Легендарних бійців");
            }
            if (MainActivity.m3726c("language") == 2) {
                TextView textView18 = this.f3929u;
                textView18.setText(i2 + "/" + i + " Легендарных бойцов");
            }
        }
        if (str.equals("h")) {
            if (MainActivity.m3726c("language") == 0) {
                TextView textView19 = this.f3929u;
                textView19.setText(i2 + "/" + i + " Chromatic brawlers");
            }
            if (MainActivity.m3726c("language") == 1) {
                TextView textView20 = this.f3929u;
                textView20.setText(i2 + "/" + i + " Хроматичних бійців");
            }
            if (MainActivity.m3726c("language") == 2) {
                TextView textView21 = this.f3929u;
                textView21.setText(i2 + "/" + i + " Хроматических бойцов");
            }
        }
    }

    /* access modifiers changed from: package-private */
    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: e */
    public final void mo3390e() {
        if (this.f3907ap) {
            this.f3905an = new ArrayList<>();
            this.f3906ao = new ArrayList<>();
            if (!getPackageName().equals(this.f3864U)) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(67108864);
                startActivity(intent);
            }
            for (int i = 0; i < this.f3859P.size(); i++) {
                C1135f fVar = new C1135f(this.f3859P.get(i).intValue(), MainActivity.m3726c(String.valueOf(i)));
                if (fVar.f4563b != 0) {
                    this.f3905an.add(fVar);
                    this.f3906ao.add(Integer.valueOf(i));
                }
            }
        }
        this.f3907ap = false;
        int nextInt = new Random().nextInt(1050);
        if (MainActivity.f4135Z.equals("free") || MainActivity.f4135Z.equals("normal")) {
            if (nextInt < 950) {
                m3698a(this.f3905an, this.f3906ao);
            } else if (nextInt < 960) {
                m3699c("f");
            } else if (nextInt < 970) {
                m3699c("r");
            } else if (nextInt < 980) {
                m3699c("s");
            } else if (nextInt < 990) {
                m3699c("e");
            } else if (nextInt < 1000) {
                m3699c("m");
            } else if (nextInt < 1030) {
                m3703l();
            } else if (nextInt <= 1050) {
                m3701j();
            }
        } else if (nextInt < 950) {
            m3698a(this.f3905an, this.f3906ao);
        } else if (nextInt < 960) {
            m3699c("f");
        } else if (nextInt < 970) {
            m3699c("r");
        } else if (nextInt < 980) {
            m3699c("s");
        } else if (nextInt < 990) {
            m3699c("e");
        } else if (nextInt <= 995) {
            m3699c("l");
        } else if (nextInt < 1000) {
            m3699c("m");
        } else if (nextInt < 1010) {
            m3699c("h");
        } else if (nextInt < 1030) {
            m3703l();
        } else if (nextInt <= 1050) {
            m3701j();
        }
    }

    /* access modifiers changed from: package-private */
   // @Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: f */
    public final void mo3391f() {
        if (this.f3931w != 0) {
            this.f3922n.setVisibility(0);
            TextView textView = this.f3922n;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3931w);
            textView.setText(sb.toString());
        } else {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3922n.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            this.f3922n.setLayoutParams(layoutParams);
        }
        if (this.f3930v != 0) {
            this.f3923o.setVisibility(0);
            TextView textView2 = this.f3923o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f3930v);
            textView2.setText(sb2.toString());
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3923o.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
            this.f3923o.setLayoutParams(layoutParams2);
        }
        if (this.f3930v == 0 && this.f3931w == 0) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f3921m.getLayoutParams();
            layoutParams3.rightMargin = 0;
            layoutParams3.leftMargin = 0;
            this.f3921m.setLayoutParams(layoutParams3);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        this.f3921m.startAnimation(scaleAnimation);
        this.f3922n.startAnimation(scaleAnimation);
        this.f3923o.startAnimation(scaleAnimation);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3449h() {
        if (!m3700i()) {
            this.f3870aA.setVisibility(0);
            this.f3914aw.get(0).startAnimation(this.f3915ax);
            this.f3914aw.get(1).startAnimation(this.f3916ay);
            this.f3914aw.get(2).startAnimation(this.f3917az);
            this.f3914aw.get(3).startAnimation(this.f3915ax);
            this.f3914aw.get(4).startAnimation(this.f3916ay);
            this.f3914aw.get(5).startAnimation(this.f3917az);
        }
    }

    private  InterstitialAd interstitialAd;
    private  int freeAdCount;

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_chest_open);

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this,FacebookAdsConfig.facebookInterstitialAdPlacement);
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        });
        interstitialAd.loadAd();
        Handler ad2Handler = new Handler();
        ad2Handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                interstitialAd.loadAd();
            }
        },3000);

        this.f3918j = (GifImageView) findViewById(R.id.fone_gif);
        this.f3875aF = (RelativeLayout) findViewById(R.id.full_gadget_lay);
        this.f3877aH = (LinearLayout) findViewById(R.id.gadget_info_lay);
        this.f3878aI = (ImageView) findViewById(R.id.gadget);
        this.f3879aJ = (ImageView) findViewById(R.id.gadget_brawler_icon);
        this.f3880aK = (TextView) findViewById(R.id.gadget_title);
        this.f3881aL = (TextView) findViewById(R.id.gadget_descreption);
        this.f3882aM = (TextView) findViewById(R.id.gadget_name);
        this.f3883aN = (TextView) findViewById(R.id.brawler_name_gadget);
        this.f3876aG = (RelativeLayout) findViewById(R.id.rel_card_gadget);
        f3842aj = true;
        this.f3844A = 0;
        this.f3913av = 0;
        MainActivity.m3730h();
        this.f3901ai = new ScaleAnimation(0.5f, 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f3901ai.setDuration(300);
        this.f3901ai.setStartOffset(200);
        this.f3902ak = (RelativeLayout) findViewById(R.id.brawler_lay);
        this.f3903al = (ImageView) findViewById(R.id.shaddow_brawler);
        this.f3901ai.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C096314 */

            public final void onAnimationEnd(Animation animation) {
                ChestOpen.this.f3856M.setVisibility(0);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3872aC = (RelativeLayout) findViewById(R.id.box_lay);
        this.f3873aD = (ImageView) findViewById(R.id.current_box);
        this.f3874aE = (ImageView) findViewById(R.id.shaddow);
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f3870aA = (RelativeLayout) findViewById(R.id.star_layout);
        this.f3914aw = new ArrayList<>();
        this.f3914aw.add((ImageView) findViewById(R.id.star_1));
        this.f3914aw.add((ImageView) findViewById(R.id.star_2));
        this.f3914aw.add((ImageView) findViewById(R.id.star_3));
        this.f3914aw.add((ImageView) findViewById(R.id.star_4));
        this.f3914aw.add((ImageView) findViewById(R.id.star_5));
        this.f3914aw.add((ImageView) findViewById(R.id.star_6));
        this.f3915ax = AnimationUtils.loadAnimation(this, R.anim.stars_anim);
        this.f3916ay = AnimationUtils.loadAnimation(this, R.anim.statrs_anim2);
        this.f3917az = AnimationUtils.loadAnimation(this, R.anim.stars_anim3);
        this.f3915ax.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09642 */

            public final void onAnimationEnd(Animation animation) {
                for (int i = 0; i < ChestOpen.this.f3914aw.size(); i++) {
                    ChestOpen.this.f3914aw.get(i).setVisibility(4);
                }
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3912au = MediaPlayer.create(getApplicationContext(), (int) R.raw.power_points);
        this.f3854K = (ImageView) findViewById(R.id.card);
        this.f3920l = (LinearLayout) findViewById(R.id.info_card);
        this.f3900ah = (TextView) findViewById(R.id.name);
        this.f3845B = new ArrayList<>();
        this.f3846C = "money";
        this.f3911at = (TextView) findViewById(R.id.coins_count);
        this.f3909ar = false;
        this.f3896ac = false;
        this.f3899ag = false;
        this.f3862S = (RelativeLayout) findViewById(R.id.back);
        this.f3907ap = true;
        this.f3910as = (ImageView) findViewById(R.id.bonuses);
        this.f3933z = false;
        this.f3908aq = false;
        this.f3924p = AnimationUtils.loadAnimation(this, R.anim.show_and_hide_for_some_time);
        this.f3925q = (TextView) findViewById(R.id.congrat);
        //ToDo: Layout Manager...
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false);
        this.f3928t = (RelativeLayout) findViewById(R.id.casing);
        this.f3929u = (TextView) findViewById(R.id.new_unlock_have_all);
        this.f3847D = (RecyclerView) findViewById(R.id.recycler);
        this.f3932y = (ImageView) findViewById(R.id.box_icons);
        this.f3847D.setLayoutManager(linearLayoutManager);
        this.f3926r = (ImageView) findViewById(R.id.smoke);
        this.f3927s = AnimationUtils.loadAnimation(this, R.anim.smoke_anim);
        this.f3853J = AnimationUtils.loadAnimation(this, R.anim.rotate);
        f3841ae = AnimationUtils.loadAnimation(this, R.anim.rotate2);
        this.f3848E = (RelativeLayout) findViewById(R.id.rel_color);
        this.f3851H = new ArrayList<>();
        this.f3852I = (TextView) findViewById(R.id.name_of_brawler);
        if (MainActivity.m3726c("firstbrawler") == 0) {
            MainActivity.m3720a(1, "firstbrawler");
            MainActivity.m3720a(1, "0");
            MainActivity.m3720a(1, "l0");
        }
        this.f3849F = (RelativeLayout) findViewById(R.id.card_lay);
        this.f3856M = (TextView) findViewById(R.id.text_count);
        this.f3858O = (ImageView) findViewById(R.id.new_brawler);
        this.f3863T = (ImageView) findViewById(R.id.click);
        this.f3897ad = (ImageView) findViewById(R.id.rotate);
        this.f3861R = new ArrayList<>();
        this.f3857N = (TextView) findViewById(R.id.have);
        this.f3850G = (AnimationDrawable) this.f3857N.getBackground();
        this.f3850G.setOneShot(true);
        this.f3866W = (TextView) findViewById(R.id.tap);
        if (MainActivity.m3726c("language") == 0) {
            this.f3866W.setText("Tap! Tap! ");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3866W.setText("Натискай! ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3866W.setText("Нажимай! ");
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(10000);
        rotateAnimation.setRepeatCount(-1);
        this.f3897ad.setAnimation(rotateAnimation);
        this.f3895ab = true;
        this.f3921m = (TextView) findViewById(R.id.money_give);
        this.f3922n = (TextView) findViewById(R.id.gems_give);
        this.f3923o = (TextView) findViewById(R.id.ticket_give);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09653 */

            public final void onAnimationEnd(Animation animation) {
                ChestOpen.this.f3874aE.setVisibility(0);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        scaleAnimation.setStartOffset(700);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, ((double) (memoryInfo.totalMem / 1048576)) < 2000.0d ? R.anim.small_box : R.anim.box_drop);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09664 */

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.box_dance);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this, R.anim.fone);
        if (!m3700i()) {
            this.f3932y.setBackground(getResources().getDrawable(R.drawable.box_icons));
            this.f3932y.startAnimation(loadAnimation3);
        } else {
            this.f3932y.setBackground(getResources().getDrawable(R.drawable.box_icons));
            this.f3932y.setScaleX(1.7f);
            this.f3932y.setScaleY(1.7f);
        }
        this.f3873aD.setImageResource(f3843x);
        this.f3872aC.setVisibility(0);
        this.f3863T.setAlpha(1.0f);
        this.f3928t.setBackground(getResources().getDrawable(R.drawable.box_fone));
        this.f3872aC.startAnimation(loadAnimation);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.0f, 0.0f, 0.0f, 1, 0.0f, 1, 0.0f);
        scaleAnimation2.setDuration(300);
        scaleAnimation2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09675 */

            public final void onAnimationEnd(Animation animation) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(ChestOpen.this.getApplicationContext(), (int) R.raw.safe).start();
                }
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3870aA.startAnimation(scaleAnimation2);
        this.f3873aD.startAnimation(loadAnimation2);
        if (!m3700i()) {
            this.f3874aE.startAnimation(scaleAnimation);
        }
        this.f3863T.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09686 */

            @SuppressLint({"ResourceType"})
            public final void onClick(View view) {
                int i;
                int i2;
                Resources resources;
                ImageView imageView;
                ChestOpen.this.f3875aF.setVisibility(4);
                ChestOpen.this.f3852I.setText("Orest");
                ChestOpen.this.f3902ak.setVisibility(4);
                ChestOpen.this.f3903al.setVisibility(4);
                ChestOpen.this.f3932y.setScaleX(1.0f);
                ChestOpen.this.f3932y.setScaleY(1.0f);
                ChestOpen.this.f3926r.clearAnimation();
                ChestOpen.this.f3872aC.clearAnimation();
                ChestOpen.this.f3873aD.clearAnimation();
                ChestOpen.this.f3872aC.setVisibility(4);
                ChestOpen.this.f3870aA.setVisibility(4);
                ChestOpen chestOpen = ChestOpen.this;
                chestOpen.f3844A = 0;
                chestOpen.f3920l.setVisibility(4);
                MainActivity.f4146j = true;
                ChestOpen.this.f3910as.setVisibility(4);
                ChestOpen.this.f3910as.setImageResource(17170445);
                ChestOpen.this.f3863T.setImageResource(17170445);
                ChestOpen.this.f3932y.setBackground(null);
                ChestOpen.this.f3863T.setBackground(null);
                ChestOpen.this.f3858O.setImageResource(0);
                ChestOpen.this.f3911at.setText("");
                if (ChestOpen.this.f3933z) {
                    ChestOpen chestOpen2 = ChestOpen.this;
                    chestOpen2.mo3446a(chestOpen2.f3897ad, R.drawable.end_spin);
                }
                ChestOpen.this.f3928t.setBackground(null);
                ChestOpen.this.f3932y.setBackground(null);
                ChestOpen.this.f3857N.setVisibility(4);
                Drawable drawable = ChestOpen.this.f3863T.getDrawable();
                if (MainActivity.m3726c("language") == 0) {
                    ChestOpen.this.f3866W.setText("Tap! Tap! ");
                }
                if (MainActivity.m3726c("language") == 1) {
                    ChestOpen.this.f3866W.setText("Натискай! ");
                }
                if (MainActivity.m3726c("language") == 2) {
                    ChestOpen.this.f3866W.setText("Нажимай! ");
                }
                if (ChestOpen.this.f3908aq) {
                    ChestOpen.this.f3848E.setBackgroundColor(-1);
                    if (ChestOpen.this.f3895ab) {
                        if (ChestOpen.this.f3865V.nextInt(10) > 6) {
                            int nextInt = ChestOpen.this.f3865V.nextInt(7);
                            ChestOpen.this.f3856M.setText(String.valueOf(nextInt));
                            MainActivity.m3720a(MainActivity.m3726c("gems") + nextInt, "gems");
                        }
                        ChestOpen.this.mo3390e();
                        ChestOpen.this.f3926r.startAnimation(ChestOpen.this.f3927s);
                        ChestOpen.this.f3927s.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09686.C09691 */

                            public final void onAnimationEnd(Animation animation) {
                                ChestOpen.this.f3926r.setVisibility(4);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                                if (ChestOpen.this.f3909ar) {
                                    ChestOpen.this.f3926r.setVisibility(4);
                                }
                            }
                        });
                        ChestOpen.this.f3895ab = false;
                    } else if (ChestOpen.this.f3868Y - ChestOpen.this.f3869Z > 0) {
                        ChestOpen.this.f3926r.startAnimation(ChestOpen.this.f3927s);
                        ChestOpen chestOpen3 = ChestOpen.this;
                        chestOpen3.mo3447a(chestOpen3.f3864U);
                        ChestOpen.this.f3927s.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.ChestOpen.C09686.C09702 */

                            public final void onAnimationEnd(Animation animation) {
                                ChestOpen.this.f3926r.setVisibility(4);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                                if (ChestOpen.this.f3909ar) {
                                    ChestOpen.this.f3926r.setVisibility(4);
                                }
                            }
                        });
                        ChestOpen.this.mo3390e();
                    } else {
                        if (ChestOpen.this.f3896ac) {
                            ChestOpen.this.finish();
                        }
                        if (!ChestOpen.this.f3896ac) {
                            if (ChestOpen.this.f3913av == 0) {
                                i = ChestOpen.this.f3865V.nextInt(3);
                                ChestOpen.this.f3913av = 1;
                            } else {
                                i = 1;
                            }
                            if (i == 1 || i == 2) {
                                ChestOpen chestOpen4 = ChestOpen.this;
                                chestOpen4.f3909ar = true;
                                TextView textView = chestOpen4.f3921m;
                                StringBuilder sb = new StringBuilder();
                                sb.append(ChestOpen.this.f3855L);
                                textView.setText(sb.toString());
                                ChestOpen.this.mo3391f();
                                ChestOpen.this.f3921m.setVisibility(0);
                                ChestOpen.this.f3849F.setVisibility(4);
                                ChestOpen.this.f3848E.setVisibility(4);
                                ChestOpen.this.f3854K.setVisibility(4);
                                ChestOpen.this.f3856M.setVisibility(4);
                                ChestOpen.this.f3920l.setVisibility(4);
                                ChestOpen.this.f3858O.setVisibility(4);
                                if (MainActivity.m3726c("language") == 0) {
                                    ChestOpen.this.f3866W.setText("YOU GOT");
                                }
                                if (MainActivity.m3726c("language") == 1) {
                                    ChestOpen.this.f3866W.setText("Ти Отримав ");
                                }
                                if (MainActivity.m3726c("language") == 2) {
                                    ChestOpen.this.f3866W.setText("Ты Получил ");
                                }
                                ChestOpen.this.f3926r.clearAnimation();
                                ArrayList arrayList = new ArrayList();
                                int i3 = 0;
                                for (int i4 = 0; i4 < ChestOpen.this.f3845B.size(); i4++) {
                                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                                    scaleAnimation.setDuration(300);
                                    scaleAnimation.setStartOffset((long) i3);
                                    i3 += 150;
                                    arrayList.add(scaleAnimation);
                                }
                                C1151l lVar = new C1151l(ChestOpen.this.f3845B, ChestOpen.this, arrayList);
                                ChestOpen chestOpen5 = ChestOpen.this;
                                chestOpen5.mo3446a(chestOpen5.f3897ad, R.drawable.end_spin);
                                ChestOpen.this.f3862S.setBackgroundColor(ChestOpen.this.getResources().getColor(R.color.back_color));
                                ChestOpen.this.f3863T.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.back_chest));
                                ChestOpen.this.f3863T.setAlpha(0.5f);
                                ChestOpen chestOpen6 = ChestOpen.this;
                                chestOpen6.f3933z = true;
                                if (!chestOpen6.f3896ac) {
                                    ChestOpen.this.f3847D.setAdapter(lVar);
                                    ChestOpen.this.f3847D.setVisibility(0);
                                    if (MainActivity.m3726c("sounds") == 0) {
                                        MediaPlayer.create(ChestOpen.this, (int) R.raw.recycler).start();
                                    }
                                    ChestOpen.this.f3896ac = true;
                                }
                            }
                            if (i == 0) {
                                if (ChestOpen.this.f3865V.nextInt(2) == 0) {
                                    int nextInt2 = ChestOpen.this.f3865V.nextInt(7) + 1;
                                    ChestOpen.this.f3911at.setText("X".concat(String.valueOf(nextInt2)));
                                    if (MainActivity.m3726c("sounds") == 0) {
                                        ChestOpen chestOpen7 = ChestOpen.this;
                                        chestOpen7.f3912au = MediaPlayer.create(chestOpen7, (int) R.raw.emit_gems_01);
                                        ChestOpen.this.f3912au.start();
                                    }
                                    MainActivity.m3720a(MainActivity.m3726c("gems") + nextInt2, "gems");
                                    if (MainActivity.m3726c("language") == 0) {
                                        ChestOpen.this.f3866W.setText("GEMS");
                                    }
                                    if (MainActivity.m3726c("language") == 1) {
                                        ChestOpen.this.f3866W.setText("КРИСТАЛИ");
                                    }
                                    if (MainActivity.m3726c("language") == 2) {
                                        ChestOpen.this.f3866W.setText("КРИСТАЛЛЫ");
                                    }
                                    ChestOpen.this.f3910as.setVisibility(0);
                                    ChestOpen.this.mo3449h();
                                    ChestOpen.this.f3910as.setImageResource(R.drawable.gems_box);
                                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.05f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                                    scaleAnimation2.setFillAfter(true);
                                    scaleAnimation2.setDuration(500);
                                    ChestOpen.this.f3910as.startAnimation(scaleAnimation2);
                                    ChestOpen chestOpen8 = ChestOpen.this;
                                    chestOpen8.f3931w = nextInt2;
                                    chestOpen8.f3932y.clearAnimation();
                                    imageView = ChestOpen.this.f3932y;
                                    resources = ChestOpen.this.getResources();
                                    i2 = R.drawable.gems_fone;
                                } else {
                                    int nextInt3 = ChestOpen.this.f3865V.nextInt(3) + 1;
                                    ChestOpen.this.f3911at.setText("X".concat(String.valueOf(nextInt3)));
                                    ChestOpen.this.f3930v = nextInt3;
                                    MainActivity.m3720a(MainActivity.m3726c("ticket") + nextInt3, "ticket");
                                    if (MainActivity.m3726c("sounds") == 0) {
                                        ChestOpen chestOpen9 = ChestOpen.this;
                                        chestOpen9.f3912au = MediaPlayer.create(chestOpen9, (int) R.raw.emit_tickets_01);
                                        ChestOpen.this.f3912au.start();
                                    }
                                    if (MainActivity.m3726c("language") == 0) {
                                        ChestOpen.this.f3866W.setText("TICKETS");
                                    }
                                    if (MainActivity.m3726c("language") == 1) {
                                        ChestOpen.this.f3866W.setText("КВИТКИ");
                                    }
                                    if (MainActivity.m3726c("language") == 2) {
                                        ChestOpen.this.f3866W.setText("БИЛЕТЫ");
                                    }
                                    ChestOpen.this.f3910as.setVisibility(0);
                                    ChestOpen.this.mo3449h();
                                    ChestOpen.this.f3910as.setImageResource(R.drawable.ticket_box);
                                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.05f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                                    scaleAnimation3.setFillAfter(true);
                                    scaleAnimation3.setDuration(500);
                                    ChestOpen.this.f3910as.startAnimation(scaleAnimation3);
                                    ChestOpen.this.f3932y.clearAnimation();
                                    imageView = ChestOpen.this.f3932y;
                                    resources = ChestOpen.this.getResources();
                                    i2 = R.drawable.tickets_fone;
                                }
                                imageView.setBackground(resources.getDrawable(i2));
                                ChestOpen.this.f3932y.setAlpha(1.0f);
                            }
                        }
                    }
                }
                if (drawable != ChestOpen.this.getResources().getDrawable(ChestOpen.f3843x)) {
                    ChestOpen.this.f3863T.setImageResource(0);
                    ChestOpen.this.f3849F.startAnimation(ChestOpen.f3841ae);
                    ChestOpen.this.f3908aq = true;
                }
                if (MainActivity.m3726c("sounds") == 0) {
                    if (ChestOpen.this.f3846C.equals("") && !ChestOpen.this.f3896ac && ChestOpen.this.f3852I.getText().toString().equals("Orest") && ChestOpen.this.f3931w == 0 && ChestOpen.this.f3930v == 0) {
                        ChestOpen chestOpen10 = ChestOpen.this;
                        chestOpen10.f3912au = MediaPlayer.create(chestOpen10, (int) R.raw.power_points);
                        ChestOpen.this.f3912au.start();
                    }
                    ChestOpen.this.f3910as.setVisibility(4);
                    ChestOpen.this.f3910as.setBackground(null);
                }
                ChestOpen chestOpen11 = ChestOpen.this;
                chestOpen11.mo3447a(chestOpen11.f3864U);
                if (ChestOpen.this.f3846C.equals("money")) {
                    ChestOpen chestOpen12 = ChestOpen.this;
                    chestOpen12.f3846C = "";
                    chestOpen12.f3863T.clearAnimation();
                    if (MainActivity.m3726c("sounds") == 0) {
                        ChestOpen chestOpen13 = ChestOpen.this;
                        chestOpen13.f3912au = MediaPlayer.create(chestOpen13, (int) R.raw.get_coins_01);
                        ChestOpen.this.f3912au.start();
                    }
                    int nextInt4 = ChestOpen.this.f3865V.nextInt(40) + 1;
                    ChestOpen.this.f3911at.setText("X".concat(String.valueOf(nextInt4)));
                    MainActivity.m3720a(MainActivity.m3726c("money") + nextInt4, "money");
                    if (MainActivity.m3726c("language") == 0) {
                        ChestOpen.this.f3866W.setText("COINS");
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        ChestOpen.this.f3866W.setText("МОНЕТИ");
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        ChestOpen.this.f3866W.setText("МОНЕТЫ");
                    }
                    ChestOpen.this.f3910as.setVisibility(0);
                    ChestOpen.this.mo3449h();
                    ChestOpen.this.f3910as.setImageResource(R.drawable.money_box);
                    ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.05f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation4.setFillAfter(true);
                    scaleAnimation4.setDuration(500);
                    ChestOpen.this.f3910as.startAnimation(scaleAnimation4);
                    ChestOpen chestOpen14 = ChestOpen.this;
                    chestOpen14.f3855L = nextInt4;
                    chestOpen14.f3932y.clearAnimation();
                    ChestOpen.this.f3932y.setBackground(ChestOpen.this.getResources().getDrawable(R.drawable.coins_fone));
                    ChestOpen.this.f3932y.setAlpha(1.0f);
                }
            }
        });
        this.f3859P = new ArrayList<>();
        this.f3869Z = 0;
        this.f3865V = new Random();
        this.f3859P.add(Integer.valueOf((int) R.drawable.shelly_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.nita_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.colt_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.bull_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.jessie_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.brock_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.dinamike_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.emz_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.bo_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.bit_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.tick_i));
        this.f3861R.add("f");
        this.f3859P.add(Integer.valueOf((int) R.drawable.el_orimo_i));
        this.f3861R.add("r");
        this.f3859P.add(Integer.valueOf((int) R.drawable.barley_i));
        this.f3861R.add("r");
        this.f3859P.add(Integer.valueOf((int) R.drawable.poco_i));
        this.f3861R.add("r");
        this.f3859P.add(Integer.valueOf((int) R.drawable.rosa_i));
        this.f3861R.add("r");
        this.f3859P.add(Integer.valueOf((int) R.drawable.rico_i));
        this.f3861R.add("s");
        this.f3859P.add(Integer.valueOf((int) R.drawable.daryl_i));
        this.f3861R.add("s");
        this.f3859P.add(Integer.valueOf((int) R.drawable.panny_i));
        this.f3861R.add("s");
        this.f3859P.add(Integer.valueOf((int) R.drawable.carl_i));
        this.f3861R.add("s");
        this.f3859P.add(Integer.valueOf((int) R.drawable.jacky_i));
        this.f3861R.add("s");
        this.f3859P.add(Integer.valueOf((int) R.drawable.bibi_i));
        this.f3861R.add("e");
        this.f3859P.add(Integer.valueOf((int) R.drawable.bea_i));
        this.f3861R.add("e");
        this.f3859P.add(Integer.valueOf((int) R.drawable.frank_i));
        this.f3861R.add("e");
        this.f3859P.add(Integer.valueOf((int) R.drawable.pipre_i));
        this.f3861R.add("e");
        this.f3859P.add(Integer.valueOf((int) R.drawable.pam_i));
        this.f3861R.add("e");
        this.f3859P.add(Integer.valueOf((int) R.drawable.nani_i));
        this.f3861R.add("e");
        this.f3859P.add(Integer.valueOf((int) R.drawable.max_i));
        this.f3861R.add("m");
        this.f3859P.add(Integer.valueOf((int) R.drawable.mortis_i));
        this.f3861R.add("m");
        this.f3859P.add(Integer.valueOf((int) R.drawable.mr_p_i));
        this.f3861R.add("m");
        this.f3859P.add(Integer.valueOf((int) R.drawable.sprout_i));
        this.f3861R.add("m");
        this.f3859P.add(Integer.valueOf((int) R.drawable.tara_i));
        this.f3861R.add("m");
        this.f3859P.add(Integer.valueOf((int) R.drawable.gene_i));
        this.f3861R.add("m");
        this.f3859P.add(Integer.valueOf((int) R.drawable.spike_i));
        this.f3861R.add("l");
        this.f3859P.add(Integer.valueOf((int) R.drawable.crow_i));
        this.f3861R.add("l");
        this.f3859P.add(Integer.valueOf((int) R.drawable.leon_i));
        this.f3861R.add("l");
        this.f3859P.add(Integer.valueOf((int) R.drawable.sandy_i));
        this.f3861R.add("l");
        this.f3859P.add(Integer.valueOf((int) R.drawable.gale_i));
        this.f3861R.add("h");
        this.f3860Q = new ArrayList<>();
        this.f3860Q.add(Integer.valueOf((int) R.drawable.shelly_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.nita_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.colt_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.bull_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.jessie_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.brock_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.dinamike_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.emz_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.bo_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.bit_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.tick_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.elprimo_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.barley_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.poco_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.rosa_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.riko_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.darryl_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.penny_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.carl_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.jacky_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.bibi_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.bea_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.frank_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.piper_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.pam_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.nani_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.max_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.mortis_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.mr_p_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.sprout_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.tara_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.gene_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.spike_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.crow_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.leon_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.sandy_f));
        this.f3860Q.add(Integer.valueOf((int) R.drawable.gale_f));
        if (MainActivity.m3726c("language") == 0) {
            this.f3864U = "com.brawl.mybestappforfansbrawlstarsboxs";
            this.f3851H.add("Shelly");
            this.f3851H.add("Nita");
            this.f3851H.add("Colt");
            this.f3851H.add("Bull");
            this.f3851H.add("Jessie");
            this.f3851H.add("Brock");
            this.f3851H.add("Dinamike");
            this.f3851H.add("Emz");
            this.f3851H.add("Bo");
            this.f3851H.add("8-Bit");
            this.f3851H.add("Tick");
            this.f3851H.add("El Primo");
            this.f3851H.add("Barley");
            this.f3851H.add("Poco");
            this.f3851H.add("Rosa");
            this.f3851H.add("Ricochet");
            this.f3851H.add("Daryl");
            this.f3851H.add("Penny");
            this.f3851H.add("Carl");
            this.f3851H.add("Jacky");
            this.f3851H.add("Bibi");
            this.f3851H.add("Bea");
            this.f3851H.add("Frank");
            this.f3851H.add("Piper");
            this.f3851H.add("Pam");
            this.f3851H.add("Nani");
            this.f3851H.add("Max");
            this.f3851H.add("Mortis");
            this.f3851H.add("Mr P");
            this.f3851H.add("Sprout");
            this.f3851H.add("Tara");
            this.f3851H.add("Gene");
            this.f3851H.add("Spike");
            this.f3851H.add("Crow");
            this.f3851H.add("Leon");
            this.f3851H.add("Sandy");
            this.f3851H.add("Gale");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3851H.add("Шеллі");
            this.f3851H.add("Ніта");
            this.f3851H.add("Кольт");
            this.f3851H.add("Булл");
            this.f3851H.add("Джессі");
            this.f3851H.add("Брок");
            this.f3851H.add("Дінамайк");
            this.f3851H.add("ЕМЗ");
            this.f3851H.add("Бо");
            this.f3851H.add("8-Біт");
            this.f3851H.add("Тік");
            this.f3851H.add("Ель Прімо");
            this.f3851H.add("Барлі");
            this.f3851H.add("Поко");
            this.f3851H.add("Роза");
            this.f3851H.add("Ріко");
            this.f3851H.add("Дерріл");
            this.f3851H.add("Пенні");
            this.f3851H.add("Карл");
            this.f3851H.add("Джекі");
            this.f3851H.add("Бібі");
            this.f3851H.add("Беа");
            this.f3851H.add("Френк");
            this.f3851H.add("Пайпер");
            this.f3851H.add("Пем");
            this.f3851H.add("Нані");
            this.f3851H.add("Макс");
            this.f3851H.add("Мортіс");
            this.f3851H.add("Містер П.");
            this.f3851H.add("Спраут");
            this.f3851H.add("Тара");
            this.f3851H.add("Джин");
            this.f3851H.add("Спайк");
            this.f3851H.add("Ворон");
            this.f3851H.add("Леон");
            this.f3851H.add("Сенді");
            this.f3851H.add("Гейл");
            this.f3864U = "com.brawl.mybestappforfansbrawlstarsboxs";
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3864U = "com.brawl.mybestappforfansbrawlstarsboxs";
            this.f3851H.add("Шелли");
            this.f3851H.add("Нита");
            this.f3851H.add("Кольт");
            this.f3851H.add("Булл");
            this.f3851H.add("Джесси");
            this.f3851H.add("Брок");
            this.f3851H.add("Динамайк");
            this.f3851H.add("ЭМЗ");
            this.f3851H.add("Бо");
            this.f3851H.add("8-Бит");
            this.f3851H.add("Тик");
            this.f3851H.add("Эль Примо");
            this.f3851H.add("Барли");
            this.f3851H.add("Поко");
            this.f3851H.add("Роза");
            this.f3851H.add("Рико");
            this.f3851H.add("ДЭррил");
            this.f3851H.add("Пенни");
            this.f3851H.add("Карл");
            this.f3851H.add("Джеки");
            this.f3851H.add("БИБИ");
            this.f3851H.add("Беа");
            this.f3851H.add("ФрЭнк");
            this.f3851H.add("Пайпер");
            this.f3851H.add("ПЭМ");
            this.f3851H.add("Нани");
            this.f3851H.add("Макс");
            this.f3851H.add("Мортис");
            this.f3851H.add("Мистер П.");
            this.f3851H.add("Спраут");
            this.f3851H.add("Тара");
            this.f3851H.add("Джин");
            this.f3851H.add("Спайк");
            this.f3851H.add("Ворон");
            this.f3851H.add("Леон");
            this.f3851H.add("СЭнди");
            this.f3851H.add("Гэйл");
        }
        int nextInt = this.f3865V.nextInt(40);
        this.f3848E.setBackgroundColor(0);
        this.f3856M.setBackground(null);
        this.f3856M.setText(String.valueOf(nextInt));
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
