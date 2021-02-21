package com.visionarymindszm.examsresults.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.visionarymindszm.examsresults.R;
import java.util.List;

/**
 * PastPaperAdapter holds the recyclerView actions, Extends {@link  RecyclerView.Adapter }class
 *
 *
 */

public class PastPaperAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<PastPaperModel> pastPaperModelList;
    private Context context;
    private RecyclerViewClickListener mListener;

    public PastPaperAdapter(List<PastPaperModel> pastPaperModelList, Context context, RecyclerViewClickListener mListener) {
        this.pastPaperModelList = pastPaperModelList;
        this.context = context;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.past_paper_card, parent, false);

        return new PastPaperViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PastPaperAdapter.PastPaperViewHolder pastPaperViewHolder = (PastPaperViewHolder) holder;
        pastPaperViewHolder.examPaperName.setText(pastPaperModelList.get(position).getPaper_name());
        pastPaperViewHolder.examPaperYear.setText(pastPaperModelList.get(position).getPaper_year());
    }

    // return the size of the List
    @Override
    public int getItemCount() {
        return pastPaperModelList.size();
    }


    public class PastPaperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView examPaperName;
        private TextView examPaperYear;
        private CardView cardView;

        public PastPaperViewHolder(@NonNull View itemView) {
            super(itemView);

            examPaperName = itemView.findViewById(R.id.examPaperName);
            examPaperYear = itemView.findViewById(R.id.examPaperYear);
            cardView = itemView.findViewById(R.id.card_view);
            cardView = itemView.findViewById(R.id.card_view);
            cardView.setOnClickListener(this);
        }

        // override the onclick action from the OnClick Interface
        // then attach a listener to the row (cardView) and pass the current
        // adapterPosition => 0 ... n
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.card_view){
                mListener.onRowClick(cardView, getAdapterPosition());
            }
        }
    }

    // Create an interface class to listen to the actions from the clicks and hold them
    // through the onClick action.
    public interface RecyclerViewClickListener {
        void onRowClick(View view, int position);
    }
}
