package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Random;

/* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.j */
final class C1146j extends RecyclerView.Adapter<C1146j.C1147a> {

    /* renamed from: c */
    static Activity f4603c = null;

    /* renamed from: d */
    static int f4604d = 3;

    /* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.j$a */
    public static class C1147a extends RecyclerView.ViewHolder {

        /* renamed from: r */
        ImageView f4605r;

        /* renamed from: s */
        ImageView f4606s;

        /* renamed from: t */
        TextView f4607t;

        C1147a(View view) {
            super(view);
            this.f4605r = (ImageView) view.findViewById(R.id.card);
            this.f4606s = (ImageView) view.findViewById(R.id.fone);
            this.f4607t = (TextView) view.findViewById(R.id.count);
            this.f4605r.setOnClickListener(new View.OnClickListener() {
                /* class com.brawl.mybestappforfansbrawlstarsboxs.C1146j.C1147a.C11481 */

                public final void onClick(View view) {
                    int i;
                    if (C1146j.f4604d > 0) {
                        MediaPlayer.create(C1146j.f4603c, (int) R.raw.menu_click).start();
                        C1147a.this.f4606s.setVisibility(0);
                        Random random = new Random();
                        try {
                            i = random.nextInt(Game.f4022l.size());
                        } catch (Exception unused) {
                            i = random.nextInt(Game.f4022l.size());
                        }
                        int nextInt = random.nextInt(30) + 1;
                        C1147a.this.f4605r.animate().withLayer().rotationY(180.0f).setDuration(150);
                        C1147a.this.f4605r.setBackground(C1146j.f4603c.getResources().getDrawable(Game.f4022l.get(i).intValue()));
                        C1147a.this.f4607t.setText(String.valueOf(nextInt));
                        Game.f4024o.add(new C1153m(nextInt, Game.f4022l.get(i).intValue()));
                        int i2 = 0;
                        for (int i3 = 0; i3 < Game.f4023m.size(); i3++) {
                            if (Game.f4023m.get(i3) == Game.f4022l.get(i)) {
                                i2 = i3;
                            }
                        }
                        MainActivity.m3720a(MainActivity.m3726c(String.valueOf(i2)) + nextInt, String.valueOf(i2));
                        C1146j.f4604d--;
                        return;
                    }
                    Game.f4025p.setVisibility(View.VISIBLE);
                    C1149k kVar = new C1149k(C1146j.f4603c, Game.f4024o);
                    RecyclerView recyclerView = Game.f4021k;
                    Activity activity = C1146j.f4603c;
                    //ToDo: getApplicationContext
                    recyclerView.setLayoutManager(new GridLayoutManager(activity.getApplicationContext(), 3));
                    Game.f4021k.setAdapter(kVar);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300);
                    Game.f4025p.startAnimation(alphaAnimation);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setFillAfter(true);
                    scaleAnimation.setDuration(500);
                    scaleAnimation.setStartOffset(300);
                    Game.f4026q.startAnimation(scaleAnimation);
                }
            });
        }
    }

    C1146j(Activity activity) {
        f4603c = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final int getItemCount() {
        return 15;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$w' to match base method */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /*@Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C1147a onCreateViewHolder(ViewGroup viewGroup) {
        return new C1147a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_game, viewGroup, false));
    }*/

    @NonNull
    @Override
    public C1147a onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new C1147a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_game, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$w, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final void onBindViewHolder(C1147a aVar, int i) {
        C1147a aVar2 = aVar;
        aVar2.f4605r.setBackground(f4603c.getResources().getDrawable(R.drawable.dont_know));
        aVar2.f4607t.setText("");
    }
}
