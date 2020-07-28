package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

@SuppressWarnings("ALL")
/* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.i */
final class C1141i extends RecyclerView.Adapter<C1141i.C1145a> {

    /* renamed from: e */
    static Activity f4575e;

    /* renamed from: c */
    ArrayList<C1135f> f4576c;

    /* renamed from: d */
    ArrayList<Integer> f4577d;

    /* renamed from: f */
    ArrayList f4578f;

    /* renamed from: g */
    ArrayList<String> f4579g;

    /* renamed from: h */
    int f4580h;

    /* renamed from: i */
    ArrayList<Integer> f4581i;

    /* renamed from: j */
    ArrayList<Integer> f4582j;

    /* renamed from: k */
    final String f4583k = "com.brawl.mybestappforfansbrawlstarsboxs";

    /* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.i$a */
    public static class C1145a extends RecyclerView.ViewHolder {

        /* renamed from: A */
        ImageView f4591A;

        /* renamed from: B */
        ImageView f4592B;

        /* renamed from: C */
        RelativeLayout f4593C;

        /* renamed from: r */
        ImageView f4594r;

        /* renamed from: s */
        ImageView f4595s;

        /* renamed from: t */
        ImageView f4596t;

        /* renamed from: u */
        TextView f4597u;

        /* renamed from: v */
        TextView f4598v;

        /* renamed from: w */
        TextView f4599w;

        /* renamed from: x */
        TextView f4600x;

        /* renamed from: y */
        TextView f4601y;

        /* renamed from: z */
        TextView f4602z;

        C1145a(View view) {
            super(view);
            this.f4593C = (RelativeLayout) view.findViewById(R.id.layout);
            this.f4596t = (ImageView) view.findViewById(R.id.card);
            this.f4597u = (TextView) view.findViewById(R.id.text_count);
            this.f4598v = (TextView) view.findViewById(R.id.power);
            this.f4591A = (ImageView) view.findViewById(R.id.power_upgrade);
            this.f4599w = (TextView) view.findViewById(R.id.text_lock);
            this.f4600x = (TextView) view.findViewById(R.id.text_upgrade);
            this.f4592B = (ImageView) view.findViewById(R.id.upgrade_line);
            this.f4601y = (TextView) view.findViewById(R.id.top_upgrade);
            this.f4602z = (TextView) view.findViewById(R.id.name);
            this.f4594r = (ImageView) view.findViewById(R.id.gadget);
            this.f4595s = (ImageView) view.findViewById(R.id.starpower);
        }
    }

    C1141i(ArrayList<C1135f> arrayList, Activity activity) {
        this.f4576c = arrayList;
        f4575e = activity;
        this.f4582j = new ArrayList<>();
        this.f4582j.add(Integer.valueOf((int) R.drawable.shelly_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.nita_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.colt_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.bull_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.jessie_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.brock_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.dinamike_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.emz_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.bo_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.bit_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.tick_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.el_primo_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.barley_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.poco_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.rosa_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.rico_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.darryl_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.penny_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.carl_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.jacky_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.bibi_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.bea_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.frank_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.piper_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.pam_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.nani_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.max_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.mortis_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.mr_p_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.sprout_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.tara_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.gene_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.spike_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.crow_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.leon_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.sandy_gadget));
        this.f4582j.add(Integer.valueOf((int) R.drawable.gale_gadget));
        this.f4581i = new ArrayList<>();
        this.f4581i.add(Integer.valueOf((int) R.drawable.shelly_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.nita_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.colt_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.bull_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.jessie_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.brock_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.dinamike_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.emz_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.bo_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.bit_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.tick_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.el_primo_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.barley_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.poco_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.rosa_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.rico_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.darryl_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.penny_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.carl_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.jacky_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.bibi_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.bea_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.frank_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.piper_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.pam_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.nani_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.max_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.mortis_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.mr_p_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.sprout_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.tara_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.gene_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.spike_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.crow_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.leon_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.sandy_star));
        this.f4581i.add(Integer.valueOf((int) R.drawable.gale_star));
        this.f4577d = new ArrayList<>();
        this.f4577d.add(Integer.valueOf((int) R.drawable.shelly_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.nita_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.colt_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.bull_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.jessie_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.brock_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.dinamike_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.emz_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.bo_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.bit_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.tick_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.el_primo_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.barley_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.poco_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.rosa_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.ricoshet_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.daril_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.penny_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.carl_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.jacky_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.bibi_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.bea_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.frank_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.piper_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.pam_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.nani_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.max_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.mortis_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.mr_p_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.sprout_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.tara_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.gene_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.spike_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.crow_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.leon_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.sandy_l));
        this.f4577d.add(Integer.valueOf((int) R.drawable.gale_l));
        this.f4578f = new ArrayList();
        this.f4578f.add(Integer.valueOf((int) R.drawable.shelly_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.nita_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.colt_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.bull_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.jessie_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.brock_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.dinamike_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.emz_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.bo_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.bit_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.tick_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.elprimo_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.barley_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.poco_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.rosa_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.riko_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.darryl_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.penny_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.carl_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.jacky_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.bibi_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.bea_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.frank_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.piper_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.pam_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.nani_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.max_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.mortis_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.mr_p_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.sprout_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.tara_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.gene_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.spike_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.crow_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.leon_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.sandy_f));
        this.f4578f.add(Integer.valueOf((int) R.drawable.gale_f));
        this.f4579g = new ArrayList<>();
        if (MainActivity.m3726c("language") == 0) {
            this.f4579g.add("Shelly");
            this.f4579g.add("Nita");
            this.f4579g.add("Colt");
            this.f4579g.add("Bull");
            this.f4579g.add("Jessie");
            this.f4579g.add("Brock");
            this.f4579g.add("Dinamike");
            this.f4579g.add("Emz");
            this.f4579g.add("Bo");
            this.f4579g.add("8-Bit");
            this.f4579g.add("Tick");
            this.f4579g.add("El Primo");
            this.f4579g.add("Barley");
            this.f4579g.add("Poco");
            this.f4579g.add("Rosa");
            this.f4579g.add("Ricochet");
            this.f4579g.add("Daryl");
            this.f4579g.add("Penny");
            this.f4579g.add("Carl");
            this.f4579g.add("Jacky");
            this.f4579g.add("Bibi");
            this.f4579g.add("Bea");
            this.f4579g.add("Frank");
            this.f4579g.add("Piper");
            this.f4579g.add("Pam");
            this.f4579g.add("Nani");
            this.f4579g.add("Max");
            this.f4579g.add("Mortis");
            this.f4579g.add("Mr P");
            this.f4579g.add("Sprout");
            this.f4579g.add("Tara");
            this.f4579g.add("Gene");
            this.f4579g.add("Spike");
            this.f4579g.add("Crow");
            this.f4579g.add("Leon");
            this.f4579g.add("Sandy");
            this.f4579g.add("Gale");
        }
        if (MainActivity.m3726c("language") == 1) {
            this.f4579g.add("Шеллі");
            this.f4579g.add("Ніта");
            this.f4579g.add("Кольт");
            this.f4579g.add("Булл");
            this.f4579g.add("Джессі");
            this.f4579g.add("Брок");
            this.f4579g.add("Дінамайк");
            this.f4579g.add("ЕМЗ");
            this.f4579g.add("Бо");
            this.f4579g.add("8-Біт");
            this.f4579g.add("Тік");
            this.f4579g.add("Ель Прімо");
            this.f4579g.add("Барлі");
            this.f4579g.add("Поко");
            this.f4579g.add("Роза");
            this.f4579g.add("Ріко");
            this.f4579g.add("Дерріл");
            this.f4579g.add("Пенні");
            this.f4579g.add("Карл");
            this.f4579g.add("Джекі");
            this.f4579g.add("Бібі");
            this.f4579g.add("Беа");
            this.f4579g.add("Френк");
            this.f4579g.add("Пайпер");
            this.f4579g.add("Пем");
            this.f4579g.add("Нані");
            this.f4579g.add("Макс");
            this.f4579g.add("Мортіс");
            this.f4579g.add("Містер П.");
            this.f4579g.add("Спраут");
            this.f4579g.add("Тара");
            this.f4579g.add("Джин");
            this.f4579g.add("Спайк");
            this.f4579g.add("Ворон");
            this.f4579g.add("Леон");
            this.f4579g.add("Сенді");
            this.f4579g.add("Гейл");
        }
        if (MainActivity.m3726c("language") == 2) {
            this.f4579g.add("Шелли");
            this.f4579g.add("Нита");
            this.f4579g.add("Кольт");
            this.f4579g.add("Булл");
            this.f4579g.add("Джесси");
            this.f4579g.add("Брок");
            this.f4579g.add("Динамайк");
            this.f4579g.add("ЭМЗ");
            this.f4579g.add("Бо");
            this.f4579g.add("8-Бит");
            this.f4579g.add("Тик");
            this.f4579g.add("Эль Примо");
            this.f4579g.add("Барли");
            this.f4579g.add("Поко");
            this.f4579g.add("Роза");
            this.f4579g.add("Рико");
            this.f4579g.add("ДЭррил");
            this.f4579g.add("Пенни");
            this.f4579g.add("Карл");
            this.f4579g.add("Джеки");
            this.f4579g.add("БИБИ");
            this.f4579g.add("Беа");
            this.f4579g.add("ФрЭнк");
            this.f4579g.add("Пайпер");
            this.f4579g.add("ПЭМ");
            this.f4579g.add("Нани");
            this.f4579g.add("Макс");
            this.f4579g.add("Мортис");
            this.f4579g.add("Мистер П.");
            this.f4579g.add("Спраут");
            this.f4579g.add("Тара");
            this.f4579g.add("Джин");
            this.f4579g.add("Спайк");
            this.f4579g.add("Ворон");
            this.f4579g.add("Леон");
            this.f4579g.add("СЭнди");
            this.f4579g.add("Гэйл");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final int getItemCount() {
        return this.f4576c.size();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$w' to match base method */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
   /* @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C1145a onCreateViewHolder(ViewGroup viewGroup) {
        return new C1145a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false));
    }*/

    @NonNull
    @Override
    public C1145a onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new C1145a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$w, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final void onBindViewHolder(C1145a aVar, final int i) {
        int i2;
        Resources resources;
        ImageView imageView;
        final C1145a aVar2 = aVar;
        final Animation loadAnimation = AnimationUtils.loadAnimation(f4575e, R.anim.upgrade_line_second);
        aVar2.f4600x.setVisibility(4);
        loadAnimation.setAnimationListener(null);
        aVar2.f4592B.clearAnimation();
        if (this.f4576c.get(i).f4564c != 1000) {
            aVar2.f4593C.setVisibility(0);
            aVar2.f4602z.setText(this.f4579g.get(this.f4576c.get(i).f4564c));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4576c.get(i).f4564c);
            this.f4576c.get(i).f4563b = MainActivity.m3726c(sb.toString());
            if (this.f4576c.get(i).f4563b != 0) {
                aVar2.f4596t.setBackground(f4575e.getResources().getDrawable(this.f4576c.get(i).f4562a));
                aVar2.f4598v.setVisibility(0);
                if (MainActivity.m3726c("language") == 0) {
                    TextView textView = aVar2.f4598v;
                    StringBuilder sb2 = new StringBuilder("POWER ");
                    sb2.append(MainActivity.m3726c("l" + this.f4576c.get(i).f4564c));
                    textView.setText(sb2.toString());
                }
                if (MainActivity.m3726c("language") == 1) {
                    TextView textView2 = aVar2.f4598v;
                    StringBuilder sb3 = new StringBuilder("СИЛА ");
                    sb3.append(MainActivity.m3726c("l" + this.f4576c.get(i).f4564c));
                    textView2.setText(sb3.toString());
                }
                if (MainActivity.m3726c("language") == 2) {
                    TextView textView3 = aVar2.f4598v;
                    StringBuilder sb4 = new StringBuilder("СИЛА ");
                    sb4.append(MainActivity.m3726c("l" + this.f4576c.get(i).f4564c));
                    textView3.setText(sb4.toString());
                }
                aVar2.f4591A.setVisibility(4);
                aVar2.f4591A.clearAnimation();
                ArrayList<Integer> arrayList = Brawlers.f3824o;
                this.f4580h = arrayList.get(MainActivity.m3726c("l" + this.f4576c.get(i).f4564c)).intValue();
                TextView textView4 = aVar2.f4597u;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f4576c.get(i).f4563b);
                sb5.append('/');
                sb5.append(this.f4580h);
                textView4.setText(sb5.toString());
                if (!f4575e.getPackageName().equals("com.brawl.mybestappforfansbrawlstarsboxs")) {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    intent.setFlags(67108864);
                    f4575e.startActivity(intent);
                }
                aVar2.f4597u.setBackground(f4575e.getResources().getDrawable(R.drawable.half_minus));
                loadAnimation.setAnimationListener(null);
                aVar2.f4592B.clearAnimation();
                aVar2.f4601y.setVisibility(4);
                if (this.f4580h != 0) {
                    aVar2.f4591A.setVisibility(4);
                    if (this.f4576c.get(i).f4563b >= this.f4580h / 2) {
                        aVar2.f4591A.setVisibility(4);
                        aVar2.f4597u.setBackground(f4575e.getResources().getDrawable(R.drawable.half));
                    }
                    double d = (double) this.f4576c.get(i).f4563b;
                    double d2 = (double) this.f4580h;
                    Double.isNaN(d2);
                    if (d >= d2 / 1.5d) {
                        aVar2.f4591A.setVisibility(4);
                        aVar2.f4597u.setBackground(f4575e.getResources().getDrawable(R.drawable.half_plus));
                    }
                    if (this.f4576c.get(i).f4563b >= this.f4580h) {
                        aVar2.f4597u.setBackground(f4575e.getResources().getDrawable(R.drawable.upgrade));
                        aVar2.f4600x.setVisibility(0);
                        aVar2.f4597u.setText((CharSequence) null);
                        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.brawl.mybestappforfansbrawlstarsboxs.C1141i.C11421 */

                            public final void onAnimationEnd(Animation animation) {
                                aVar2.f4592B.startAnimation(loadAnimation);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }
                        });
                        loadAnimation.setFillAfter(false);
                        aVar2.f4592B.startAnimation(loadAnimation);
                        aVar2.f4601y.setVisibility(0);
                        if (MainActivity.m3726c("language") == 0) {
                            aVar2.f4600x.setText("UPGRADE");
                        }
                        if (MainActivity.m3726c("language") == 1) {
                            aVar2.f4600x.setText("ПОКРАЩИТИ");
                        }
                        if (MainActivity.m3726c("language") == 2) {
                            aVar2.f4600x.setText("УЛУЧШИТЬ");
                        }
                        aVar2.f4591A.setVisibility(0);
                    }
                    if (this.f4576c.get(i).f4563b < this.f4580h) {
                        loadAnimation.setAnimationListener(null);
                        aVar2.f4592B.clearAnimation();
                    }
                    aVar2.f4597u.getBackground();
                    f4575e.getResources().getDrawable(R.drawable.upgrade);
                } else {
                    aVar2.f4591A.setVisibility(4);
                    aVar2.f4597u.setBackground(f4575e.getResources().getDrawable(R.drawable.half_plus));
                    TextView textView5 = aVar2.f4597u;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.f4576c.get(i).f4563b);
                    textView5.setText(sb6.toString());
                }
                aVar2.f4599w.setVisibility(4);
            } else {
                loadAnimation.setAnimationListener(null);
                aVar2.f4592B.clearAnimation();
                aVar2.f4601y.setVisibility(4);
                aVar2.f4596t.setBackground(f4575e.getResources().getDrawable(this.f4577d.get(this.f4576c.get(i).f4564c).intValue()));
                aVar2.f4597u.setText("");
                aVar2.f4599w.setVisibility(0);
                aVar2.f4591A.setVisibility(4);
                aVar2.f4598v.setVisibility(4);
                aVar2.f4597u.setBackground(null);
            }
            if (MainActivity.m3726c("language") == 0) {
                aVar2.f4599w.setText("OPEN BRAWL BOXES\nTO UNLOCK");
            }
            if (MainActivity.m3726c("language") == 1) {
                aVar2.f4599w.setText("ВІДКРИВАЙ ЯЩИКИ\nЩОБ РОЗБЛОКУВАТИ");
            }
            if (MainActivity.m3726c("language") == 2) {
                aVar2.f4599w.setText("ОТКРЫВАЙ ЯЩИКИ\nЧТОБЫ РАЗБЛОКИРОВАТЬ");
            }
            if (this.f4576c.get(i).f4564c == 0) {
                aVar2.f4591A.setVisibility(4);
            }
        } else {
            aVar2.f4593C.setVisibility(4);
        }
        aVar2.f4596t.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.C1141i.C11432 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                aVar2.f4593C.startAnimation(Brawlers.f3822m);
                return false;
            }
        });
        aVar2.f4596t.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.C1141i.C11443 */

            public final void onClick(View view) {
                Intent intent;
                BrawlerReview.f3720l = C1141i.this.f4582j.get(C1141i.this.f4576c.get(i).f4564c).intValue();
                BrawlerReview.f3721m = C1141i.this.f4581i.get(C1141i.this.f4576c.get(i).f4564c).intValue();
                if (C1141i.this.f4576c.get(i).f4563b != 0) {
                    BrawlerReview.f3714N = ((Integer) C1141i.this.f4578f.get(C1141i.this.f4576c.get(i).f4564c)).intValue();
                    if (MainActivity.m3726c("language") == 0) {
                        BrawlerReview.f3716Q = "OPEN BRAWL BOXES\nTO UNLOCK";
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        BrawlerReview.f3716Q = "ВІДКРИВАЙ ЯЩИКИ\nЩОБ РОЗБЛОКУВАТИ";
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        BrawlerReview.f3716Q = "ОТКРЫВАЙ ЯЩИКИ\nЧТОБЫ РАЗБЛОКИРОВАТЬ";
                    }
                    BrawlerReview.f3719X = MainActivity.m3726c("l" + C1141i.this.f4576c.get(i).f4564c);
                    BrawlerReview.f3718W = C1141i.this.f4576c.get(i).f4564c;
                    BrawlerReview.f3712L = C1141i.this.f4579g.get(C1141i.this.f4576c.get(i).f4564c);
                    BrawlerReview.f3715O = C1141i.this.f4576c.get(i).f4563b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C1141i.this.f4576c.get(i).f4563b);
                    sb.append('/');
                    sb.append(C1141i.this.f4580h);
                    BrawlerReview.f3717R = sb.toString();
                    intent = new Intent(C1141i.f4575e, BrawlerReview.class);
                } else {
                    BrawlerReview.f3719X = 0;
                    if (MainActivity.m3726c("language") == 0) {
                        BrawlerReview.f3716Q = "OPEN BRAWL BOXES\nTO UNLOCK";
                    }
                    if (MainActivity.m3726c("language") == 1) {
                        BrawlerReview.f3716Q = "ВІДКРИВАЙ ЯЩИКИ\nЩОБ РОЗБЛОКУВАТИ";
                    }
                    if (MainActivity.m3726c("language") == 2) {
                        BrawlerReview.f3716Q = "ОТКРЫВАЙ ЯЩИКИ\nЧТОБЫ РАЗБЛОКИРОВАТЬ";
                    }
                    BrawlerReview.f3714N = ((Integer) C1141i.this.f4578f.get(C1141i.this.f4576c.get(i).f4564c)).intValue();
                    BrawlerReview.f3713M = C1141i.this.f4576c.get(i).f4564c;
                    BrawlerReview.f3718W = C1141i.this.f4576c.get(i).f4564c;
                    BrawlerReview.f3712L = C1141i.this.f4579g.get(C1141i.this.f4576c.get(i).f4564c);
                    BrawlerReview.f3715O = C1141i.this.f4576c.get(i).f4563b;
                    BrawlerReview.f3717R = "";
                    intent = new Intent(C1141i.f4575e, BrawlerReview.class);
                }
                C1141i.f4575e.startActivity(intent);
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(C1141i.f4575e, (int) R.raw.menu_click).start();
                }
            }
        });
        if (MainActivity.m3726c("l" + this.f4576c.get(i).f4564c) >= 9) {
            aVar2.f4600x.setVisibility(4);
            aVar2.f4601y.setVisibility(0);
            aVar2.f4601y.setBackground(f4575e.getResources().getDrawable(R.drawable.star_bar));
            if (MainActivity.m3726c("gadget" + this.f4576c.get(i).f4564c) != 0) {
                imageView = aVar2.f4594r;
                resources = f4575e.getResources();
                i2 = this.f4582j.get(this.f4576c.get(i).f4564c).intValue();
            } else {
                imageView = aVar2.f4594r;
                resources = f4575e.getResources();
                i2 = R.drawable.gadget_lock_bar;
            }
            imageView.setBackground(resources.getDrawable(i2));
            if (MainActivity.m3726c("starpower" + this.f4576c.get(i).f4564c) != 0) {
                aVar2.f4595s.setBackground(f4575e.getResources().getDrawable(this.f4581i.get(this.f4576c.get(i).f4564c).intValue()));
            } else {
                aVar2.f4595s.setBackground(f4575e.getResources().getDrawable(R.drawable.power_star_lock_bar));
            }
            aVar2.f4591A.setVisibility(4);
            return;
        }
        if (this.f4576c.get(i).f4563b >= this.f4580h) {
            aVar2.f4591A.setVisibility(0);
            aVar2.f4600x.setVisibility(0);
        }
        if (MainActivity.m3726c("l" + this.f4576c.get(i).f4564c) == 0) {
            aVar2.f4591A.setVisibility(4);
            aVar2.f4600x.setVisibility(4);
        }
        aVar2.f4595s.setBackground(null);
        aVar2.f4594r.setBackground(null);
        if (MainActivity.m3726c("l" + this.f4576c.get(i).f4564c) != 0) {
            aVar2.f4601y.setBackground(f4575e.getResources().getDrawable(R.drawable.upgrade_top));
        }
    }
}
