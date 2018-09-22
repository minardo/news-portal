package com.betaministudio.application.newsportal.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betaministudio.application.newsportal.Interface.ItemClickListener;
import com.betaministudio.application.newsportal.Model.WebSiteModel;
import com.betaministudio.application.newsportal.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by ARDO on 9/20/2018.
 */

class ListSourceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ItemClickListener itemClickListener;

    TextView source_title;
    CircleImageView source_image;

    public ListSourceViewHolder(View itemView) {
        super(itemView);

        source_image = (CircleImageView) itemView.findViewById(R.id.source_image);
        source_title = (TextView) itemView.findViewById(R.id.source_name);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(), false);
    }
}

public class ListSourceAdapter extends RecyclerView.Adapter<ListSourceViewHolder> {
    private Context context;
    private WebSiteModel webSiteModel;

    public ListSourceAdapter(Context context, WebSiteModel webSiteModel) {
        this.context = context;
        this.webSiteModel = webSiteModel;
    }

    @Override
    public ListSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.source_layout, parent, false);
        return new ListSourceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListSourceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return webSiteModel.getSourceModels().size();
    }
}
