package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.l */
public final class C1151l extends RecyclerView.Adapter<C1151l.C1152a> {

    /* renamed from: c */
    ArrayList<C1135f> f4614c;

    /* renamed from: d */
    ArrayList<ScaleAnimation> f4615d;

    /* renamed from: e */
    Activity f4616e;

    /* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.l$a */
    public static class C1152a extends RecyclerView.ViewHolder {

        /* renamed from: r */
        ImageView f4617r;

        /* renamed from: s */
        TextView f4618s;

        /* renamed from: t */
        RelativeLayout f4619t;

        C1152a(View view) {
            super(view);
            this.f4617r = (ImageView) view.findViewById(R.id.card);
            this.f4618s = (TextView) view.findViewById(R.id.text_count);
            this.f4619t = (RelativeLayout) view.findViewById(R.id.rel_color);
        }
    }

    C1151l(ArrayList<C1135f> arrayList, Activity activity, ArrayList<ScaleAnimation> arrayList2) {
        this.f4614c = arrayList;
        this.f4616e = activity;
        this.f4615d = arrayList2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final int getItemCount() {
        return this.f4614c.size();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$w' to match base method */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /*@Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C1152a onCreateViewHolder(ViewGroup viewGroup) {
        return new C1152a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_rec, viewGroup, false));
    }*/

    @NonNull
    @Override
    public C1152a onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new C1152a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_rec, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$w, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final void onBindViewHolder(C1152a aVar, int i) {
        String str;
        TextView textView;
        C1152a aVar2 = aVar;
        aVar2.f4617r.setBackground(this.f4616e.getResources().getDrawable(this.f4614c.get(i).f4562a));
        if (this.f4614c.get(i).f4563b == 1234) {
            aVar2.f4618s.setBackgroundColor(-16777216);
            if (MainActivity.m3726c("language") == 0) {
                aVar2.f4618s.setText("Gadget");
            }
            if (MainActivity.m3726c("language") == 1) {
                aVar2.f4618s.setText("Гаджет");
            }
            if (MainActivity.m3726c("language") == 2) {
                textView = aVar2.f4618s;
                str = "Гаджет";
            }
            aVar2.f4619t.startAnimation(this.f4615d.get(i));
        }
        textView = aVar2.f4618s;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4614c.get(i).f4563b);
        str = sb.toString();
        textView.setText(str);
        aVar2.f4619t.startAnimation(this.f4615d.get(i));
    }
}
