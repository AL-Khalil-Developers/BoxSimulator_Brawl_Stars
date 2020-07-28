package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.k */
final class C1149k extends RecyclerView.Adapter<C1149k.C1150a> {

    /* renamed from: c */
    static Activity f4609c;

    /* renamed from: d */
    ArrayList<C1153m> f4610d;

    /* renamed from: com.brawl.mybestappforfansbrawlstarsboxs.k$a */
    public static class C1150a extends RecyclerView.ViewHolder {

        /* renamed from: r */
        ImageView f4611r;

        /* renamed from: s */
        ImageView f4612s;

        /* renamed from: t */
        TextView f4613t;

        C1150a(View view) {
            super(view);
            this.f4611r = (ImageView) view.findViewById(R.id.card);
            this.f4612s = (ImageView) view.findViewById(R.id.fone);
            this.f4613t = (TextView) view.findViewById(R.id.count);
        }
    }

    C1149k(Activity activity, ArrayList<C1153m> arrayList) {
        f4609c = activity;
        this.f4610d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final int getItemCount() {
        return 3;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$w' to match base method */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /*@Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C1150a onCreateViewHolder(ViewGroup viewGroup) {
        return new C1150a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_small, viewGroup, false));
    }*/

    @NonNull
    @Override
    public C1150a onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new C1150a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_small, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$w, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public final void onBindViewHolder(C1150a aVar, int i) {
        C1150a aVar2 = aVar;
        try {
            aVar2.f4611r.setBackground(f4609c.getResources().getDrawable(this.f4610d.get(i).f4621b));
            TextView textView = aVar2.f4613t;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4610d.get(i).f4620a);
            textView.setText(sb.toString());
        } catch (Exception unused) {
        }
    }
}
