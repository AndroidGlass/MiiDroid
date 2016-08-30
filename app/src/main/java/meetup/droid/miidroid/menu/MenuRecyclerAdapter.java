package meetup.droid.miidroid.menu;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import meetup.droid.miidroid.R;
import meetup.droid.miidroid.lifecycle.ViewHolderCallbacks;

/**
 */
public class MenuRecyclerAdapter extends RecyclerView.Adapter<MenuRecyclerAdapter.ViewHolder> implements ViewHolderCallbacks {

    private MenuItem[] mDataList;

    public MenuRecyclerAdapter(MenuItem[] data) {
        mDataList = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        View view = inflate.inflate(R.layout.row_menu_item_view, parent, false);
        return new ViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MenuItem item = mDataList[position];
        holder.mTitle.setText(item.getTitle());
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return mDataList.length;
    }

    @Override
    public void onItemClick(View view, int position) {
        MenuItem item = mDataList[position];
        Intent intent = new Intent(view.getContext(), item.getClazz());
        view.getContext().startActivity(intent);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView mTitle;

        public ViewHolderCallbacks mCallbacks;

        public ViewHolder(View itemView, ViewHolderCallbacks callbacks) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);
            itemView.setOnClickListener(this);
            mCallbacks = callbacks;
        }

        @Override
        public void onClick(View v) {
            mCallbacks.onItemClick(v, getAdapterPosition());
        }
    }
}
