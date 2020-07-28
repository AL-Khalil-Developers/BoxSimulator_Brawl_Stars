package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.h */
final class C1137h extends RecyclerView.Adapter<C1137h.C1140a> {

    /* renamed from: c */
    ArrayList<Integer> f4568c;

    /* renamed from: d */
    Activity f4569d;

    /* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.h$a */
    public static class C1140a extends RecyclerView.ViewHolder {

        /* renamed from: r */
        ImageView f4573r;

        /* renamed from: s */
        ImageView f4574s;

        C1140a(View view) {
            super(view);
            this.f4573r = (ImageView) view.findViewById(R.id.icon);
            this.f4574s = (ImageView) view.findViewById(R.id.lock);
        }
    }

    C1137h(ArrayList<Integer> arrayList, Activity activity) {
        this.f4568c = arrayList;
        this.f4569d = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final int getItemCount() {
        return this.f4568c.size();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$w' to match base method */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /*@Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C1140a onCreateViewHolder(ViewGroup viewGroup) {
        return new C1140a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icon_selector, viewGroup, false));
    }*/

    @NonNull
    @Override
    public C1140a onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new C1140a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icon_selector, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$w, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final void onBindViewHolder(C1140a aVar, final int i) {
        C1140a aVar2 = aVar;
        aVar2.f4573r.setBackground(this.f4569d.getResources().getDrawable(this.f4568c.get(i).intValue()));
        aVar2.f4573r.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.C1137h.C11381 */

            public final void onClick(View view) {
                MediaPlayer.create(C1137h.this.f4569d, (int) R.raw.menu_click).start();
            }
        });
        if (MainActivity.m3726c(String.valueOf(i)) != 0) {
            aVar2.f4574s.setVisibility(4);
        }
        if (MainActivity.m3726c(String.valueOf(i)) == 0) {
            aVar2.f4574s.setVisibility(0);
        }
        aVar2.f4573r.setOnClickListener(new View.OnClickListener() {
            /* class com.brawl.mybestappforfansbrawlstarsboxs.C1137h.C11392 */

            public final void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                if (MainActivity.m3726c(sb.toString()) != 0) {
                    MainActivity.m3720a(C1137h.this.f4568c.get(i).intValue(), "icon");
                    try {
                        MainActivity.f4125I.setBackground(C1137h.this.f4569d.getResources().getDrawable(C1137h.this.f4568c.get(i).intValue()));
                        Info_about_you.f4047V.setBackground(C1137h.this.f4569d.getResources().getDrawable(C1137h.this.f4568c.get(i).intValue()));
                    } catch (Exception unused) {
                    }
                    C1137h.this.f4569d.finish();
                }
            }
        });
    }
}
