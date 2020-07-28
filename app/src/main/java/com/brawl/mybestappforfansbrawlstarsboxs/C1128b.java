package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

@SuppressWarnings("ALL")
/* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.b */
final class C1128b extends RecyclerView.Adapter<C1128b.C1131a> {

    /* renamed from: c */
    Activity f4540c;

    /* renamed from: d */
    ArrayList<C1127a> f4541d;

    /* renamed from: e */
    final String f4542e = "com.brawl.mybestappforfansbrawlstarsboxs";

    @NonNull
    @Override
    public C1131a onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new C1131a(LayoutInflater.from(parent.getContext()).inflate(R.layout.achivement_item, parent, false));
    }

    /*@Override
    public void onBindViewHolder(@NonNull C1131a holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }*/

    /* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.b$a */
    public static class C1131a extends RecyclerView.ViewHolder {

        /* renamed from: r */
        ProgressBar f4548r;

        /* renamed from: s */
        TextView f4549s;

        /* renamed from: t */
        TextView f4550t;

        /* renamed from: u */
        TextView f4551u;

        /* renamed from: v */
        TextView f4552v;

        /* renamed from: w */
        CardView f4553w;

        /* renamed from: x */
        CardView f4554x;

        /* renamed from: y */
        RelativeLayout f4555y;

        C1131a(View view) {
            super(view);
            this.f4548r = (ProgressBar) view.findViewById(R.id.progressBar);
            this.f4552v = (TextView) view.findViewById(R.id.progress_number);
            this.f4550t = (TextView) view.findViewById(R.id.money);
            this.f4551u = (TextView) view.findViewById(R.id.gems);
            this.f4549s = (TextView) view.findViewById(R.id.title);
            this.f4553w = (CardView) view.findViewById(R.id.bonus_lay);
            this.f4554x = (CardView) view.findViewById(R.id.back_lay);
            this.f4555y = (RelativeLayout) view.findViewById(R.id.done);
        }
    }

    C1128b(Activity activity, ArrayList<C1127a> arrayList) {
        this.f4540c = activity;
        if (!this.f4540c.getPackageName().equals("com.brawl.mybestappforfansbrawlstarsboxs")) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(67108864);
            this.f4540c.startActivity(intent);
        }
        this.f4541d = arrayList;
    }

    /* renamed from: a */
    public static void m3787a(int i, int i2) {
        MainActivity.m3720a(MainActivity.m3726c("money") + i, "money");
        MainActivity.m3720a(MainActivity.m3726c("gems") + i2, "gems");
        MainActivity.m3729d(Achivements.f3700o, "money");
        MainActivity.m3729d(Achivements.f3701p, "gems");
    }

    /* renamed from: a */
    private static void m3788a(C1131a aVar, float f, String str) {
        try {
            int c = (int) ((((float) MainActivity.m3726c(str)) / f) * 100.0f);
            aVar.f4548r.setSecondaryProgress(c);
            TextView textView = aVar.f4552v;
            textView.setText(c + "%");
            if (c > 100) {
                aVar.f4548r.setSecondaryProgress(100);
                aVar.f4552v.setText("100%");
            }
        } catch (Exception unused) {
            aVar.f4548r.setSecondaryProgress(0);
            aVar.f4552v.setText("0%");
        }
    }

    /* renamed from: a */
    private static void m3789a(C1131a aVar, String str) {
        try {
            int parseInt = (int) ((((float) Integer.parseInt(Register.m3740a(str))) / 100.0f) * 100.0f);
            aVar.f4548r.setSecondaryProgress(parseInt);
            TextView textView = aVar.f4552v;
            textView.setText(parseInt + "%");
            if (parseInt > 100) {
                aVar.f4548r.setSecondaryProgress(100);
                aVar.f4552v.setText("100%");
            }
        } catch (Exception unused) {
            aVar.f4548r.setSecondaryProgress(0);
            aVar.f4552v.setText("0%");
        }
    }

    /* renamed from: b */
    private static void m3790b(C1131a aVar, String str) {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < Achivements.f3703r.size(); i++) {
            if (Achivements.f3703r.get(i).equals(str)) {
                f2 += 1.0f;
                if (MainActivity.m3726c(String.valueOf(i)) != 0) {
                    f += 1.0f;
                }
            }
        }
        int i2 = (int) ((f / f2) * 100.0f);
        aVar.f4548r.setSecondaryProgress(i2);
        TextView textView = aVar.f4552v;
        textView.setText(i2 + "%");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final int getItemCount() {
        return this.f4541d.size();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$w' to match base method */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */

    /*@Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C1131a onCreateViewHolder(ViewGroup viewGroup) {
        return new C1131a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.achivement_item, viewGroup, false));
    }*/

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$w, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final void onBindViewHolder(C1131a aVar, final int i) {
        int i2;
        Resources resources;
        CardView cardView;
        final C1131a aVar2 = aVar;
        aVar2.f4549s.setText(this.f4541d.get(i).f4537a);
        TextView textView = aVar2.f4550t;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4541d.get(i).f4538b);
        textView.setText(sb.toString());
        TextView textView2 = aVar2.f4551u;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4541d.get(i).f4539c);
        textView2.setText(sb2.toString());
        if (i == 0) {
            m3790b(aVar2, "f");
        }
        if (i == 1) {
            m3790b(aVar2, "r");
        }
        if (i == 2) {
            m3790b(aVar2, "s");
        }
        if (i == 3) {
            m3790b(aVar2, "e");
        }
        if (i == 4) {
            m3790b(aVar2, "m");
        }
        if (i == 5) {
            m3790b(aVar2, "l");
        }
        if (i == 6) {
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i3 = 0; i3 < Achivements.f3703r.size(); i3++) {
                f2 += 1.0f;
                if (MainActivity.m3726c(String.valueOf(i3)) != 0) {
                    f += 1.0f;
                }
            }
            int i4 = (int) ((f / f2) * 100.0f);
            aVar2.f4548r.setSecondaryProgress(i4);
            TextView textView3 = aVar2.f4552v;
            textView3.setText(i4 + "%");
        }
        if (i == 7) {
            m3789a(aVar2, "free");
        }
        if (i == 8) {
            m3789a(aVar2, "big");
        }
        if (i == 9) {
            m3789a(aVar2, "mega");
        }
        if (i == 10) {
            m3788a(aVar2, 1000.0f, "gems");
        }
        if (i == 11) {
            m3788a(aVar2, 10000.0f, "money");
        }
        if (i == 12) {
            m3788a(aVar2, 100.0f, "ticket");
        }
        if (aVar2.f4548r.getSecondaryProgress() == 100) {
            cardView = aVar2.f4553w;
            resources = this.f4540c.getResources();
            i2 = R.color.progress_100;
        } else {
            cardView = aVar2.f4553w;
            resources = this.f4540c.getResources();
            i2 = R.color.back_card;
        }
        cardView.setCardBackgroundColor(resources.getColor(i2));
        aVar2.f4553w.setOnTouchListener(new View.OnTouchListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.C1128b.C11291 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                aVar2.f4554x.startAnimation(Achivements.f3702q);
                return false;
            }
        });
        if (aVar2.f4552v.getText().toString().equals("0%")) {
            aVar2.f4548r.setSecondaryProgress(1);
        }
        aVar2.f4553w.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.C1128b.C11302 */

            public final void onClick(View view) {
                if (MainActivity.m3726c("sounds") == 0) {
                    MediaPlayer.create(C1128b.this.f4540c, (int) R.raw.menu_click).start();
                }
                if (MainActivity.m3726c("ach" + i) == 0 && aVar2.f4548r.getSecondaryProgress() == 100) {
                    MainActivity.m3720a(1, "ach" + i);
                    if (i == 0) {
                        C1128b.m3787a(250, 25);
                    }
                    if (i == 1) {
                        C1128b.m3787a(350, 35);
                    }
                    if (i == 2) {
                        C1128b.m3787a(400, 40);
                    }
                    if (i == 3) {
                        C1128b.m3787a(600, 60);
                    }
                    if (i == 4) {
                        C1128b.m3787a(800, 80);
                    }
                    if (i == 5) {
                        C1128b.m3787a(1000, 150);
                    }
                    if (i == 6) {
                        C1128b.m3787a(10000, 1500);
                    }
                    if (i == 7) {
                        C1128b.m3787a(10000, 100);
                    }
                    if (i == 8) {
                        C1128b.m3787a(1000, 300);
                    }
                    if (i == 9) {
                        C1128b.m3787a(5000, 500);
                    }
                    if (i == 10) {
                        C1128b.m3787a(10000, 2000);
                    }
                    if (i == 11) {
                        C1128b.m3787a(20000, 450);
                    }
                    if (i == 12) {
                        C1128b.m3787a(1000, 250);
                    }
                    C1128b.this.mo3722a(aVar2);
                }
            }
        });
        if (aVar2.f4548r.getSecondaryProgress() != 100) {
            aVar2.f4555y.setVisibility(4);
            aVar2.f4548r.setProgressDrawable(this.f4540c.getResources().getDrawable(R.drawable.progressbar));
        } else if (MainActivity.m3726c("ach".concat(String.valueOf(i))) != 0) {
            mo3722a(aVar2);
        }
    }

    /* renamed from: a */
    public final void mo3722a(C1131a aVar) {
        aVar.f4555y.setVisibility(0);
        aVar.f4553w.setCardBackgroundColor(this.f4540c.getResources().getColor(R.color.back_card));
        aVar.f4548r.setProgressDrawable(this.f4540c.getResources().getDrawable(R.drawable.done_progress));
    }
}
