package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.ActivityManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import pl.droidsonroids.gif.GifImageView;

@SuppressWarnings("ALL")
public class BrawlerReview extends AppCompatActivity {

    /* renamed from: L */
    static String f3712L;

    /* renamed from: M */
    static int f3713M;

    /* renamed from: N */
    static int f3714N;

    /* renamed from: O */
    static int f3715O;

    /* renamed from: Q */
    static String f3716Q;

    /* renamed from: R */
    static String f3717R;

    /* renamed from: W */
    static int f3718W;

    /* renamed from: X */
    static int f3719X;

    /* renamed from: l */
    static int f3720l;

    /* renamed from: m */
    static int f3721m;

    /* renamed from: A */
    Animation f3722A;

    /* renamed from: B */
    int f3723B;

    /* renamed from: C */
    int f3724C;

    /* renamed from: D */
    int f3725D;

    /* renamed from: E */
    TextView f3726E;

    /* renamed from: F */
    TextView f3727F;

    /* renamed from: G */
    TextView f3728G;

    /* renamed from: H */
    TextView f3729H;

    /* renamed from: I */
    TextView f3730I;

    /* renamed from: J */
    TextView f3731J;

    /* renamed from: K */
    Button f3732K;

    /* renamed from: P */
    TextView f3733P;

    /* renamed from: S */
    ImageView f3734S;

    /* renamed from: T */
    TextView f3735T;

    /* renamed from: U */
    RelativeLayout f3736U;

    /* renamed from: V */
    Animation f3737V;

    /* renamed from: Y */
    ArrayList<C1134e> f3738Y;

    /* renamed from: Z */
    TextView f3739Z;

    /* renamed from: aA */
    MediaPlayer f3740aA;

    /* renamed from: aB */
    RelativeLayout f3741aB;

    /* renamed from: aC */
    ImageView f3742aC;

    /* renamed from: aD */
    TextView f3743aD;

    /* renamed from: aE */
    int f3744aE = 0;

    /* renamed from: aF */
    Animation f3745aF;

    /* renamed from: aG */
    Animation f3746aG;

    /* renamed from: aH */
    Animation f3747aH;

    /* renamed from: aI */
    ScaleAnimation f3748aI;

    /* renamed from: aJ */
    ScaleAnimation f3749aJ;

    /* renamed from: aK */
    ImageButton f3750aK;

    /* renamed from: aL */
    ImageView f3751aL;

    /* renamed from: aa */
    ArrayList<Integer> f3752aa;

    /* renamed from: ab */
    ArrayList<Integer> f3753ab;

    /* renamed from: ac */
    ArrayList<C1132c> f3754ac;

    /* renamed from: ad */
    ImageView f3755ad;

    /* renamed from: ae */
    GifImageView f3756ae;

    /* renamed from: af */
    TextView f3757af;

    /* renamed from: ag */
    TextView f3758ag;

    /* renamed from: ah */
    TextView f3759ah;

    /* renamed from: ai */
    TextView f3760ai;

    /* renamed from: aj */
    TextView f3761aj;

    /* renamed from: ak */
    ArrayList<ScaleAnimation> f3762ak;

    /* renamed from: al */
    RelativeLayout f3763al;

    /* renamed from: am */
    Animation f3764am;

    /* renamed from: an */
    ImageView f3765an;

    /* renamed from: ao */
    Button f3766ao;

    /* renamed from: ap */
    ImageView f3767ap;

    /* renamed from: aq */
    ImageView f3768aq;

    /* renamed from: ar */
    LinearLayout f3769ar;

    /* renamed from: as */
    LinearLayout f3770as;

    /* renamed from: at */
    LinearLayout f3771at;

    /* renamed from: au */
    boolean f3772au;

    /* renamed from: av */
    boolean f3773av = true;

    /* renamed from: aw */
    ArrayList<String> f3774aw;

    /* renamed from: ax */
    ArrayList<Integer> f3775ax;

    /* renamed from: ay */
    ArrayList<Integer> f3776ay;

    /* renamed from: az */
    int f3777az;

    /* renamed from: j */
    ImageButton f3778j;

    /* renamed from: k */
    TextView f3779k;

    /* renamed from: n */
    int f3780n = 5800;

    /* renamed from: o */
    int f3781o = 1600;

    /* renamed from: p */
    int f3782p = 2800;

    /* renamed from: q */
    ImageButton f3783q;

    /* renamed from: r */
    ImageButton f3784r;

    /* renamed from: s */
    ArrayList<C1136g> f3785s;

    /* renamed from: t */
    ArrayList<ImageView> f3786t;

    /* renamed from: u */
    ArrayList<ImageView> f3787u;

    /* renamed from: v */
    ArrayList<ImageView> f3788v;

    /* renamed from: w */
    TextView f3789w;

    /* renamed from: x */
    ImageView f3790x;

    /* renamed from: y */
    ImageView f3791y;

    /* renamed from: z */
    ArrayList<String> f3792z;
    private InterstitialAd f4179aP;

    /* renamed from: a */
    private static void m3687a(ArrayList<ImageView> arrayList, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.get(i2).setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m3688i() {
        this.f3785s.add(new C1136g(4, 3, 3));
        this.f3785s.add(new C1136g(3, 4, 2));
        this.f3785s.add(new C1136g(4, 2, 2));
        this.f3785s.add(new C1136g(3, 4, 1));
        this.f3785s.add(new C1136g(3, 2, 3));
        this.f3785s.add(new C1136g(4, 2, 4));
        this.f3785s.add(new C1136g(4, 2, 3));
        this.f3785s.add(new C1136g(3, 2, 2));
        this.f3785s.add(new C1136g(4, 1, 1));
        this.f3785s.add(new C1136g(4, 1, 2));
        this.f3785s.add(new C1136g(2, 4, 1));
        this.f3785s.add(new C1136g(4, 2, 4));
        this.f3785s.add(new C1136g(2, 3, 1));
        this.f3785s.add(new C1136g(3, 4, 2));
        this.f3785s.add(new C1136g(4, 2, 3));
        this.f3785s.add(new C1136g(3, 4, 1));
        this.f3785s.add(new C1136g(3, 2, 2));
        this.f3785s.add(new C1136g(3, 3, 3));
        this.f3785s.add(new C1136g(3, 3, 2));
        this.f3785s.add(new C1136g(2, 4, 2));
        this.f3785s.add(new C1136g(4, 2, 2));
        this.f3785s.add(new C1136g(2, 4, 3));
        this.f3785s.add(new C1136g(3, 3, 3));
        this.f3785s.add(new C1136g(4, 1, 2));
        this.f3785s.add(new C1136g(2, 4, 3));
        this.f3785s.add(new C1136g(4, 1, 3));
        this.f3785s.add(new C1136g(2, 2, 1));
        this.f3785s.add(new C1136g(2, 3, 1));
        this.f3785s.add(new C1136g(3, 2, 2));
        this.f3785s.add(new C1136g(3, 2, 4));
        this.f3785s.add(new C1136g(2, 2, 3));
        this.f3785s.add(new C1136g(2, 2, 1));
        this.f3785s.add(new C1136g(4, 2, 3));
        this.f3785s.add(new C1136g(4, 1, 4));
        this.f3785s.add(new C1136g(4, 2, 3));
        this.f3785s.add(new C1136g(2, 2, 4));
        this.f3785s.add(new C1136g(2, 2, 4));
        m3687a(this.f3787u, this.f3785s.get(f3718W).f4566b);
        m3687a(this.f3786t, this.f3785s.get(f3718W).f4565a);
        m3687a(this.f3788v, this.f3785s.get(f3718W).f4567c);
    }

    /* renamed from: j */
    private void m3689j() {
        this.f3752aa = new ArrayList<>();
        this.f3752aa.add(20);
        this.f3752aa.add(35);
        this.f3752aa.add(75);
        this.f3752aa.add(140);
        this.f3752aa.add(290);
        this.f3752aa.add(480);
        this.f3752aa.add(800);
        this.f3752aa.add(1250);
        this.f3752aa.add(2000);
        this.f3752aa.add(5000);
        this.f3738Y.add(new C1134e(3600, 300, 320));
        this.f3738Y.add(new C1134e(3800, 740, 400));
        this.f3738Y.add(new C1134e(2800, 300, 300));
        this.f3738Y.add(new C1134e(5200, 400, 800));
        this.f3738Y.add(new C1134e(3200, 820, 240));
        this.f3738Y.add(new C1134e(2800, 1100, 1040));
        this.f3738Y.add(new C1134e(2800, 760, 2800));
        this.f3738Y.add(new C1134e(3600, 500, 200));
        this.f3738Y.add(new C1134e(3600, 500, 1440));
        this.f3738Y.add(new C1134e(2200, 640, 2000));
        this.f3738Y.add(new C1134e(5800, 360, 800));
        this.f3738Y.add(new C1134e(2400, 680, 680));
        this.f3738Y.add(new C1134e(3800, 660, 2100));
        this.f3738Y.add(new C1134e(5000, 480, 0));
        this.f3738Y.add(new C1134e(2400, 300, 300));
        this.f3738Y.add(new C1134e(4200, 280, 400));
        this.f3738Y.add(new C1134e(3200, 840, 1200));
        this.f3738Y.add(new C1134e(4400, 640, 400));
        this.f3738Y.add(new C1134e(5500, 1300, 1500));
        this.f3738Y.add(new C1134e(4200, 1300, 1000));
        this.f3738Y.add(new C1134e(2400, 800, 100));
        this.f3738Y.add(new C1134e(5800, 1200, 1200));
        this.f3738Y.add(new C1134e(2400, 1640, 900));
        this.f3738Y.add(new C1134e(4300, 240, 320));
        this.f3738Y.add(new C1134e(3500, 250, 0));
        this.f3738Y.add(new C1134e(2400, 700, 2000));
        this.f3738Y.add(new C1134e(3800, 900, 900));
        this.f3738Y.add(new C1134e(2900, 700, 260));
        this.f3738Y.add(new C1134e(3200, 380, 800));
        this.f3738Y.add(new C1134e(3200, 1000, 400));
        this.f3738Y.add(new C1134e(3600, 1000, 0));
        this.f3738Y.add(new C1134e(2400, 480, 400));
        this.f3738Y.add(new C1134e(2400, 300, 300));
        this.f3738Y.add(new C1134e(3200, 440, 0));
        this.f3738Y.add(new C1134e(3800, 900, 0));
        this.f3738Y.add(new C1134e(3800, 900, 0));
        this.f3738Y.add(new C1134e(3400, 300, 100));
        if (MainActivity.m3726c("language") == 0) {
            this.f3792z.add("Shelly's spread-fire shotgun blasts the other team with buckshot. Her Super destroys cover and keeps her opponents at a distance!");
            this.f3792z.add("Nita strikes her enemies with a thunderous shockwave. Her Super summons a massive bear to fight by her side!");
            this.f3792z.add("Colt fires an accurate burst of bullets from his dual revolvers. His Super shreds cover and extends the bullet barrage!");
            this.f3792z.add("Bull deals massive damage up close with his shotgun. For his Super move, he charges through barriers and knocks back enemies!");
            this.f3792z.add("Jessie's Shock Rifle shoots energy orbs that bounce between enemies. Her Super deploys a cute but deadly gun turret!");
            this.f3792z.add("Brock fires a long-range, explosive rocket at enemies. His Super is a ballistic rocket barrage that destroys cover!");
            this.f3792z.add("Dynamike lobs two explosive sticks of dynamite. His Super attack is a whole barrel full of dynamite that blows up cover!");
            this.f3792z.add("Emz attacks with blasts of hair spray that deal damage over time, and slows down opponents with her Super");
            this.f3792z.add("Bo fires three explosive arrows toward his targets. His Super ability places a trio of hidden, explosive mines on the ground!");
            this.f3792z.add("8-Bit lumbers along like an arcade cabinet on legs. He shoots Blaster Beams and his Super boosts friendlies' damage!");
            this.f3792z.add("Tick is a metal ball of barely controlled excitement and energy - explosive energy! ");
            this.f3792z.add("El Primo throws a flurry of punches at his enemies. His Super is a leaping elbow drop that deals damage to all caught underneath!");
            this.f3792z.add("Barley attacks by lobbing bottles at enemies, doing splash damage. His Super is a huge barrage of burning bottles!");
            this.f3792z.add("Poco fires damaging sound waves at enemies. His Super can heal both Poco himself and his teammates!");
            this.f3792z.add("This boxing botanist will plant her feet and go toe to toe! Her Super gives her tough, vegan protective gear");
            this.f3792z.add("Rico fires a burst of bullets that bounce off walls. His Super burst is a long barrage of bouncy bullets that pierce targets!");
            this.f3792z.add("Darryl has a powerful double-shotgun attack. His Super move is a reckless roll inside his bouncy barrel!");
            this.f3792z.add("Penny shoots bags of coins, damaging the target and anyone standing behind. Her Super is a mortar-style cannon turret!");
            this.f3792z.add("Carl throws his Pickaxe like a boomerang. His Super is a crazy cart spin that clobbers anyone around him");
            this.f3792z.add("Jacky works her Jackhammer to shake up the ground and nearby enemies");
            this.f3792z.add("Batter up! Bibi's got a sweet swing that can knock back enemies when her Home Run bar is charged. Her Super is a bouncing ball of gum that deals damage");
            this.f3792z.add("Bea loves bugs and hugs. She shoots her mechanical drones at range, and her Super sends forth an angry army of swarming bees!");
            this.f3792z.add("Frank swings his hammer at enemies, sending a shockwave. His Super is an especially powerful blow that stuns enemies!");
            this.f3792z.add("Piper's sniper shots do more damage the farther they travel. Her Super drops grenades at her feet, while Piper herself leaps away!");
            this.f3792z.add("Pam shoots from the hip, peppering targets with shrapnel. Her Super is a healing turret that restores her and teammates' health!");
            this.f3792z.add("Nani loves her friends and looks over them with a watchful lens. She handles threats with angled shots, and her Super allows Nani to commandeer her pal Peep, who goes out with a bang!");
            this.f3792z.add("Max goes fast! Her attack is a fast-firing blaster. Her Super speeds up her and allies!");
            this.f3792z.add("Mortis dashes forward with each swing of his shovel. As his Super attack, he sends a cloud of bats to damage enemies and heal himself!");
            this.f3792z.add("Mr. P is a disgruntled luggage handler who angrily hurls suitcases at opponents. His Super calls robo-porters to help him.");
            this.f3792z.add("The spout was created to sow life and love with the help of galloping bombs. Its Super creates a plant barrier");
            this.f3792z.add("Tara's triple tarot card attack pierces through enemies. Her Super is a black hole that sucks in all nearby enemies, causing damage!");
            this.f3792z.add("Gene uses his magic lamp to shoot a splitting projectile. His super is a magical hand that grabs and pulls enemies close!");
            this.f3792z.add("Spike throws cactus grenades that send needles flying, and a show-stopping Super: a field of cactus spines that slows down and damages enemies!");
            this.f3792z.add("Crow fires a trio of poisoned daggers. As a Super move he leaps, firing daggers both on jump and on landing!");
            this.f3792z.add("Leon shoots a quick salvo of blades at his target. His Super trick is a smoke bomb that makes him invisible for a little while!");
            this.f3792z.add("Sandy is a sleep-deprived Brawler with powerful control over sand: casting sharp pebbles at enemies, and summoning a sandstorm to hide teammates!");
            this.f3792z.add("Gale is a tireless handyman who gets no rest. He blasts foes with a wide shot of wind and snow and his Super pushes them back with a huge gust of wind.");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3792z.add("Шелли отличный воин, стреляющий со своего дробовика сразу по 3 целям. Имеет отличный супер удар, достаточно здоровья, скорости и дальности стрельбы");
            this.f3792z.add("Нита в Brawl Stars это маленькая повелительница медведей, способная быстро разносить врагов");
            this.f3792z.add("Больше всего усилий у вас уйдет на то что попасть вообще в кого-то, так как радиус попадания у данного персонажа всего 1 клетка, то есть вам надо точно попадать во врагов");
            this.f3792z.add("Булл в Brawl Stars – это просто огромная банка здоровья с большим уроном");
            this.f3792z.add("Джесси – настоящий воин на арене сражения, не смотря на свои “хрупкие” габариты. Вооружена шоковой винтовкой, которая выстреливает энергосферой, отскакивающей от врага к врагу");
            this.f3792z.add("Брок – отличный боец дальнего боя, который наносит колоссальный урон своими ракетами, осталось только попасть");
            this.f3792z.add("Если вы хотите прятаться за укрытием и закидывать динамитом всех вокруг, выбирайте Диномайка");
            this.f3792z.add("Эмз атакует, разбрызгивая лак для волос, облака которого наносят урон с течением времени");
            this.f3792z.add("Бо выпускает три взрывные стрелы. Его Супер — установка трёх секретных взрывных ловушек");
            this.f3792z.add("8-БИТ похож на ходячий игровой автомат. Он стреляет лучами из бластера, а его Супер усиливает урон товарищей по команде");
            this.f3792z.add("Взрывной характер и неуёмная энергия в металлической оболочке");
            this.f3792z.add("Эль Примо обрушивает на врагов град ударов. Его Супер, удар локтем в прыжке, наносит урон всем, кто оказался рядом!");
            this.f3792z.add("Барли - официант заведения, метающий бутылки с зажигательной смесью. Его атака - это бросок бутылки с кислотой, а при помощи Супера он обрушивает на врагов шквал огненных бутылок.");
            this.f3792z.add("Поко атакует врагов разрушительной звуковой волной. Его Супер исцеляет его самого и его товарищей по команде!");
            this.f3792z.add("Эта боксёрша-ботаник крепко стоит на ногах и не боится ближнего боя! Супер оплетает её прочной и стопроцентно веганской бронёй.");
            this.f3792z.add("Выпущенные Рико пули могут отскакивать от стен. Его Супер преодолевает большую дистанцию и насквозь прошивает цель!");
            this.f3792z.add("Атака из пары дробовиков Дэррила невероятно мощна. Его Супер — усиленная бочка, в которой он катится вперёд, отскакивая от стен по пути!");
            this.f3792z.add("Пенни стреляет мешочками с монетами. Они наносят урон цели и любому, кто находится за ней. Её Супер — бронебашня-мортира");
            this.f3792z.add("Карл бросает свою кирку, как бумеранг. Его Супер атака - это сумасшедшее вращение вагонетки, которая сбивает всех вокруг него.");
            this.f3792z.add("Джеки работает своим отбойным молотком, чтобы встряхнуть землю и ближайших врагов");
            this.f3792z.add("На поле! Когда шкала хоум-рана заряжена полностью, удар Биби отбрасывает бойцов назад. Её Супер - упругий шарик из жвачки, прошивающий врагов насквозь");
            this.f3792z.add("Беа нравятся букашки и обнимашки. Она атакует с расстояния дронами, а её Супер вызывает армию разъяренных пчел!");
            this.f3792z.add("Удар Фрэнка порождает взрывную волну. Его неимоверно мощный Супер оглушает противников!");
            this.f3792z.add("Снайперские выстрелы Пайпер наносят больше урона на большой дистанции. Её Супер — четыре гранаты, бросив которые, она сбегает!");
            this.f3792z.add("Выстрелы Пэм усыпают все вокруг шрапнелью. Её супер — лечебная турель, восстанавливающая здоровье ей и её товарищам по команде!");
            this.f3792z.add("Нани обожает своих друзей и всегда заботится о них. Она стреляет световыми сферами в нескольких направлениях и управляет своим роботом Пипом с помощью Супера!");
            this.f3792z.add("Макс невероятно быстра! Она стреляет из скорострельного бластера, а её Супер ускоряет её саму и товарищей по команде!");
            this.f3792z.add("Мортис прыгает вперёд с каждым взмахом своей лопаты. Его Супер призывает стаю летучих мышей, наносящих урон врагам и исцеляющих его самого!");
            this.f3792z.add("Мистер П. – сердитый грузчик, который кидает во врагов чемоданы. Его Супер призывает ему на помощь роботов-носильщиков.");
            this.f3792z.add("Спраут был создан, чтобы сеять жизнь и любовь с помощью скачущих зернобомб. Его Супер создаёт преграду из растений");
            this.f3792z.add("Три карты таро Тары насквозь пронзают врагов. Её супер — чёрная дыра, которая затягивает оказавшихся поблизости врагов, нанося им урон!");
            this.f3792z.add("Джин выпускает из своей волшебной лампы разделяющиеся снаряды. Его супер — волшебная рука, которая хватает и притягивает к нему врагов!");
            this.f3792z.add("Спайк бросает кактусные гранаты, осыпающие всё вокруг иголками. Его ошеломительный Супер создаёт поле с шипами, замедляющее врагов и наносящее им урон!");
            this.f3792z.add("Ворон бросает три отравленных кинжала. Его Супер — стремительный прыжок, начиная и заканчивая который, Ворон разбрасывает по сторонам кинжалы!");
            this.f3792z.add("Леон поражает цель роем метательных клинков. Его супер - дымовая бомба, делающая его невидимым на некоторое время!");
            this.f3792z.add("Сэнди - это боец с хроническим недосыпом, способный управлять стихией земли: забрасывает врага колючим гравием и прячет товарищей за песчаной завесой.");
            this.f3792z.add("Гэйл - неутомимый мастер на все руки! Он атакует врагов ветром со снегом, а его Супер отбрасывает их назад мощным порывом ветра!");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3792z.add("Шеллі хоробрий воїн, що стріляє зі свого дробовика відразу по 3 цілям. Має відмінний супер удар, досить здоров'я, швидкості і дальності стрільби");
            this.f3792z.add("Ніта в Brawl Stars це маленька володарка ведмедів, здатна швидко розносити ворогів");
            this.f3792z.add("Найбільше зусиль у вас піде на те щоб потрапити взагалі в когось, так як радіус попадання у даного персонажа всього 1 клітинка, тобто вам треба точно потрапляти у ворогів");
            this.f3792z.add("Булл в Brawl Stars - це просто величезна банка здоров'я з сильним ударом");
            this.f3792z.add("Джессі - справжній воїн на арені бою, не дивлячись на свої \"крихкі\" габарити. Озброєна шоковою гвинтівкою, яка вистрілює енерго сферою, яка відскакує від ворога до ворога");
            this.f3792z.add("Брок - відмінний воїн далекого бою, який завдає колосальної шкоди своїми ракетами, залишилося тільки потрапити");
            this.f3792z.add("Якщо ви хочете ховатися за укриттям і закидати динамітом всіх навколо, вибирайте Дінамайка");
            this.f3792z.add("ЕМЗ атакує, розбризкуючи лак для волосся, хмари якого завдають шкоди з плином часу");
            this.f3792z.add("Бо випускає три вибухові стріли. Його Супер - установка трьох секретних вибухових пасток");
            this.f3792z.add("8-БІТ схожий на ходячий ігровий автомат. Він стріляє променями з бластера, а його Супер підсилює шкоду товаришів по команді");
            this.f3792z.add("Вибуховою характер і невгамовна енергія в металевій оболонці");
            this.f3792z.add("Ель Прімо обрушує на ворогів град ударів. Його Супер, удар ліктем в стрибку, завдає шкоди всім, хто опинився поруч!");
            this.f3792z.add("Барлі - офіціант закладу, який кидає пляшки із запальною сумішшю. Його атака - це кидок пляшки з кислотою, а за допомогою Супера він обрушує на ворогів шквал вогняних пляшок.");
            this.f3792z.add("Поко атакує ворогів руйнівною звуковою хвилею. Його Супер зцілює його самого і його товаришів по команді!");
            this.f3792z.add("Ця боксерка-ботанік міцно стоїть на ногах і не боїться ближнього бою! Супер обплітає її міцною і стовідсотково веганською бронею.");
            this.f3792z.add("Випущені Ріко кулі можуть відскакувати від стін. Його Супер долає велику дистанцію і наскрізь прошиває ціль!");
            this.f3792z.add("Атака з пари дробовиків Дерріла неймовірно потужна. Його Супер - посилена бочка, в якій він котиться вперед, відскакуючи від стін на шляху!");
            this.f3792z.add("Пенні стріляє мішечками з монетами. Вони завдають шкоди цілі і будь-кому, хто перебуває за нею. Її Супер - броневежа-мортира");
            this.f3792z.add("Карл кидає свою кирку, як бумеранг. Його Супер атака - це божевільне обертання вагонетки, яка збиває всіх навколо нього.");
            this.f3792z.add("Джекі працює своїм відбійним молотком, похитуючи землю та ворогів, що знаходяться поблизу");
            this.f3792z.add("На полі! Коли шкала хоум-рана повністю заряджено, удар Бібі відкидає бійців назад. Її Супер - пружна кулька з жуйки, яка прошиває ворогів наскрізь");
            this.f3792z.add("Беа подобаються комашки і обнімашкі. Вона атакує з відстані дронами, а її Супер викликає армію розлючених бджіл!");
            this.f3792z.add("Удар Френка породжує вибухову хвилю. Його неймовірно потужний Супер блокує супротивників!");
            this.f3792z.add("Снайперські постріли Пайпер завдають більше шкоди на великій дистанції. Її Супер - чотири гранати, кинувши які, вона тікає!");
            this.f3792z.add("Постріли Пем засипають все навколо шрапнеллю. Її супер - лікувальна турель, відновлює здоров'я їй і її товаришам по команді!");
            this.f3792z.add("Нані обожнює своїх друзів і завжди піклується про них. Вона стріляє світловими сферами в декількох напрямках і керує своїм роботом Піпом за допомогою Супера!");
            this.f3792z.add("Макс неймовірно швидка! Вона стріляє з швидкострільного бластера, а її Супер прискорює її саму і товаришів по команді!");
            this.f3792z.add("Мортис стрибає вперед з кожним помахом своєї лопати. Його Супер викликає зграю кажанів, що завдають шкоди ворогам і зціляють його самого!");
            this.f3792z.add("Містер П. - сердитий вантажник, який кидає на ворогів валізи. Його Супер закликає йому на допомогу роботів-носіїв.");
            this.f3792z.add("Спраут був створений, щоб сіяти життя і любов за допомогою зернобомб. Його Супер створює перешкоду з рослин");
            this.f3792z.add("Три карти таро Тари наскрізь пронизують ворогів. Її супер - чорна діра, яка затягує опинилися поблизу ворогів, завдаючи їм шкоди!");
            this.f3792z.add("Джин випускає зі своєї чарівної лампи снаряди, які розділяються. Його супер - чарівна рука, яка захоплює і притягує до нього ворогів!");
            this.f3792z.add("Спайк кидає гранати з кактусів, які обсипають все навколо голками. Його приголомшливий Супер створює поле з шипами, що сповільнює ворогів і завдає їм шкоди!");
            this.f3792z.add("Ворон кидає три отруєних кинджала. Його Супер - стрімкий стрибок, починаючи і закінчуючи який, Ворон розкидає по сторонам кинджали!");
            this.f3792z.add("Леон вражає ціль роєм метальних клинків. Його супер - димова бомба, що робить його невидимим на деякий час!");
            this.f3792z.add("Сенді - це боєць з хронічним недосипом, здатний управляти стихією землі: закидає ворога колючим гравієм і ховає товаришів за піщаної завісою.");
            this.f3792z.add("Гейл - невтомний майстер на всі руки! Він атакує ворогів вітром зі снігом, а його Супер відкидає їх назад могутнім поривом вітру!");
        }
    }

    /* renamed from: a */
    public final void mo3389a(String str, ImageButton imageButton) {
        TranslateAnimation translateAnimation;
        imageButton.startAnimation(this.f3745aF);
        this.f3783q.setEnabled(false);
        this.f3784r.setEnabled(false);
        if (str.equals("l")) {
            this.f3746aG = new TranslateAnimation(0.0f, -1500.0f, 0.0f, 0.0f);
            translateAnimation = new TranslateAnimation(1500.0f, 0.0f, 0.0f, 0.0f);
        } else {
            this.f3746aG = new TranslateAnimation(0.0f, 1500.0f, 0.0f, 0.0f);
            translateAnimation = new TranslateAnimation(-1500.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f3747aH = translateAnimation;
        this.f3746aG.setDuration(500);
        this.f3747aH.setDuration(500);
        this.f3746aG.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09331 */

            public final void onAnimationEnd(Animation animation) {
                ImageView imageView;
                float f;
                BrawlerReview brawlerReview = BrawlerReview.this;
                if (BrawlerReview.f3715O != 0) {
                    if (MainActivity.m3726c("brawler") == brawlerReview.f3754ac.get(BrawlerReview.f3718W).f4556a.get(brawlerReview.f3744aE).intValue()) {
                        brawlerReview.f3757af.setVisibility(4);
                    } else {
                        brawlerReview.f3757af.setVisibility(0);
                    }
                }
                brawlerReview.f3744aE++;
                if (brawlerReview.f3744aE == brawlerReview.f3754ac.get(BrawlerReview.f3718W).f4556a.size()) {
                    brawlerReview.f3744aE = 0;
                }
                brawlerReview.f3790x.setImageResource(brawlerReview.f3754ac.get(BrawlerReview.f3718W).f4556a.get(brawlerReview.f3744aE).intValue());
                if (MainActivity.m3726c("skin" + brawlerReview.f3754ac.get(BrawlerReview.f3718W).f4556a.get(brawlerReview.f3744aE)) != 0) {
                    brawlerReview.f3750aK.setVisibility(4);
                    imageView = brawlerReview.f3790x;
                    f = 1.0f;
                } else {
                    brawlerReview.f3750aK.setVisibility(0);
                    imageView = brawlerReview.f3790x;
                    f = 0.7f;
                }
                imageView.setAlpha(f);
                BrawlerReview.this.f3741aB.startAnimation(BrawlerReview.this.f3747aH);
                BrawlerReview.this.f3768aq.startAnimation(BrawlerReview.this.f3749aJ);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3747aH.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C093812 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.mo3391f();
                BrawlerReview.this.f3783q.setEnabled(true);
                BrawlerReview.this.f3784r.setEnabled(true);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3741aB.startAnimation(this.f3746aG);
        this.f3768aq.startAnimation(this.f3748aI);
    }

    /* access modifiers changed from: package-private */
    //@Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: e */
    public final void mo3390e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3787u);
        arrayList.addAll(this.f3786t);
        arrayList.addAll(this.f3788v);
        m3688i();
        for (int i = 0; i < this.f3762ak.size(); i++) {
            if (((ImageView) arrayList.get(i)).getVisibility() == 0) {
                ((ImageView) arrayList.get(i)).startAnimation(this.f3762ak.get(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
   // @Override // androidx.appcompat.app.AppCompatActivity
    /* renamed from: f */
    public final void mo3391f() {
        int i;
        this.f3777az++;
        if (this.f3777az == 2) {
            this.f3777az = 0;
        }
        if (MainActivity.m3726c("sounds") == 0 && (i = f3718W) != 32) {
            this.f3740aA = MediaPlayer.create(this, (this.f3777az == 0 ? this.f3775ax : this.f3776ay).get(i).intValue());
            this.f3740aA.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3392h() {
        if (f3715O >= this.f3753ab.get(f3719X).intValue()) {
            this.f3731J.setBackground(getResources().getDrawable(R.drawable.have_at_the_moment_upgrade));
            this.f3764am.setAnimationListener(new Animation.AnimationListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C093711 */

                public final void onAnimationEnd(Animation animation) {
                    BrawlerReview.this.f3765an.startAnimation(BrawlerReview.this.f3764am);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }
            });
            this.f3764am.setFillAfter(false);
            this.f3765an.startAnimation(this.f3764am);
            return;
        }
        this.f3731J.setBackground(getResources().getDrawable(R.drawable.have_at_the_moment));
        this.f3764am.setAnimationListener(null);
        this.f3765an.clearAnimation();
        this.f3765an.setVisibility(4);
    }

    @Override // androidx.core.app.C0523c, androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onCreate(Bundle bundle) {
        String str;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.rewiew);

        MobileAds.initialize(this, getResources().getString(R.string.admob_app_id));
        this.f4179aP = new InterstitialAd(this);
        this.f4179aP.setAdUnitId(getResources().getString(R.string.admob_interstitial_ad_unit_id));
        f4179aP.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                f4179aP.loadAd(new AdRequest.Builder().build());
            }
        });
        f4179aP.loadAd(new AdRequest.Builder().build());

        this.f3777az = 0;
        this.f3744aE = 0;
        this.f3746aG = new TranslateAnimation(0.0f, 1000.0f, 0.0f, 0.0f);
        this.f3746aG.setDuration(1000);
        this.f3746aG.setFillAfter(true);
        this.f3747aH = new TranslateAnimation(-1000.0f, 0.0f, 0.0f, 0.0f);
        this.f3747aH.setDuration(1000);
        this.f3747aH.setFillAfter(true);
        this.f3750aK = (ImageButton) findViewById(R.id.locker);
        this.f3751aL = (ImageView) findViewById(R.id.gadget);
        if (f3719X < 7) {
            this.f3751aL.setBackground(getResources().getDrawable(R.drawable.locked_gadget));
        }
        if (f3719X >= 7) {
            this.f3751aL.setBackground(getResources().getDrawable(R.drawable.gadget_locked_lvl7));
            this.f3751aL.setEnabled(true);
            if (MainActivity.m3726c("gadget" + f3718W) != 0) {
                this.f3751aL.setEnabled(false);
                this.f3751aL.setBackground(getResources().getDrawable(f3720l));
            }
        }
        this.f3765an = (ImageView) findViewById(R.id.upgrade_line);
        this.f3764am = AnimationUtils.loadAnimation(this, R.anim.upgrade_line);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.drawable.shelly_f));
        arrayList.add(Integer.valueOf((int) R.drawable.shelly_skin));
        this.f3754ac = new ArrayList<>();
        this.f3754ac.add(new C1132c());
        this.f3754ac.add(new C1132c(R.drawable.nita_f, R.drawable.nita_skin));
        this.f3754ac.add(new C1132c(R.drawable.colt_f, R.drawable.colt_skin));
        this.f3754ac.add(new C1132c(R.drawable.bull_f, R.drawable.bull_skin));
        this.f3754ac.add(new C1132c(R.drawable.jessie_f, R.drawable.jessie_skin));
        this.f3754ac.add(new C1132c(R.drawable.brock_f, R.drawable.brock_skin));
        this.f3754ac.add(new C1132c(R.drawable.dinamike_f, R.drawable.dinamike_skin));
        this.f3754ac.add(new C1132c(R.drawable.emz_f, R.drawable.emz_skin));
        this.f3754ac.add(new C1132c(R.drawable.bo_f, R.drawable.bo_skin));
        this.f3754ac.add(new C1132c(R.drawable.bit_f, R.drawable.bit_skin));
        this.f3754ac.add(new C1132c(R.drawable.tick_f, R.drawable.tick_f));
        this.f3754ac.add(new C1132c(R.drawable.elprimo_f, R.drawable.elprimo_skin));
        this.f3754ac.add(new C1132c(R.drawable.barley_f, R.drawable.barley_skin));
        this.f3754ac.add(new C1132c(R.drawable.poco_f, R.drawable.poco_skin));
        this.f3754ac.add(new C1132c(R.drawable.rosa_f, R.drawable.rosa_f));
        this.f3754ac.add(new C1132c(R.drawable.riko_f, R.drawable.ricko_skin));
        this.f3754ac.add(new C1132c(R.drawable.darryl_f, R.drawable.darryl_skin));
        this.f3754ac.add(new C1132c(R.drawable.penny_f, R.drawable.penny_skin));
        this.f3754ac.add(new C1132c(R.drawable.carl_f, R.drawable.carl_skin));
        this.f3754ac.add(new C1132c(R.drawable.jacky_f, R.drawable.jacky_skin));
        this.f3754ac.add(new C1132c(R.drawable.bibi_f, R.drawable.bibi_skin));
        this.f3754ac.add(new C1132c(R.drawable.bea_f, R.drawable.bea_skin));
        this.f3754ac.add(new C1132c(R.drawable.frank_f, R.drawable.frank_skin));
        this.f3754ac.add(new C1132c(R.drawable.piper_f, R.drawable.piper_skin));
        this.f3754ac.add(new C1132c(R.drawable.pam_f, R.drawable.pam_skin));
        this.f3754ac.add(new C1132c(R.drawable.nani_f, R.drawable.nani_f));
        this.f3754ac.add(new C1132c(R.drawable.max_f, R.drawable.max_skin));
        this.f3754ac.add(new C1132c(R.drawable.mortis_f, R.drawable.mortis_skin));
        this.f3754ac.add(new C1132c(R.drawable.mr_p_f, R.drawable.mr_p_skin));
        this.f3754ac.add(new C1132c(R.drawable.sprout_f, R.drawable.sprout_skin));
        this.f3754ac.add(new C1132c(R.drawable.tara_f, R.drawable.tara_skin));
        this.f3754ac.add(new C1132c(R.drawable.gene_f, R.drawable.gene_skin));
        this.f3754ac.add(new C1132c(R.drawable.spike_f, R.drawable.spike_skin));
        this.f3754ac.add(new C1132c(R.drawable.crow_f, R.drawable.crow_skin));
        this.f3754ac.add(new C1132c(R.drawable.leon_f, R.drawable.leon_skin));
        this.f3754ac.add(new C1132c(R.drawable.sandy_f, R.drawable.sandy_skin));
        this.f3754ac.add(new C1132c(R.drawable.gale_f, R.drawable.gale_skin));
        this.f3748aI = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f3748aI.setDuration(200);
        this.f3749aJ = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f3749aJ.setDuration(1500);
        this.f3749aJ.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C093913 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.f3768aq.setVisibility(0);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3783q = (ImageButton) findViewById(R.id.arrow_left);
        this.f3784r = (ImageButton) findViewById(R.id.arrow_right);
        if (this.f3754ac.get(f3718W).f4556a.get(0) == this.f3754ac.get(f3718W).f4556a.get(1)) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        this.f3783q.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C094014 */

            public final void onClick(View view) {
                BrawlerReview brawlerReview = BrawlerReview.this;
                brawlerReview.mo3389a("l", brawlerReview.f3783q);
            }
        });
        this.f3784r.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C094115 */

            public final void onClick(View view) {
                BrawlerReview brawlerReview = BrawlerReview.this;
                brawlerReview.mo3389a("r", brawlerReview.f3784r);
            }
        });
        this.f3745aF = AnimationUtils.loadAnimation(this, R.anim.pow_up);
        this.f3743aD = (TextView) findViewById(R.id.rare_text);
        this.f3785s = new ArrayList<>();
        this.f3774aw = new ArrayList<>();
        this.f3768aq = (ImageView) findViewById(R.id.shaddow);
        this.f3766ao = (Button) findViewById(R.id.full_info);
        this.f3769ar = (LinearLayout) findViewById(R.id.att_lay);
        this.f3770as = (LinearLayout) findViewById(R.id.health_lay);
        this.f3771at = (LinearLayout) findViewById(R.id.super_lay);
        this.f3741aB = (RelativeLayout) findViewById(R.id.brawler_lay);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C094216 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.f3769ar.setVisibility(4);
                BrawlerReview.this.f3770as.setVisibility(4);
                BrawlerReview.this.f3771at.setVisibility(4);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(500);
        scaleAnimation2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C094317 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.f3769ar.setVisibility(0);
                BrawlerReview.this.f3770as.setVisibility(0);
                BrawlerReview.this.f3771at.setVisibility(0);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        final ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setDuration(500);
        scaleAnimation3.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C094418 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.f3729H.setVisibility(4);
                BrawlerReview.this.f3728G.setVisibility(4);
                BrawlerReview.this.f3730I.setVisibility(4);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        final ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation4.setDuration(500);
        scaleAnimation4.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C094519 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.f3729H.setVisibility(0);
                BrawlerReview.this.f3728G.setVisibility(0);
                BrawlerReview.this.f3730I.setVisibility(0);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3766ao.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09462 */

            public final void onClick(View view) {
                if (!BrawlerReview.this.f3772au && BrawlerReview.this.f3773av) {
                    BrawlerReview.this.f3769ar.startAnimation(scaleAnimation);
                    BrawlerReview.this.f3770as.startAnimation(scaleAnimation);
                    BrawlerReview.this.f3771at.startAnimation(scaleAnimation);
                    BrawlerReview.this.f3729H.startAnimation(scaleAnimation4);
                    BrawlerReview.this.f3728G.startAnimation(scaleAnimation4);
                    BrawlerReview.this.f3730I.startAnimation(scaleAnimation4);
                    BrawlerReview brawlerReview = BrawlerReview.this;
                    brawlerReview.f3772au = true;
                    brawlerReview.f3773av = false;
                }
                if (!BrawlerReview.this.f3772au && !BrawlerReview.this.f3773av) {
                    BrawlerReview.this.f3769ar.startAnimation(scaleAnimation2);
                    BrawlerReview.this.f3770as.startAnimation(scaleAnimation2);
                    BrawlerReview.this.f3771at.startAnimation(scaleAnimation2);
                    BrawlerReview.this.f3729H.startAnimation(scaleAnimation3);
                    BrawlerReview.this.f3728G.startAnimation(scaleAnimation3);
                    BrawlerReview.this.f3730I.startAnimation(scaleAnimation3);
                    BrawlerReview brawlerReview2 = BrawlerReview.this;
                    brawlerReview2.f3772au = true;
                    brawlerReview2.f3773av = true;
                }
                BrawlerReview.this.f3772au = false;
            }
        });
        getWindow().setFlags(1024, 1024);
        MainActivity.m3727c(this);
        this.f3763al = (RelativeLayout) findViewById(R.id.info_lay);
        if (f3719X == 0) {
            this.f3763al.setBackground(getResources().getDrawable(R.drawable.new_stat_lock));
        }
        this.f3767ap = (ImageView) findViewById(R.id.power_star);
        ScaleAnimation scaleAnimation5 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation5.setDuration(1000);
        scaleAnimation5.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09473 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.mo3390e();
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                BrawlerReview brawlerReview = BrawlerReview.this;
                brawlerReview.f3786t.add((ImageView) brawlerReview.findViewById(R.id.health_one));
                brawlerReview.f3786t.add((ImageView) brawlerReview.findViewById(R.id.health_two));
                brawlerReview.f3786t.add((ImageView) brawlerReview.findViewById(R.id.health_three));
                brawlerReview.f3786t.add((ImageView) brawlerReview.findViewById(R.id.health_four));
                brawlerReview.f3787u.add((ImageView) brawlerReview.findViewById(R.id.attack_one));
                brawlerReview.f3787u.add((ImageView) brawlerReview.findViewById(R.id.attack_two));
                brawlerReview.f3787u.add((ImageView) brawlerReview.findViewById(R.id.attack_three));
                brawlerReview.f3787u.add((ImageView) brawlerReview.findViewById(R.id.attack_fourth));
                brawlerReview.f3788v.add((ImageView) brawlerReview.findViewById(R.id.super_one));
                brawlerReview.f3788v.add((ImageView) brawlerReview.findViewById(R.id.super_two));
                brawlerReview.f3788v.add((ImageView) brawlerReview.findViewById(R.id.super_three));
                brawlerReview.f3788v.add((ImageView) brawlerReview.findViewById(R.id.super_fourth));
                brawlerReview.f3762ak = new ArrayList<>();
                int i = 0;
                for (int i2 = 0; i2 < 12; i2++) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration(250);
                    scaleAnimation.setStartOffset((long) i);
                    i += 100;
                    brawlerReview.f3762ak.add(scaleAnimation);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(brawlerReview.f3787u);
                arrayList.addAll(brawlerReview.f3786t);
                arrayList.addAll(brawlerReview.f3788v);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((ImageView) arrayList.get(i3)).setVisibility(4);
                }
            }
        });
        this.f3763al.startAnimation(scaleAnimation5);
        this.f3736U = (RelativeLayout) findViewById(R.id.rare);
        this.f3742aC = (ImageView) findViewById(R.id.rare_step);
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("f");
        this.f3774aw.add("r");
        this.f3774aw.add("r");
        this.f3774aw.add("r");
        this.f3774aw.add("r");
        this.f3774aw.add("s");
        this.f3774aw.add("s");
        this.f3774aw.add("s");
        this.f3774aw.add("s");
        this.f3774aw.add("s");
        this.f3774aw.add("e");
        this.f3774aw.add("e");
        this.f3774aw.add("e");
        this.f3774aw.add("e");
        this.f3774aw.add("e");
        this.f3774aw.add("e");
        this.f3774aw.add("m");
        this.f3774aw.add("m");
        this.f3774aw.add("m");
        this.f3774aw.add("m");
        this.f3774aw.add("m");
        this.f3774aw.add("m");
        this.f3774aw.add("l");
        this.f3774aw.add("l");
        this.f3774aw.add("l");
        this.f3774aw.add("l");
        this.f3774aw.add("h");
        if (MainActivity.m3726c("language") == 1) {
            this.f3743aD.setText("НАГОРОДА");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3743aD.setText("НАГРАДА");
        }
        if (this.f3774aw.get(f3718W).equals("r")) {
            this.f3742aC.setBackground(getResources().getDrawable(R.drawable.new_lvl_line_rare));
            this.f3743aD.setTextColor(getResources().getColor(R.color.new_rare));
            if (MainActivity.m3726c("language") == 0) {
                this.f3743aD.setText("RARE");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3743aD.setText("РІДКІСНИЙ");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3743aD.setText("РЕДКИЙ");
            }
        }
        if (this.f3774aw.get(f3718W).equals("s")) {
            this.f3742aC.setBackground(getResources().getDrawable(R.drawable.new_lvl_line_superrare));
            this.f3743aD.setTextColor(getResources().getColor(R.color.new_super_rare));
            if (MainActivity.m3726c("language") == 0) {
                this.f3743aD.setText("SUPER RARE");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3743aD.setText("ДУЖЕ РІДКІСНИЙ");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3743aD.setText("СВЕРХРЕДКИЙ");
            }
        }
        if (this.f3774aw.get(f3718W).equals("e")) {
            this.f3742aC.setBackground(getResources().getDrawable(R.drawable.new_lvl_line_epik));
            this.f3743aD.setTextColor(getResources().getColor(R.color.new_epik));
            if (MainActivity.m3726c("language") == 0) {
                this.f3743aD.setText("EPIC");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3743aD.setText("ЕПІЧНИЙ");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3743aD.setText("ЭПИЧЕСКИЙ");
            }
        }
        if (this.f3774aw.get(f3718W).equals("m")) {
            this.f3742aC.setBackground(getResources().getDrawable(R.drawable.new_lvl_line_mifik));
            this.f3743aD.setTextColor(getResources().getColor(R.color.new_mifik));
            if (MainActivity.m3726c("language") == 0) {
                this.f3743aD.setText("MYTHIC");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3743aD.setText("МІФІЧНИЙ");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3743aD.setText("МИФИЧЕСКИЙ");
            }
        }
        if (this.f3774aw.get(f3718W).equals("l")) {
            this.f3742aC.setBackground(getResources().getDrawable(R.drawable.new_lvl_line_legendary));
            this.f3743aD.setTextColor(getResources().getColor(R.color.new_legendary));
            if (MainActivity.m3726c("language") == 0) {
                this.f3743aD.setText("LEGENDARY");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3743aD.setText("ЛЕГЕНДАРНИЙ");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3743aD.setText("ЛЕГЕНДАРНЫЙ");
            }
        }
        if (this.f3774aw.get(f3718W).equals("h")) {
            this.f3742aC.setBackground(getResources().getDrawable(R.drawable.new_lvl_line_hromatic));
            this.f3743aD.setTextColor(getResources().getColor(R.color.new_chromatic));
            if (MainActivity.m3726c("language") == 0) {
                this.f3743aD.setText("CHROMATIC");
            }
            if (MainActivity.m3726c("language") == 2) {
                this.f3743aD.setText("ХРОМАТИЧЕСКИЙ");
            }
            if (MainActivity.m3726c("language") == 1) {
                this.f3743aD.setText("ХРОМАТИЧНИЙ");
            }
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(-500.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(-800.0f, 0.0f, -100.0f, 0.0f);
        translateAnimation2.setDuration(600);
        translateAnimation2.setFillAfter(true);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09484 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview.this.f3779k.setVisibility(0);
                BrawlerReview.this.f3767ap.setVisibility(0);
                BrawlerReview.this.f3751aL.setVisibility(0);
                BrawlerReview.this.f3789w.setVisibility(0);
                BrawlerReview.this.f3757af.setVisibility(0);
                TranslateAnimation translateAnimation = new TranslateAnimation(-500.0f, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(1000);
                translateAnimation.setFillAfter(true);
                TranslateAnimation translateAnimation2 = new TranslateAnimation(500.0f, 0.0f, 0.0f, 0.0f);
                translateAnimation2.setDuration(1000);
                translateAnimation2.setFillAfter(true);
                BrawlerReview.this.f3789w.startAnimation(translateAnimation);
                if (BrawlerReview.f3715O != 0) {
                    BrawlerReview.this.f3757af.startAnimation(translateAnimation);
                } else {
                    BrawlerReview.this.f3757af.setVisibility(4);
                }
                if (BrawlerReview.f3719X != 0) {
                    BrawlerReview.this.f3779k.startAnimation(translateAnimation2);
                } else {
                    BrawlerReview.this.f3779k.setVisibility(4);
                }
                BrawlerReview.this.f3767ap.startAnimation(translateAnimation2);
                BrawlerReview.this.f3751aL.startAnimation(translateAnimation2);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3736U.startAnimation(translateAnimation);
        this.f3787u = new ArrayList<>();
        this.f3786t = new ArrayList<>();
        this.f3788v = new ArrayList<>();
        this.f3759ah = (TextView) findViewById(R.id.health_text);
        this.f3760ai = (TextView) findViewById(R.id.attack_text);
        this.f3761aj = (TextView) findViewById(R.id.super_text);
        this.f3756ae = (GifImageView) findViewById(R.id.fos);
        this.f3758ag = (TextView) findViewById(R.id.title);
        this.f3757af = (TextView) findViewById(R.id.select);
        this.f3757af.setVisibility(4);
        if (MainActivity.m3726c("language") == 0) {
            this.f3758ag.setText("Brawlers ");
            this.f3759ah.setText("HEALTH ");
            this.f3760ai.setText("ATTACK");
            this.f3761aj.setText("SUPER ");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f3758ag.setText("Бійці ");
            this.f3759ah.setText("ЗДОРОВ’Я ");
            this.f3760ai.setText("АТАКА ");
            this.f3761aj.setText("СУПЕР УДАР ");
            this.f3757af.setText("ОБРАТИ");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f3758ag.setText("Бойцы ");
            this.f3759ah.setText("ЗДОРОВЬЯ ");
            this.f3760ai.setText("АТАКА ");
            this.f3761aj.setText("СУПЕР УДАР ");
            this.f3757af.setText("ВЫБРАТЬ");
        }
        this.f3755ad = (ImageView) findViewById(R.id.scells);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (((double) (memoryInfo.totalMem / 1048576)) <= 2500.0d) {
            this.f3756ae.setVisibility(4);
            this.f3755ad.setVisibility(0);
        } else {
            this.f3756ae.setBackgroundResource(R.drawable.ideal_back_fourth);
        }
        this.f3757af.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09495 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("skin" + BrawlerReview.this.f3754ac.get(BrawlerReview.f3718W).f4556a.get(BrawlerReview.this.f3744aE)) != 0) {
                    Toast.makeText(BrawlerReview.this, "Selected", 0).show();
                    MainActivity.m3720a(BrawlerReview.this.f3754ac.get(BrawlerReview.f3718W).f4556a.get(BrawlerReview.this.f3744aE).intValue(), "brawler");
                    BrawlerReview.this.f3757af.setVisibility(4);
                    try {
                        MainActivity.f4147p.setImageResource(MainActivity.m3726c("brawler"));
                    } catch (Exception unused) {
                    }
                } else {
                    Toast.makeText(BrawlerReview.this, "Buy this skin", 0).show();
                }
            }
        });
        this.f3792z = new ArrayList<>();
        this.f3778j = (ImageButton) findViewById(R.id.back);
        this.f3739Z = (TextView) findViewById(R.id.need_coins);
        this.f3732K = (Button) findViewById(R.id.upgrade);
        this.f3733P = (TextView) findViewById(R.id.block);
        this.f3733P.setText(f3716Q);
        this.f3789w = (TextView) findViewById(R.id.text);
        this.f3789w.setVisibility(4);
        int i = f3719X + 1;
        if (MainActivity.m3726c("language") == 0) {
            this.f3732K.setText("UPGRADE TO POWER LEVEL ".concat(String.valueOf(i)));
        }
        if (MainActivity.m3726c("language") == 1) {
            Button button = this.f3732K;
            button.setText("ПОКРАЩИТИ ДО " + i + " РІВНЯ");
        }
        if (MainActivity.m3726c("language") == 2) {
            Button button2 = this.f3732K;
            button2.setText("УЛУЧШИТЬ ДО " + i + " УРОВНЯ");
        }
        this.f3737V = AnimationUtils.loadAnimation(this, R.anim.upgrade_anim);
        this.f3722A = AnimationUtils.loadAnimation(this, R.anim.play);
        this.f3722A.setRepeatCount(-1);
        this.f3726E = (TextView) findViewById(R.id.name);
        this.f3727F = (TextView) findViewById(R.id.count);
        this.f3731J = (TextView) findViewById(R.id.count_bottom);
        this.f3779k = (TextView) findViewById(R.id.lvl);
        this.f3791y = (ImageView) findViewById(R.id.rotate);
        this.f3779k.setVisibility(4);
        this.f3767ap.setVisibility(4);
        this.f3751aL.setVisibility(4);
        if (f3715O == 0) {
            this.f3733P.setVisibility(0);
            this.f3732K.setVisibility(4);
            this.f3739Z.setVisibility(4);
            this.f3727F.setVisibility(4);
            this.f3779k.setVisibility(4);
            this.f3739Z.setVisibility(4);
            this.f3727F.setVisibility(4);
            this.f3732K.setVisibility(4);
            this.f3765an.setVisibility(4);
            this.f3765an.clearAnimation();
            this.f3731J.setVisibility(4);
        } else {
            this.f3733P.getLayoutParams().height = 0;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(10000);
        rotateAnimation.setRepeatCount(-1);
        if (MainActivity.m3726c("language") == 0) {
            TextView textView2 = this.f3779k;
            textView2.setText("POWER  " + f3719X);
        }
        if (MainActivity.m3726c("language") == 1) {
            TextView textView3 = this.f3779k;
            textView3.setText("СИЛА  " + f3719X);
        }
        if (MainActivity.m3726c("language") == 2) {
            TextView textView4 = this.f3779k;
            textView4.setText("СИЛА  " + f3719X);
        }
        this.f3728G = (TextView) findViewById(R.id.health);
        this.f3729H = (TextView) findViewById(R.id.attack);
        this.f3730I = (TextView) findViewById(R.id.supers);
        this.f3738Y = new ArrayList<>();
        this.f3734S = (ImageView) findViewById(R.id.home);
        this.f3735T = (TextView) findViewById(R.id.coins);
        MainActivity.m3729d(this.f3735T, "money");
        StringBuilder sb = new StringBuilder();
        sb.append(f3718W);
        f3715O = MainActivity.m3726c(sb.toString());
        this.f3734S.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09506 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(BrawlerReview.this.getApplicationContext(), (int) R.raw.menu_cancel).start();
                }
                f4179aP.show();
                BrawlerReview.this.finish();
            }
        });
        TextView textView5 = this.f3726E;
        textView5.setText(f3712L + " ");
        if (this.f3726E.getText().toString().equals("Tick ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Rosa ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Nani ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Тік ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Роза ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Нані ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Тик ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Роза ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        if (this.f3726E.getText().toString().equals("Нани ")) {
            this.f3784r.setVisibility(4);
            this.f3783q.setVisibility(4);
        }
        this.f3778j.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09517 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(BrawlerReview.this.getApplicationContext(), (int) R.raw.menu_cancel).start();
                }
                BrawlerReview.this.finish();
            }
        });
        this.f3790x = (ImageView) findViewById(R.id.drawable);
        this.f3790x.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09528 */

            public final void onClick(View view) {
                if (BrawlerReview.this.f3733P.getVisibility() == 4 && BrawlerReview.this.f3750aK.getVisibility() == 0) {
                    Shop.f4308ad = BrawlerReview.this.f3726E.getText().toString();
                    Shop.f4307ac = true;
                    Shop.f4309ae = BrawlerReview.this.f3754ac.get(BrawlerReview.f3718W).f4556a.get(BrawlerReview.this.f3744aE).intValue();
                    BrawlerReview.this.startActivity(new Intent(BrawlerReview.this, Shop.class));
                    BrawlerReview.this.finish();
                    Brawlers.f3830z.finish();
                }
            }
        });
        this.f3741aB.startAnimation(translateAnimation2);
        translateAnimation2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09539 */

            public final void onAnimationEnd(Animation animation) {
                BrawlerReview brawlerReview = BrawlerReview.this;
                brawlerReview.f3775ax = new ArrayList<>();
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.shelly));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.nita));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.colt));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.bull));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.jessie));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.brock));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.dinamoke));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.emz));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.bo));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.bit));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.tick));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.elprimo));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.barley));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.poco));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.rosa));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.ricko));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.darryl));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.penny));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.carl));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.jaky));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.bibi));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.bea));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.frank));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.piper));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.pam));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.nani));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.max));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.mortis));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.mrp));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.sprout));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.tara));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.gene));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.gene));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.crow));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.leon));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.sandy));
                brawlerReview.f3775ax.add(Integer.valueOf((int) R.raw.gale));
                brawlerReview.f3776ay = new ArrayList<>();
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.shelly2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.nita2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.colt2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.bull2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.jessie2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.brock2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.dinamike2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.emz2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.bo2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.bit2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.tick2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.el_primo2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.barley2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.poco2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.rosa2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.ricko2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.darryl2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.penny2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.carl2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.jackie2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.bibi2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.bea2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.frank2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.piper2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.pam2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.nani2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.max2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.mortis2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.mr_p2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.sprout2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.tara2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.gene2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.gene2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.crow2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.leon2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.sandy2));
                brawlerReview.f3776ay.add(Integer.valueOf((int) R.raw.gale2));
                if (BrawlerReview.f3718W != 32) {
                    brawlerReview.f3740aA = MediaPlayer.create(brawlerReview, brawlerReview.f3775ax.get(BrawlerReview.f3718W).intValue());
                    brawlerReview.f3740aA.start();
                }
                BrawlerReview.this.f3790x.startAnimation(BrawlerReview.this.f3722A);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(1000);
                scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C09539.C09541 */

                    public final void onAnimationEnd(Animation animation) {
                        BrawlerReview.this.f3768aq.setVisibility(0);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }
                });
                BrawlerReview.this.f3768aq.startAnimation(scaleAnimation);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f3790x.setImageResource(f3714N);
        int i2 = f3714N;
        if (i2 == R.drawable.tick_f && i2 == R.drawable.rosa_f && i2 == R.drawable.jacky_f && i2 == R.drawable.pam_f && i2 == R.drawable.gene_f) {
            this.f3783q.setVisibility(4);
            this.f3784r.setVisibility(4);
        }
        MainActivity.m3720a(1, "skin" + f3714N);
        m3689j();
        this.f3723B = this.f3738Y.get(f3718W).f4559a + (f3719X * 120);
        this.f3724C = this.f3738Y.get(f3718W).f4560b + (f3719X * 80);
        this.f3725D = this.f3738Y.get(f3718W).f4561c + (f3719X * 45);
        TextView textView6 = this.f3728G;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3723B);
        textView6.setText(sb2.toString());
        TextView textView7 = this.f3729H;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f3724C);
        textView7.setText(sb3.toString());
        TextView textView8 = this.f3730I;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3725D);
        textView8.setText(sb4.toString());
        if (f3719X != 10) {
            textView = this.f3739Z;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f3752aa.get(f3719X));
            sb5.append(' ');
            str = sb5.toString();
        } else {
            textView = this.f3739Z;
            str = null;
        }
        textView.setText(str);
        this.f3753ab = new ArrayList<>();
        this.f3753ab.add(0);
        this.f3753ab.add(20);
        this.f3753ab.add(30);
        this.f3753ab.add(50);
        this.f3753ab.add(80);
        this.f3753ab.add(130);
        this.f3753ab.add(210);
        this.f3753ab.add(340);
        this.f3753ab.add(550);
        this.f3789w.setText(this.f3792z.get(f3718W));
        this.f3753ab.add(800);
        if (f3719X < 9) {
            TextView textView9 = this.f3727F;
            textView9.setText(f3715O + "/" + this.f3753ab.get(f3719X));
            if (f3715O != 0) {
                mo3392h();
            }
        } else {
            this.f3739Z.setVisibility(4);
            this.f3727F.setVisibility(4);
            this.f3732K.setVisibility(4);
            this.f3765an.setVisibility(4);
            this.f3767ap.setBackground(getResources().getDrawable(R.drawable.star_lvl_9));
            this.f3731J.setVisibility(4);
            this.f3763al.setBackground(getResources().getDrawable(R.drawable.new_stat_lock));
            if (MainActivity.m3726c("starpower" + f3718W) != 0) {
                this.f3767ap.setBackground(getResources().getDrawable(f3721m));
            }
        }
        this.f3732K.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C093410 */

            public final void onClick(View view) {
                String str;
                TextView textView;
                f4179aP.show();
                if (BrawlerReview.f3719X < 9) {
                    MainActivity.m3729d(BrawlerReview.this.f3735T, "money");
                    int parseInt = Integer.parseInt(BrawlerReview.this.f3735T.getText().toString());
                    if (parseInt - BrawlerReview.this.f3752aa.get(BrawlerReview.f3719X).intValue() >= 0 && BrawlerReview.f3715O - BrawlerReview.this.f3753ab.get(BrawlerReview.f3719X).intValue() >= 0) {
                        if (MainActivity.m3726c("sounds") == 0) {
                            MediaPlayer create = MediaPlayer.create(BrawlerReview.this.getApplicationContext(), (int) R.raw.unlock_new_power_lvl_01);
                            create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C093410.C09351 */

                                public final void onCompletion(MediaPlayer mediaPlayer) {
                                    BrawlerReview.this.mo3391f();
                                }
                            });
                            create.start();
                        }
                        BrawlerReview.this.mo3390e();
                        BrawlerReview.this.f3791y.setVisibility(0);
                        BrawlerReview.this.f3791y.startAnimation(BrawlerReview.this.f3737V);
                        BrawlerReview.this.f3737V.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.BrawlerReview.C093410.C09362 */

                            public final void onAnimationEnd(Animation animation) {
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setDuration(500);
                                BrawlerReview.this.f3791y.startAnimation(alphaAnimation);
                                BrawlerReview.this.f3791y.setVisibility(4);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }
                        });
                        BrawlerReview.this.f3790x.animate().withLayer().rotationY(720.0f).setDuration(1500);
                        BrawlerReview.f3715O -= BrawlerReview.this.f3753ab.get(BrawlerReview.f3719X).intValue();
                        int intValue = parseInt - BrawlerReview.this.f3752aa.get(BrawlerReview.f3719X).intValue();
                        if (BrawlerReview.f3715O == 0) {
                            BrawlerReview.f3715O++;
                        }
                        MainActivity.m3720a(intValue, "money");
                        int i = BrawlerReview.f3715O;
                        StringBuilder sb = new StringBuilder();
                        sb.append(BrawlerReview.f3718W);
                        MainActivity.m3720a(i, sb.toString());
                        int i2 = BrawlerReview.f3719X + 1;
                        BrawlerReview.f3719X = i2;
                        MainActivity.m3720a(i2, "l" + BrawlerReview.f3718W);
                        BrawlerReview brawlerReview = BrawlerReview.this;
                        brawlerReview.f3723B = brawlerReview.f3738Y.get(BrawlerReview.f3718W).f4559a + (BrawlerReview.f3719X * 120);
                        BrawlerReview brawlerReview2 = BrawlerReview.this;
                        brawlerReview2.f3724C = brawlerReview2.f3738Y.get(BrawlerReview.f3718W).f4560b + (BrawlerReview.f3719X * 80);
                        BrawlerReview brawlerReview3 = BrawlerReview.this;
                        brawlerReview3.f3725D = brawlerReview3.f3738Y.get(BrawlerReview.f3718W).f4561c + (BrawlerReview.f3719X * 45);
                        TextView textView2 = BrawlerReview.this.f3728G;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(BrawlerReview.this.f3723B);
                        textView2.setText(sb2.toString());
                        TextView textView3 = BrawlerReview.this.f3729H;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(BrawlerReview.this.f3724C);
                        textView3.setText(sb3.toString());
                        TextView textView4 = BrawlerReview.this.f3730I;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(BrawlerReview.this.f3725D);
                        textView4.setText(sb4.toString());
                        if (BrawlerReview.f3719X != 10) {
                            textView = BrawlerReview.this.f3739Z;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(BrawlerReview.this.f3752aa.get(BrawlerReview.f3719X));
                            sb5.append(' ');
                            str = sb5.toString();
                        } else {
                            textView = BrawlerReview.this.f3739Z;
                            str = null;
                        }
                        textView.setText(str);
                        if (MainActivity.m3726c("language") == 0) {
                            BrawlerReview.this.f3779k.setText("POWER  " + BrawlerReview.f3719X);
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            BrawlerReview.this.f3779k.setText("СИЛА  " + BrawlerReview.f3719X);
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            BrawlerReview.this.f3779k.setText("СИЛА  " + BrawlerReview.f3719X);
                        }
                        int i3 = BrawlerReview.f3719X + 1;
                        if (MainActivity.m3726c("language") == 0) {
                            BrawlerReview.this.f3732K.setText("UPGRADE TO POWER LEVEL ".concat(String.valueOf(i3)));
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            BrawlerReview.this.f3732K.setText("ПОКРАЩИТИ ДО " + i3 + " РІВНЯ");
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            BrawlerReview.this.f3732K.setText("УЛУЧШИТЬ ДО " + i3 + " УРОВНЯ");
                        }
                        BrawlerReview.this.f3735T.setText(String.valueOf(intValue));
                        if (BrawlerReview.f3719X != 10) {
                            BrawlerReview.this.f3727F.setText(BrawlerReview.f3715O + "/" + BrawlerReview.this.f3753ab.get(BrawlerReview.f3719X));
                            BrawlerReview.this.mo3392h();
                        } else {
                            BrawlerReview.this.f3739Z.setVisibility(4);
                            BrawlerReview.this.f3727F.setVisibility(4);
                            BrawlerReview.this.f3732K.setVisibility(4);
                        }
                        //ToDo: Notify....
                        /*((RecyclerView.Adapter) Brawlers.f3819B).notifyDataSetChanged();
                        ((RecyclerView.Adapter) Brawlers.f3819B).hasObservers().mo2962a(BrawlerReview.f3718W);*/
                    }
                } else {
                    BrawlerReview.this.f3739Z.setVisibility(4);
                    BrawlerReview.this.f3727F.setVisibility(4);
                    BrawlerReview.this.f3732K.setVisibility(4);
                    BrawlerReview.this.f3765an.setVisibility(4);
                    BrawlerReview.this.f3767ap.setBackground(BrawlerReview.this.getResources().getDrawable(R.drawable.star_lvl_9));
                    BrawlerReview.this.f3731J.setVisibility(4);
                    BrawlerReview.this.f3763al.setBackground(BrawlerReview.this.getResources().getDrawable(R.drawable.new_stat_lock));
                }
                if (MainActivity.m3726c("l" + BrawlerReview.f3718W) >= 9) {
                    BrawlerReview.this.f3739Z.setVisibility(4);
                    BrawlerReview.this.f3727F.setVisibility(4);
                    BrawlerReview.this.f3732K.setVisibility(4);
                    BrawlerReview.this.f3765an.setVisibility(4);
                    BrawlerReview.this.f3767ap.setBackground(BrawlerReview.this.getResources().getDrawable(R.drawable.star_lvl_9));
                    BrawlerReview.this.f3731J.setVisibility(4);
                    BrawlerReview.this.f3763al.setBackground(BrawlerReview.this.getResources().getDrawable(R.drawable.new_stat_lock));
                }
                BrawlerReview brawlerReview4 = BrawlerReview.this;
                if (BrawlerReview.f3719X < 7) {
                    brawlerReview4.f3751aL.setBackground(brawlerReview4.getResources().getDrawable(R.drawable.locked_gadget));
                }
                if (BrawlerReview.f3719X >= 7) {
                    brawlerReview4.f3751aL.setBackground(brawlerReview4.getResources().getDrawable(R.drawable.gadget_locked_lvl7));
                    brawlerReview4.f3751aL.setEnabled(true);
                    if (MainActivity.m3726c("gadget" + BrawlerReview.f3718W) != 0) {
                        brawlerReview4.f3751aL.setEnabled(false);
                        brawlerReview4.f3751aL.setBackground(brawlerReview4.getResources().getDrawable(BrawlerReview.f3720l));
                    }
                }
            }
        });
    }

    @Override // androidx.p038f.p039a.C0666e, androidx.appcompat.app.AppCompatActivity
    public void onDestroy() {
        super.onDestroy();
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
